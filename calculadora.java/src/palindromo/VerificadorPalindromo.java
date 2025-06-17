package palindromo;

public class VerificadorPalindromo {
    public boolean ehPalindromo(String texto) {
        // Remover espaços e converter para minúsculas
        String textoProcessado = texto.replaceAll("\\s+", "").toLowerCase();
        
        int esquerda = 0;
        int direita = textoProcessado.length() - 1;
        
        while (esquerda < direita) {
            if (textoProcessado.charAt(esquerda) != textoProcessado.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}