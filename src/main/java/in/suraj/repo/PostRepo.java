package in.suraj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.suraj.entity.PostEntity;

public interface PostRepo extends JpaRepository<PostEntity, Integer>{

}
