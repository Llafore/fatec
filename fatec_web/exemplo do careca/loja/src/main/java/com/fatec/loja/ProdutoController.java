package com.fatec.loja;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
    @Autowired
    ProdutoRepository bd;

    @PostMapping("/api/produto")
    public String gravar(@RequestBody Produto obj){
        bd.save(obj);
        return "O Produto "+ obj.getNome() + " foi salvo corretamente!";
    }

    @PutMapping("/api/produto")
    public String alterar(@RequestBody Produto obj){
        bd.save(obj);
        return "O produto "+ obj.getNome() + " foi alterado corretamente!";
    }

    @GetMapping("/api/produto/{codigo}")
    public Produto carregar(@PathVariable int codigo){
        Optional<Produto> obj = bd.findById(codigo);
        if(obj.isPresent()){
            return obj.get();
        } else {
            return null;
        }
    }

    @DeleteMapping("/api/produto/{codigo}")
    public String remover(@PathVariable int codigo){
        bd.deleteById(codigo);
        return "Registro "+ codigo + " removido com suceso!";
    }

    @GetMapping("/api/produtos")
    public List<Produto> listar(){
       return bd.findAll();
    }

}
