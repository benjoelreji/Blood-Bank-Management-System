import java.awt.*;
import javax.swing.*;

public class WelcomePage extends JFrame {

    public WelcomePage() {

        setTitle("Blood Donation System");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel bg = new JPanel() {
            Image img = new ImageIcon("sample/bg_blood.jpg").getImage();
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        bg.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);

        JLabel title = new JLabel("BLOOD DONATION SYSTEM");
        title.setFont(new Font("Arial", Font.BOLD, 48));
        title.setForeground(Color.WHITE);

        JLabel msg = new JLabel("<html><center>Donate Blood • Save Life</center></html>");
        msg.setFont(new Font("Arial", Font.BOLD, 22));
        msg.setForeground(Color.WHITE);

        JButton login = styled("LOGIN");
        JButton signup = styled("SIGN UP");

        JPanel btnPanel = new JPanel();
        btnPanel.setOpaque(false);
        btnPanel.add(login);
        btnPanel.add(signup);

        gbc.gridy=0; bg.add(title, gbc);
        gbc.gridy=1; bg.add(msg, gbc);
        gbc.gridy=2; bg.add(btnPanel, gbc);

        add(bg);

        login.addActionListener(e -> {
            new LoginPage().setVisible(true);
            dispose();
        });

        signup.addActionListener(e -> {
    new SignupPage().setVisible(true);
    dispose();
});

    }

    private JButton styled(String t) {
        JButton b = new JButton(t);
        b.setFont(new Font("Arial", Font.BOLD, 20));
        b.setBackground(new Color(200,0,0));
        b.setForeground(Color.WHITE);
        b.setPreferredSize(new Dimension(160,50));
        return b;
    }

    public static void main(String[] args) {
        new WelcomePage().setVisible(true);
    }
}
