import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//        Local class:
        class ClickListener implements Button.onClickListener {

            public ClickListener(){
                System.out.println("I've been attached.");//just message - class ClickListener was fire up
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());

//        Anonymous class:
//        btnPrint.setOnClickListener(new Button.onClickListener() {//interface as a parameter
//            @Override
//            public void onClick(String title) {//interface is necessary to this method
//                System.out.println(title + " was clicked");
//            }
//        });

        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
