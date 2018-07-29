package com.flower.flower.dao;

import com.flower.flower.bean.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<product,Integer> {
}
