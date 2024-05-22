public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void promover() {
        if (idade > 18) {
            aumentarSalario(25);
        }
    }

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
    }

    public void demitir(int motivo) {
        switch (motivo) {
            case 1:
                System.out.println(nome + " foi demitido por justa causa.");
                break;
            case 2:
                System.out.println(nome + " foi demitido por decisão do empregador.");
                System.out.println("Multa rescisória: " + salario * 0.4);
                break;
            case 3:
                System.out.println(nome + " se aposentou.");
                if (salario >= 1000 && salario <= 2000) {
                    salario = 1500;
                } else if (salario > 2000 && salario <= 3000) {
                    salario = 2500;
                } else if (salario > 3000 && salario <= 4000) {
                    salario = 3500;
                } else if (salario > 4000) {
                    salario = 4000;
                }
                System.out.println("Salário de aposentadoria: " + salario);
                break;
            default:
                System.out.println("Motivo inválido.");
        }
    }

    public void fazerAniversario() {
        idade++;
    }

    @Override
    public String toString() {
        return "Empregado [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
    }
}

