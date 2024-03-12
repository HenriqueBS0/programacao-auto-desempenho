package exercicio04;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class TelaContadores extends JFrame {
    public TelaContadores() {
        super("Contadores");
        setLayout(new GridLayout(2, 1));

        add(new ContadorComponente("A"));
        add(new ContadorComponente("B"));
        
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
