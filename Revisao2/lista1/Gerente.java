package lista1;
public class Gerente extends Funcionario {
    public Gerente(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.20 + 1000;
    }
}