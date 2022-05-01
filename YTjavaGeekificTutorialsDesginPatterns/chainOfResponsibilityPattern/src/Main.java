public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);//stworzenie nowego handlera - jako UserExistsHandler
        handler.setNextHandler(new ValidPasswordHandler(database));//UserExistsHandler.setNextHandler(new ValidPasswordHandler(database))
        handler.setNextHandler(new RoleCheckHandler());//UserExistsHandler.setNextHandler(new RoleCheckHandler())
        AuthService service = new AuthService(handler);

        System.out.println("==========================================");
// SOMETHING WRONG
        System.out.println(service.logIn("user_username", "user_password"));

//        System.out.println("==========================================");
//
//        System.out.println(service.logIn("wrong1", "password"));
//
//        System.out.println("==========================================");
//
//        System.out.println(service.logIn("user_username", "password"));
//
//        System.out.println("==========================================");
//
//        System.out.println(service.logIn("admin_username", "admin_password"));
//
//        System.out.println("==========================================");

    }
}
