/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;

import javax.activity.InvalidActivityException;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author isaac
 */
public class GUIController implements Initializable {
    private String operation = "operation";
    private Calculadora c;

    @FXML
    private Button _calculate;
    
    @FXML
    private  MenuButton _seletorOperacao;
    
    @FXML
    private MenuItem _adicaoOperacao;
    
    @FXML
    private MenuItem _divisaoOperacao;
    
    @FXML
    private MenuItem _multiplicacaoOperacao;
    
    @FXML
    private MenuItem _subtracaoOperacao;
    
    @FXML
    private Pane _pane;
    
    @FXML
    private TextField _inputNumeroA;
    
     @FXML
    private TextField _inputNumeroB;
     
    @FXML
    private TextField _result;

    @FXML
    public void calcular() {
        Double a = null;
        Double b = null;

        if(!_inputNumeroA.getText().equals("")){
            a = new Double(_inputNumeroA.getText());
        }
        if(!_inputNumeroB.getText().equals("")) {
            b = new Double(_inputNumeroB.getText());
        }
        if(a != null && b != null) {
            Double res = 0.0;

            if(operation.compareTo("+") == 0) {
                res = c.add(a, b);
                _result.setText(res.toString());
            } else if(operation.compareTo("-") == 0) {
                res = c.subtract(a, b);
                _result.setText(res.toString());
            } else if(operation.compareTo("*") == 0) {
                res = c.multiply(a, b);
                _result.setText(res.toString());
            } else if(operation.compareTo("/") == 0) {
                try {
                    res = c.divide(a, b);
                    _result.setText(res.toString());
                } catch (InvalidOperation e) {
                    System.out.println(e.getMessage());
                    _result.setText("ERRO");
                }
            }
        }
    }
    
    @FXML
    public void adicao() {
        operation = "+";
    _seletorOperacao.setText("    +    ");
    }

    @FXML
    public void subtracao() {
        operation = "-";
        _seletorOperacao.setText("    -    ");
    }

    @FXML
    public void multiplicacao() {
        operation = "*";
        _seletorOperacao.setText("    *    ");
    }

    @FXML
    public void divisao() {
        operation = "/";
        _seletorOperacao.setText("    /    ");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        c = new Calculadora();
        _inputNumeroA.textProperty().addListener( 
                new ChangeListener<String>() { 
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                        if (!newValue.matches("\\d*")) { 
                            _inputNumeroA.setText(newValue.replaceAll("[^\\d]", "0")); 
                        } 
                    } 
                }
            );
        
        _inputNumeroB.textProperty().addListener( 
            new ChangeListener<String>() { 
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) { 
                        _inputNumeroB.setText(newValue.replaceAll("[^\\d]", "0")); 
                    } 
                } 
            }
        );
    }
}
