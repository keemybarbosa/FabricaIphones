package br.com.keemy.iphones;

public class IphoneX extends Celular implements Iphone{

    public IphoneX(){
        super("Apple A11 Bionic", "3GB", "5.8 polegadas", "12MP", "7MP");
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("[Iphone X]%nProcessador: %s%nTela: %s%nMemória: %s%n" +
                        "CâmeraTraseira: %s%nCâmera Frontal:%s%n",
                this.processador, this.tela, this.memoria, this.cameraTraseira, this.cameraFrontal);
    }
}
