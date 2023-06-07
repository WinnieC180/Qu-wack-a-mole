import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JPanel implements ActionListener, MouseMotionListener, ItemListener {

    private int x;
    private int y;
    private int previous;
    private JButton switchButton;
    private JButton start;

    private JLabel back;

    public Home () {
        previous = 0;

        switchButton = new JButton("switch Button");
        add(switchButton);
        switchButton.setLocation(200,200);
        switchButton.addActionListener(this);

        start = new JButton("start");
        add(start);
        start.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon icon0 = new ImageIcon("src/title.jpg");
        Image iconImg = icon0.getImage();
        g.drawImage(iconImg, 0, 0, null);

        start.setLocation(270,400);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton button = (JButton) source;
        String text = button.getText();

        if (text.equals("start")){
            SimpleGUI.cardLayout.show(SimpleGUI.mainPanel, "pane2");
        }
    }


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}