package in.suraj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.suraj.entity.CommentEntity;

public interface CommentRepo extends JpaRepository<CommentEntity, Integer> {

}
