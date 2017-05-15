package Elso_gui;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FlowPane rootPane = new FlowPane();
			rootPane.setHgap(10.0);
			rootPane.setVgap(10.0);
			
			Button newReciepeBtn = new Button("Uj recept");
			TextField nameTF = new TextField();
			TextField ingradiantsTF = new TextField();
			
			nameTF.setPromptText("recept neve");
			ingradiantsTF.setPromptText("hozzavalok");
			
			nameTF.setVisible(false);
			ingradiantsTF.setVisible(false);
			
			newReciepeBtn.setOnAction(new EventHandler<ActionEvent>() {
			
				@Override
				public void handle(ActionEvent event) {
					nameTF.setVisible(!nameTF.isVisible());
					ingradiantsTF.setVisible(!ingradiantsTF.isVisible());
				}
				
			});
			
			
			rootPane.getChildren().addAll(newReciepeBtn, nameTF, ingradiantsTF);
			Scene scene = new Scene(rootPane, 400.0, 400.0);
			primaryStage.setScene(scene);
			primaryStage.show();
		

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
