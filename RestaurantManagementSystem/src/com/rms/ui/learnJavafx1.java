/**
 * 
 */
package com.rms.ui;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author PRIYATAM SINGH
 *
 */
public class learnJavafx1 extends Application  {
	
	//to start javafx application need to call method called launch
	public static void main(String[] args) {
		launch(args);//this launch will calls javafx application constrctur  
		

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button("Click me");
		Button etn = new Button("Exit");
		etn.setOnAction(e -> System.exit(0));
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("hello ravi");		
			}
		});
		VBox st = new VBox();
		st.getChildren().addAll(btn,etn);
		Scene sc = new Scene(st,500,300);
		primaryStage.setScene(sc);
		
		
		
		primaryStage.show();
		
	}

}
