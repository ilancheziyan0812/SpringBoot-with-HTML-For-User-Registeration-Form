package com.urf.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urf.entity.User;

public interface Repo extends JpaRepository<Integer, User> {

	void save(User user);

}
