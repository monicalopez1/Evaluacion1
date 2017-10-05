/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.ViewOperaciones;
import views.ViewMain;
import models.ModelOperaciones;
import java.awt.event.ActionListener;


public class ControllerOperaciones {
    ViewOperaciones viewOperaciones;
    ModelOperaciones modelOperaciones;
    ViewMain viewMain;
    
    public ControllerOperaciones(ViewOperaciones viewOperaciones, ModelOperaciones modelOperaciones){
        this.viewOperaciones = viewOperaciones;
        this.modelOperaciones = modelOperaciones;
        viewOperaciones.jbtn_mas.addActionListener(e -> jbtn_mas_click());
        viewOperaciones.jbtn_menos.addActionListener(e -> jbtn_menos_click());
        viewOperaciones.jbtn_multi.addActionListener(e -> jbtn_multi_click());
        viewOperaciones.jbtn_division.addActionListener(e -> jbtn_division_click());
        initView();
    }
    
    private void initView(){
        viewOperaciones.jtf_n1.setText(String.valueOf(modelOperaciones.getN1()));
        viewOperaciones.jtf_n2.setText(String.valueOf(modelOperaciones.getN2()));
        viewOperaciones.jtf_resultado.setText(String.valueOf(modelOperaciones.getResultado()));
    }
    
    public void jbtn_mas_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));
        modelOperaciones.suma();
        viewOperaciones.jtf_resultado.setText(String.valueOf(modelOperaciones.getResultado()));
    }
    public void jbtn_menos_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));
        modelOperaciones.resta();
        viewOperaciones.jtf_resultado.setText(String.valueOf(modelOperaciones.getResultado()));
    }
    
    public void jbtn_multi_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));
        modelOperaciones.multiplicacion();
        viewOperaciones.jtf_resultado.setText(String.valueOf(modelOperaciones.getResultado()));
    }
    public void jbtn_division_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));
        modelOperaciones.division();
        viewOperaciones.jtf_resultado.setText(String.valueOf(modelOperaciones.getResultado()));
    }
}
