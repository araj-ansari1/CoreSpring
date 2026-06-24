package com.app.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {
	@NotNull(message = "is required")
	@NotBlank
	private String firstName;
	
	@NotNull(message = "is required")
	@NotBlank
	@Size(min = 0, message = "is required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value = 0, message = "Not valid number of Passes")
	@Max(value = 10, message = "Not Valid number of passes")
	private int freepasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "Only 5 Character of digit")
	private String postCode;
	
	@NotNull(message = "Field is required")
	@Email(message = "Invalid Email | Please enter valid email")
	private String email;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(@NotNull(message = "is required") @NotBlank String firstName,
			@NotNull(message = "is required") @NotBlank @Size(min = 0, message = "is required") String lastName,
			@NotNull(message = "is required") @Min(value = 0, message = "Not valid number of Passes") @Max(value = 10, message = "Not Valid number of passes") int freepasses,
			@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 Character of digit") String postCode,
			@NotNull(message = "Field is required") @Email(message = "Invalid Email | Please enter valid email") String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.freepasses = freepasses;
		this.postCode = postCode;
		this.email = email;
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

	public int getFreepasses() {
		return freepasses;
	}

	public void setFreepasses(int freepasses) {
		this.freepasses = freepasses;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
}
