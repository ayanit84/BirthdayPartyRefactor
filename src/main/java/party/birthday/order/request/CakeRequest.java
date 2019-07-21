package party.birthday.order.request;

import party.birthday.order.cake.model.CakeColor;
import party.birthday.order.cake.model.CakeFlavor;
import party.birthday.order.cake.model.CakeFrostingFlavor;
import party.birthday.order.cake.model.CakeShape;
import party.birthday.order.cake.model.CakeSize;

public class CakeRequest {
	private CakeFlavor flavor;
	private CakeFrostingFlavor frostingFlavor;
	private CakeShape shape;
	private CakeSize size;
	private CakeColor cakeColor;

	public CakeRequest() {
	}
	
	
	public CakeRequest(CakeFlavor flavor, CakeFrostingFlavor frostingFlavor, CakeShape shape, CakeSize size,
			CakeColor cakeColor) {
		this.flavor = flavor;
		this.frostingFlavor = frostingFlavor;
		this.shape = shape;
		this.size = size;
		this.cakeColor = cakeColor;
	}


	public CakeFlavor getFlavor() {
		return flavor;
	}

	public void setFlavor(CakeFlavor flavor) {
		this.flavor = flavor;
	}

	public CakeFrostingFlavor getFrostingFlavor() {
		return frostingFlavor;
	}

	public void setFrostingFlavor(CakeFrostingFlavor frostingFlavor) {
		this.frostingFlavor = frostingFlavor;
	}

	public CakeShape getShape() {
		return shape;
	}

	public void setShape(CakeShape shape) {
		this.shape = shape;
	}

	public CakeSize getSize() {
		return size;
	}

	public void setSize(CakeSize size) {
		this.size = size;
	}

	public CakeColor getCakeColor() {
		return cakeColor;
	}

	public void setCakeColor(CakeColor cakeColor) {
		this.cakeColor = cakeColor;
	}
}
