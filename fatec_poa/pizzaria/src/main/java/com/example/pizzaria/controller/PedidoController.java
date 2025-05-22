package com.example.pizzaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pizzaria.Menu;
import com.example.pizzaria.Pedido;
import com.example.pizzaria.repository.MenuRepository;
import com.example.pizzaria.repository.PedidoRepository;

@RestController
@RequestMapping("/pedido")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class PedidoController {
	@Autowired
	private PedidoRepository repository;
	
	@Autowired
    private MenuRepository menuRepository;

    @PostMapping
    public ResponseEntity<Pedido> post(@RequestBody Pedido pedido) {
        for (Menu menuItem : pedido.getItem()) {
            if (menuItem.getId() == 0) {
                menuRepository.save(menuItem); 
            }
        }
        Pedido novoPedido = repository.save(pedido);

        return ResponseEntity.status(HttpStatus.CREATED).body(novoPedido);
    }
	
	
	/**
	@PostMapping
	public ResponseEntity<Pedido> post (@RequestBody Pedido pedido){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(pedido));
	}
	**/
	
	@GetMapping
    public ResponseEntity<List<Pedido>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getById(@PathVariable("id") Long id) {
        Optional<Pedido> pedido = repository.findById(id);
        return pedido.map(ResponseEntity::ok)
                       .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @PatchMapping("/{id}")
    public ResponseEntity<Pedido> updatePedido(@PathVariable("id") Long id, @RequestBody Pedido updatedPedido) {
        return repository.findById(id).map(pedido -> {
            if (updatedPedido.getQtd() != 0) pedido.setQtd(updatedPedido.getQtd());
            if (updatedPedido.getObservacao() != null) pedido.setObservacao(updatedPedido.getObservacao());
            if (updatedPedido.getValor() != 0.0) pedido.setValor(updatedPedido.getValor());

            Pedido updated = repository.save(pedido);
            return ResponseEntity.ok(updated);
        }).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedido(@PathVariable("id") Long id) {
        Optional<Pedido> pedido = repository.findById(id);
        if (pedido.isPresent()) {
            repository.delete(pedido.get());
            return ResponseEntity.noContent().build(); 
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); 
        }
    }
}
