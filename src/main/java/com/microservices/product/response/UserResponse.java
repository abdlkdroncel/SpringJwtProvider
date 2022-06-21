package com.microservices.product.response;

import com.microservices.product.model.Users;
import lombok.Data;

@Data
public class UserResponse {
	
	Long id;
	String userName;

	public UserResponse(Users entity) {
		this.id = entity.getId();
		this.userName = entity.getUserName();
	} 
}
