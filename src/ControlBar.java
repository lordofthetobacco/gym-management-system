import javax.swing.*;

public class ControlBar extends JMenuBar {

    private MainWindow mainWindowRef;

    private JMenu fileMenu = new JMenu("File");
    private     JMenuItem reloadFromDisk = new JMenuItem("Reload From Disk");
    private     JMenuItem logout = new JMenuItem("Logout");
    private JMenu editMenu = new JMenu("Edit");
    private     JMenuItem employees = new JMenuItem("Employees");
    private     JMenuItem members = new JMenuItem("Members");
    private     JMenuItem facilities = new JMenuItem("Facilities");
    private     JMenuItem courses = new JMenuItem("Courses");
    private JMenu helpMenu = new JMenu("Help");
    private     JMenuItem about = new JMenuItem("About");

    public ControlBar(MainWindow mainWindowRef) {
        this.mainWindowRef = mainWindowRef;
        fileMenu();
        editMenu();
        helpMenu();
    }

    private void fileMenu() {
        fileMenu.add(reloadFromDisk);
        fileMenu.add(logout);
        add(fileMenu);
    }

    private void editMenu() {
        editMenu.add(employees);
        editMenu.add(members);
        editMenu.add(facilities);
        editMenu.add(courses);
        add(editMenu);
    }

    private void helpMenu() {
        helpMenu.add(about);
        add(helpMenu);
    }
}
