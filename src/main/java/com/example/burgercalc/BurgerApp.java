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



        Scene scene = new Scene(loader.load(), 380, 550);



        scene.getStylesheets().add(

                BurgerApp.class.getResource("style.css").toExternalForm()

        );



        stage.setTitle("Burger Calculator");



        stage.setWidth(400);

        stage.setHeight(600);



        stage.setMinWidth(380);

        stage.setMinHeight(550);



        stage.setScene(scene);

        stage.show();

    }



    public static void main(String[] args) {

        launch();

    }

}