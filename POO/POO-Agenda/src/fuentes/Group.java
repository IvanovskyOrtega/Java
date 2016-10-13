package fuentes;
import java.util.ArrayList;
public class Group {
    private ArrayList<Person> group;

    public Group() {
        group = new ArrayList<>();
    }
    public void add(Person p){
        group.add(p);
    }

    public ArrayList<Person> getGroup() {
        return group;
    }
}
