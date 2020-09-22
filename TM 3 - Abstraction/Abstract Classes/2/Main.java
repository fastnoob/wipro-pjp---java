import java.util.Random;

abstract class Compartment {
    abstract void notice();
}

class FirstClass extends Compartment {
    	void notice() {
        System.out.println("FIRST CLASS");
    }
}

class Ladies extends Compartment {
    void notice() {
        System.out.println("LADIES COMPARTMENT");
    }
}

class General extends Compartment {
    void notice() {
        System.out.println("GENERAL CLASS");
    }
}

class Lugguage extends Compartment {
    void notice() {
        System.out.println("LUGGAGE COMPARTMENT");
    }
}

class TestCompartment {
    public static void main(String[] args) {
        Compartment arr[] = new Compartment[10];

    
        Random randint = new Random();

        for (int i = 0; i < 10; i++) {
            int x = randint.nextInt(4) + 1;
            switch (x) {
            case 1:
                arr[i] = new FirstClass();
                break;
            case 2:
                arr[i] = new Ladies();
                break;
            case 3:
                arr[i] = new General();
                break;
            case 4:
                arr[i] = new Lugguage();
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            arr[i].notice();
        }
    }
}