package com.gl.springBootCaseStudy.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.springBootCaseStudy.bean.MyUsers;



@Repository
public interface MyUsersRepository extends JpaRepository<MyUsers, String> {
	Optional<MyUsers> findUserByUsername(String username);
}


