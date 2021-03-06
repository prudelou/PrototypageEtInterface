/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawler;

import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Crawler extends Application {
    public static Stage stage;
    public static String lang;
    @Override
    public void start(Stage stage) throws Exception {
        Crawler.stage = stage;
        Crawler.lang = "fr";
        ResourceBundle bundle = ResourceBundle.getBundle("resources/UIResources", new Locale("fr"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("maquette.fxml"), bundle);
        Parent root = loader.load();  
        Scene scene = new Scene(root);
        stage.setTitle("Crawler");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}