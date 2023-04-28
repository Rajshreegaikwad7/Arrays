package com.example.Controller;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RequestController {
	@PostMapping("/user")
	public static String receiveUser(@RequestBody User user)
	{
		System.out.println(user.getId());
		System.out.println(user.getName());
		return "User received";
		
	}
}
