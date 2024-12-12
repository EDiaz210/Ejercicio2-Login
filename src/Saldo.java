import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo {
    private JButton button1;
    private JLabel Saldo;
    public JPanel SaldoP;

    public Saldo() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JFrame)SwingUtilities.getWindowAncestor(button1)).dispose();
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
