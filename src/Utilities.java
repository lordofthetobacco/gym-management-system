import java.text.SimpleDateFormat;
import java.util.Date;

public interface Utilities {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date currentDate = new Date();
    String defaultPassword = "changeme";
}
