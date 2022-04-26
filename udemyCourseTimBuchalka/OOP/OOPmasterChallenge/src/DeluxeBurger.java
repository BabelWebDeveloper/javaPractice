public class DeluxeBurger extends BaseBurger{
    public DeluxeBurger(String meat) {
        super("Deluxe burger", "Standard", meat, 28);
        setAdditionalLimit(4);
    }
}
//wskazówka: Musisz znaleźć sposób na automatyczne dodawanie tych nowych dodatków w momencie tworzenia obiektu deluxe burger, a następnie uniemożliwić wprowadzanie innych dodatków.
//zrobić wersje base burger z 4 fieldsami: String addition1, String addition2 ect, healthy z 6 fieldsami i deluxe bez extra dodatków ale z chipsami i napojem
