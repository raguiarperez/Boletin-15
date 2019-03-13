
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author raguiarperez
 */
public class Boletin15 {

    public static void main(String[] args) {
        Productos camiseta = new Productos("C1", 24);
        Productos casco = new Productos("H23", 234);
        Productos Smartphone = new Productos("M30", 109);

        JOptionPane.showMessageDialog(null, Productos.Factura(camiseta, casco, Smartphone));
        try {
            casco.setProductos();
        } catch (CodigoExcepcion e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage());
        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(null, "Número incorrecto");
        }
        JOptionPane.showMessageDialog(null, Productos.Factura(camiseta, casco, Smartphone));

    }

}

