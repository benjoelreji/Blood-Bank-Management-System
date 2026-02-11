import java.awt.*;
import javax.swing.*;

public class SignupPage extends JFrame {

    public SignupPage() {

        setTitle("Create Account");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* ===== BACKGROUND ===== */
        JPanel bg = new JPanel() {
            Image img = new ImageIcon("sample/bg_blood.jpg").getImage();
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        bg.setLayout(new GridBagLayout());
        add(bg);

        /* ===== CARD ===== */
        JPanel card = new JPanel(new GridLayout(12, 1, 10, 10));
        card.setPreferredSize(new Dimension(420, 480));
        card.setBackground(new Color(255, 255, 255, 235));
        card.setBorder(BorderFactory.createEmptyBorder(25, 30, 25, 30));

        /* ===== HEADING ===== */
        JLabel title = new JLabel("Create Account", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setForeground(new Color(180, 0, 0));

        /* ===== FIELDS ===== */
        JTextField name = new JTextField();
        JTextField email = new JTextField();
        JPasswordField pass = new JPasswordField();
        JPasswordField rePass = new JPasswordField();

        /* ===== BUTTON ===== */
        JButton signupBtn = new JButton("SIGN UP");
        signupBtn.setBackground(new Color(180, 0, 0));
        signupBtn.setForeground(Color.WHITE);
        signupBtn.setFont(new Font("Arial", Font.BOLD, 18));
        signupBtn.setFocusPainted(false);
        signupBtn.setPreferredSize(new Dimension(200, 45));

        /* ===== LOGIN LINK ===== */
        JButton loginLink = new JButton("Already have an account? Login");
        loginLink.setBorder(null);
        loginLink.setBackground(Color.WHITE);
        loginLink.setForeground(new Color(160, 0, 0));
        loginLink.setFont(new Font("Arial", Font.PLAIN, 14));

        /* ===== ADD COMPONENTS (ORDER IMPORTANT) ===== */
        card.add(title);

        card.add(new JLabel("Full Name"));
        card.add(name);

        card.add(new JLabel("Email"));
        card.add(email);

        card.add(new JLabel("Password"));
        card.add(pass);

        card.add(new JLabel("Re-enter Password"));
        card.add(rePass);

        card.add(signupBtn);
        card.add(loginLink);

        bg.add(card);

        /* ===== BUTTON ACTIONS ===== */
        signupBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "Account created successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);

            new LoginPage().setVisible(true);
            dispose();
        });

        loginLink.addActionListener(e -> {
            new LoginPage().setVisible(true);
            dispose();
        });
    }
}
