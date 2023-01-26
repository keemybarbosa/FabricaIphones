package br.com.keemy.iphones;

public abstract class Celular {
    String memoria;
    String tela;
    String cameraTraseira;
    String cameraFrontal;

    String processador;

    public Celular(String processador, String memoria, String tela, String cameraTraseira, String cameraFrontal){
        this.processador = processador;
        this.memoria = memoria;
        this.tela = tela;
        this.cameraTraseira = cameraTraseira;
        this.cameraFrontal = cameraFrontal;
    }

}
