package Lista2;

public class ModeloBasico implements Celular {
  
    public void ligar() {
        System.out.println("Celular básico ligado.");
    }

  
    public void desligar() {
        System.out.println("Celular básico desligado.");
    }


    public void fazerLigacao(String numero) {
        System.out.println("Ligando para: " + numero);
    }

  
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para: " + numero + ". Mensagem: " + mensagem);
    }
}