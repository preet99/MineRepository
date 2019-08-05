package com.manpreet.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	private static List<User> users = new ArrayList<User>();

	private static int userCount = 3;

	static {
		users.add(new User(4, "Vin", new Date()));
		users.add(new User(1, "Manne", new Date()));
		users.add(new User(2, "Ashish", new Date()));
		users.add(new User(3, "Nisha", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public void saveUser(User user) {
		List<User> userFound = users.stream().filter(it -> it.getId() == user.getId()).collect(Collectors.toList());
		System.out.println(userFound);
		if (userFound.isEmpty() || userFound == null) {
			users.add(user);
			System.out.println(users);
		}
	}

	public User getById(long id) {
		List<User> userFound = users.stream().filter(it -> it.getId() == id).collect(Collectors.toList());
		if (userFound != null && !userFound.isEmpty()) {
			return userFound.get(0);
<<<<<<< HEAD
=======
		} else {
			return null;
>>>>>>> 65d8c9829482e31156553516a373a989f4336a79
		}
		return null; 
	}
	
	public String deleteById(long id)
	{
		User userFound = users.stream().filter(it -> it.getId() == id).collect(Collectors.toList()).get(0);
		if(userFound != null)
		{
			users.remove(userFound);
			return "removed";
		}
		else {
			return null;
		}
		
		
	}

}
