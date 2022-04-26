import java.util.Scanner;

public class Door {
    private String material;
    private boolean access;

    public Door(String material, boolean access) {
        this.material = material;
        this.access = access;
    }

    public void isAccess(boolean access) {
        System.out.println("Door isAccess() called ---");
        if (access){
            System.out.println("Door is close.");
        } else {
            System.out.println("Door is open.");
        }
    }
}
