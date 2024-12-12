import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaccion {
    private JButton verSaldoButton;
    private JButton depositarButton;
    private JButton salirButton;
    private JButton retirarButton;
    public JPanel menu;

    public Transaccion() {
        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JFrame)SwingUtilities.getWindowAncestor(depositarButton)).dispose();
                JFrame frame = new JFrame("Lyxuz Oxcorp");
                frame.setContentPane(new depositar().deposito);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(350, 200));
                frame.pack();
                frame.setVisible(true);

            }
        });
        verSaldoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JFrame)SwingUtilities.getWindowAncestor(verSaldoButton)).dispose();
                JFrame frame = new JFrame("Lyxuz Oxcorp");
                frame.setContentPane(new Saldo().SaldoP);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(350, 200));
                frame.pack();
                frame.setVisible(true);

            }
        });
        retirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JFrame)SwingUtilities.getWindowAncestor(retirarButton)).dispose();
                JFrame frame = new JFrame("Lyxuz Oxcorp");
                frame.setContentPane(new retiro().retiro);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(350, 200));
                frame.pack();
                frame.setVisible(true);

            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Muchas Gracias...");
            }
        });
    }
}
