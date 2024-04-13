import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Medico m1 = new Medico("Leticia", "112312312", "senha123", "12312", "Ortopedista");
            Recepcionista rcp1 = new Recepcionista("Fabricio", "1231231", "jesus", "123412");
            Paciente p1 = rcp1.recepcionar("Luis","4110448","1231231","M","19");
            Consulta c1 = new Consulta(LocalDate.of(2024,03,27), "16:00", "Dor no joelho","/",m1,p1,null, null);
            m1.preescrever(c1);
        } catch(Exception e){
            System.out.println(e.getStackTrace() + "=>" + e.getMessage());
        }
    }
}