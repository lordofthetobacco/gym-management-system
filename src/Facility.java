import java.util.ArrayList;

public class Facility {
    private static int lastId = 0;
    private int id = lastId++;

    private String address;
    private String phoneNumber;
    private String email;
    private ArrayList<TrainingRoom> rooms = new ArrayList<>();
    private Manager manager;
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    public Facility(String address, String phoneNumber, String email, int numberOfRooms) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        handleRoomsCreation(numberOfRooms);
    }

    private void handleRoomsCreation(int i) {
        for (int j = 0; j < i; j++) {
            rooms.add(new TrainingRoom());
        }
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addEmployee(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            addEmployee(employee);
        }
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void removeManager() {
        manager = null;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
