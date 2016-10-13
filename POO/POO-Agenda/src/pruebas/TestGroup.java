package pruebas;
import fuentes.Group;
import fuentes.Person;
public class TestGroup {
    public static void main(String[] args) {
        Person p = new Person("Ste men", 51);
        Group g = new Group();
        g.add(p);
        for(int i=0;i<g.getGroup().size();i++){
            System.out.println(""+g.getGroup().get(i));
        }
    }
}
