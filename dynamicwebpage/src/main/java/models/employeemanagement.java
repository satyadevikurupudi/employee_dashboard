package models;

public class employeemanagement {
	private String rollno;
	private String name;
	private String email;
	private String password;
	private long phonenum;
	private int gender;
	private String address;
	private int pincode;
	private double salary;
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public employeemanagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employeemanagement(String rollno, String name, String email, String password, long phonenum, int gender,
			String address, int pincode, double salary) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phonenum = phonenum;
		this.gender = gender;
		this.address = address;
		this.pincode = pincode;
		this.salary = salary;
	}

}
