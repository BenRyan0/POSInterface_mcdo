/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_interfacemcdonald.s;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 *
 * @author benry
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Pane panel1,panel2,panel3,panel4,panel5;
    
    @FXML
    private JFXButton btn_1, btn_2, btn_3, btn_4, btn_5;
    
      @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btn_1){
            panel1.toFront();  
    }   else  if(event.getSource() == btn_2){
               panel2.toFront();
    }   else  if(event.getSource() == btn_3){
                panel3.toFront();
    }   else  if(event.getSource() == btn_4){
                panel4.toFront();
    }   else  if(event.getSource() == btn_5){
                panel5.toFront();
     } 
    }


 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
  
    
    
    
}
