import java.time.LocalDate;

public class Exame extends Procedimento {
    public Exame(LocalDate data, String descricao) throws Exception {
        setData(data);
        setDescritivo(descricao);
    }

    public void solicitar(){}
    public void mostrar(){
        System.out.println("Exame >>>>>>>>>>");
        super.mostrar();
    }
}
