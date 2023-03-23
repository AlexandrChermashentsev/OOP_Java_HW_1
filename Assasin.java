package Seminar_1.HomeWork;

// import java.util.Random;

public class Assasin extends Player {
    private int chance;
    /**
     * класс Ассасин интересен тем что в 30% случаев он наносит двойной урон
     */
    public Assasin(String name) {
        super(name);
        this.healthPoint = Math.round(rnd.nextDouble(80, 100));
        this.damage = Math.round(rnd.nextDouble(30, 40));
        this.armor = Math.round(rnd.nextDouble(8, 16));
    }

    public double Attack(){
        if (statusLife){
            chance = rnd.nextInt(101);
            if (chance <= 30){
                return damage * 2;
            }
            return damage;
        }
        return 0;
    }
    
}
