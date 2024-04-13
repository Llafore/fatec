import static java.lang.Math.pow;

public class Circulo implements CalcArea{
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double calculaArea(){
        return 3.14 * pow(raio, 2);
    };
}
