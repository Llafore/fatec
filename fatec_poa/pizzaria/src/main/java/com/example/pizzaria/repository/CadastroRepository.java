package com.example.pizzaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pizzaria.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository <Cadastro, Long>{
	public List<Cadastro> findAllByNomeContainingIgnoreCase(String nome);	
}
