public class BaseBurger {//z base burgaera będzie extaneds dwa inne warianty
    private String name;
    private String breadRoll;
    private String meat;
    private double burgerPrice;

    private int additionalLimit = 0;
    private int additionsSum = 0;
    private double priceWithAdditions = 0;

    private int tomato = 0;
    private int avocado = 0;
    private int onion = 0;
    private int cheddar = 0;

    private double tomatoPrice = 3.50;
    private double avocadoPrice = 8;
    private double onionPrice = 2;
    private double cheddarPrice = 7.50;

    public BaseBurger(String name, String breadRoll, String meat, double burgerPrice) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.burgerPrice = burgerPrice;
        additionalLimit = 4;
    }

    //    NIE MOŻE BYĆ COMPOSITIONS - TRZEBA BY ROBIĆ NEW TOMATO, NEW AVOCADO ITP
    public void additions(){
        double tomatoTotal = tomato * tomatoPrice;
        double avocadoTotal = avocado * avocadoPrice;
        double onionTotal = onion * onionPrice;
        double cheddarTotal = cheddar * cheddarPrice;
        System.out.println("Base burger price: " + burgerPrice);
        System.out.println("Extra tomato - " + tomato + " for " + tomatoTotal);
        System.out.println("Extra avocado - " + avocado + " for " + avocadoTotal);
        System.out.println("Extra onion - " + onion + " for " + onionTotal);
        System.out.println("Extra cheddar - " + cheddar + " for " + cheddarTotal);
        System.out.println("Total cost: " + (tomatoTotal + avocadoTotal + onionTotal + cheddarTotal + burgerPrice));
    }

    public void additions(String addition){//TUTAJ TRZEBA WSZYSTKIE METODY DLA 3 BURGERÓW!!!...ale wtedy będzie dostęp np burgera deluxe do metod burgera heealthy
//        INTRO TO INHERITANCE - DOG
        if (additionsSum < additionalLimit){
            switch (addition){
                case "tomato":
                    tomato ++;
                    additionsSum ++;
                    priceWithAdditions += tomatoPrice;
                    System.out.println("Tomato added.");
                    break;
                case "avocado":
                    avocado ++;
                    additionsSum ++;
                    priceWithAdditions += avocadoPrice;
                    System.out.println("Avocado added.");
                    break;
                case "onion":
                    onion ++;
                    additionsSum ++;
                    priceWithAdditions += onionPrice;
                    System.out.println("Onion added.");
                    break;
                case "cheddar":
                    cheddar ++;
                    additionsSum ++;
                    priceWithAdditions += cheddarPrice;
                    System.out.println("Cheddar added.");
                    break;
            }
        } else {
            System.out.println("Limit of additions reached!");
        }
    }


    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public int getTomato() {
        return tomato;
    }

    public int getAvocado() {
        return avocado;
    }

    public int getOnion() {
        return onion;
    }

    public int getCheddar() {
        return cheddar;
    }

    public int getAdditionsSum() {
        return additionsSum;
    }

    public int getAdditionalLimit() {
        return additionalLimit;
    }

    public void setAdditionalLimit(int additionalLimit) {
        this.additionalLimit = additionalLimit;
    }
}