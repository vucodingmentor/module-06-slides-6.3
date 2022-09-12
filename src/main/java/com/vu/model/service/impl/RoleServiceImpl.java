package com.vu.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vu.model.entity.Role;
import com.vu.model.repository.RoleRepository;
import com.vu.model.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role getById(Integer id) {
		return roleRepository.findById(id).get();
	}

}
