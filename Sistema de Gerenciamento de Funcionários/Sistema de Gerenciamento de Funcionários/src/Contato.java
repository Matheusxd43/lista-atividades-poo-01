import java.util.ArrayList;
import java.util.Scanner;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }

    // Método para listar todos os contatos
    public static void listarContatos(ArrayList<Contato> contatos) {
        System.out.println("\nLista de Contatos:");
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + 
                             ", Telefone: " + contato.getTelefone() + 
                             ", Email: " + contato.getEmail());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        System.out.println("Agenda de Contatos");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar novo contato");
            System.out.println("2. Listar todos os contatos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    
                    contatos.add(new Contato(nome, telefone, email));
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                    
                case 2:
                    listarContatos(contatos);
                    break;
                    
                case 3:
                    System.out.println("Saindo da agenda...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}