import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.skin.LabelSkin;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Scene scene1,scene2;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;

        Label label1 = new Label("welcome to screen 1");
        Button button1 = new Button("click to scene 2");
        button1.setOnAction(event -> window.setScene(scene2));

        //layouts
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(layout1,button1);
        scene1 = new Scene(label1,200,200);


    }


}
