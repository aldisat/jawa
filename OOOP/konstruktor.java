public class konstruktor {
	int modelYear;
	String modelName;

	public konstruktor(int year, String name) {
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args) {
		konstruktor myObj = new konstruktor(1969, "Mustang");
		System.out.println(myObj.modelYear + " " + myObj.modelName);
	}
}

