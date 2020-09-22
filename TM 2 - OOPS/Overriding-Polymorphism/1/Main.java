import java.awt.SystemColor;

class Fruit {
    String name, taste;
    int size;

    Fruit() {
        name = "";
        taste = "";
        size = 0;
    }

    void eat() {
        System.out.println("NAME OF FRUIT : "+name);
        System.out.println("TASTE OF FRUIT : "+taste);
    }
}

class Apple extends Fruit {
    Apple() {
        name = "Apple";
        size = 1;
        taste = "Sweet";
    }
    void eat() {
        System.out.println("NAME OF FRUIT : "+name);
        System.out.println("TASTE OF FRUIT : "+taste);
    }
}

class Orange extends Fruit {
    Orange() {
        name = "Orange";
        size = 2;
        taste = "Sour";
    }
    void eat() {
    	System.out.println("NAME OF FRUIT : "+name);
        System.out.println("TASTE OF FOOD : "+taste);
        
    }
}   

class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        apple.eat();
        System.out.println("");
        orange.eat();
    }
}