import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final ControlBar controlBar = new ControlBar(this);
    private LoginFrame loginFrameRef;

    public MainWindow(LoginFrame loginFrameRef) {
        this.loginFrameRef = loginFrameRef;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
    }
}
