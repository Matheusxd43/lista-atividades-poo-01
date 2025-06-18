import java.util.Scanner;

public class MatrizExercicios {
    
    public static void maiorMenorElementoMatriz(Scanner scanner) {
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();
        
        int[][] matriz = new int[linhas][colunas];
        
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento > maior) {
                    maior = elemento;
                }
                if (elemento < menor) {
                    menor = elemento;
                }
            }
        }
        
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
    }
    
    public static void somaDiagonaisMatrizQuadrada(Scanner scanner) {
        System.out.print("Digite a ordem da matriz quadrada: ");
        int ordem = scanner.nextInt();
        
        int[][] matriz = new int[ordem][ordem];
        
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int somaPrincipal = 0;
        int somaSecundaria = 0;
        
        for (int i = 0; i < ordem; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][ordem - 1 - i];
        }
        
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
    }
}