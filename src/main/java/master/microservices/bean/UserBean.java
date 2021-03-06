package master.microservices.bean;

import java.util.Date;

public class UserBean {
	private Integer id;
	
	private String name;
	
	private Date birthDate;

	public UserBean(Integer id, String name, Date birthDate) {
		super();
		System.out.printf("user bean init id: %d; name: %s; date: %s \n", id, name, birthDate);

		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
	

}
