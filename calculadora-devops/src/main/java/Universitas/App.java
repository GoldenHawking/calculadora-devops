package Universitas;

public class App {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double num1 = 15;
        double num2 = 5;

        System.out.println("=== CALCULADORA DEVOPS ===");
        System.out.println("Suma (15 + 5): " + calc.sumar(num1, num2));
        System.out.println("Resta (15 - 5): " + calc.restar(num1, num2));
    }
}