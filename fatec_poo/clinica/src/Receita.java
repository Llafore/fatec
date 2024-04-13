import java.time.LocalDate;

public class Receita extends Procedimento{
    public Receita(LocalDate data, String descricao) throws Exception {
        setData(data);
        setDescritivo(descricao);
    }
    public void preescrever(){}

    public void mostrar(){
        System.out.println("Receita >>>>>>>>");
        super.mostrar();
    }
}
