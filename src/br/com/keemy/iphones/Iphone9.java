package br.com.keemy.iphones;

public class Iphone9 extends Celular implements Iphone{

    public Iphone9() {
        super("Apple A13 Bionic","3GB", "4.7 polegadas", "12MP", "7MP");
    }
    @Override
    public void exibirDetalhes() {
        System.out.printf("[Iphone 9]%nProcessador: %s%nTela: %s%nMemória: %s%n" +
                        "CâmeraTraseira: %s%nCâmera Frontal:%s%n",
                this.processador, this.tela, this.memoria, this.cameraTraseira, this.cameraFrontal);
    }
}
