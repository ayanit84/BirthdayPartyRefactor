package party.birthday.order.cake.model;

public enum CakeFrostingFlavor {
	Chocolate("chocolate"), Vanilla("vanilla");
	
	private String value;
	
	private CakeFrostingFlavor(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
