package br.com.keemy.iphones;

public class Main {
    public static void main(String[] args) {

        Iphone iphoneX, iphone9,iphone13Mini;
        IPhoneFactory factory = new IPhoneFactory();

        iphoneX = factory.cadastrarIphone(IPhoneFactory.TypeIphoneEnum.IPHONE_X);
        iphone9 = factory.cadastrarIphone(IPhoneFactory.TypeIphoneEnum.IPHONE_9);
        iphone13Mini = factory.cadastrarIphone(IPhoneFactory.TypeIphoneEnum.IPHONE_13_MINI);

        iphoneX.exibirDetalhes();
        System.out.println();
        iphone9.exibirDetalhes();
        System.out.println();
        iphone13Mini.exibirDetalhes();

    }
}