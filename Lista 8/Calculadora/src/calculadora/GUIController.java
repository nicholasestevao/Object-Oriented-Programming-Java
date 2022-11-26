/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 *
 * @author isaac
 */
public class GUIController implements Initializable {
    
    @FXML
    private Button _calculate;
    
    @FXML
    private  MenuButton __seletorOperacao;
    
    
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
