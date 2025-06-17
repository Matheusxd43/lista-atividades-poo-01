import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 2.1 Maior e Menor Elemento em uma Matriz
        System.out.println("\n=== 2.1 Maior e Menor Elemento em uma Matriz ===");
        MatrizExercicios.maiorMenorElementoMatriz(scanner);
        
        // 2.2 Soma das Diagonais de uma Matriz Quadrada
        System.out.println("\n=== 2.2 Soma das Diagonais de uma Matriz Quadrada ===");
        MatrizExercicios.somaDiagonaisMatrizQuadrada(scanner);
        
        // 3.1 Manipulando Dados de um Objeto
        System.out.println("\n=== 3.1 Manipulando Dados de um Objeto ===");
        Numero numero = new Numero(42);
        numero.imprimirValor();
        System.out.println("Hash code do objeto: " + System.identityHashCode(numero));
        
        // 3.2 Trocando Valores entre Objetos
        System.out.println("\n=== 3.2 Trocando Valores entre Objetos ===");
        System.out.print("Digite o valor para objA: ");
        int valorA = scanner.nextInt();
        System.out.print("Digite o valor para objB: ");
        int valorB = scanner.nextInt();
        
        ValorContainer objA = new ValorContainer(valorA);
        ValorContainer objB = new ValorContainer(valorB);
        
        System.out.println("Antes da troca - objA: " + objA.getValor() + ", objB: " + objB.getValor());
        ValorContainer.trocarValores(objA, objB);
        System.out.println("Depois da troca - objA: " + objA.getValor() + ", objB: " + objB.getValor());
        
        // 4.1 Sistema de Gerenciamento de Funcionários
        System.out.println("\n=== 4.1 Sistema de Gerenciamento de Funcionários ===");
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();
        gerenciador.executar(scanner);
        
        // 4.2 Agenda de Contatos
        System.out.println("\n=== 4.2 Agenda de Contatos ===");
        AgendaContatos agenda = new AgendaContatos();
        agenda.executar(scanner);
        
        scanner.close();
    }
}