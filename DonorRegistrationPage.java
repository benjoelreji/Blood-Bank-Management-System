import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DonorRegistrationPage extends JFrame {

    public DonorRegistrationPage(DefaultTableModel model) {

        setTitle("Donor Registration");
        setSize(900, 550);
        setLocationRelativeTo(null);

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
        JPanel card = new JPanel(new GridLayout(10, 1, 10, 10));
        card.setPreferredSize(new Dimension(420, 430));
        card.setBackground(new Color(255, 255, 255, 235));
        card.setBorder(BorderFactory.createEmptyBorder(25, 30, 25, 30));

        /* ===== HEADING ===== */
        JLabel title = new JLabel("Donor Registration", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setForeground(new Color(180, 0, 0));

        /* ===== FIELDS ===== */
        JTextField name = new JTextField();
        JTextField phone = new JTextField();
        JTextField email = new JTextField();

        String[] groups = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
        JComboBox<String> blood = new JComboBox<>(groups);

        /* ===== BUTTON ===== */
        JButton registerBtn = new JButton("Register Donor");
        registerBtn.setBackground(new Color(180, 0, 0));
        registerBtn.setForeground(Color.WHITE);
        registerBtn.setFont(new Font("Arial", Font.BOLD, 18));
        registerBtn.setFocusPainted(false);
        registerBtn.setPreferredSize(new Dimension(200, 45));

        /* ===== ADD COMPONENTS (ORDER IMPORTANT) ===== */
        card.add(title);

        card.add(new JLabel("Name"));
        card.add(name);

        card.add(new JLabel("Phone Number"));
        card.add(phone);

        card.add(new JLabel("Email"));
        card.add(email);

        card.add(new JLabel("Blood Group"));
        card.add(blood);

        card.add(registerBtn);

        bg.add(card);

        /* ===== BUTTON ACTION ===== */
        registerBtn.addActionListener(e -> {
            model.addRow(new Object[]{
                    name.getText(),
                    blood.getSelectedItem(),
                    "Donor",
                    "NO",
                    "Available"
            });
            dispose();
        });
    }
}
