/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewMain;
import models.ModelMain;
import views.ViewMessage;
import views.ViewOperaciones;
import models.ModelMain;
import models.ModelOperaciones;

public class ControllerMain implements ActionListener{
    ViewMain viewMain;
    ViewMessage viewMessage;
    ModelMain modelMain;
    ViewOperaciones viewoperaciones;
    ModelOperaciones modeloperaciones;
    
    public ControllerMain(ViewMain viewMain,ViewMessage viewMessage,ViewOperaciones viewoperaciones, ModelMain modelMain){
        this.viewMain = viewMain;
        this.viewMessage = viewMessage;
        this.modelMain = modelMain;
        this.viewoperaciones =viewoperaciones;
        this.viewMain.jmiMessage.addActionListener(this); //evento del boton jmiMessage
        this.viewMain.jmiOperaciones.addActionListener(this); //evento del boton jmiMessage
        initView();
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMain.jmiMessage)
            jmiMessageActionPerformed();
        else if (e.getSource() ==viewMain.jmiOperaciones)
            jmiOperacionesActionPerformed();
    }
    public void jmiMessageActionPerformed(){
        this.viewMain.setContentPane(viewMessage);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
        public void jmiOperacionesActionPerformed(){
        this.viewMain.setContentPane(viewoperaciones);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    private void initView(){
        this.viewMain.setTitle("Hello MVC Panel");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
    }
}
