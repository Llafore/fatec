public class Quadrado implements CalcArea{
    private double base;
    private double altura;

    public Quadrado(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calculaArea(){
        return (base * altura);
    };
}
