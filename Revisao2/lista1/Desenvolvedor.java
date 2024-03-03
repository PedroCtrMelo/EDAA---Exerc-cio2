package lista1;
public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(){}
    public Desenvolvedor(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

 
    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.10;
    }
}