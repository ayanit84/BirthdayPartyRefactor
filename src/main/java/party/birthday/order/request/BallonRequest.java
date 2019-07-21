package party.birthday.order.request;

import party.birthday.order.ballon.model.BallonColor;
import party.birthday.order.ballon.model.BallonMaterial;

public class BallonRequest {

	private BallonColor color;
	private BallonMaterial material;
	private int number;

	public BallonRequest() {
	}
	
	public BallonRequest(BallonColor color, BallonMaterial material, int number) {
		this.color = color;
		this.material = material;
		this.number = number;
	}

	public BallonColor getColor() {
		return color;
	}

	public void setColor(BallonColor color) {
		this.color = color;
	}

	public BallonMaterial getMaterial() {
		return material;
	}

	public void setMaterial(BallonMaterial material) {
		this.material = material;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
