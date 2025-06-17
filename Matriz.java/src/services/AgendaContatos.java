import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContatos {
    private ArrayList<Contato> contatos;
    private static final int LIMITE = 10;
    
    public AgendaContatos() {
        contatos = new ArrayList<>();
    }
    
    public void executar(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar todos os contatos");
            System.out.println("3. Buscar contato por nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    adicionarContato(scanner);
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    buscarContato(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    
    private void adicionarContato(Scanner scanner) {
        if (contatos.size() >= LIMITE) {
            System.out.println("Agenda cheia! Limite de " + LIMITE + " contatos atingido.");
            return;
        }
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        contatos.add(new Contato(nome, telefone, email));
        System.out.println("Contato adicionado com sucesso!");
    }
    
    private void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado!");
            return;
        }
        
        System.out.println("\nLista de Contatos:");
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
    
    private void buscarContato(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Telefone: " + c.getTelefone());
                System.out.println("Email: " + c.getEmail());
                return;
            }
        }
        
        System.out.println("Contato não encontrado!");
    }
}