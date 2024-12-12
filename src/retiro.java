import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retiro {
    private JButton $20Button1;
    private JButton $40Button1;
    private JButton $60Button;
    private JButton $80Button;
    private JButton $100Button;
    private JButton $120Button;
    private JButton $200Button;
    private JButton $300Button;
    private JTextField otroValorTextField;
    private JTextField $TextField;
    private JButton retirarButton;
    private JButton volverAlMenúButton;
    public JPanel retiro;

    public retiro() {
        volverAlMenúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JFrame)SwingUtilities.getWindowAncestor(volverAlMenúButton)).dispose();
                JFrame frame = new JFrame("Lyxuz Oxcorp");
                frame.setContentPane(new Transaccion().menu);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(350, 500));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
