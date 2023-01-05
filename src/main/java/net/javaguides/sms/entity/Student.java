package net.javaguides.sms.entity;


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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private Date dob;
	
	private String gender;
	
    private String address;
    
    private String city;
    
    private String pincode;
    
    private String schoolname;
    
    private String fname;
    
    private String mname;
    
    private String fathers_occu;
    
    private String whatsapp_number;

	@Column(name = "email")
	private String email;

	

}
