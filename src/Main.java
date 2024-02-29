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

    public static void removeFuncionario(Scanner func) {
        funcionario.remove(func);
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto;
        String opcao;
        System.out.println("Bem vindo ao sistema de gerenciamento de funcionários!");
        do{
            texto = "Digite 1 para adicionar um novo funcionário \n " +
                    "Digite 2 para remover um funcionário \n ou 3 para consultar" +
                    " todos os funcionários ou (digite n para parar" ;
            System.out.println(texto);
            opcao = leitor.nextLine();
            if(leitor.nextLine().equals("n")){
                break;
            }
        }
        while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3"));
        if (opcao.equals("1")) {
            System.out.println("Adicionando um novo funcionário");
            addFuncionario(leitor);
        } else if (opcao.equals("2")) {
            System.out.println("Removendo um funcionário");
            removeFuncionario(leitor);
        } else if (opcao.equals("3")) {
            for (Funcionario func : funcionario) {
                System.out.println("Funcionário: ");
                System.out.println(func);
            }
        }
    }
}