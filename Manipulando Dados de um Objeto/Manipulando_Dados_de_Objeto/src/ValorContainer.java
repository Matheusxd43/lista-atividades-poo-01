import java.util.Scanner;

public class ValorContainer {
    private int valor;

    public ValorContainer(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando duas instâncias de ValorContainer
        System.out.print("Digite o valor para objA: ");
        ValorContainer objA = new ValorContainer(scanner.nextInt());
        
        System.out.print("Digite o valor para objB: ");
        ValorContainer objB = new ValorContainer(scanner.nextInt());
        
        // Imprimindo valores originais
        System.out.println("\nValores originais:");
        System.out.println("objA.valor = " + objA.getValor());
        System.out.println("objB.valor = " + objB.getValor());
        
        // Chamando método para trocar valores
        trocarValores(objA, objB);
        
        // Imprimindo valores após a troca
        System.out.println("\nValores após a troca:");
        System.out.println("objA.valor = " + objA.getValor());
        System.out.println("objB.valor = " + objB.getValor());
        
        scanner.close();
    }
}