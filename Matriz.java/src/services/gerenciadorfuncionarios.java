import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorFuncionarios {
    private ArrayList<Funcionario> funcionarios;
    
    public GerenciadorFuncionarios() {
        funcionarios = new ArrayList<>();
    }
    
    public void executar(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Calcular total de salários por departamento");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    cadastrarFuncionario(scanner);
                    break;
                case 2:
                    calcularTotalSalariosDepartamento(scanner);
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    
    private void cadastrarFuncionario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();
        
        funcionarios.add(new Funcionario(nome, id, salario, departamento));
        System.out.println("Funcionário cadastrado com sucesso!");
    }
    
    private void calcularTotalSalariosDepartamento(Scanner scanner) {
        System.out.print("Digite o departamento: ");
        String depto = scanner.nextLine();
        
        double total = 0;
        for (Funcionario f : funcionarios) {
            if (f.getDepartamento().equalsIgnoreCase(depto)) {
                total += f.getSalario();
            }
        }
        
        System.out.printf("Total de salários do departamento %s: %.2f\n", depto, total);
    }
    
    private void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado!");
            return;
        }
        
        System.out.println("\nLista de Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}