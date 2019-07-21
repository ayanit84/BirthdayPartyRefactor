package party.birthday.order.cake.model;

public enum CakeShape {
	Circle("circle"), Square("square"), Rectangle("rectangle");
	
	private String value;
	
	private CakeShape(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
