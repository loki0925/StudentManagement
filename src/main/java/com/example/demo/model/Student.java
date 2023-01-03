package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studentid;
	
	private String firstName;
	
	private String lastName;
	
	private Date date_of_birth;
	
	private String gender;
	
	private String Address;
	
	private String city;
	
	private String pincode;
	
	private String school_name;
	
	private int standard;
	
    private String School_devision;
    
    private String fathers_name;
    
    private String mothers_name;
    
    private String parent_occupation;
    
    private String Whatsapp_number;
    
    private String emailId;
    
	
}
