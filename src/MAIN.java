
public class MAIN {

	public static void main(String[] args) {

		Vehicle aVehicle = new Vehicle("0NN000", 5, " Generic Vehicle");
		OnRoad car = new OnRoad("0NN123", 4, " Toyota", 4, 4);
		OnWater boat = new OnWater("0NN456", 6, "Ocean Love", 2, 123.7);
		OnAir plane = new OnAir("0NN789", 2, " Flying Beauty", 2, false);
		OnAir secondPlane = new OnAir("0NN911", 50, " Flash", 4, true);

		
		aVehicle.goTo(15, 17.34);
		aVehicle.addFuel(123);
		aVehicle.printInfo();
		System.out.println();
		
		car.goTo(12.3, 124.9);
		car.addFuel(143);
		car.printInfo();
		System.out.println();
		
		boat.goTo(12.3, 125.7);
		boat.addFuel(1234);
		boat.printInfo();
		System.out.println();

		plane.goTo(186.3, 123.9);
		plane.addFuel(13353);
		plane.printInfo();
		System.out.println();

		secondPlane.goTo(143.5, 1345.1);
		secondPlane.addFuel(1234233);
		secondPlane.printInfo();

	}
}
