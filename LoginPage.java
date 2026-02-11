import java.awt.*;
import javax.swing.*;

public class LoginPage extends JFrame {

    public LoginPage() {

        setTitle("Login");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ===== BACKGROUND =====
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

        // ===== CARD =====
        JPanel card = new JPanel(new GridBagLayout());
        card.setPreferredSize(new Dimension(420, 300));
        card.setBackground(new Color(255, 255, 255, 235));
        card.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // ===== TITLE =====
        JLabel title = new JLabel("LOGIN");
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setForeground(new Color(180, 0, 0));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        card.add(title, gbc);

        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        // ===== EMAIL =====
        gbc.gridx = 0;
        gbc.gridy = 1;
        card.add(new JLabel("Email"), gbc);

        gbc.gridx = 1;
        JTextField email = new JTextField(15);
        card.add(email, gbc);

        // ===== PASSWORD =====
        gbc.gridx = 0;
        gbc.gridy = 2;
        card.add(new JLabel("Password"), gbc);

        gbc.gridx = 1;
        JPasswordField pass = new JPasswordField(15);
        card.add(pass, gbc);

        // ===== LOGIN BUTTON =====
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;

        JButton loginBtn = new JButton("LOGIN");
        loginBtn.setPreferredSize(new Dimension(200, 40));
        loginBtn.setBackground(new Color(180, 0, 0));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFont(new Font("Arial", Font.BOLD, 18));
        loginBtn.setFocusPainted(false);

        card.add(loginBtn, gbc);

        // ===== CREATE ACCOUNT =====
        gbc.gridy = 4;
        JButton signupBtn = new JButton("Create new account");
        signupBtn.setBorder(null);
        signupBtn.setBackground(Color.WHITE);
        signupBtn.setForeground(new Color(160, 0, 0));
        signupBtn.setFont(new Font("Arial", Font.PLAIN, 14));

        card.add(signupBtn, gbc);

        bg.add(card);

        // ===== ACTIONS =====
        loginBtn.addActionListener(e -> {
            new DashboardPage().setVisible(true);
            dispose();
        });

        signupBtn.addActionListener(e -> {
            new SignupPage().setVisible(true);
            dispose();
        });
    }
}
