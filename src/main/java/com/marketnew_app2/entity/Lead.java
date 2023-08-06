package com.marketnew_app2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class Lead {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name",length=45,nullable=false)
	private String firstName;
	
	@Column(name="last_name",length=45,nullable=false)
	private String lastName;
	
	@Column(name="email",length=128,nullable=false,unique=true)
    private String email;
	
	@Column(name="mobile",length=10,nullable=false,unique=true)
    private long mobile;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	     //   if (isValidMobileNumber(mobile)) {
	            this.mobile = mobile;
	    }
}
//	        } else {
//	            throw new IllegalArgumentException("Invalid mobile number. Please provide a valid mobile number.");
//	        }
//	    }
//
//	    private boolean isValidMobileNumber(long mobile) {
//	        // Convert the mobile number to a string for further validation
//	        String mobileStr = String.valueOf(mobile);
//
//	        // Validate that the mobile number has exactly 10 digits.
//	        if (mobileStr.length() != 10) {
//	            return false;
//	        }
//
//	        // Validate that the mobile number starts with 6789.
//	        if (!mobileStr.matches("^[6789]\\d{9}$")) {
//	            return false;
//	        }
//
//	        // Additional checks can be added here based on specific requirements.
//
//	        return true;
//	    }
    
//}
