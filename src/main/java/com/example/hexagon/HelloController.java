package com.example.hexagon;

import javafx.fxml.FXML;
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

    public double sx, sy, r;

    public double x1, x2, x3, x4, x5, x6;

    public double y1, y2, y3, y4, y5, y6;

    public double v;

    @FXML
    public void pol() {

        Polygon hexagon = new Polygon();

        sx = Double.parseDouble(firstInput.getText());
        sy = Double.parseDouble(secondInput.getText());
        r = Double.parseDouble(thirdInput.getText());

        calculateHeight();

        calculatePoints();

        hexagon.setFill(Color.CYAN);

        hexagon.setStroke(Color.PURPLE);

        hexagon.getPoints().addAll(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6);

        anchorPane.getChildren().addAll(hexagon);

    }

    public void calculatePoints() {

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

    public void calculateHeight() {

        v = Math.sqrt((r * r) - ((r / 2) * (r / 2)));

    }

}