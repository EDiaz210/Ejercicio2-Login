import javax.swing.*;
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
                    validacion.setText("Acceso exitoso");
                }else {
                    validacion.setText("Credenciales invalidas");
                }
            }
        });


    }
}
