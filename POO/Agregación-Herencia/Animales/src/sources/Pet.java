package sources;
public interface Pet {
    //All methods are public and abstract.
    //All attribs are static and final.
    // public abstract String getName(); <----- Redundante
    //int age; Variables must be initialized on interfaces
    //In an Interface, all variables are constants, in other words, are final.
    String getName(); 
    void setName(String name);
    void play();
}
