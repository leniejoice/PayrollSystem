/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.payroll.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author leniejoice
 */
public class TableActionCellRender extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent (JTable jtable, Object o, boolean isSelected, boolean blnl, int row, int column){
        Component com = super.getTableCellRendererComponent(jtable, o, isSelected, blnl, row, column);
        
        PanelAction action = new PanelAction ();
        if (isSelected == false && row % 2 ==0){
            action.setBackground(Color.WHITE);  
        }else{
            action.setBackground(com.getBackground());
        }
        return action;
    }
}
