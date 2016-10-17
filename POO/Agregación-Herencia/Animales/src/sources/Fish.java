package sources;
public class Fish extends Animal implements Pet {
    private String name;
    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("It's eating now :v");
    }
    @Override
    public void walk(){
        System.out.println("Are u an idiot?");
        System.out.println("Fishes cannot walk 'cause they don't have legs, you sick bastard >:v");
    }

    @Override
    public String getName() {
       return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Still being an idiot?");
        System.out.println("Do u really wanna play with a fish?");
    }
    
}
