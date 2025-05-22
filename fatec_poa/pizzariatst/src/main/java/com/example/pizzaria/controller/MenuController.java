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
import com.example.pizzaria.repository.MenuRepository;

@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class MenuController {
	@Autowired
	private MenuRepository repository;
	
	@PostMapping
	public ResponseEntity<Menu> post (@RequestBody Menu menu){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(menu));
	}
	
	@GetMapping
    public ResponseEntity<List<Menu>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/valor/{id}")
    public ResponseEntity<Double> getValorById(@PathVariable("id") Long id) {
        Optional<Menu> menu = repository.findById(id);
        if (menu.isPresent()) {
            return ResponseEntity.ok(menu.get().getValor());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Menu> getById(@PathVariable("id") Long id) {
        Optional<Menu> menu = repository.findById(id);
        return menu.map(ResponseEntity::ok)
                       .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @PatchMapping("/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable("id") Long id, @RequestBody Menu updatedMenu) {
        return repository.findById(id).map(menu -> {
            if (updatedMenu.getNome() != null) menu.setNome(updatedMenu.getNome());
            if (updatedMenu.getValor() != 0.0) menu.setValor(updatedMenu.getValor());
            if (updatedMenu.getDescritivo() != null) menu.setDescritivo(updatedMenu.getDescritivo());

            Menu updated = repository.save(menu);
            return ResponseEntity.ok(updated);
        }).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenu(@PathVariable("id") Long id) {
        Optional<Menu> menu = repository.findById(id);
        if (menu.isPresent()) {
            repository.delete(menu.get());
            return ResponseEntity.noContent().build(); 
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); 
        }
    }
}
