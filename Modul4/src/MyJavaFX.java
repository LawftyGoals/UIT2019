import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

    @Override
    public void start(Stage primaryStage){

        Image image = new Image("/Shaggy.jpg");
        ImageView imageView = new ImageView(image);

        Pane paneI = new Pane();
        paneI.getChildren().add(imageView);

        Scene sceneI = new Scene(paneI, 200, 200);

        Stage stageI = new Stage();
        stageI.setTitle("ImageView");
        stageI.setScene(sceneI);
        stageI.show();


        StackPane pane = new StackPane();
        Button btOK = new Button("OK");

        btOK.setStyle("-fx-border-color: blue;");
        pane.getChildren().add(btOK);

        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New stage"), 100, 100));
        stage.setResizable(false);
        stage.show();



        Pane paneC = new Pane();

        Circle circle = new Circle();
        circle.centerXProperty().bind(paneC.widthProperty().divide(2));
        circle.centerYProperty().bind(paneC.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        paneC.getChildren().add(circle);

        Scene sceneC = new Scene(paneC, 200, 200);
        Stage stageC = new Stage();
        stageC.setTitle("Circle");
        stageC.setScene(sceneC);
        stageC.show();




    }

    public static void main(String[] args){
        Application.launch(args);
    }


}
