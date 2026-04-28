package com.example.burgercalc;



import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;



public class BurgerController {



    @FXML

    private TextField weightField1;



    @FXML

    private TextField priceField1;



    @FXML

    private TextField weightField2;



    @FXML

    private TextField priceField2;



    @FXML

    private Label resultLabel;



    public void calculate(ActionEvent event) {

        try {

            double weight1 = Double.parseDouble(weightField1.getText());

            double price1 = Double.parseDouble(priceField1.getText());



            double weight2 = Double.parseDouble(weightField2.getText());

            double price2 = Double.parseDouble(priceField2.getText());



            double value1 = calculateValue(weight1, price1);

            double value2 = calculateValue(weight2, price2);if (value1 > value2) {

                resultLabel.setText("Перший бургер вигідніший");

            } else if (value2 > value1) {

                resultLabel.setText("Другий бургер вигідніший");

            } else {

                resultLabel.setText("Однакова вигідність");

            }



        } catch (NumberFormatException e) {

            resultLabel.setText("Введи тільки числа!");

        }

    }



    private double calculateValue(double weight, double price) {

        return weight / price;

    }

}