abstract class GeneralBank {
    abstract double getSavings();
    abstract double getFixed();
}

class ICICIBank extends GeneralBank {
    double getSavings() {
        return 4;
    }
    double getFixed() {
        return 8.5;
    }
}

class KotMBank extends GeneralBank {
    double getSavings() {
        return 6;
    }
    double getFixed() {
        return 9;
    }
}

class Main {
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank();
        KotMBank k = new KotMBank();
        GeneralBank g1 =  new ICICIBank();
        GeneralBank g2 = new KotMBank();

        System.out.println("ICICI BANK: " + "\nFixed Interest Rate = " + i.getFixed() + "%, " + "\nSaving Interest Rate = " + i.getSavings() + "%");
        System.out.println("KOTAK MAHINDRA BANK: " + "\nFixed Interest Rate = " + k.getFixed() + "%, " + "\nSaving Interest Rate = " + k.getSavings() + "%");
        System.out.println("BANK 1: " + "\nFixed Interest Rate = " + g1.getFixed() + "%, " + "\nSaving Interest Rate = " + g1.getSavings() + "%");
        System.out.println("BANK 2: " + "\nFixed Interest Rate = " + g2.getFixed() + "%, " + "\nSaving Interest Rate = " + g2.getSavings() + "%");
    }
}