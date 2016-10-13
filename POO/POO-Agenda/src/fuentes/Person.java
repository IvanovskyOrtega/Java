package fuentes;
public class Person {
    private String name; 
    private int age;
    private int energyLevel;
    private float weight;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.energyLevel = 50;
        this.weight = 60.0f;
    }
    public int getEnergyLevel() {
        return energyLevel;
    }
    public float getWeight() {
        return weight;
    }
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void wakeUp(){
        System.out.println("...");//not a morning person
    }
    public void eat(){
        weight += +0.1f; 
        System.out.println("Yummy!");
    }
    public void work(){
        energyLevel -= 20;
        weight -= 0.3f;
        System.out.println("Chop chop");
    }
    public void goOut(){
        energyLevel -= 20;
        System.out.println("Party!");
    }
    public void sleep(){
        energyLevel += 50;
        System.out.println("ZzZzZz");
    }
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", energyLevel=" + energyLevel + ", weight=" + weight + '}';
    }
}