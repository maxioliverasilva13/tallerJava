/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mygym.enums;

import javax.swing.JPanel;
import mygym.pages.Actividades;
import mygym.pages.Clase;
import mygym.pages.Cuponeras;
import mygym.pages.Inicio;
import mygym.pages.Instituciones;
import mygym.pages.Usuarios;
import mygym.enums.PAGE;

/**
 *
 * @author maximilianooliverasilva
 */

public class SideBarContent {
    public PAGE activePage;
    
    public SideBarContent(){
        this.activePage = PAGE.INICIO;
    };
    
    public PAGE getActivePage() {
        return this.activePage;
    }
    
    public void setActivatePage(PAGE val) {
        this.activePage = val;
    }
    
    public JPanel getContentPanel() {
        JPanel pagetoReturn;
        switch (activePage) {
            case INICIO -> pagetoReturn = new Inicio();
            case ACTIVIDAD -> pagetoReturn = new Actividades();
            case CUPONERA -> pagetoReturn = new Cuponeras();
            case CLASE -> pagetoReturn = new Clase();
            case INSTITUCION -> pagetoReturn = new Instituciones();
            case USUARIO -> pagetoReturn = new Usuarios();
            default -> throw new AssertionError();
        }
        return pagetoReturn;
    }
}
