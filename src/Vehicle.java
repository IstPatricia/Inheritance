
public class Vehicle {

	private final String serialNumber;
	private int noPersons;
	private String name;

	public Vehicle(String serialNumber, int noPersons) {
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}

	public Vehicle(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoPersons(int noPersons) {
		this.noPersons = noPersons;
	}

	public int getNoPersons() {
		return noPersons;
	}

	// metoda nu poate fi suprascrisa: final
	public final String getSerialNumber() {
		return this.serialNumber;
	}

	public boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move…");
		return false;
	}

	public boolean addFuel(double amount) {
		System.out.println("Error: unknown type of vehicle…");
		return false;
	}

	void printInfo() {
		System.out.println("Vehicle properties:\t\n" + "	- serial number: " + serialNumber + "\t\n" + "	- capacity: "
				+ noPersons + "\r\n" + "	- name: " + this.getName());
	}

}
