package party.birthday.order.request;

public class PartyRequest {
	private BallonRequest ballonRequest;
	private CakeRequest cakeRequest;

	public PartyRequest() {
	}

	public PartyRequest(BallonRequest ballonRequest, CakeRequest cakeRequest) {
		this.ballonRequest = ballonRequest;
		this.cakeRequest = cakeRequest;
	}

	public BallonRequest getBallonRequest() {
		return ballonRequest;
	}

	public void setBallonRequest(BallonRequest ballonRequest) {
		this.ballonRequest = ballonRequest;
	}

	public CakeRequest getCakeRequest() {
		return cakeRequest;
	}

	public void setCakeRequest(CakeRequest cakeRequest) {
		this.cakeRequest = cakeRequest;
	}

}
