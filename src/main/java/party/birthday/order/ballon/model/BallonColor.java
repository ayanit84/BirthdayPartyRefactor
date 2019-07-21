package party.birthday.order.ballon.model;

public enum BallonColor {
	Red("red"), Blue("blue"), Yellow("yellow");
	
	private String value;
	
	private BallonColor(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
