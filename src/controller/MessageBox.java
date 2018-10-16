package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MessageBox {
    private static Stage stage;
    private static int currentTime;

    private static void setup(String message, String title) {
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(250);

        Label lbl = new Label();
        lbl.setText(message);

        Button btnOK = new Button();
        btnOK.setText("OK");
        btnOK.setOnAction(e -> stage.close());

        VBox pane = new VBox(20);
        pane.getChildren().addAll(lbl, btnOK);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
    }

    public static void show(String message, String title) {
        setup(message, title);
        stage.show();
    }

    public static void showAndWait(String message, String title) {
        setup(message, title);
        stage.showAndWait();
    }

    public static void showForSeconds(String message, String title, int seconds) {
        show(message, title);
        currentTime = seconds;
        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);
        KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                currentTime--;
                if (currentTime <= 0) {
                    time.stop();
                    stage.close();
                }
            }
        });
        time.getKeyFrames().add(frame);
        time.playFromStart();
    }
}
