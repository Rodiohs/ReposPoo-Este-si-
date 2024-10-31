package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame{
    private JLabel jlName;      //Tienen que tener el mismo nombre que tienen en el Home.form
    private JTextField Nombre;
    private JButton btnMessage;
    private JPanel MainPanel;

    public Home(){
        setContentPane(MainPanel);
        setTitle("Clase POO");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Que hacer cuando se cierra la aplicacion
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        btnMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a message ");
            }
        });
    }
}
