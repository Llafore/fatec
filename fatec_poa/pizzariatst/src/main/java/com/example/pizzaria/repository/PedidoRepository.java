package com.example.pizzaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pizzaria.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long>{
	public List<Pedido> findAllByObservacaoContainingIgnoreCase(String observacao);	
}
