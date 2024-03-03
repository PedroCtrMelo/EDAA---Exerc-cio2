package lista1;
public class Suporte extends Funcionario {
    public Suporte(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.05;
    }
}