import java.time.LocalDate;

public class Agenda {
    private LocalDate data;
    private String hora;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void consultar(){}

    public void mostrar(){
        System.out.println("Data: " + getData() + "\nHora: " + getHora());
    }
}
