package party.birthday.order.ballon.builder;

import static org.junit.Assert.*;
import org.junit.Test;

import party.birthday.order.ballon.model.BallonColor;
import party.birthday.order.ballon.model.BallonMaterial;

public class BallonBuilderTest {

	@Test
	public void testNewBuilder() {
		Ballon testBallon = Ballon.newBuilder(5).withColor(BallonColor.Blue).withMaterial(BallonMaterial.latex).build();
		assertEquals(5, testBallon.getCount());
		assertEquals(BallonColor.Blue, testBallon.getColor());
		assertEquals(BallonMaterial.latex, testBallon.getMaterial());
	}
}
