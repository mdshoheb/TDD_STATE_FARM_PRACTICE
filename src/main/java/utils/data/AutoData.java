package utils.data;

public class AutoData {
	
	private String zipCode;
	private String firstName;
	private String middleInit;
	private String lastName;
	private String address;
	private String apt;
	private String dob;
	
	public AutoData(String zipCode, String firstName, String middleInit, String lastName, String address, String apt,
			String dob) {
		this.zipCode = zipCode;
		this.firstName = firstName;
		this.middleInit = middleInit;
		this.lastName = lastName;
		this.address = address;
		this.apt = apt;
		this.dob = dob;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleInit() {
		return middleInit;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getApt() {
		return apt;
	}

	public String getDob() {
		return dob;
	}

}
