public class ActivityInterface {
    public static void main(String[] args) {
        
    }
}
interface Carnivore{
    int pieces = 10;
    /*
     * public static void eatGrass(); is invalid without a method body. Since Java interfaces allow static methods, but they must include a method body.
     */
    public static void eatGrass();
    /*
     * public int chew() has a body. Interfaces cannot have non-default instance methods (methods with bodies) unless they are marked default.
     */
    public int chew(){
        return 13;
    }
}

interface Haswings{
    /*
     * public int getNumberOfWings(); is invalid because interface methods without a body must be implicitly abstract
     */
    public int getNumberOfWings();
}
abstract class Insect implements Haswings{
    /*
     * The method abstract int getNumberOfLegs(); is valid, but the implementing subclass (Dragonfly) must provide an implementation for this method.
     */
    abstract int getNumberOfLegs();
}
class Dragonfly extends Insect{
    int getNumberOfLegs(){
        return 6;
    }
}
/*
 * The method int getNumberOfLegs() in Dragonfly does not have the @Override annotation (optional but recommended) and lacks the implementation of the getNumberOfWings() method required by the HasWings interface.
 */