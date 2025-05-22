package com.example.pizzaria;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;

import com.example.pizzaria.controller.CadastroController;

@SpringBootApplication
public class PizzariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzariaApplication.class, args);
		ApplicationContext context = SpringApplication.run(PizzariaApplication.class, args);

		int[] itensPedido = {2};
		int idUsuario = 1;
		CadastroController aux = context.getBean(CadastroController.class);
		if(aux.getById(Long.valueOf(idUsuario)) != null) {
			ResponseEntity<Cadastro> usuarioLogin = aux.getById(Long.valueOf(1));

			List<Long> idMenu = Arrays.stream(itensPedido)
				.mapToObj(Long::valueOf)
				.collect(Collectors.toList());

			Pedido ped = usuarioLogin.getBody().gerarPedido(idMenu, Long.valueOf(0), Long.valueOf(1), "Observação do pedido");
			
			usuarioLogin.getBody().enviarPedido(ped);
		}
	}
}
