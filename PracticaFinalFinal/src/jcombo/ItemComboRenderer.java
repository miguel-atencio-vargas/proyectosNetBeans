/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcombo;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
/**
 * @see http://www.jc-mouse.net/
 * @author Mouse
 */
public class ItemComboRenderer extends ItemCombo implements ListCellRenderer{
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, 
            boolean isSelected, boolean cellHasFocus)
    {
        if (value != null) {//existe elemento
            
            setTablaModel(((ItemCombo) value).getTablaModel());
            setNombreTabla(((ItemCombo) value).getNombreTabla());            
            
            //Si elemento esta seleccionado no mostrara la tabla
            //sino solo el nombre de la tabla
            if (index == -1) {
                JLabel label = new JLabel(getNombreTabla());
                return label;
            }
            //sino muestra la tabla completa
            return this;
        } else {//se muestra un label vacio
            JLabel label = new JLabel();
            return label;
        }
    }
    
}