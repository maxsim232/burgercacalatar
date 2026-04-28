package com.example.burgercalc;



import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.stage.Stage;



public class BurgerApp extends Application {



    @Override

    public void start(Stage stage) throws Exception {



        FXMLLoader loader = new FXMLLoader(

                BurgerApp.class.getResource("burger-view.fxml")

        );



        Scene scene = new Scene(loader.load(), 320, 400);



        scene.getStylesheets().add(

               BurgerApp.class.getResource("style.css").toExternalForm()

        );



        stage.setTitle("Burger Calculator");

        stage.setMinWidth(280);

        stage.setMinHeight(400);



        stage.setScene(scene);

        stage.show();

    }



    public static void main(String[] args) {

        launch();

    }

}