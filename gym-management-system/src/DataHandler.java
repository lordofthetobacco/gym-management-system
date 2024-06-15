import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataHandler {

    public static ArrayList<Employee> allEmployees = new ArrayList<>();
    public static ArrayList<Manager> allManagers = new ArrayList<>();
    public static ArrayList<Facility> allFacilities = new ArrayList<>();
    public static ArrayList<Member> allMembers = new ArrayList<>();

    private static HashMap<String, String> loginData = new HashMap<>();
    public static boolean authenticate(String username, String password) {
        for (Map.Entry<String, String> entry : loginData.entrySet()) {
            if (entry.getKey().equals(username) && entry.getValue().equals(password)) {
                return true;
            }
        }
        return false;
    }
    public static void newLoginData(String username, String password) {
        loginData.put(username, password);
    }
}
