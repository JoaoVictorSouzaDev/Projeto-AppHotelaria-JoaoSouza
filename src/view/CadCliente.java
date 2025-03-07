package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CadCliente extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Image iconBtnCadastrar = new Image(getClass().getResourceAsStream("/view/img/mais.png"));
        Image iconBtnAtualizar = new Image(getClass().getResourceAsStream("/view/img/Atualizar.png"));
        Image iconBtnExcluir = new Image(getClass().getResourceAsStream("/view/img/lixo.png"));

        ImageView iconCadastrar = new ImageView(iconBtnCadastrar);
        iconCadastrar.setFitWidth(40);
        iconCadastrar.setFitHeight(40);
        iconCadastrar.setOpacity(0.5);

        ImageView iconAtualizar = new ImageView(iconBtnAtualizar);
        iconAtualizar.setFitWidth(40);
        iconAtualizar.setFitHeight(40);
        iconAtualizar.setOpacity(0.5);

        ImageView iconExcluir = new ImageView(iconBtnExcluir);
        iconExcluir.setFitWidth(40);
        iconExcluir.setFitHeight(40);
        iconExcluir.setOpacity(0.5);

        Label lblNome = new Label("Nome");
        TextField txtNome = new TextField();
        txtNome.setMaxWidth(200);

        Label lblCpf = new Label("CPF");
        TextField txtCpf = new TextField();
        txtCpf.setMaxWidth(200);

        Label lblTelefone = new Label("Telefone");
        TextField txtTelefone = new TextField();
        txtTelefone.setMaxWidth(200);

        Label lblEmail = new Label("Email");
        TextField txtEmail = new TextField();
        txtEmail.setMaxWidth(200);

        Button btnCadastrar = new Button("Cadastrar", iconCadastrar);
        Button btnAtualizar = new Button("Atualizar",iconAtualizar);
        Button btnExcluir = new Button("Excluir",iconExcluir);

        VBox layout = new VBox(10, lblNome, txtNome, lblCpf, txtCpf, lblTelefone, txtTelefone, lblEmail, txtEmail,btnCadastrar, btnAtualizar, btnExcluir);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 400,500);
        stage.setTitle("Cadastro de Cliente");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}