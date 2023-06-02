package in.suraj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.suraj.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
	
	public UserEntity findByEmail(String email);
	
	public UserEntity findByEmailAndPwd(String email, String pwd);

}
