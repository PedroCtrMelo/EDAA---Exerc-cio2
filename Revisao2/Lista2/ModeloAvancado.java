package Lista2;

import java.util.ArrayList;
import java.util.List;

public class ModeloAvancado implements Celular {
    private List<String> ligacoesFeitas = new ArrayList<>();
    private List<String> mensagensEnviadas = new ArrayList<>();

   
    public void ligar() {
        System.out.println("Celular avançado ligado.");
    }


    public void desligar() {
        System.out.println("Celular avançado desligado.");
    }

 
    public void fazerLigacao(String numero) {
        ligacoesFeitas.add(numero);
        System.out.println("Ligando para: " + numero);
    }


    public void enviarMensagem(String numero, String mensagem) {
        mensagensEnviadas.add(numero + ": " + mensagem);
        System.out.println("Enviando mensagem para: " + numero + ". Mensagem: " + mensagem);
    }

    public List<String> getLigacoesFeitas() {
        return ligacoesFeitas;
    }

    public List<String> getMensagensEnviadas() {
        return mensagensEnviadas;
    }
}