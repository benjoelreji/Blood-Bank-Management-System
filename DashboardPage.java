import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DashboardPage extends JFrame {

    JTable table;
    DefaultTableModel model;

    public DashboardPage() {

        setTitle("Blood Donation System - Dashboard");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* ===== BACKGROUND ===== */
        JPanel bg = new JPanel() {
            Image img = new ImageIcon("Dsample/bg_blood.jpg").getImage();
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        bg.setLayout(new BorderLayout());
        setContentPane(bg);

        /* ===== TOP PANEL (TITLE + SEARCH + BUTTONS) ===== */
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(180, 0, 0));
        topPanel.setPreferredSize(new Dimension(1000, 100));

        // ---- TITLE ----
        JLabel title = new JLabel("  BLOOD DONATION SYSTEM");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setForeground(Color.WHITE);
        topPanel.add(title, BorderLayout.WEST);

        // ---- SEARCH BAR ----
        JPanel searchPanel = new JPanel();
        JTextField searchField = new JTextField(18);
        JButton searchBtn = new JButton("Search");

        searchBtn.setBackground(Color.WHITE);
        searchBtn.setForeground(new Color(180, 0, 0));

        searchPanel.add(new JLabel("Search (Name / Blood Group): "));
        searchPanel.add(searchField);
        searchPanel.add(searchBtn);

        topPanel.add(searchPanel, BorderLayout.CENTER);

        // ---- REGISTRATION BUTTONS ----
        JButton donorBtn = new JButton("DONOR REGISTRATION");
        JButton requestBtn = new JButton("BLOOD REQUEST");

        donorBtn.setBackground(Color.WHITE);
        donorBtn.setForeground(new Color(180, 0, 0));
        requestBtn.setBackground(Color.WHITE);
        requestBtn.setForeground(new Color(180, 0, 0));

        JPanel topRight = new JPanel();
        topRight.setOpaque(false);
        topRight.add(donorBtn);
        topRight.add(requestBtn);

        topPanel.add(topRight, BorderLayout.EAST);

        bg.add(topPanel, BorderLayout.NORTH);

        /* ===== TABLE ===== */
        String[] columns = {
                "Name", "Blood Group", "Hospital / Type", "Urgent", "Status"
        };

        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        table.setRowHeight(28);

        // Sample data
        model.addRow(new Object[]{"Arun", "O+", "Donor", "NO", "Available"});
        model.addRow(new Object[]{"Raju", "B+", "City Hospital", "YES", "Not Available"});

        JScrollPane scrollPane = new JScrollPane(table);
        bg.add(scrollPane, BorderLayout.CENTER);

        /* ===== BOTTOM PANEL (EDIT & DELETE) ===== */
        JPanel bottomPanel = new JPanel();

        JButton editBtn = new JButton("EDIT");
        JButton deleteBtn = new JButton("DELETE");

        editBtn.setBackground(new Color(180, 0, 0));
        editBtn.setForeground(Color.WHITE);

        deleteBtn.setBackground(Color.DARK_GRAY);
        deleteBtn.setForeground(Color.WHITE);

        bottomPanel.add(editBtn);
        bottomPanel.add(deleteBtn);

        bg.add(bottomPanel, BorderLayout.SOUTH);

        /* ===== ACTIONS ===== */

        // Search
        searchBtn.addActionListener(e -> search(searchField.getText()));

        // Registration buttons
        donorBtn.addActionListener(e ->
                new DonorRegistrationPage(model).setVisible(true));

        requestBtn.addActionListener(e ->
                new RequestRegistrationPage(model).setVisible(true));

        // Edit
        editBtn.addActionListener(e -> editRow());

        // Delete
        deleteBtn.addActionListener(e -> deleteRow());

        // Double click → View Details
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = table.getSelectedRow();
                    if (row == -1) return;

                    String status = model.getValueAt(row, 4).toString();

                    if (status.equals("Available")) {
                        new ViewDetailsPage(
                                model.getValueAt(row, 0).toString(),
                                model.getValueAt(row, 1).toString(),
                                model.getValueAt(row, 2).toString(),
                                model.getValueAt(row, 3).toString(),
                                model.getValueAt(row, 4).toString()
                        ).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "Blood not available currently",
                                "Info",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                }
            }
        });
    }

    /* ===== SEARCH METHOD ===== */
    private void search(String key) {
        if (key.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter search text");
            return;
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(key) ||
                model.getValueAt(i, 1).toString().equalsIgnoreCase(key)) {
                table.setRowSelectionInterval(i, i);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "No record found");
    }

    /* ===== EDIT METHOD ===== */
    private void editRow() {
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a row to edit");
            return;
        }

        String newName = JOptionPane.showInputDialog(
                this, "Edit Name:", model.getValueAt(row, 0));
        String newStatus = JOptionPane.showInputDialog(
                this, "Edit Status (Available / Not Available):",
                model.getValueAt(row, 4));

        if (newName != null && newStatus != null) {
            model.setValueAt(newName, row, 0);
            model.setValueAt(newStatus, row, 4);
        }
    }

    /* ===== DELETE METHOD ===== */
    private void deleteRow() {
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a row to delete");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this record?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            model.removeRow(row);
        }
    }
}
