package dam.tan.springrest.model;

public class Message {
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Message(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	public Message() {
		super();
	}
}
