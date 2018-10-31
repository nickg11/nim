package NIM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    Main main = new Main();

    private JFrame mainMenu;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI window = new GUI();
                    window.mainMenu.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        mainMenu = new JFrame();
        mainMenu.setBounds(100, 100, 450, 300);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblStartMenu = new JLabel("Start Menu");
        lblStartMenu.setFont(new Font("Rockwell", Font.PLAIN, 37));
        lblStartMenu.setHorizontalAlignment(SwingConstants.CENTER);
        mainMenu.getContentPane().add(lblStartMenu, BorderLayout.NORTH);

        JLabel lblTheGameOf = new JLabel("The game of Nim");
        lblTheGameOf.setFont(new Font("Rockwell", Font.PLAIN, 37));
        lblTheGameOf.setHorizontalAlignment(SwingConstants.CENTER);
        mainMenu.getContentPane().add(lblTheGameOf, BorderLayout.SOUTH);

        JButton btnStart = new JButton(" Computer ");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnStart.setBackground(Color.WHITE);
        btnStart.setFont(new Font("Rockwell", Font.PLAIN, 17));
        mainMenu.getContentPane().add(btnStart, BorderLayout.WEST);

        JButton btnMultiplayer = new JButton("Multiplayer");
        btnMultiplayer.setFont(new Font("Rockwell", Font.PLAIN, 17));
        mainMenu.getContentPane().add(btnMultiplayer, BorderLayout.EAST);
    }

}
