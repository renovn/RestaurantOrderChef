package sample;

import controller.Controller;
import database.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("chef.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Chef");
        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/chef.css");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(e -> {
            try {
                Database.instance().close();
                Controller controller = (Controller)loader.getController();
                controller.stopClient();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
