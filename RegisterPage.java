
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.image.ImagingOpException;

public class RegisterPage extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Registration page");
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10));


        //Label för att skriva in användarnamn
        Label username = new Label("Namn");
        layout.add(username,0,1);

        //Textfield för att skriva in användarnamn
        TextField usernamefield = new TextField();
        usernamefield.setPromptText("Namn");
        layout.add(usernamefield,1,1);

        //Label för att skriva in lösenord
        Label lblpassword = new Label("Lösenord");
        layout.add(lblpassword,0,2);

        //Textfield för att mata in lösenord
        PasswordField txtPassword = new PasswordField();
        txtPassword.setPromptText("Lösenord");
        layout.add(txtPassword,1,2);

        //Label för att skriva in E-mail
        Label lblEmail = new Label("E-mail");
        layout.add(lblEmail,0,3);

        TextField txtEmail = new TextField();
        txtEmail.setPromptText("E-mail");
        layout.add(txtEmail,1,3);

        //Label för arbetsID
        Label lblArbetsID = new Label("ArbetsID");
        layout.add(lblArbetsID,0,4);

        //Texfield för att skriva in arbetsID
        TextField txtArbetsID = new TextField();
        txtArbetsID.setPromptText("ArbetsID");
        layout.add(txtArbetsID,1,4);


        //Label för position
        Label lblPos = new Label("Position");
        layout.add(lblPos, 0, 5);



        //Skapar en choicebox
        ChoiceBox<String> choicePos = new ChoiceBox<>();
        choicePos.getItems().add("Chef");
        choicePos.getItems().add("Arbetare");
        choicePos.getItems().add("Konsult");

        //Lägger till choiceboxen i layouten
        layout.add(choicePos,1,5);

        //Skapar en imageview och lägger in bilden i programmet
        Image logoTyp = new Image("file:C:\\Users\\Daniel\\Desktop\\Memes/Appurg.png");
        ImageView visaLogo = new ImageView(logoTyp);
        visaLogo.setImage(logoTyp);
        layout.getChildren().add(visaLogo);



        //Skapar en knapp för att registrera
        Button registerBtn = new Button("Registrera");
        layout.add(registerBtn, 1, 7);
        registerBtn.setStyle("-fx-background-color: #6495ED");

        //Skapar en knapp för att gå tillbaka till login sidan
        Button goBack = new Button("Gå tillbaka");
        layout.add(goBack,0, 7 );
        goBack.setStyle("-fx-background-color: #6495ED");



        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
