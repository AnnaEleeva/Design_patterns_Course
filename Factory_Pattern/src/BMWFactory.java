
public class BMWFactory implements CarFactory {

	public Body getBody() {
		return new BMWBody();
	}

	public Engine getEngine() {
		return new BMWEngine();
	}

	
	public Interior getInterior() {
		
		return new BMWInterior();
	}

}
