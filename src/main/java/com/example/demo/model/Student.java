package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
//	private Date date_of_birth;
//	
//	private String gender;
//	
//	private String Address;
//	
//	private String city;
//	
//	private String pincode;
//	
//	private String school_name;
//	
//	private int standard;
//	
//    private String School_devision;
//    
//    private String fathers_name;
//    
//    private String mothers_name;
//    
//    private String parent_occupation;
//    
//    private String Whatsapp_number;
    
	@Column(name = "email")
    private String email;
    
	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
}
