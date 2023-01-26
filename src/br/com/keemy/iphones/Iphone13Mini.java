package br.com.keemy.iphones;

public class Iphone13Mini extends Celular implements Iphone{
    public Iphone13Mini() {
        super("Apple A15 Bionic hexacore","4GB", "5.4 polegadas", "12MP", "12MP");
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("[Iphone 13 Mini]%nProcessador: %s%nTela: %s%nMemória: %s%n" +
                        "CâmeraTraseira: %s%nCâmera Frontal:%s%n",
                this.processador, this.tela, this.memoria, this.cameraTraseira, this.cameraFrontal);
    }
}
