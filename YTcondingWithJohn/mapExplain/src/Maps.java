import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empId = new HashMap<>();

        empId.put("Przemo",1);
        empId.put("Kinga",2);
        empId.put("Murzynek",3);

        System.out.println(empId);
        System.out.println(empId.get("Kinga"));
        System.out.println(empId.containsKey("Murzynek"));
        System.out.println(empId.containsValue(3));

        empId.replace("Murzynek",4);
        System.out.println(empId);

        empId.putIfAbsent("Murzynek",5);
        empId.putIfAbsent("Karek",5);
        System.out.println(empId);

        empId.remove("Karek");
        System.out.println(empId);
    }
}
