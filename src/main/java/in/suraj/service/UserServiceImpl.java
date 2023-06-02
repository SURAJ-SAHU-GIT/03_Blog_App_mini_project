package in.suraj.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.suraj.binding.LoginForm;
import in.suraj.binding.registrationForm;
import in.suraj.entity.UserEntity;
import in.suraj.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	private UserEntity entity;

	@Override
	public String loginform(LoginForm form) {
		// TODO Auto-generated method stub

		UserEntity entity = userRepo.findByEmailAndPwd(form.getEmail(), form.getPwd());
		
		if(entity == null) {
			return "Invalid Credentials";
		} 
		
		return "success";

	}

	@Override
	public boolean registerationform(registrationForm form) {
		// TODO Auto-generated method stub

		UserEntity user = userRepo.findByEmail(form.getEmail());

		if (user != null) {
			return false;
		}

		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(form, entity);
		userRepo.save(entity);

		return true;
	}

}
