import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Mostrar detalhes dos empregados");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    empregados.add(new Empregado(nome, idade, salario));
                    break;
                case 2:
                    System.out.print("Nome do empregado a promover: ");
                    nome = scanner.next();
                    for (Empregado emp : empregados) {
                        if (emp.getNome().equals(nome)) {
                            emp.promover();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nome do empregado para aumentar salário: ");
                    nome = scanner.next();
                    System.out.print("Percentual de aumento: ");
                    double percentual = scanner.nextDouble();
                    for (Empregado emp : empregados) {
                        if (emp.getNome().equals(nome)) {
                            emp.aumentarSalario(percentual);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nome do empregado a demitir: ");
                    nome = scanner.next();
                    System.out.print("Motivo (1: Justa causa, 2: Decisão do empregador, 3: Aposentadoria): ");
                    int motivo = scanner.nextInt();
                    for (Empregado emp : empregados) {
                        if (emp.getNome().equals(nome)) {
                            emp.demitir(motivo);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nome do empregado para fazer aniversário: ");
                    nome = scanner.next();
                    for (Empregado emp : empregados) {
                        if (emp.getNome().equals(nome)) {
                            emp.fazerAniversario();
                            break;
                        }
                    }
                    break;
                case 6:
                    for (Empregado emp : empregados) {
                        System.out.println(emp);
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);

        scanner.close();
    }
}
