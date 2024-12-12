import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    public JPanel Login;
    private JButton logInButton;
    private JLabel validacion;

    public Login() {

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("APELLIDO") && passwordField1.getText().equals("APELLIDO123")) {
                    JOptionPane.showMessageDialog(null,"Acesso Exitoso");
                    ((JFrame)SwingUtilities.getWindowAncestor(logInButton)).dispose();
                    JFrame frame = new JFrame("Lyxuz Oxcorp");
                    frame.setContentPane(new Transaccion().menu);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setPreferredSize(new Dimension(350, 200));
                    frame.pack();
                    frame.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Ingrese correctamente las credenciales");
                }
            }
        });


    }
}
