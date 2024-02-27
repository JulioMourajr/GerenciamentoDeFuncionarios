import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<Funcionario> funcionario = new ArrayList<>();

    public static void addFuncionario(Scanner leitor) {
        System.out.println("Insira o nome do funcionário: ");
        String nome = leitor.nextLine();
        System.out.println("Insira o cpf do funcionário: ");
        String cpf = leitor.nextLine();
        System.out.println("Insira o salaário do funcionário: ");
        double salario = Double.parseDouble(leitor.nextLine());
        System.out.println("Insira a matricula do funcionário: ");
        String matricula = leitor.nextLine();
        System.out.println("Insira o departamento do funcionário: ");
        String departamento = leitor.nextLine();

        Funcionario novoFuncionario = new Funcionario(nome, cpf, salario, matricula, departamento);
        funcionario.add(novoFuncionario);
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de gerenciamento de funcionários!");
        addFuncionario(leitor);
        funcionario.forEach(System.out::println);

    }
}