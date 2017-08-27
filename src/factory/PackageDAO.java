package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.mysql.jdbc.Statement;

import factory.DbResult.Status;
import model.Client;
import model.Package;

public class PackageDAO {

	// DEFINICIJA KONEKCIONIH STRINGOVA
	private static String INSERTPOST = "INSERT INTO `packages`(`sender`, `recipient`, `weight`, `status`, `wayOfSending`, `dateToDeliver`) VALUES (?,?, ?, ?, ?,null )";
	private static String SELECBYID = "SELECT * FROM `packages` WHERE `id` =?";
	private static String CHANGESTATUS = "UPDATE `packages` SET `status` = '1', `dateToDeliver` = CURRENT_TIME() WHERE `packages`.`id` = ?";
	private DataSource ds;

	// DEFINICIJA KONSTRUKTORA ZA PODESAVNJE KONEKCIJU
	public PackageDAO() {
		try {
			InitialContext cxt = new InitialContext();
			if (cxt == null) {

			}
			ds = (DataSource) cxt.lookup("java:/comp/env/jdbc/mysql");
			if (ds == null) {

			}
		} catch (NamingException e) {

		}
	}

	// DEFINICIJA METODE ZA UNOS OSOBE U BAZU
	public DbResult send(Package packageForDelivery) {

		Connection con = null;
		PreparedStatement pstm = null;
		int insertId = 0;
		DbResult status = null;

		try {

			con = ds.getConnection();
			pstm = con.prepareStatement(INSERTPOST);

			pstm.setString(1, packageForDelivery.getSender());
			pstm.setString(2, packageForDelivery.getRecipient());
			pstm.setDouble(3, packageForDelivery.getWeight());
			pstm.setInt(4, packageForDelivery.getStatus().getValue());
			pstm.setInt(5, packageForDelivery.getWayOfSending().getValue());
			
			pstm.execute();

			ResultSet rs = pstm.getGeneratedKeys();
			if (rs.next()) {
				insertId = rs.getInt(1);
			}

			packageForDelivery.assignId(insertId);

			con.close();

			status = new DbResult(DbResult.Status.OK, "Package succesfully stored", packageForDelivery);

		} catch (Exception e) {
			status = new DbResult(DbResult.Status.ERROR, e.getMessage(), e);
		}

		return status;

	}

	public DbResult selectById(int id) {

		Connection con = null;
		PreparedStatement pstm = null;
		Package p = null;
		ResultSet rs = null;
		DbResult result = null;

		try {
			con = ds.getConnection();
			pstm = con.prepareStatement(SELECBYID);
			pstm.setInt(1, id);
			pstm.execute();
			rs = pstm.getResultSet();

			if (rs.next()) {

				/*
				 * p = new Package(); p.setId(rs.getInt(1));
				 * p.setSender(rs.getString(2));
				 * p.setRecipient(rs.getString(3));
				 * p.setWeight(rs.getDouble(4)); p.setStatus((Status
				 * rs).getStatus(5)); pstm.setInt(6,
				 * p.getWayOfSending().getValue());
				 */

				p = new Package(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4),
						Package.Status.create(rs.getInt(5)), Package.WayOfSending.createFromInteger(rs.getInt(6)),
						rs.getDate(7), rs.getDate(8));

				result = new DbResult(DbResult.Status.OK, "Package found", p);

			} else {
				result = new DbResult(DbResult.Status.ERROR, "Posiljka pod brojem " + id + " ne postoji u sistemu.", new Integer(id));
			}

			con.close();

		} catch (Exception e) {
			result = new DbResult(DbResult.Status.ERROR, e.getMessage(), e);
		}

		return result;

	}

	public void changeStatus(int id){
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = ds.getConnection();
			pstm = con.prepareStatement(CHANGESTATUS);

			
			pstm.setInt(1, id);
			
			pstm.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	}


