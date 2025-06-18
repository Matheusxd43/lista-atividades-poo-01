public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void imprimirValor() {
        System.out.println("Valor: " + valor);
    }

    public static void main(String[] args) {
        // Criando instância da classe Numero
        Numero numero = new Numero(10);

        // Atribuindo valor ao atributo do objeto
        numero.setValor(42);

        // Chamando método que imprime o valor
        numero.imprimirValor();

        // Simulando "endereço de memória"
        System.out.println("Hash code do objeto: " + System.identityHashCode(numero));
    }
}