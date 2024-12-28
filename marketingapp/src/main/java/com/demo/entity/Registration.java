package com.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="registrations")
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "full_name", nullable = false,length =100)
	private String name;
	
	@Column(name = "eamil_id", nullable = false,length =150, unique =true)
	private String email;
	
	@Column(name = "mobile_number" , nullable = false, unique = true)
    private long mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}	

}
