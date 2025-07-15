package keyword;

public class Client {

	private static String staticName;
	private String name;
	
	public static String getStaticName() {
		return staticName;
	}
	
	public static void setStaticName(String value) {
		staticName = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
