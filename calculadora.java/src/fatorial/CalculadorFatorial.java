package fatorial;

public class CalculadorFatorial {
    public long calcularFatorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }
        return calcularFatorialRecursivo(n);
    }
    
    private long calcularFatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorialRecursivo(n - 1);
    }
}