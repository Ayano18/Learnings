import java.util.*;

public class RunAnimal{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Bird b;
        Cat c;
        Dog d;
        
        while(true){
            System.out.println("Choose an animal.");
            System.out.print("Press: B for bird, C for Cat, and D for Dog: ");
            String choice = s.nextLine();
            if(choice.equalsIgnoreCase("B")){
                System.out.println("\nBird");
                b = new Bird();
                break;
            } else if(choice.equalsIgnoreCase("C")){
                System.out.println("\nCat");
                c = new Cat();
                break;
            } else if(choice.equalsIgnoreCase("D")){
                System.out.println("\nDog");
                d = new Dog();
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }

    }
}
abstract class Animal{
    public abstract void eat();
    public abstract void sleep();
    public abstract void sound();
}
class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("Bird eating: chirp chirp chirp chirp chirp");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleeping: ZzzZZzzZZzzZ");
        System.out.println("FunFact: Birds' brains remain active while they sleep, firing off electrical signals that can cause their vocal muscles to move. This silent brain activity can be translated into sound to recreate the song the bird was singing in its sleep.");
    }

    @Override
    public void sound() {
        System.out.println("Bird sound: tweet tweet");
    }
    Bird(){
        eat();
        sleep();
        sound();
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat eating: slurp slurp slurp slurp slurp");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping: ZzzZZzzZZzzZ");
        System.out.println("FunFact: Cats make many sounds, including meows, purrs, growls, hisses, chirrups, chatters, and trills. The word for the sound a cat makes when it's communicating with people is \"meow\"");
    }

    @Override
    public void sound() {
        System.out.println("Cat sound: meow meow meow meow");
    }
    Cat(){
        eat();
        sleep();
        sound();
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eating: slurp slurp slurp slurp slurp");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping: ZzzZZzzZZzzZ");
        System.out.println("FunFact: Dogs make many sounds, including grunting, whimpering, barking, whining, and twitching. The word for the sound a dog makes when it's communicating with people is \"barking or howling\"");
    }

    @Override
    public void sound() {
        System.out.println("Dog sound: GGRRRRRRRRRRRRRR!");
    }
    Dog(){
        eat();
        sleep();
        sound();
    }
}