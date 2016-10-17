package sources;
public class Cat extends Animal implements Pet {
    //4a
    private String name;
    //4b
    public Cat(String name) {
        super(4);//Initialize inherited fields
        this.name = name;//Initialize self flieds
    }
    //4c
    public Cat() {
        //"this." 
        //"this()" calls a local constructor (of the same class)
        this("");//A cat with no name :,v
        //this("") turns in super(4); this.name = ""; (Saving code lines my friend :D) 
    }

    @Override
    public void eat() {
        System.out.println("You've gave some tunny to your motherf***ing "+name+" :v");
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
        System.out.println("Now it's playing with its f***ing  yarn ball");
    }
    
}
//In this case, the attrib "name" is setted privates, because if it were protected, we're saying that the class
//where we've defined the attrib, is going to have a daughter class.
//The previus, is applied to the Fish class.

/*
    For Javadoc 
    @override
    @params
    @return
*/