package in.suraj.binding;

public class registrationForm {
	
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "registrationForm [fname=" + fname + ", lname=" + lname + ", email=" + email + ", pwd=" + pwd
				+ ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getEmail()=" + getEmail()
				+ ", getPwd()=" + getPwd() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
