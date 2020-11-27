package src;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Profile extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        User user = new User("Stefan Svensson", "Stefansvensson87", "stefansvensson@gmail.com", 1, 502, 0730121232);

        primaryStage.setTitle("Profile page");
        primaryStage.getIcons().add(new Image("file:C:/Users/gusta/IdeaProjects/datastrukturer/.idea/java.png")); //Set application icon

        final String LOGO = "file:C:/Users/gusta/IdeaProjects/datastrukturer/.idea/logo.png";
        final String PROFILE = "file:C:/Users/gusta/IdeaProjects/datastrukturer/.idea/profilepic.png";

        Image logoImg = new Image(LOGO);
        ImagePattern logoIw = new ImagePattern(logoImg);

        Image profileImage = new Image(PROFILE);
        ImagePattern profileIw = new ImagePattern(profileImage);

        Rectangle logoRect = new Rectangle(100,100);
        logoRect.setFill(logoIw);
        logoRect.setX(1280-logoRect.getWidth()*2);
        logoRect.setY(0+logoRect.getHeight()/2);

        Rectangle profileRect = new Rectangle(100,100);
        profileRect.setFill(profileIw);
        profileRect.setX(logoRect.getX()-profileRect.getWidth());
        profileRect.setY(logoRect.getY());

        StackPane leftMenuBox = new StackPane();

        Rectangle fillRect = new Rectangle(300,800);
        fillRect.setFill(Color.rgb(23,97,160));

        Label compName = new Label();
        compName.setText("Appurg");
        Font myFont = new Font(55);
        compName.setFont(myFont);

        TextField searchField = new TextField();
        searchField.setPromptText("Search here!");
        searchField.setOnKeyPressed(event ->
        {
            Label l = new Label();
            leftMenuBox.getChildren().addAll(l);
            try
            {
                String text = searchField.getText();
                if (event.getCode() == KeyCode.ENTER) {
                    if (text.equalsIgnoreCase(user.getName()))
                    {
                        l.setText(text);
                    }
                }
            }
            catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }

        });


        VBox leftMenu = new VBox();
        leftMenu.setPadding(new Insets(50, 50, 50, 50));
        leftMenu.setSpacing(5);
        leftMenu.getChildren().addAll(compName, searchField);
        TreeItem<String> firstTreeItemRoot = new TreeItem<>("1. Felprocedurer");
        TreeItem<String> firstTreeItemChild = new TreeItem<>("1.1 Press ");
        firstTreeItemChild.getChildren().add(new TreeItem<>("1.1.1 Press låter för högt"));
        firstTreeItemChild.getChildren().add(new TreeItem<>("1.1.2 Press pressar inte tillräckligt"));

        TreeItem<String> secondTreeItemChild = new TreeItem<>("1.2 Spolmaskin");
        secondTreeItemChild.getChildren().add(new TreeItem<>("1.2.1 Läckage"));
        secondTreeItemChild.getChildren().add(new TreeItem<>("1.2.2 Elfel"));
        secondTreeItemChild.getChildren().add(new TreeItem<>("1.2.3 Spolblandning"));

        TreeItem<String> thirdTreeItemChild = new TreeItem<>("1.3 Laserskärare");
        thirdTreeItemChild.getChildren().add(new TreeItem<>("1.3.1 Felkalibrerad laser"));
        thirdTreeItemChild.getChildren().add(new TreeItem<>("1.3.2 Svag laser"));

        firstTreeItemRoot.getChildren().addAll(firstTreeItemChild, secondTreeItemChild, thirdTreeItemChild);

        TreeView<String> newTreeView = new TreeView<>(firstTreeItemRoot);
        Label selectedOption = new Label();

        newTreeView.getSelectionModel().selectedItemProperty().addListener(
                (ov, old_val, new_val) -> selectedOption.setText(new_val.getValue()));
        leftMenu.getChildren().addAll(newTreeView, selectedOption);

        logoRect.setOnMouseClicked(event ->  {
            new Landing(primaryStage);
        });

        /*profileRect.setOnMouseClicked(event -> {

        });*/

        VBox userTextFields = new VBox();
        userTextFields.setSpacing(20);

        Label account = new Label();
        account.setText("Konto");
        account.setFont(myFont);

        TextField tfName = new TextField();
        tfName.setText(user.getName());
        tfName.setEditable(false);

        TextField tfUserName = new TextField();
        tfUserName.setText(user.getUserName());
        tfUserName.setEditable(false);

        TextField tfEmail = new TextField();
        tfEmail.setText(user.getEmail());
        tfEmail.setEditable(false);

        TextField tfTitle = new TextField();
        String title = Integer.toString(user.getWorkRole());
        tfTitle.setText(title);
        tfTitle.setEditable(false);

        TextField tfWorkID = new TextField();
        String workID = Integer.toString(user.getWorkID());
        tfWorkID.setText(workID);
        tfWorkID.setEditable(false);

        TextField tfTelephone = new TextField();
        String telephone = Integer.toString(user.getTelephone());
        tfTelephone.setText(telephone);
        tfTelephone.setEditable(false);

        VBox tfLabels = new VBox();
        tfLabels.setSpacing(30);

        Label lName = new Label();
        lName.setText("Namn: ");

        Label lUserName = new Label();
        lUserName.setText("Användarnamn: ");

        Label lEmail = new Label();
        lEmail.setText("Email: ");

        Label lTitle = new Label();
        lTitle.setText("Arbetsposition: ");

        Label lWorkID = new Label();
        lWorkID.setText("Arbets-ID: ");

        Label lTelephone = new Label();
        lTelephone.setText("Telefonnummer: ");

        tfLabels.getChildren().addAll(lName, lUserName, lEmail, lTitle, lWorkID, lTelephone);

        userTextFields.getChildren().addAll(tfName, tfUserName, tfEmail, tfTitle, tfWorkID, tfTelephone);
        userTextFields.setPrefSize(200,50);

        HBox menuAndInfo = new HBox();
        HBox textFieldsAndLabels = new HBox();
        VBox accountLabel = new VBox();
        textFieldsAndLabels.getChildren().addAll(tfLabels,userTextFields);
        accountLabel.getChildren().addAll(account, textFieldsAndLabels);

        leftMenuBox.getChildren().addAll(fillRect, leftMenu);
        menuAndInfo.getChildren().addAll(leftMenuBox, accountLabel);

        Group root = new Group();
        root.getChildren().addAll(menuAndInfo, profileRect, logoRect);

        Scene scene = new Scene(root, 1280,800);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
