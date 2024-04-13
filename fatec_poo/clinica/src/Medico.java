import java.time.LocalDate;

public class Medico extends Funcionario{
    private String crm;
    private String especialidade;

    public Medico(String nome, String telefone, String senha, String crm, String especialidade) throws Exception{
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
        setCrm(crm);
        setEspecialidade(especialidade);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception{
        if(crm.isEmpty()){
            throw new Exception("Insira o CRM!");
        } else {
            this.crm = crm;
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void mostrar(){
        System.out.println("Medico >>>>>>>>>");
        super.mostrar();
        System.out.println("CRM: " + getCrm() + "\nEspecialidade: " + getEspecialidade());
    }
    public void preescrever(Consulta consulta) throws Exception{
        Receita r1 = new Receita(LocalDate.of(2024,03,27), "Dipirona");
        Exame ex1 = new Exame(LocalDate.of(2024,04,03), "Ressonancia");
        Exame ex2 = new Exame(LocalDate.of(2024,04,05), "Electrocardiograma");
    }
}
