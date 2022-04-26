public class Burger {
    //some methods..
}
class HealthyBurger extends Burger {//extends mean inherit methods (behaviors) form parent
    //some methods...S
}

//COVARIANT RETURN TYPE - KOWARIANTALNY ZNACZY pozostający w stałej relacji do czegoś, podklasy mogą mieć inny return niż superklasa (sub return)

//KOWARIANCJA:
//class Super {
//    Object getSomething(){}
//}
//class Sub extends Super {
//    String getSomething() {}
//}
//Sub # getSomething jest kowariantny, ponieważ zwraca podklasę typu return Super # getSomething (ale wypełnia kontrakt Super.getSomething ())

//KONTRAWARIANCJA:

