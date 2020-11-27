package src;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Landing extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public Landing(Stage st)
    {
        start(st);
    }

    private ArrayList<HelpLanding> val(){
        ArrayList<HelpLanding> listOfVal = new ArrayList<>();

        HelpLanding fel = new HelpLanding();
        HelpLanding arb = new HelpLanding();


        fel.setNamn("1. Felprocedurer");
        fel.setBeskrivning("Här hittar du felprocedurer");

        arb.setNamn("2. Arbetsprocedurer");
        arb.setBeskrivning("Här inne hittar du arbetsprocedurer");



        listOfVal.add(fel);
        listOfVal.add(arb);


        return listOfVal;
    }

    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("Landing page");

        ListView<String> choice = new ListView<>();
        choice.setPrefWidth(150);

        BorderPane root = new BorderPane();



        root.setPadding(new Insets(10));
        root.setMargin(choice, new Insets(10));
        root.setLeft(choice);


        root.setTop(label);


        for (HelpLanding ettVal : val()) {

            choice.getItems().add(ettVal.getNamn());

        }

        choice.getSelectionModel().selectedIndexProperty().addListener(o ->{

            int index = choice.getSelectionModel().getSelectedIndex();


            Text beskrivning = new Text(val().get(index).getBeskrivning());
            Text namn = new Text(val().get(index).getNamn() + "\n");
            TextFlow tFlow = new TextFlow(namn, beskrivning);
            tFlow.setPadding(new Insets(5));
            tFlow.setScaleShape(true);
            ScrollPane scroll = new ScrollPane(tFlow);
            scroll.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
            scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            scroll.setFitToHeight(true);
            scroll.setFitToWidth(true);
            root.setCenter(scroll);
        });




        ImageView pic = new ImageView(new Image("file:C:/Users/gusta/IdeaProjects/datastrukturer/.idea/logo.png"));
        root.getChildren().addAll(pic);
        pic.setX(200);
        pic.setFitWidth(400);
        pic.setFitHeight(400);


        Scene scene = new Scene(root, 1280, 900);
        primaryStage.setTitle("Appurg");
        primaryStage.setScene(scene);
        primaryStage.show();
    }}