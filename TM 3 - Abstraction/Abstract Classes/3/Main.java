import java.util.Random;

abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    void play() {
        System.out.println("Piano is playing  tan tan tan tan");
    }
}

class Flute extends Instrument {
    void play() {
        System.out.println("Flute is playing  toot toot toot toot");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}

class Main {
    public static void main(String[] args) {
        Instrument[] instrument = new Instrument[10];

        Random randint = new Random();

        for (int i = 0; i < 10; i++) {
            int x = randint.nextInt(3) + 1;
            switch (x) {
            case 1: instrument[i] = new Piano();
                    break;
            case 2: instrument[i] = new Flute();
                    break;
            case 3: instrument[i] = new Guitar();
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(instrument[i] instanceof Piano){
                System.out.print("Instrument " + i + " is PIANO, ");
            }
            if(instrument[i] instanceof Flute){
                System.out.print("Instrument " + i + " is FLUTE, ");
            }
            if(instrument[i] instanceof Guitar){
                System.out.print("Instrument "+ i + " is GUITAR, ");
            }
                instrument[i].play();
        }
    }
}