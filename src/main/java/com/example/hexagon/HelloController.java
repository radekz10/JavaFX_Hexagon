package com.example.hexagon;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class HelloController {

    @FXML
    public TextField firstInput;

    public TextField secondInput;

    public TextField thirdInput;

    public AnchorPane anchorPane;

    public RadioButton firstRadioButton;

    public RadioButton secondRadioButton;

    public double sx, sy, r;

    public double x1, x2, x3, x4, x5, x6, x7, x8;

    public double y1, y2, y3, y4, y5, y6, y7, y8;

    public double v;


    public void display(){

        if (firstRadioButton.isSelected()){
            polHexagon();
        }
        if(secondRadioButton.isSelected()) {
            polOctagon();
        }

    }

    public void polHexagon() {

        Polygon hexagon = new Polygon();

        sx = Double.parseDouble(firstInput.getText());
        sy = Double.parseDouble(secondInput.getText());
        r = Double.parseDouble(thirdInput.getText());

        calculateHeight();

        calculatePointsHexagon();

        hexagon.setFill(Color.CYAN);

        hexagon.setStroke(Color.PURPLE);

        hexagon.getPoints().addAll(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6);

        anchorPane.getChildren().addAll(hexagon);

    }

    public void polOctagon() {

        Polygon octagon = new Polygon();

        sx = Double.parseDouble(firstInput.getText());
        sy = Double.parseDouble(secondInput.getText());
        r = Double.parseDouble(thirdInput.getText());

        calculateHeight();

        calculatePointsOctagon();

        octagon.setFill(Color.PURPLE);

        octagon.setStroke(Color.CYAN);

        octagon.getPoints().addAll(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7, x8, y8);

        anchorPane.getChildren().addAll(octagon);

    }

    public void calculatePointsHexagon() {

        x1 = sx - (r / 2);
        y1 = sy - v;

        x2 = sx + (r / 2);
        y2 = sy - v;

        x3 = sx + r;
        y3 = sy;

        x4 = sx + (r / 2);
        y4 = sy + v;

        x5 = sx - (r / 2);
        y5 = sy + v;

        x6 = sx - r;
        y6 = sy;

    }

    public void calculatePointsOctagon() {

        x1 = sx - (r / 2);
        y1 = sy - v;

        x2 = sx + (r / 2);
        y2 = sy - v;

        x3 = sx + r;
        y3 = sy - (v / 2);

        x4 = sx + r ;
        y4 = sy + (v / 2);

        x5 = sx + (r / 2);
        y5 = sy + v;

        x6 = sx - (r / 2);
        y6 = sy + v;

        x7 = sx - r ;
        y7 = sy + (v / 2);

        x8 = sx - r ;
        y8 = sy - (v / 2);

    }

    public void calculateHeight() {

        v = Math.sqrt((r * r) - ((r / 2) * (r / 2)));

    }

}