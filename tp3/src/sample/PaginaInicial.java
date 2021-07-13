package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PaginaInicial  {

    @FXML
    private Button buttonlogin;

    @FXML
    private Button buttoncadastro;
    @FXML
    private Button butonmodalidade;
    @FXML
    private Button buttoncalendario;

    @FXML
    void loginloader() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loguin.fxml"));
        Parent root = loader.load();
        Stage window = (Stage) buttonlogin.getScene().getWindow();
        window.setScene(new Scene(root));


    }
    @FXML
    void cadastroloader() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cadastro.fxml"));
        Parent root = loader.load();
        Stage window = (Stage) buttoncadastro.getScene().getWindow();
        window.setScene(new Scene(root));


    }
    @FXML
    void modalidadeloader() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("modalidades.fxml"));
        Parent root = loader.load();
        Stage window = (Stage) butonmodalidade.getScene().getWindow();
        window.setScene(new Scene(root));


    }
    @FXML
    void calendarioloader() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("calendario.fxml"));
        Parent root = loader.load();
        Stage window = (Stage) buttoncalendario.getScene().getWindow();
        window.setScene(new Scene(root));


    }
}

