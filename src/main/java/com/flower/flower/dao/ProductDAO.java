package com.flower.flower.dao;

import com.flower.flower.bean.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductDAO extends JpaRepository<product,Integer> {
}
