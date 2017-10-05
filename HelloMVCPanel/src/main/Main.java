/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.*;
import models.*;
import controllers.*;

public class Main {
    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain; 
    
    private static ControllerOperaciones controlleroperaciones;
    private static ViewOperaciones viewoperaciones;
    private static ModelOperaciones modeloperaciones;
    
    private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;
    
    
    
     public static void main(String[] args) {
       viewMessage = new ViewMessage();
       modelMessage = new ModelMessage();
       controllerMessage = new ControllerMessage(viewMessage, modelMessage);
       
       viewoperaciones = new ViewOperaciones();
       modeloperaciones = new ModelOperaciones();
       controlleroperaciones = new ControllerOperaciones(viewoperaciones, modeloperaciones);
       
       viewMain = new ViewMain();
       modelMain = new ModelMain();
       controllerMain = new ControllerMain(viewMain,viewMessage,viewoperaciones,modelMain);
     }
}
