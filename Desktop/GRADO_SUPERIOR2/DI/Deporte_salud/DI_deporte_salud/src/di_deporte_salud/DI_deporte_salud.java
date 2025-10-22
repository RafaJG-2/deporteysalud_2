/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package di_deporte_salud;
import javax.swing.SwingUtilities;
/**
 *
 * @author Rafa
 */
public class DI_deporte_salud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new deporte_y_salud().setVisible(true);
        });
    }
    
}
