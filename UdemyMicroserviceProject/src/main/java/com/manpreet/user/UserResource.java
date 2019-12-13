package com.manpreet.user;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDao userDao;


	@GetMapping(path = "/users")
	private List<User> retrieveListOfUSers() {
		return userDao.findAll();
	}

	@PostMapping("/users")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		if (user != null) {
			userDao.saveUser(user);
		}
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	// HATEOAS
	@GetMapping(path = "/users/{id}", produces = { "application/hal+json" })
	public Resource<User> retrieveById(@PathVariable long id) {
		User user = userDao.getById(id);
		if (userDao.getById(id) == null) {
			throw new UserNotFoundException("User not found");
		}

		Resource<User> resource = new Resource<User>(user);
		ControllerLinkBuilder userLink = linkTo(((UserResource) methodOn(UserResource.class)).retrieveListOfUSers());
		resource.add(userLink.withRel("all-users"));
		return resource;

	}

	private Object methodOn(Class<? extends UserResource> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	@DeleteMapping("/users/{id}")
	public void deleteById(@PathVariable long id) {
		if (userDao.deleteById(id) == null) {
			throw new UserNotFoundException("User not found");
		}
	}

	
}
