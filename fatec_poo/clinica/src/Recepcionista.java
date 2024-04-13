import java.time.LocalDate;
import java.util.List;

public class Recepcionista extends Funcionario{
    private String cpf;

    public Recepcionista(String nome, String telefone, String senha, String cpf) throws Exception{
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) throws Exception{
        if(cpf.isEmpty()){
            throw new Exception("Informe o CPF!");
        } else {
            this.cpf = cpf;
        }
    }

    public Paciente recepcionar(String nome, String cpf, String telefone, String genero, String idade) throws Exception{
        Paciente p1 = new Paciente(nome, cpf, telefone, genero, idade);
        p1.mostrar();
        return p1;
    }
    public Consulta marcarConsulta(LocalDate data, String hora, String motivo, String historico, Medico medico, Paciente paciente){
        Consulta c1 = new Consulta(data, hora, motivo, historico, medico, paciente, "", "");
        return c1;
    }

    public void mostrar(){
        System.out.println("Recepcionista >>");
        super.mostrar();
    }
}
