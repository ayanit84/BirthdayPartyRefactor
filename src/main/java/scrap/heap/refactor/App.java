package scrap.heap.refactor;

import party.birthday.order.ballon.builder.Ballon;
import party.birthday.order.ballon.model.BallonColor;
import party.birthday.order.ballon.model.BallonMaterial;
import party.birthday.order.cake.builder.Cake;
import party.birthday.order.cake.model.CakeColor;
import party.birthday.order.cake.model.CakeFlavor;
import party.birthday.order.cake.model.CakeFrostingFlavor;
import party.birthday.order.cake.model.CakeShape;
import party.birthday.order.cake.model.CakeSize;
import party.birthday.order.request.BallonRequest;
import party.birthday.order.request.CakeRequest;
import party.birthday.order.request.PartyRequest;

public class App {
	public String getGreeting() {
		return "Hello world.";
	}

	public static void main(String[] args) {

		// Place birthday party orders
		order(new PartyRequest(new BallonRequest(BallonColor.Red, BallonMaterial.Mylar, 4),
				new CakeRequest(CakeFlavor.Chocolate, CakeFrostingFlavor.Chocolate, CakeShape.Circle, CakeSize.Large,
						CakeColor.Brown)));
		
		order(new PartyRequest(new BallonRequest(BallonColor.Blue, BallonMaterial.latex, 7),
				new CakeRequest(CakeFlavor.Vanilla, CakeFrostingFlavor.Chocolate, CakeShape.Square, CakeSize.Medium,
						CakeColor.Brown)));
		
		order(new PartyRequest(new BallonRequest(BallonColor.Red, BallonMaterial.Mylar, 4),
				new CakeRequest(CakeFlavor.Chocolate, CakeFrostingFlavor.Chocolate, CakeShape.Circle, CakeSize.Large,
						CakeColor.Brown)));

	}

	private static void order(final PartyRequest partyRequest) {

		orderBalloons(partyRequest.getBallonRequest());

		orderCake(partyRequest.getCakeRequest());
	}

	private static void orderBalloons(final BallonRequest request) {

		// for the purposes of this exercise, pretend this method works and adds
		// balloons to the order
		Ballon ballon = Ballon.newBuilder(request.getNumber()).withColor(BallonColor.Blue)
				.withMaterial(BallonMaterial.latex).build();

		System.out.println("Balloons ordered; " + ballon.getColor().name() + ", " + ballon.getMaterial().name() + ", "
				+ ballon.getCount());

	}

	private static void orderCake(final CakeRequest request) {

		// for the purposes of this exercise, pretend that this method adds a cake to
		// the order
		Cake cake = Cake.newBuilder(CakeFlavor.Chocolate).withFrostingFlavor(CakeFrostingFlavor.Vanilla)
				.withShape(CakeShape.Circle).ofSize(CakeSize.Medium).withColor(CakeColor.Brown).build();
		System.out.println("cake ordered; " + cake.getFlavor().name() + ", " + cake.getFrostingFlavor().name() + ", "
				+ cake.getShape().name() + ", " + cake.getSize().name() + ", " + cake.getColor().name());

	}

}
