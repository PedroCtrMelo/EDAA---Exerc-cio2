package Lista2;

public class Principal {
    public static void main(String[] args) {
        Celular celularBasico = new ModeloBasico();
        

        //  ModeloBasico
        celularBasico.ligar();
        celularBasico.fazerLigacao("123456789");
        celularBasico.enviarMensagem("987654321", "Olá, tudo bem?");
        celularBasico.desligar();

        //  ModeloAvancado
        Celular avancado = new ModeloAvancado();
        avancado.ligar();
        avancado.fazerLigacao("0987654321");
        avancado.fazerLigacao("0987654320");
        avancado.enviarMensagem("111222333", "Estou testando o celular avançado.");
        avancado.desligar();

        // Exibindo histórico do ModeloAvancado
        ModeloAvancado avancadoConvertido = (ModeloAvancado) avancado;
        System.out.println("Histórico de ligações do ModeloAvançado: " + avancadoConvertido.getLigacoesFeitas());
        System.out.println("Histórico de mensagens do ModeloAvançado: " + avancadoConvertido.getMensagensEnviadas());
    }
}