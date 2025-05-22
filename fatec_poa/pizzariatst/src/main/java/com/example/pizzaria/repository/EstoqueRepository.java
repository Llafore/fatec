package com.example.pizzaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pizzaria.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository <Estoque, Long>{
	public List<Estoque> findAllByNomeContainingIgnoreCase(String nome);
}