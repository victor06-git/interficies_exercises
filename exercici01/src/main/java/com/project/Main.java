package com.project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    static String nom = "";
    static String edat = "";

    final int WINDOW_WIDTH = 650;
    final int WINDOW_HEIGHT = 500;

    @Override
    public void start(Stage stage) throws Exception {
        // Carrega la vista inicial des del fitxer FXML
        UtilsViews.parentContainer.setStyle("-fx-font: 14 arial;");
        UtilsViews.addView(getClass(), "View1", "/assets/view1.fxml");
        UtilsViews.addView(getClass(), "View2", "/assets/view2.fxml");

        Scene scene = new Scene(UtilsViews.parentContainer);

        stage.setScene(scene);
        stage.setTitle("Exercici 1");
        stage.setWidth(WINDOW_WIDTH);
        stage.setHeight(WINDOW_HEIGHT);
        stage.show();

        // Afegeix una icona només si no és un Mac
        if (!System.getProperty("os.name").contains("Mac")) {
            Image icon = new Image("file:icons/icon.png");
            stage.getIcons().add(icon);
        }
    }
    public static void main( String[] args )
    {
        launch(args);
    }
}
