import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.LocalDate;
public class Member extends Person implements Utilities{

    private static int lastId = 0;
    private int id = lastId++;

    private Date passExpirationDate;

    Member(String name, String lastName, Date birthDate) {
        super(name, lastName, birthDate);
        extendPass();
        DataHandler.allMembers.add(this);
    }

    public void extendPass() {
        passExpirationDate = new Date(
                currentDate.getTime() + (1000L * 60 * 60 * 24 * 30)
        );
    }

    public int getId() {
        return id;
    }

    public Date getPassExpirationDate() {
        return passExpirationDate;
    }



}
