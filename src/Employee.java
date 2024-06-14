import java.util.Date;

public class Employee extends Person implements Utilities{
    private static int lastId = 0;
    private int id = lastId++;

    private String login;

    Employee(String name, String lastName, Date birthDate) {
        super(name, lastName, birthDate);
        this.login = (getLastName() + getName().charAt(0)) + id;
        DataHandler.allEmployees.add(this);
        DataHandler.newLoginData(login, defaultPassword);
    }



}
