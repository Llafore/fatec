package com.fatec.loja;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CestaController {
 @PostMapping("/api/cesta")
    public String gravar(@RequestBody Cesta obj){
      //  bd.save(obj);
        return "O item "+ obj.getCodigo() + " foi salvo corretamente!";
    }

    @PutMapping("/api/cesta")
    public String alterar(@RequestBody Cesta obj){
        //bd.save(obj);
        return "O item "+ obj.getCodigo() + " foi alterado corretamente!";
    }

    @GetMapping("/api/cesta/{codigo}")
    public Item carregar(@PathVariable int codigo){
       // Optional<Cliente> obj = bd.findById(codigo);
     //   if(obj.isPresent()){
      //      return obj.get();
      //  } else {
            return null;
     //   }
    }

    @DeleteMapping("/api/cesta/{codigo}")
    public String remover(@PathVariable int codigo){
        //bd.deleteById(codigo);
        return "Registro "+ codigo + " removido com suceso!";
    }

    @GetMapping("/api/cestas")
    public List<Cesta> listar(){
       // return bd.findAll();
       return null;
    }
}
