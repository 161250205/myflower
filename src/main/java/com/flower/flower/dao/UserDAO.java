package com.flower.flower.dao;

import com.flower.flower.bean.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<user, String>{
}
