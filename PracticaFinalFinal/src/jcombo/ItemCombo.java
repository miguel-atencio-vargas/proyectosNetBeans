
package jcombo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ItemCombo extends JPanel {    
    
    private JTable tabla;
    private JLabel tablaNombre;

    /**
     * Constructor de clase
     */
    public ItemCombo() {
        super();
        init();
    }
    
    private void init() {
        tabla = new JTable();
        tablaNombre = new JLabel();
        //dimensiones del componente
        setPreferredSize(new Dimension(300, 100));

        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(tabla);
        //para el titulo
        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(new Color(0, 0, 200));
        jPanel1.setPreferredSize(new Dimension(0, 16));
        jPanel1.setLayout(new GridBagLayout());
        //color de texto
        tablaNombre.setForeground(new Color(255, 255, 255));
        jPanel1.add(tablaNombre);
        //layout para el componente
        setLayout(new BorderLayout());
        
        //se agregan los componentes titulo y tabla
        add(jPanel1, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);        
    }        
        
    public String getNombreTabla() {
        return tablaNombre.getText();
    }

    public void setNombreTabla(String nombreTabla) {        
        tablaNombre.setText(nombreTabla);
    }

    public DefaultTableModel getTablaModel() {
        return (DefaultTableModel) tabla.getModel();
    }

    public void setTablaModel(DefaultTableModel tablaModel) {        
        this.tabla.setModel(tablaModel);
    }
    
}