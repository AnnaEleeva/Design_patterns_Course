
public class Main {

	public static void main(String[] args) {
		CarFactory factory=getFactoryByMark("BMW");
		Body b=factory.getBody();
		b.createBody();
		b.paintBody();
		Engine e=factory.getEngine();
		e.createEngine();

	}

	static CarFactory getFactoryByMark(String mark) {
		switch (mark) {
		case "BMW":
			return new BMWFactory();
		case "AUDI":
			return new AUDIFactory();
		default:
			throw new RuntimeException("Неподдерживаемая марка: " +mark);
		}
	}

}
