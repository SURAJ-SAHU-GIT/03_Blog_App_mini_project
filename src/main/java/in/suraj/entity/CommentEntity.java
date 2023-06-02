package in.suraj.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "COMMENT_TBL")
public class CommentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	@Lob
	private String content;
	@CreationTimestamp
	private LocalDate createdOn;
	@Override
	public String toString() {
		return "CommentEntity [id=" + id + ", name=" + name + ", email=" + email + ", content=" + content
				+ ", createdOn=" + createdOn + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private PostEntity post;
	
}
