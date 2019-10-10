
public class AUDIFactory implements CarFactory {

	public Body getBody() {
		return new AUDIBody();
	}

	public Engine getEngine() {
		return new AUDIEngine();
	}

	public Interior getInterior() {
		return new AUDIInterior();
	}

}
