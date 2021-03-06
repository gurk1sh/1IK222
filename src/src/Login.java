package src;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Inloggning till Appurg");
        GridPane pane = new GridPane();

        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(30.5, 30.5, 13.5, 14.4));
        pane.setHgap(5.5);
        pane.setVgap(3.5);
        pane.add(new Label("Användarnamn:"), 0, 8);
        final TextField username = new TextField();
        pane.add(username, 1, 8);
        pane.add(new Label("Lösenord:"), 0, 11);
        final PasswordField password = new PasswordField();
        pane.add(password, 1, 11);
        final Label result = new Label();
        pane.add(result, 0, 2);
        Button register = new Button("Registrera användare");
        Button testLogin = new Button("Logga in");
        testLogin.setStyle("-fx-background-color: lightblue");
        pane.add(testLogin, 0, 20);
        pane.add(register, 1,20);
        register.setStyle("-fx-background-color: lightblue");
        GridPane.setHalignment(testLogin, HPos.RIGHT);
        testLogin.setOnAction(e -> {
            if(username.getText().equals("username") && password.getText().equals("password"))
                result.setText("Inloggad");
            else
                result.setText("Det blev fel, försök igen");
        });


        ImageView pic = new ImageView(new Image("file:images/appurg.png"));
        pane.getChildren().addAll(pic);


        Scene scene = new Scene(pane,1280, 900);
        primaryStage.setScene(scene);
        primaryStage.show();




    }
}
