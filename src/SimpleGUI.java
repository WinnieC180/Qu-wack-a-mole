public class SimpleGUI extends JFrame implements ActionListener{
    private JLabel welcomeLabel;
    private Test newPanel;

    public SimpleGUI() {
        super("QU-WACK A MOLE");
        init();
    }

    private void init() {
        setTitle("QuWack a mole");
        setSize(550, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        newPanel = new Test();
        add(newPanel);
        setVisible(true);
    }

    // ActionListener interface method, called when a button is clicked
    public void actionPerformed(ActionEvent ae) {
        // cast ae to a JButton object since we want to call the getText method on it;
        // casting is needed since getSource() returns Object type, NOT a JButton
        Object source = ae.getSource();
        JButton button = (JButton) source;
        String text = button.getText();

        if (text.equals("Send")) {
            welcomeLabel.setText("Send pressed!");
        } else if (text.equals("Reset")) {
            welcomeLabel.setText("Reset pressed!");
        }
    }
}

