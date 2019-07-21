package party.birthday.order.cake.model;

public enum CakeFlavor {
	Chocolate("chocolate"), Vanilla("vanilla");
	
	private String value;
	
	private CakeFlavor(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
