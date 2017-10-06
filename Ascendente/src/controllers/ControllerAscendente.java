/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import models.ModelAscendente;
import view.ViewAscendente;
import view.ViewPrincipal;


public class ControllerAscendente {

    ViewAscendente ViewAscendente;
    ViewPrincipal ViewPrincipal;
    ModelAscendente modelAscendente;
    

    public ControllerAscendente(ViewAscendente ViewAscendente, ViewPrincipal ViewPrincipal, ModelAscendente modelAscendente) {
        this.ViewAscendente = ViewAscendente;
        this.modelAscendente = modelAscendente;
        this.ViewPrincipal = ViewPrincipal;
        ViewAscendente.jbtn_insertar.addActionListener(e -> jbtn_insertar_click());
        ViewAscendente.jbtn_asc.addActionListener(e -> jbtn_asc_click());
        ViewAscendente.jbtn_promedio.addActionListener(e -> jbtn_promedio_click());
        initView();
    }
    
  
            
    public void jbtn_principal_click(){
        
    }
    public void jbtn_promedio_click(){
        modelAscendente.setN1(Integer.parseInt(ViewAscendente.jtf_valor.getText()));
        ;
    }
    public void jbtn_asc_click(){
        
    }
    public void jbtn_insertar_click(){
        modelAscendente.setN1(Integer.parseInt(ViewAscendente.jtf_valor.getText()));
    }

    private void initView(){
        ViewAscendente.jtf_valor.setText(String.valueOf(modelAscendente.getN1()));
    }
   
    private DefaultListModel jl_list1(){
        DefaultListModel<String> model = new DefaultListModel<>();
        return model;
    }
}
