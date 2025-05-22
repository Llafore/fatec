package com.example.pizzaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pizzaria.Menu;

@Repository
public interface MenuRepository extends JpaRepository <Menu, Long>{
	public List<Menu> findAllByNomeContainingIgnoreCase(String nome);
}
