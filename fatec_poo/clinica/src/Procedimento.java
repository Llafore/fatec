import java.time.LocalDate;

public class Procedimento{
    private LocalDate data;
    private String descritivo;

    public LocalDate getData() {
            return data;
    }

    public void setData(LocalDate data) throws Exception{
        if(data.isBefore(LocalDate.now())){
            throw new Exception("O cadastro de consultas retroativas não é permitido!");
        } else {
        this.data = data;
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void mostrar(){
        System.out.println("Data: " + getData() + "Descritivo: " + getDescritivo());
    }
}
