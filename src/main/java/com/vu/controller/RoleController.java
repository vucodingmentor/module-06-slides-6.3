package com.vu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vu.model.entity.Role;
import com.vu.model.service.RoleService;

@Controller
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@GetMapping("/role/id/2")
	public String getRole(Model model) {
		Role role = roleService.getById(2);
		model.addAttribute("role", role);
		return "role/index";
	}
}
