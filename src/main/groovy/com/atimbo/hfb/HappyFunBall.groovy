package com.atimbo.hfb

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.scene.shape.Circle
import javafx.scene.shape.CircleBuilder
import javafx.stage.Stage

class HappyFunBall extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle('Happy Fun Ball')
        Pane root = new Pane()

        Circle circle = CircleBuilder.create()
            .radius(20)
            .centerX(20)
            .centerY(20)
            .build()

        root.getChildren().add(circle)

        primaryStage.setScene(new Scene(root, 400, 400))
        primaryStage.show()
    }

    public static void main(String[] args) {
        launch(HappyFunBall, args)
    }
}
