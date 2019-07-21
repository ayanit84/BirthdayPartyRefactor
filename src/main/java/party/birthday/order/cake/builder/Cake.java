package party.birthday.order.cake.builder;

import party.birthday.order.cake.model.CakeColor;
import party.birthday.order.cake.model.CakeFlavor;
import party.birthday.order.cake.model.CakeFrostingFlavor;
import party.birthday.order.cake.model.CakeShape;
import party.birthday.order.cake.model.CakeSize;

public class Cake {
	private final CakeFlavor flavor;
	private final CakeFrostingFlavor frostingFlavor;
	private final CakeShape shape;
	private final CakeSize size;
	private final CakeColor color;

	public static Builder newBuilder(final CakeFlavor flavor) {
		return new Builder(flavor);
	}

	public CakeFlavor getFlavor() {
		return flavor;
	}

	public CakeFrostingFlavor getFrostingFlavor() {
		return frostingFlavor;
	}

	public CakeShape getShape() {
		return shape;
	}

	public CakeSize getSize() {
		return size;
	}

	public CakeColor getColor() {
		return color;
	}

	private Cake(Builder builder) {
		this.flavor = builder.flavor;
		this.frostingFlavor = builder.frostingFlavor;
		this.shape = builder.shape;
		this.size = builder.size;
		this.color = builder.color;
	}

	public static class Builder {
		private CakeFlavor flavor;
		private CakeFrostingFlavor frostingFlavor;
		private CakeShape shape;
		private CakeSize size;
		private CakeColor color;

		public Builder(final CakeFlavor flavor) {
			this.flavor = flavor;
		}

		public Builder withFrostingFlavor(final CakeFrostingFlavor frostingFlavor) {
			this.frostingFlavor = frostingFlavor;

			return this;
		}
		
		public Builder withShape(final CakeShape shape) {
			this.shape = shape;

			return this;
		}
		
		public Builder ofSize(final CakeSize size) {
			this.size = size;

			return this;
		}
		
		public Builder withColor(final CakeColor color) {
			this.color = color;

			return this;
		}

		public Cake build() {
			return new Cake(this);
		}
	}

}
