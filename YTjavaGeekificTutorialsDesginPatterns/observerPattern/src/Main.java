public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.getService().subscribe(Event.NEW_ITEM, new EmailMsgListener("geekific@like.com"));//Event.NEW_ITEM zwraca wartość NEW_ITEM z typu wyliczeniowego Enum - zwraca obiekt Event
        store.getService().subscribe(Event.SALE, new EmailMsgListener("geekific@like.com"));//new EmailMsgListener implementuje interfejs Listerner więc zwraca obiekt Listener
        store.getService().subscribe(Event.SALE, new EmailMsgListener("geekific@subs.com"));
        store.getService().subscribe(Event.NEW_ITEM, new MobileAppListener("GeekificLnS"));

        store.newItemPromotion();

        System.out.println("===============================================================");

        store.salePromotion();

        System.out.println("===============================================================");

        store.getService().unsubscribe(Event.SALE, new EmailMsgListener("geekific@like.com"));
        store.salePromotion();
    }
}
