package exercicio04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorComponente extends JPanel implements ActionListener{
    private JLabel numeroLabel;
    private JButton startButton, pauseButton, stopButton;
    private int contador = 0;
    private ContadorThread contadorThread;

    public ContadorComponente(String nomeContador) {
        // Configurando layout
        setLayout(new FlowLayout());

        // Criando e adicionando componentes
        startButton = new JButton("Start " + nomeContador);
        startButton.addActionListener(this);
        add(startButton);

        pauseButton = new JButton("Pause " + nomeContador);
        pauseButton.addActionListener(this);
        add(pauseButton);

        stopButton = new JButton("Stop " + nomeContador);
        stopButton.addActionListener(this);
        add(stopButton);

        numeroLabel = new JLabel(Integer.toString(contador));
        add(numeroLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startContador();
        } else if (e.getSource() == pauseButton) {
            pauseContador();
        } else if (e.getSource() == stopButton) {
            stopContador();
        }
    }

    private void startContador() {
        if(contadorThread == null) {
            contadorThread = new ContadorThread(this);
            contadorThread.start();
            return;
        }

        contadorThread.setPausado(false);
    }

    private void pauseContador() {
        if(contadorThread == null) {
            return;
        }

        contadorThread.setPausado(true);
    }

    private void stopContador() {
        contadorThread.parar();
        contador = 0;
        numeroLabel.setText(Integer.toString(contador));
        contadorThread = null;
    }

    public void incrementaContador() {
        contador++;
        numeroLabel.setText(Integer.toString(contador));
    }
}
