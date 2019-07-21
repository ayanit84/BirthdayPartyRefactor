package party.birthday.order.ballon.builder;

import party.birthday.order.ballon.model.BallonColor;
import party.birthday.order.ballon.model.BallonMaterial;

public class Ballon {
	private final BallonColor color;
	private final BallonMaterial material;
	private final int count;
	
	public static Builder newBuilder(final int count) {
		return new Builder(count);
	}
	
	public BallonColor getColor() {
		return color;
	}
	
	public BallonMaterial getMaterial() {
		return material;
	}
	
	public int getCount() {
		return count;
	}

	private Ballon(Builder builder) {
		this.color = builder.color;
		this.material = builder.material;
		this.count = builder.count;
	}
	
	
	public static class Builder {
		private BallonColor color;
		private BallonMaterial material;
		private int count;
		
		public Builder(final int count) {
			this.count = count;
		}
		
		public Builder withColor(final BallonColor color) {
			this.color = color;
			
			return this;
		}
		
		public Builder withMaterial(final BallonMaterial material) {
			this.material = material;
			
			return this;
		}
		
		public Ballon build() {
			return new Ballon(this);
		}
	}
	
}
