package Seminar_1.HomeWork;


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
public class Program {

    
    public static void main(String[] args) throws InterruptedException {
        // Player standartUnit = new Player("standartUnit");
        // System.out.println(standartUnit.getInfo());
        Random random = new Random();
        int wait;
        
        Tank tank = new Tank("Tank"); // 1
        System.out.println(tank.getInfo());
        
        Archer archer = new Archer("Archer"); // 2
        System.out.println(archer.getInfo());
        
        Assasin assasin = new Assasin("Assasin"); // 3
        System.out.println(assasin.getInfo());
        
        System.out.println("---------Fight---------");
        
        while (assasin.getStatusLife() | tank.getStatusLife() | archer.getStatusLife()){
            wait = random.nextInt(1, 4);
            if (wait == tank.getId()){
                assasin.GetDamage(archer.Attack());
                System.out.println(assasin.getInfo());
                archer.GetDamage(assasin.Attack());
                System.out.println(archer.getInfo());
                
            } else if (wait == archer.getId()){
                tank.GetDamage(assasin.Attack());
                System.out.println(tank.getInfo());
                
                assasin.GetDamage(tank.Attack());
                System.out.println(assasin.getInfo());
            } else {
                tank.GetDamage(archer.Attack());
                System.out.println(tank.getInfo());
                
                archer.GetDamage(tank.Attack());
                System.out.println(archer.getInfo());
            }
            
            if (!assasin.getStatusLife() && !archer.getStatusLife()){
                System.out.println("Win Tank!");
                break;
            } else if (!assasin.getStatusLife() && !tank.getStatusLife()){
                System.out.println("Win Archer!");
                break;
            } else if (!archer.getStatusLife() && !tank.getStatusLife()){
                System.out.println("Win Assasin!");
                break;
            }
            System.out.println();
            Thread.sleep(2000);
        }
        
    }
    
}

