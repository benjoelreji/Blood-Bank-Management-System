import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RequestRegistrationPage extends JFrame {

    public RequestRegistrationPage(DefaultTableModel model) {

        setTitle("Blood Request");
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
        JPanel card = new JPanel(new GridLayout(14, 1, 10, 10));
        card.setPreferredSize(new Dimension(420, 500));
        card.setBackground(new Color(255, 255, 255, 235));
        card.setBorder(BorderFactory.createEmptyBorder(25, 30, 25, 30));

        /* ===== HEADING ===== */
        JLabel title = new JLabel("Blood Request", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setForeground(new Color(180, 0, 0));

        /* ===== FIELDS ===== */
        JTextField name = new JTextField();
        JTextField phone = new JTextField();
        JTextField email = new JTextField();
        JTextField hospital = new JTextField();

        String[] groups = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
        JComboBox<String> blood = new JComboBox<>(groups);

        JCheckBox urgent = new JCheckBox("URGENT");
        urgent.setForeground(Color.RED);

        /* ===== BUTTON ===== */
        JButton requestBtn = new JButton("Send Blood Request");
        requestBtn.setBackground(new Color(180, 0, 0));
        requestBtn.setForeground(Color.WHITE);
        requestBtn.setFont(new Font("Arial", Font.BOLD, 18));
        requestBtn.setFocusPainted(false);
        requestBtn.setPreferredSize(new Dimension(200, 45));

        /* ===== ADD COMPONENTS IN ORDER ===== */
        card.add(title);

        card.add(new JLabel("Patient Name"));
        card.add(name);

        card.add(new JLabel("Phone Number"));
        card.add(phone);

        card.add(new JLabel("Email"));
        card.add(email);

        card.add(new JLabel("Hospital"));
        card.add(hospital);

        card.add(new JLabel("Blood Group"));
        card.add(blood);

        card.add(urgent);
        card.add(requestBtn);

        bg.add(card);

        /* ===== BUTTON ACTION ===== */
        requestBtn.addActionListener(e -> {
            model.addRow(new Object[]{
                    name.getText(),
                    blood.getSelectedItem(),
                    hospital.getText(),
                    urgent.isSelected() ? "YES" : "NO",
                    "Not Available"
            });
            dispose();
        });
    }
}
