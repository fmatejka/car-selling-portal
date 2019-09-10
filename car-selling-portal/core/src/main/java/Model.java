import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model {
	
	@Id
	private int id;
	private String name;
	private int manufacturer_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getManufacturer_id() {
		return manufacturer_id;
	}
	public void setManufacturer_id(int manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", manufacturer_id=" + manufacturer_id + "]";
	}
	
	
	
	

}
