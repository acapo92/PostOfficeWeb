package factory;

public class DbResult {

	public enum Status {
		OK, ERROR
	}

	private Status status;
	private String message;
	private Object data;

	public DbResult(Status status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	
	public Status getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

}
