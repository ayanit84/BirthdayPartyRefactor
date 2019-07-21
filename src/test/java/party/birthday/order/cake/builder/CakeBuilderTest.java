package party.birthday.order.cake.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import party.birthday.order.cake.model.CakeColor;
import party.birthday.order.cake.model.CakeFlavor;
import party.birthday.order.cake.model.CakeFrostingFlavor;
import party.birthday.order.cake.model.CakeShape;
import party.birthday.order.cake.model.CakeSize;

public class CakeBuilderTest {

	@Test
	public void testNewBuilder() {
		Cake testCake = Cake.newBuilder(CakeFlavor.Chocolate).withFrostingFlavor(CakeFrostingFlavor.Vanilla)
				.withShape(CakeShape.Circle).ofSize(CakeSize.Medium).withColor(CakeColor.Brown).build();
		assertEquals(CakeFlavor.Chocolate, testCake.getFlavor());
		assertEquals(CakeFrostingFlavor.Vanilla, testCake.getFrostingFlavor());
		assertEquals(CakeShape.Circle, testCake.getShape());
		assertEquals(CakeColor.Brown, testCake.getColor());
		assertEquals(CakeSize.Medium, testCake.getSize());
	}
}
