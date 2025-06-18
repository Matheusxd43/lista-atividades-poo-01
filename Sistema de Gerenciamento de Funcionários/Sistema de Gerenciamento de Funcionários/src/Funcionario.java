import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private int id;
    private double salario;
    private String departamento;

    public Funcionario(String nome, int id, double salario, String departamento) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Getters
    public String getNome() { return nome; }
    public int getId() { return id; }
    public double getSalario() { return salario; }
    public String getDepartamento() { return departamento; }

    // Método para calcular total de salários por departamento
    public static double calcularTotalSalariosDepartamento(ArrayList<Funcionario> funcionarios, String departamento) {
        double total = 0;
        for (Funcionario func : funcionarios) {
            if (func.getDepartamento().equalsIgnoreCase(departamento)) {
                total += func.getSalario();
            }
        }
        return total;
    }

    // Método para listar todos os funcionários
    public static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
        System.out.println("\nLista de Funcionários:");
        for (Funcionario func : funcionarios) {
            System.out.println("Nome: " + func.getNome() + 
                             ", ID: " + func.getId() + 
                             ", Salário: R$" + func.getSalario() + 
                             ", Departamento: " + func.getDepartamento());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Sistema de Gerenciamento de Funcionários");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar novo funcionário");
            System.out.println("2. Calcular total de salários por departamento");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do funcionário: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("ID do funcionário: ");
                    int id = scanner.nextInt();
                    
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Limpar buffer
                    
                    System.out.print("Departamento: ");
                    String departamento = scanner.nextLine();
                    
                    funcionarios.add(new Funcionario(nome, id, salario, departamento));
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
                    
                case 2:
                    System.out.print("Digite o departamento para calcular o total de salários: ");
                    String depto = scanner.nextLine();
                    double total = calcularTotalSalariosDepartamento(funcionarios, depto);
                    System.out.println("Total de salários do departamento " + depto + ": R$" + total);
                    break;
                    
                case 3:
                    listarFuncionarios(funcionarios);
                    break;
                    
                case 4:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}