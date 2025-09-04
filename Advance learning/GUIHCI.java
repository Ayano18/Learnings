import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIHCI extends JFrame {

    private JTextField txtFirstName, txtLastName, txtMiddleName, txtMobile, txtEmail;
    private JButton btnSubmit, btnClearAll;
    private JFrame outputFrame;

    public GUIHCI() {
        setTitle("INPUT");
        setSize(300, 300);
        setLayout(new GridLayout(6, 2));

        txtFirstName = new JTextField();
        txtLastName = new JTextField();
        txtMiddleName = new JTextField();
        txtMobile = new JTextField();
        txtEmail = new JTextField();

        add(new JLabel("First Name:"));
        add(txtFirstName);
        add(new JLabel("Last Name:"));
        add(txtLastName);
        add(new JLabel("Middle Name:"));
        add(txtMiddleName);
        add(new JLabel("Mobile Number:"));
        add(txtMobile);
        add(new JLabel("E-mail Address:"));
        add(txtEmail);

        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new SubmitActionListener());
        btnClearAll = new JButton("Clear All");
        btnClearAll.addActionListener(new ClearAllActionListener());

        add(btnSubmit);
        add(btnClearAll);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void showOutput() {
        String details = String.format("First Name: %s\nLast Name: %s\nMiddle Name: %s\nMobile Number: %s\nE-mail Address: %s",
                txtFirstName.getText(), txtLastName.getText(), txtMiddleName.getText(), txtMobile.getText(), txtEmail.getText());

        outputFrame = new JFrame("OUTPUT");
        outputFrame.setSize(300, 200);
        JTextArea textArea = new JTextArea(details);
        textArea.setEditable(false);
        outputFrame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        JButton btnOkay = new JButton("Okay");
        btnOkay.addActionListener(new OkayActionListener(outputFrame));
        outputFrame.add(btnOkay, BorderLayout.SOUTH);
        outputFrame.setVisible(true);
        btnSubmit.setEnabled(false);
    }

    private void clearFields() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMiddleName.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
        btnSubmit.setEnabled(true);
        
        if (outputFrame != null && outputFrame.isVisible()) {
            outputFrame.dispose();
        }
    }

    class SubmitActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            showOutput();
        }
    }

    class ClearAllActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clearFields();
        }
    }

    class OkayActionListener implements ActionListener {
        private JFrame outputFrame;

        public OkayActionListener(JFrame outputFrame) {
            this.outputFrame = outputFrame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            outputFrame.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUIHCI frame = new GUIHCI();
            frame.setVisible(true);
        });
    }
}
