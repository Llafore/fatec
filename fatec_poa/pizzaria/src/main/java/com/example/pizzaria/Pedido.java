package com.example.pizzaria;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

	@Entity
	@Table(name="pedido")
	

public class Pedido {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private long qtd;
		private String observacao;
		private double valor;
		
		@Temporal (TemporalType.TIMESTAMP)
		private Date data = new java.sql.Date(System.currentTimeMillis());

		@OneToMany(cascade = CascadeType.PERSIST)
		@JsonIgnoreProperties ("pedido")
		private List<Menu> item;
		
		
		@JsonIgnoreProperties ("pedido")
		private Cadastro cliente;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getQtd() {
			return qtd;
		}

		public void setQtd(long qtd) {
			this.qtd = qtd;
		}

		public String getObservacao() {
			return observacao;
		}

		public void setObservacao(String observacao) {
			this.observacao = observacao;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public List<Menu> getItem() {
			return item;
		}

		public void setItem(List<Menu> item) {
			this.item = item;
		}

		public Cadastro getCliente() {
			return cliente;
		}

		public void setCliente(Cadastro cliente) {
			this.cliente = cliente;
		}
}
