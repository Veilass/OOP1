package Project01;

public class UI {
    public static void main(String[] args) {
        Person Bob = new Person(23,Personality.MALE);
        System.out.println(Bob.getAge());
        Bob.talk();

        UFO Xero = new UFO(5325,Personality.ALIEN);
        System.out.println(Xero.getAge());
        Xero.talk();

        if(Xero.person == Personality.ALIEN)
            System.out.println("Да");

    }
}


