package com.urf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.urf.entity.User;
import com.urf.repo.Repo;

@Controller
public class ControllerHome {
	@Autowired
	private Repo repo;

	@GetMapping("/home")
	public String first()
	{
		return "homepage";
	}
	@PostMapping("/register")
	public String secondPage(@ModelAttribute User user)
	{
		repo.save(user);
		
		return "final";
	}
}
