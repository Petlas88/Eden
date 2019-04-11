package Eden;

public class Character {
    String name;
    String origin;
    int age;
    int attack;
    int intellect;
    int hp;
    int stamina;

    public Character(String name, String origin, int age, int attack, int intellect, int hp, int stamina)  {
        this.name = name;
        this.origin = origin;
        this.age = age;
        this.attack = attack;
        this.intellect = intellect;
        this.hp = hp;
        this.stamina = stamina;
    }

    public Character(String name, int attack, int intellect, int hp, int stamina) {
        this.name = name;
        this.attack = attack;
        this.intellect = intellect;
        this.hp = hp;
        this.stamina = stamina;
    }




    void display() {
        System.out.println("NAME: " + name + "\nAGE: " + age + "\nORIGIN: " + origin );
    }




}




