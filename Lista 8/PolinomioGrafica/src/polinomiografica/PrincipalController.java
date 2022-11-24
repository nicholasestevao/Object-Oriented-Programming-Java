/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomiografica;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 12689616
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private Label lbResultado;
    
    @FXML
    private Label lbPolinomio;
    
    @FXML
    private TextField tfGrau0;
    
    @FXML
    private TextField tfGrau1;
    
    @FXML
    private TextField tfGrau2;
    
    @FXML
    private TextField tfGrau3;
    
    @FXML
    private TextField tfGrau4;
    
    @FXML
    private TextField tfGrau5;    
    
    @FXML
    private TextField tfValorX;
    
    @FXML
    private Button bCalcular;
    
    @FXML
    private Button bGerarPolinomio;
    
    private Polinomio pol;
    
    
    @FXML
    public void calcular(){
        System.out.println("Calculou");
        if(!tfValorX.getText().equals("")){
            Double x = new Double(tfValorX.getText());
            Double res = pol.calcula(x);
            String res_string = res.toString();
            lbResultado.setText(res_string);
        }
    }
     
    @FXML
    public void gerarPolinomio(){
        System.out.println("Gerou");
        pol = new Polinomio(5);
        pol.add(new Termo(0,0.0));
        pol.add(new Termo(1,0.0));
        pol.add(new Termo(1,0.0));
        pol.add(new Termo(2,0.0));
        pol.add(new Termo(3,0.0));
        pol.add(new Termo(4,0.0));        
        pol.add(new Termo(5,0.0));
        if(!tfGrau0.getText().equals("")){
            pol.add(new Termo(0,new Double(tfGrau0.getText())));
        }
        if(!tfGrau1.getText().equals("")){
        pol.add(new Termo(1,new Double(tfGrau1.getText())));
        }
        if(!tfGrau2.getText().equals("")){
            pol.add(new Termo(2,new Double(tfGrau2.getText())));
        }
        if(!tfGrau3.getText().equals("")){
            pol.add(new Termo(3,new Double(tfGrau3.getText())));
        }
        if(!tfGrau4.getText().equals("")){
            pol.add(new Termo(4,new Double(tfGrau4.getText())));
        }
        if(!tfGrau5.getText().equals("")){
            pol.add(new Termo(5,new Double(tfGrau5.getText())));
        }
        lbPolinomio.setText(pol.mostra());
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pol = new Polinomio(5);
        
        pol.add(new Termo(0,0.0));
        pol.add(new Termo(1,0.0));
        pol.add(new Termo(1,0.0));
        pol.add(new Termo(2,0.0));
        pol.add(new Termo(3,0.0));
        pol.add(new Termo(4,0.0));        
        pol.add(new Termo(5,0.0));
        
        
        tfGrau0.textProperty().addListener( 
            new ChangeListener<String>() {     
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) { 
                        tfGrau0.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                }
             } 
       );
        tfGrau1.textProperty().addListener( 
            new ChangeListener<String>() {     
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) { 
                        tfGrau1.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                }
             } 
       );
        tfGrau2.textProperty().addListener( 
            new ChangeListener<String>() {     
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) { 
                        tfGrau2.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                }
             } 
       );
        tfGrau3.textProperty().addListener( 
            new ChangeListener<String>() {     
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) { 
                        tfGrau3.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                }
             } 
       );
        tfGrau4.textProperty().addListener( 
            new ChangeListener<String>() {     
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) { 
                        tfGrau4.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                }
             } 
       );
        tfGrau5.textProperty().addListener( 
            new ChangeListener<String>() {     
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) { 
                        tfGrau5.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                }
             } 
       );
        tfValorX.textProperty().addListener( 
            new ChangeListener<String>() {     
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) { 
                        tfValorX.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                }
             } 
       );
    }    
    
}
