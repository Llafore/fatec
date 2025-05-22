package com.example.pizzaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
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

import com.example.pizzaria.Cadastro;
import com.example.pizzaria.repository.CadastroRepository;


@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CadastroController {

    private final CadastroRepository repository;

    public CadastroController(CadastroRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Cadastro> post (@RequestBody Cadastro cadastro){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cadastro));
    }

    @GetMapping
    public ResponseEntity<List<Cadastro>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cadastro> getById(@PathVariable("id") Long id) {
        Optional<Cadastro> cadastro = repository.findById(id);
        return cadastro.map(ResponseEntity::ok)
                       .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Cadastro> updateCadastro(@PathVariable("id") Long id, @RequestBody Cadastro updatedCadastro) {
        return repository.findById(id).map(cadastro -> {
            if (updatedCadastro.getNome() != null) cadastro.setNome(updatedCadastro.getNome());
            if (updatedCadastro.getCpf() != null) cadastro.setCpf(updatedCadastro.getCpf());
            if (updatedCadastro.getEndereco() != null) cadastro.setEndereco(updatedCadastro.getEndereco());
            if (updatedCadastro.getTelefone() != null) cadastro.setTelefone(updatedCadastro.getTelefone());
            if (updatedCadastro.getIdade() != 0) cadastro.setIdade(updatedCadastro.getIdade());

            Cadastro updated = repository.save(cadastro);
            return ResponseEntity.ok(updated);
        }).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCadastro(@PathVariable("id") Long id) {
        Optional<Cadastro> cadastro = repository.findById(id);
        if (cadastro.isPresent()) {
            repository.delete(cadastro.get());
            return ResponseEntity.noContent().build(); 
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); 
        }
    }
}