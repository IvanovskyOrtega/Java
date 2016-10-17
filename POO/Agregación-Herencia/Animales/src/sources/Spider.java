package sources;
public class Spider extends Animal{
    //2.b
    public Spider() {
        super(8);
    }
    //2.c
    @Override
    public void eat(){
        System.out.println("The spider has killed an insect :v");
        System.out.println("Damn, it's eating it now :,v");
    }
}
