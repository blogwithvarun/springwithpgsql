package in.varun.springwithpgsql.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.varun.springwithpgsql.model.User;
import in.varun.springwithpgsql.repository.PostRepository;

@RestController
@RequestMapping(value="/api/v1")
public class PostController {
	
	@Autowired
	PostRepository postRepo;


	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/data")
	public List<User> findAll(){
		return (List<User>) postRepo.findAll();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/data")
	public String savel(){
		
		User p = new User();
		UUID uuid =UUID.randomUUID();
		p.setId(uuid);
		p.setName("First data");
		p.setPhone("8987654321");
		postRepo.save(p);
		
		return "Data Inserted Successfully!!";
	}
}


