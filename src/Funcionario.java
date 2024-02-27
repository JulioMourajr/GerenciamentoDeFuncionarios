public class Funcionario {
    public String nome;
    public String cpf;
    public double salario;

    public String matricula;

    public String departamento;

    public Funcionario(String nome, String cpf, double salario, String matricula, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
