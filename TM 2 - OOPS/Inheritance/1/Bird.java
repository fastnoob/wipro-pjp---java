class Animal {
    public void eat() {
        System.out.println("ANIMAL IS EATING");
    }

    public void sleep() {
        System.out.println("ANIMAL IS SLEEPING");
    }
}

class Bird extends Animal {
   @Override
    public void eat() {
        System.out.println("BIRD IS EATING");
    }

   	@Override
    public void sleep() {
        System.out.println("BIRD IS SLEEPING");
    }

    public void fly() {
        System.out.println("BIRD IS FLYING");
    }

    public static void main(String[] args) {
        Animal animal= new Animal();
        animal.eat();
        animal.sleep();

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}