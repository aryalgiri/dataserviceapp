package app.dataservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataServiceEntity {
	private String data;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public DataServiceEntity(String data, Long id) {
		this.data = data;
		this.id = id;
	}
	public DataServiceEntity() {
		
		
	}

}
