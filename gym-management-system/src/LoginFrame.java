import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private final LoginPanel loginPanel = new LoginPanel();
    private final JButton submitButton = new JButton("Submit");
    public LoginFrame() {
        setResizable(false);
        setSize(new Dimension(400,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(loginPanel);
        submitButton.addActionListener(e -> check());
        add(submitButton, BorderLayout.SOUTH);
        setVisible(true);
    }
    public void check() {
        if (DataHandler.authenticate(loginPanel.getLogin(), loginPanel.getPassword())) {
            this.setVisible(false);
            return;
        }
        loginPanel.loginFailed();
    }

    private class LoginPanel extends JPanel {
        private JTextField loginField = new JTextField();
        private JPasswordField passwordField = new JPasswordField();
        private JLabel loginFailedLabel = new JLabel("Login failed.");

        public LoginPanel() {
            setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
            loginFailedLabel.setForeground(Color.RED);
            loginFailedLabel.setVisible(false);
            passwordField.setEchoChar('*');
            setLayout(new GridLayout(5,1,5,5));
            add(new JLabel("Login")); add(loginField);
            add(new JLabel("Password")); add(passwordField);
            add(loginFailedLabel);
        }
        public String getLogin() {
            return loginField.getText();
        }
        public String getPassword() {
            return passwordField.getText();
        }
        public void loginFailed() {
            loginFailedLabel.setVisible(true);
            passwordField.setText("");
        }
    }
}
