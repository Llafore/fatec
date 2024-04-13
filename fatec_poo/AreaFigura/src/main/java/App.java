public class App {
    public static void main(String[] args) {
        Triangulo forma1 = new Triangulo(2.3, 2);
        Quadrado forma2 = new Quadrado(2,4);
        Circulo forma3 = new Circulo(3);
        System.out.println("Area da forma 1: " + forma1.calculaArea());
        System.out.println("Area da forma 2: " + forma2.calculaArea());
        System.out.println("Area da forma 3: " + forma3.calculaArea());
    }
}