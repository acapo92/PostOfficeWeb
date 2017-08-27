package model;

import java.sql.Time;
import java.util.Date;

public class Package {

	public enum Status {
		DELIVERD(1), NOT_DELIVERED(0);

		private int status;

		public static Status create(int value) throws Exception {
			switch (value) {
			case 1:
				return DELIVERD;

			case 0:
				return NOT_DELIVERED;

			default:
				throw new Exception("Invalid Status " + value);
			}

		}

		Status(int status) {
			this.status = status;
		}

		public int getValue() {
			return status;
		}
	}

	public enum WayOfSending {
		RECOMMENDED(1), URGENT(2), VALUED(3);

		private int status;

		public static WayOfSending createFromInteger(int value) throws Exception {
			switch (value) {
			case 1:
				return RECOMMENDED;

			case 2:
				return URGENT;

			case 3:
				return VALUED;

			default:
				throw new Exception("Invalid WayOfSending " + value);
			}

		}

		WayOfSending(int status) {
			this.status = status;
		}

		public int getValue() {
			return status;
		}
	}

	int id;
	String sender;
	String recipient;
	double weight;
	Status status;
	WayOfSending wayOfSending;
	Date dateToSent;
	Date dateToDelivered;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param sender
	 * @param recipient
	 * @param weight
	 * @param status
	 * @param wayOfSending
	 * @param dateToSent
	 * @param dateToDelivered
	 */
	public Package(int id, String sender, String recipient, double weight, Status status, WayOfSending wayOfSending,
			Date dateToSent, Date dateToDelivered) {
		super();
		this.id = id;
		this.sender = sender;
		this.recipient = recipient;
		this.weight = weight;
		this.status = status;
		this.wayOfSending = wayOfSending;
		this.dateToSent = dateToSent;
		this.dateToDelivered = dateToDelivered;
	}

	public void assignId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getSender() {
		return sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public double getWeight() {
		return weight;
	}

	public Status getStatus() {
		return status;
	}

	public WayOfSending getWayOfSending() {
		return wayOfSending;
	}

	public Date getDateToSent() {
		return dateToSent;
	}

	public Date getDateToDelivered() {
		return dateToDelivered;
	}

}
