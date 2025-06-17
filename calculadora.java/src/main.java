import java.util.Scanner;
import calculadora.calculadora;
import palindromo.VerificadorPalindromo;
import fatorial.CalculadorFatorial;
import temperatura.ConversorTemperatura;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu Principal");
            System.out.println("1. Calculadora Simples");
            System.out.println("2. Verificador de Palíndromos");
            System.out.println("3. Cálculo Fatorial");
            System.out.println("4. Conversor de Temperaturas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    usarCalculadora(scanner);
                    break;
                case 2:
                    verificarPalindromo(scanner);
                    break;
                case 3:
                    calcularFatorial(scanner);
                    break;
                case 4:
                    converterTemperatura(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void usarCalculadora(Scanner scanner) {
        calculadora calc = new calculadora();

        System.out.println("\nCalculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Operações disponíveis:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Escolha a operação: ");
        int operacao = scanner.nextInt();

        double resultado = 0;
        switch (operacao) {
            case 1:
                resultado = calc.somar(num1, num2);
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                try {
                    resultado = calc.dividir(num1, num2);
                    System.out.println("Resultado da divisão: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }

    private static void verificarPalindromo(Scanner scanner) {
        VerificadorPalindromo verificador = new VerificadorPalindromo();

        System.out.println("\nVerificador de Palíndromos");
        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        if (verificador.ehPalindromo(texto)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }
    }

    private static void calcularFatorial(Scanner scanner) {
        CalculadorFatorial calculador = new CalculadorFatorial();

        System.out.println("\nCálculo Fatorial");
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        try {
            long resultado = calculador.calcularFatorial(numero);
            System.out.println(numero + "! = " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void converterTemperatura(Scanner scanner) {
        ConversorTemperatura conversor = new ConversorTemperatura();

        System.out.println("\nConversor de Temperaturas");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Escolha a direção da conversão: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        double resultado;
        if (opcao == 1) {
            resultado = conversor.celsiusParaFahrenheit(temperatura);
            System.out.printf("%.2f°C = %.2f°F\n", temperatura, resultado);
        } else if (opcao == 2) {
            resultado = conversor.fahrenheitParaCelsius(temperatura);
            System.out.printf("%.2f°F = %.2f°C\n", temperatura, resultado);
        } else {
            System.out.println("Opção inválida!");
        }
    }
}