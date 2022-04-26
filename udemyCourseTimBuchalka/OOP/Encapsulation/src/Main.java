public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 200, "Sword");//visible variable is health, not hitPoints, hitPoints was changed thanks to encapsulation and we don't have to change name of variable inside of main
        System.out.println("Initial health is " + player.getHealth());//we must use getHealth() to get access to hitPoints - variable is hidden

        //	    Player player = new Player();
//        player.name = "Tim";
////        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200; ----- HERE unwanted change the health because data is not protected, not hidden, like it could be by constructor
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
    }
}
