package Eden;

public class Character {
   private String name;
   private String origin;
   private int age;
   private int attack;
   private int intellect;
   private int hp;
   private int stamina;

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


    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public int getAge() {
        return age;
    }

    public int getAttack() {
        return attack;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getHp() {
        return hp;
    }

    public int getStamina() {
        return stamina;
    }
}




