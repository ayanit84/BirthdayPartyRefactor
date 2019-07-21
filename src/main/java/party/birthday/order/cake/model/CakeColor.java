package party.birthday.order.cake.model;

public enum CakeColor {
	Red("red"), Blue("blue"), Yellow("yellow"), Brown("brown");
	
	private String value;
	
	private CakeColor(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
