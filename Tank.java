package Seminar_1.HomeWork;

public class Tank extends Player {
    /**
     * класс Танк, в моем исполнении славится в большим кол-вом защиты и здоровья
     */
    public Tank(String name){
        super(name);
        this.damage = Math.round(rnd.nextDouble(20, 30));
        this.healthPoint = Math.round(rnd.nextDouble(120, 150));
        this.armor = Math.round(rnd.nextDouble(15, 31));
    }
    
    public double Attack(){
        if (statusLife){
            return damage;
        }
        return 0;
    }

}
