/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import view.ViewAscendente;
import models.ModelAscendente;
import view.ViewPrincipal;
import controllers.ControllerAscendente;

public class Main {
    
    private static ViewAscendente viewAscendente;
    private static ModelAscendente modelAscendente;
    private static ControllerAscendente controllerAscendente;
    public static ViewPrincipal viewPrincipal;
    
     public static void main(String[] args) {
         
        viewAscendente = new ViewAscendente();
        modelAscendente = new ModelAscendente();
        viewPrincipal = new ViewPrincipal();
        controllerAscendente = new ControllerAscendente(viewAscendente, viewPrincipal, modelAscendente);
    }
}
