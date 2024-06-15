import javax.swing.*;
import java.awt.*;

public class ProfilePanel extends JPanel implements Utilities{
    private Member memberRef;

    public ProfilePanel(Member memberRef) {
        this.memberRef = memberRef;
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setLayout(new GridLayout(2,2,5,5));
        add(imagePanel());
        add(basicDataPanel());
    }
    private JPanel basicDataPanel() {
        JPanel basicDataPanel = new JPanel();
        basicDataPanel.setBorder(BorderFactory.createEmptyBorder(0,5,5,0));
        basicDataPanel.setLayout(new GridLayout(3,1,5,0));
        basicDataPanel.add(new JLabel(memberRef.getName()));
        basicDataPanel.add(new JLabel(memberRef.getLastName()));
        basicDataPanel.add(new JLabel("Pass Expires on: " + dateFormat.format(memberRef.getPassExpirationDate())));
        return basicDataPanel;
    }
    private JPanel imagePanel() {
        JPanel imagePanel = new JPanel();
        imagePanel.setBorder(BorderFactory.createEmptyBorder(0,0,5,5));
        imagePanel.add(new JLabel(new ImageIcon(memberRef.getProfilePicture())));
        return imagePanel;
    }
}
