/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combobox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


/**
 *
 * @author Justyna
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    private Label label;
    public ComboBox <String> inputScale;
    public ComboBox <String> outputScale;
    public TextField input;
    public TextField output;
    
    ObservableList<String> list = FXCollections.observableArrayList("Kelvin","Celcius","Fahrenheit");
    @FXML
    private void handleButtonAction(ActionEvent event) {
       Calc calc=new Calc();
       double o;
       double i;
       try{
        i=Double.parseDouble(input.getText());
        o=calc.choose(inputScale.getValue(),outputScale.getValue(),i);
       }
       catch (NumberFormatException n){
           label.setText("Input is not a number");
           input.setText("");
           return;  
        }
       String out=String.valueOf(o);
        output.setText(out);
        System.out.println("You clicked me!");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inputScale.setItems(list);
        outputScale.setItems(list);
        inputScale.setValue("Kelvin");
        outputScale.setValue("Celcius");
    }    

    private double DoubleParseDouble(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
