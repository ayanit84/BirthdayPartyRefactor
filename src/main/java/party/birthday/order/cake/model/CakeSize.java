package party.birthday.order.cake.model;

public enum CakeSize {
	Large("large"), Medium("med"), Small("small");
	
	private String value;
	
	private CakeSize(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
