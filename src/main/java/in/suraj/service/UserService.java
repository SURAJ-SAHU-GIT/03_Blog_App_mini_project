package in.suraj.service;

import in.suraj.binding.LoginForm;
import in.suraj.binding.registrationForm;

public interface UserService {
	
	public boolean registerationform(registrationForm form);

	public String loginform(LoginForm form);
}
