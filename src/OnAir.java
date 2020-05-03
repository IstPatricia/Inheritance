
public class OnAir extends Vehicle {

	private int noTurbines = 2;
	private boolean hasFirstClass;

	public OnAir(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}

	public OnAir(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}

	public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
		super(serialNumber, noPersons, name);
		this.noTurbines = noTurbines;
	}

	public OnAir(String serialNumber, int noPersons, String name, int noTurbines, boolean hasFirstClass) {
		this(serialNumber, noPersons, name, noTurbines);
		this.hasFirstClass = hasFirstClass;
	}

	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Flying the airplane to coordinates: " + "[" + positionX + " , " + positionY + "]");
		return true;
	}

	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the airplane");
		return true;
	}

	@Override
	public void printInfo() {
		System.out.println("Airplane properties:\t\n" + "	- serial number: " + super.getSerialNumber() + "\t\n"
				+ "	- capacity: " + super.getNoPersons() + " persons\t\n" + "	- name:" + this.getName() + "\t\n"
				+ "Airplane properties:\t\n" + "	- number of turbines: " + noTurbines);
		
		if (hasFirstClass) {
			System.out.println("	- has first class");
		} else {
			System.out.println("	- does not have first class");
		}

	}
}
