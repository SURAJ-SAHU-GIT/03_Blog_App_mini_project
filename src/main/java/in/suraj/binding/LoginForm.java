package in.suraj.binding;

public class LoginForm {
	
	private String email;
	private String pwd;
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
		return "loginForm [email=" + email + ", pwd=" + pwd + ", getEmail()=" + getEmail() + ", getPwd()=" + getPwd()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
