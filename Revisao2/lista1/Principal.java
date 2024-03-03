package lista1;
import java.util.Scanner;
public class Principal {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        System.out.println("Digite -1 para sair.");

        while (true) {
            System.out.print("ID do funcionário (-1 to finish): ");
            int id = scanner.nextInt();
            scanner.nextLine();

            if (id == -1) {
                break;
            }

            System.out.print("Salário base do funcionário: ");
            double salarioBase = scanner.nextDouble();
            scanner.nextLine();

            Funcionarios funcionario = new Funcionarios(20, "Pedro", 1200);

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            Funcionarios.setNome(nome);
            empresa.adicionarFuncionario(Funcionarios);
        }

        System.out.printf("Total de funcionários: %d%n", empresa.getFuncionarios().size());
        System.out.printf("Folha salarial total: %.2f%n", empresa.calcularFolhaSalarialTotal());
        empresa.exibirFuncionarios();
    }
}