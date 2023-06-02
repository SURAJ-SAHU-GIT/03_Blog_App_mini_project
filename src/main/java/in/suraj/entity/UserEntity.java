package in.suraj.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_TBL")
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
		return "UserEntity [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pwd=" + pwd
				+ ", getId()=" + getId() + ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getEmail()="
				+ getEmail() + ", getPwd()=" + getPwd() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

	@OneToMany(mappedBy="user", cascade=CascadeType.REMOVE)
	private List<PostEntity> posts;

}
