package com.sony.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sony.model.User;

@Service
public class UserManager {
	private Map<String, User>users;
	
	public UserManager() {
		users = new HashMap<>();
		User user;
		
		user = new User("Vi","Kumar","vinod@xmpl.com","Bangalore");
		users.put(user.getId(),user);
		
		user = new User("John","Doe","johndoe@xmpl.com","Dallas");
		users.put(user.getId(), user);
		
		user = new User("Jane","Doe","jane@xmpl.com","Chicago");
		users.put(user.getId(),user);
		
		
	}

	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return this.users.values();
	}
	
	public User getUserById(String id) {
		return this.users.get(id);
				
	}

}
