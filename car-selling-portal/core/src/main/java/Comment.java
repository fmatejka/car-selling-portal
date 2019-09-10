import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
	
	@Id
	private int id;
	private String text;
	private int car_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", car_id=" + car_id + "]";
	}
	
	
	
	

}
