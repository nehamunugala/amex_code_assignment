package amex.ws;

public class Customer {

	String address;
	String name;
	String phnum;
	String email;
	
	public Customer(String address,String name,	String phnum,String email){
		this.address= address;
		this. name= name;
		this.phnum=phnum;
		this.email=email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnum() {
		return phnum;
	}
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
