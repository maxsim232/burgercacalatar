package com.example.burgercalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PizzaApp extends Application {



    @Override

    public void start(Stage stage) throws Exception {



        FXMLLoader loader = new FXMLLoader(

                PizzaApp.class.getResource("burger-view.fxml")

        );



        Scene scene = new Scene(loader.load(), 320, 320);





        scene.getStylesheets().add(

                PizzaApp.class.getResource("style.css").toExternalForm()

        );



        stage.setTitle("Burger Calculator");

        stage.setMinWidth(280);

        stage.setMinHeight(320);



        stage.setScene(scene);

        stage.show();

    }



    public static void main(String[] args) {

        launch();

    }

}