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

    public static void removerFuncionario(Funcionario func) {
        funcionario.remove(func);
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto;
        String opcao;

        System.out.println("Bem vindo ao sistema de gerenciamento de funcionários");
            texto = "Digite 1 para adicionar um novo funcionário \n " +
                    "Digite 2 para remover um funcionário \n ou 3 para consultar" +
                    " todos os funcionários ou digite n para parar" +
                    "\n";
            System.out.println(texto);
            opcao = leitor.nextLine();
            while (!opcao.equals("n")) {
                if (opcao.equals("1")) {
                    System.out.println("Adicionando um novo funcionário");
                    addFuncionario(leitor);
                } else if (opcao.equals("2")) {
                    System.out.println("Qual é o nome do funcionário que deseja remover? ");
                    String nome = leitor.nextLine();
                    for (int i = 0; i < funcionario.size(); i++) {
                        if (funcionario.get(i).getNome().equals(nome)) {
                            removerFuncionario(funcionario.get(i));
                            System.out.println("Funcionario removido com sucesso!");
                        }
                    }

                } else if (opcao.equals("3")) {
                    for (Funcionario func : funcionario) {
                        System.out.println("Funcionário:");
                        System.out.println(func);
                    }
                }
                texto = " E agora o que quer fazer? " +
                        " 1 para adicionar um novo funcionário \n " +
                        " 2 para remover um funcionário" +
                        " \n 3 para consultar" +
                        " \n digite n para parar";
                System.out.println(texto);
                opcao = leitor.nextLine();
            }
        System.out.println("Obrigado por utilizar o sistema de gerenciamento de funcionários!");
    }
}