import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class depositar {
    private JTextField textField1;
    private JButton depositarButton;
    private JButton volverAlMenúButton;
    public JPanel deposito;

    public depositar() {
        volverAlMenúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JFrame)SwingUtilities.getWindowAncestor(volverAlMenúButton)).dispose();
                JFrame frame = new JFrame("Lyxuz Oxcorp");
                frame.setContentPane(new Transaccion().menu);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(350, 200));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
