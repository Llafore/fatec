package com.example.pizzaria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.pizzaria.controller.MenuController;
import com.example.pizzaria.controller.PedidoController;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cadastro")

public class Cadastro implements Serializable{
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String nome;
		private String cpf;
		private String endereco;
		private String telefone;
		private long idade;
		
		public Pedido gerarPedido(List<Long> idMenu, Long Idped, Long qtde, String obs) {
			MenuController menuController = new MenuController();
			Pedido newPed = new Pedido();
			newPed.setCliente(this);
			newPed.setId(Idped);
			newPed.setQtd(qtde != null ? qtde : 0L);
			newPed.setObservacao(obs);
			double valorTotal = 0.0;
			List<Menu> itensPedido = new ArrayList<>();
			
			for (Long id : idMenu) {
				ResponseEntity<Menu> response = menuController.getById(id);
		        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
		        	Menu menuItem = response.getBody();
		            itensPedido.add(menuItem);
		            double valorItem = menuController.getValorById(id).getBody();
		            valorTotal += valorItem;
		        }
			}
		    newPed.setItem(itensPedido);
		    newPed.setValor(valorTotal); 
			return newPed;
		};
		
		public void enviarPedido(Pedido pedido){
			PedidoController pControl = new PedidoController();
			pControl.post(pedido);
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public long getIdade() {
			return idade;
		}
		public void setIdade(long idade) {
			this.idade = idade;
		}	
}
