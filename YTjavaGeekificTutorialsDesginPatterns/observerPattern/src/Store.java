public class Store {
//    komponenty sklepu jako fieldsy:
    private final NotificationService notificationService;

//    konstruktor:
    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(Event.NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(Event.SALE);
    }

//    Getter - żeby "dobrać się" do metod w NotificationService
    public NotificationService getService() {
        return notificationService;
    }
}
