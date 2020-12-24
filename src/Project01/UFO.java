package Project01;

public class UFO implements HumanInterface {
    private int age;
    public Personality person;

    UFO(int age, Personality person){
        this.age = age;
        this.person = person;
    }

    @Override
    public void talk() {
        System.out.println("Ya umey govorite");
        System.out.println("Персона: " + this.person);

    }

    @Override
    public void walk() {
        System.out.println("Ya mogy hodit yra!");

    }

    @Override
    public int getAge() {
        return this.age;
    }
}
