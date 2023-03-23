package Seminar_1.HomeWork;

// import java.util.ArrayList;
import java.util.Random;

/**
 * Создать класс Player с полями id (long), name (String), damage (double) healthPoint (hp) (double)
У класса должен быть конструктор, который принимает только name. 
Идентификатор присваивается автоматически из последовательности (1, 2, ...) 
Каждый класс должен уметь "бить" другого Player'а void attack(Player player) -> player1.attack(player2)
Внутри метода игрок, на котором вызван метод уменьшает здоровье игрока, который передан в метод
Придумать несколько классов с разными параметрами жизней и атаки по-умолчанию Player player = new Tank("name");
* Придумать, все, что захочется и обогатить проект
* Понасоздавать объектов и стравить их друг с другом
 */
public class Player {
    private long id;
    private String name;
    protected double damage;
    protected double healthPoint;
    protected double armor;
    protected static Random rnd;
    protected boolean statusLife = true;
    
    
    private static int defaultIndex = 1;
    static {Player.rnd = new Random();}



    public Player(String name){
        this.name = name;
        this.damage = 1;
        this.healthPoint = 10;
        id = defaultIndex;
        defaultIndex++;
        this.armor = 1;
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getDamageInfo(){
        if (statusLife){
            return damage;
        } else {
            return 0;
        }
    }
    public double getArmor(){
        return armor;
    }
    public double getHP(){
        return healthPoint;
    }
    public boolean getStatusLife(){
        return statusLife;
    }
    /**
     * В методе получения урона песонажу, я учитываю броню персонажа (как небольшое дополнение как задаче)
     */
    public void GetDamage(double damage){
        if (statusLife){
            if (this.healthPoint - damage > 0){
                this.healthPoint = Math.round(this.healthPoint - (damage * (1 - (this.armor * 0.01))));
                System.out.println(this.name + " get " + Math.round(damage * (1 - (this.armor * 0.01))) + " damage");
            } else {
                this.healthPoint = Math.round(this.healthPoint - (damage * (1 - (this.armor * 0.01))));
                this.statusLife = false; 
                die();
            }
        }
    }
    public void die(){
        System.out.printf("%s Die!\n", name);
    }

    public String getInfo(){
        return String.format("Id: %s Name: %s HP: %s Damage: %s Armor: %s",
        getId(), getName(), getHP(), getDamageInfo(), getArmor());
    }

}
