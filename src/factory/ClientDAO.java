package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Client;


public class ClientDAO {
	
	//Aca kralj
	private static String LOGIN = "SELECT * FROM `client` WHERE `username` =  ? AND `pass` = ?";
	private static String LOGINACCOUNT = "SELECT * FROM `client` WHERE `account` =  ?";
	private static String CHANGEBALANCE = "UPDATE `client` SET `balance` = ? WHERE `client`.`account` = ?";
	private DataSource ds;
	
			
	// DEFINICIJA KONSTRUKTORA ZA PODESAVNJE KONEKCIJU
	public ClientDAO() {
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
	
	public Client validateLogin(String user, String pass) {

		Connection con = null;
		PreparedStatement pstm = null;
		Client client = null;
		ResultSet rs = null;
		try {
			con = ds.getConnection();
			pstm = con.prepareStatement(LOGIN);
			pstm.setString(1, user);
			pstm.setString(2, pass);
			pstm.execute();
			rs = pstm.getResultSet();

			if (rs.next()) {

				client = new Client();
				client.setId(rs.getInt(1));
				client.setName(rs.getString(2));
				client.setLast_name(rs.getString(3));
				client.setUsername(rs.getString(4));
				client.setPass(rs.getString(5));
				client.setAccount(rs.getInt(6));
				client.setBalance(rs.getInt(7));
			
			
			}

		} catch (SQLException e) {
			client = null;
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return client;

	}
	
	public Client getAccount(int account) {

		Connection con = null;
		PreparedStatement pstm = null;
		Client client = null;
		ResultSet rs = null;
		try {
			con = ds.getConnection();
			pstm = con.prepareStatement(LOGINACCOUNT);
			pstm.setInt(1, account);
		
			pstm.execute();
			rs = pstm.getResultSet();

			if (rs.next()) {

				client = new Client();
				client.setId(rs.getInt(1));
				client.setName(rs.getString(2));
				client.setLast_name(rs.getString(3));
				client.setUsername(rs.getString(4));
				client.setPass(rs.getString(5));
				client.setAccount(rs.getInt(6));
				client.setBalance(rs.getInt(7));
			
			
			}

		} catch (SQLException e) {
			client = null;
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return client;

	}
	
	public void changeBalance(double balance, int accaunt){
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = ds.getConnection();
			pstm = con.prepareStatement(CHANGEBALANCE);

			pstm.setDouble(1, balance);
			pstm.setInt(2, accaunt);
			
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
