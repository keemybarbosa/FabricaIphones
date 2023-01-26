package br.com.keemy.iphones;

import javax.management.InvalidApplicationException;

public class IPhoneFactory {
    public Iphone cadastrarIphone(TypeIphoneEnum typeIphone) {
        Iphone iphone = null;
        switch (typeIphone) {
            case IPHONE_9:
                iphone = new Iphone9();
                break;
            case IPHONE_X:
                iphone = new IphoneX();
                break;
            case IPHONE_13_MINI:
                iphone = new Iphone13Mini();
                break;
        }
        return iphone;
    }

    public enum TypeIphoneEnum {
        IPHONE_X("Iphone X"),
        IPHONE_9("Iphone 9"),
        IPHONE_13_MINI("Iphone 13 Mini");

        String texto;

        TypeIphoneEnum(String s) {
            this.texto = s;
        }


        @Override
        public String toString() {
            return this.texto;
        }
    }

}
