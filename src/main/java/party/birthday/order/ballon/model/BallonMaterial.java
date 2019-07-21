package party.birthday.order.ballon.model;

public enum BallonMaterial {
	Mylar("mylar"), latex("latex");
	
	private String value;
	
	private BallonMaterial(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
