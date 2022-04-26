public class Player {
    private String name;
    private int hitPoints = 100;//#1 here changing default name of variable and setting begin value
    private String weapon;

    public Player(String name, int health, String weapon) {//hiding data - hitPoints as health
        this.name = name;

        if(health >0 && health <= 100) {//this validation allows us to protect data from manipulations
            this.hitPoints = health;//#2 and here
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
