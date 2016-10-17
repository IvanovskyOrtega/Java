package sources;
public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }
    /**
     * This method makes your animal walk :v
     */
    public void walk(){
        System.out.println("I'm an animal walking in "+legs+" legs >:v");
    }
    /**
     * This method gives some food to your animal :v
     */
    public abstract void eat();
}
