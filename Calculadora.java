public class Calculadora {
    private int num1, num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int realizarOperacion(String operacion) {
        if (operacion.equals("suma")) {
            return suma();
        } else if (operacion.equals("resta")) {
            return resta();
        } else if (operacion.equals("multiplicar")) {
	    return multiplicar();
	}
        return 0;
    }

    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }
}
