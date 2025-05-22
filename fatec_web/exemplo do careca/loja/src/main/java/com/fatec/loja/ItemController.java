package com.fatec.loja;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class ItemController {
    @PostMapping("/api/item")
    public String gravar(@RequestBody Item obj){
      //  bd.save(obj);
        return "O item "+ obj.getCodigo() + " foi salvo corretamente!";
    }

    @PutMapping("/api/item")
    public String alterar(@RequestBody Item obj){
        //bd.save(obj);
        return "O item "+ obj.getCodigo() + " foi alterado corretamente!";
    }

    @GetMapping("/api/item/{codigo}")
    public Item carregar(@PathVariable int codigo){
       // Optional<Cliente> obj = bd.findById(codigo);
     //   if(obj.isPresent()){
      //      return obj.get();
      //  } else {
            return null;
     //   }
    }

    @DeleteMapping("/api/item/{codigo}")
    public String remover(@PathVariable int codigo){
        //bd.deleteById(codigo);
        return "Registro "+ codigo + " removido com suceso!";
    }

    @GetMapping("/api/itens")
    public List<Item> listar(){
       // return bd.findAll();
       return null;
    }
}
