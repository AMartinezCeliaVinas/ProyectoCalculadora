public class pruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(4, 2);
        System.out.println(calc.realizarOperacion("suma"));
    }
}