package co.edu.uniquindio.poo.application;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Tienda;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Tienda tienda1 = new Tienda("Tienda de doña Inés",7);
        JOptionPane.showMessageDialog(null, tienda1, null, 0);
    }
}
