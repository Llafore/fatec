import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Consulta extends Agenda{
    private String motivo;
    private String historico;
    private Medico medico;
    private Paciente paciente;
    private List<Exame> exames = new ArrayList<Exame>();
    private List<Receita> receitas = new ArrayList<Receita>();

    public Consulta(LocalDate data, String hora, String motivo, String historico, Medico medico, Paciente paciente, String exames, String receitas) {
        setData(data);
        setHora(hora);
        setMotivo(motivo);
        setHistorico(historico);
        setMedico(medico);
        setPaciente(paciente);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public void mostrar(){
        System.out.println("Consulta >>>>>>>");
        super.mostrar();
        System.out.println("Medico" + getMedico() + "\nPaciente: " + getPaciente());
    }
}
