package pruebas;
import fuentes.Person;
public class DailyLife {
    public static void main(String[] args) {
        Person person = new Person("Steffen",31);
        person.wakeUp();
        person.eat();
        person.work();
        person.eat();
        person.goOut();
        person.sleep();
        System.out.println("Current energy level: "+person.getEnergyLevel());
        System.out.println("Current weight: "+person.getWeight());
    }
}
