package in.suraj.entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name="POST_TBL")
public class PostEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	@Lob
	private String content;
	@CreationTimestamp
	private LocalDate createdOn;
	@UpdateTimestamp
	private LocalDate updatedOn;
	@Override
	public String toString() {
		return "PostEntity [id=" + id + ", title=" + title + ", description=" + description + ", content=" + content
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;
	
	@OneToMany(mappedBy= "post", cascade=CascadeType.REMOVE)
	private List<CommentEntity> comment; 

}
