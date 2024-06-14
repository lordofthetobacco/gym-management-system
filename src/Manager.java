import java.util.Date;

public class Manager extends Person implements Utilities{
    private static int lastId = 0;
    private int id = lastId++;

    private Facility workPlace;
    private String login;

    Manager(String name, String lastName, Date birthDate) {
        super(name, lastName, birthDate);
        this.login = (getLastName() + getName().charAt(0)) + id;
        DataHandler.allManagers.add(this);
        DataHandler.newLoginData(login, defaultPassword);
    }


    public void assignWorkPlace(Facility facility) {
        workPlace = facility;
    }

    public Facility getWorkPlace() {
        return workPlace;
    }

    public String getLogin() {
        return login;
    }
}
