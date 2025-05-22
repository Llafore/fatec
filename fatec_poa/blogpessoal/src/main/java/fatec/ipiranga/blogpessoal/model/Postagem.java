package fatec.ipiranga.blogpessoal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.ipiranga.blogpessoal.model.Cadastro;
import fatec.ipiranga.blogpessoal.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class CadastroController {
	@Autowired
	private CadastroRepository repository;
	
	@PostMapping
	public ResponseEntity<Cadastro> post (@RequestBody Cadastro cadastro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cadastro));
	}
	
	@GetMapping
    public ResponseEntity<List<Cadastro>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cadastro> getById(@PathVariable Long id) {
        Optional<Cadastro> cadastro = repository.findById(id);
        return cadastro.map(ResponseEntity::ok)
                       .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
