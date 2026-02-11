import java.awt.*;
import javax.swing.*;

public class ViewDetailsPage extends JFrame {

    public ViewDetailsPage(String name,String blood,
                           String place,String urgent,String status) {

        setTitle("Details");
        setSize(600,450);
        setLocationRelativeTo(null);

        JPanel bg=new JPanel(){
            Image img=new ImageIcon("sample/bg_blood.jpg").getImage();
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        };
        bg.setLayout(new GridBagLayout());
        add(bg);

        JPanel card=new JPanel(new GridLayout(7,1,10,10));
        card.setPreferredSize(new Dimension(400,320));
        card.setBackground(new Color(255,255,255,235));
        card.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        card.add(new JLabel("Name : "+name));
        card.add(new JLabel("Blood Group : "+blood));
        card.add(new JLabel("Hospital / Type : "+place));
        card.add(new JLabel("Urgent : "+urgent));
        card.add(new JLabel("Status : "+status));

        JButton close=new JButton("CLOSE");
        close.addActionListener(e -> dispose());
        card.add(close);

        bg.add(card);
    }
}

