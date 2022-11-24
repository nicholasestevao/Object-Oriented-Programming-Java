/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expilhainterfacegrafica;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ObservableValueBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author 12689616
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private Button bPush;
    
    @FXML
    private Button bPop;
    
    @FXML
    private TextField tfItem;
    
    @FXML
    private ListView lvPilha;
    
    private Pilha pilha;
    
    public void exibirMensagem(Alert.AlertType tipo, String titulo, String conteudo){
        Alert mensagem = new Alert(tipo);
        mensagem.setTitle(titulo);
        mensagem.setHeaderText(conteudo);
        mensagem.showAndWait();
    }
    
    
    @FXML
    private void clicouPop(ActionEvent event) {
        System.out.println("clicou pop");
        if(!tfItem.getText().equals("")){
            exibirMensagem(Alert.AlertType.ERROR, "Erro na inserção", "A caixa de item deve estar vazia");
        }else{
            try{
                tfItem.setText(pilha.pop());
                lvPilha.getItems().remove(0);
                exibirMensagem(Alert.AlertType.INFORMATION, "Sucesso na remocao", "Elemento removido corretamente");
            }catch(PilhaVazia e){
                exibirMensagem(Alert.AlertType.ERROR, "Erro na remocao", e.getMessage());
            }
        }
    }
    
    @FXML
    private void clicouPush(ActionEvent event) {
        System.out.println("clicou push");
        if(tfItem.getText().equals("")){
            System.out.println("Nada a inserir");
            exibirMensagem(Alert.AlertType.ERROR, "Erro na inserção", "Item vazio");
        }else{
            try{
                pilha.push(tfItem.getText());
                lvPilha.getItems().add(0,tfItem.getText());
                tfItem.setText("");
                exibirMensagem(Alert.AlertType.INFORMATION, "Sucesso na insercao", "Elemento inserido corretamente");
            }catch(PilhaCheia e){
                exibirMensagem(Alert.AlertType.ERROR, "Erro na inserção", e.getMessage());
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pilha = new Pilha(3);
        
        tfItem.textProperty().addListener( 
            new ChangeListener<String>() {     
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) { 
                        tfItem.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                }
             } 
       );
    }    
    
}
