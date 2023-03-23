package Seminar_1.HomeWork;

public class Archer extends Player {
    private double tempAttack;
    /**
     * Лучник имеет шанс лишь задеть, либо нанести повышенный урон 
     */
    public Archer(String name) {
        super(name);
        this.damage = Math.round(rnd.nextDouble(35, 45));
        this.healthPoint = Math.round(rnd.nextDouble(80, 100));
        this.armor = Math.round(rnd.nextDouble(3, 11));
    }

    public double Attack(){
        if (statusLife){
            tempAttack = damage;
            tempAttack = Math.round(rnd.nextDouble(0.7, 1.31) * this.damage);
            System.out.println(tempAttack);
            return tempAttack;
        }
        return 0;
    }
}
