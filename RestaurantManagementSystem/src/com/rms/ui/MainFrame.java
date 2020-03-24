/**
 * 
 */
package com.rms.ui;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @author PRIYATAM SINGH
 *
 */
public class MainFrame extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Restaurant");
		Label label = new Label("Restaurant Management System");
		Label label1 = new Label("@ Copyright 2020-2021");
		label.setFont(new Font("Arial", 64));
		label.setAlignment(Pos.BASELINE_CENTER);
		Label text1 = new Label("Chicken "); 
		Label text2 = new Label("Chicken Burer");  
		Label text3 = new Label("Samosa");
		Label text4 = new Label("Omelette");
		Label mealsLabel = new Label("Meals");
		mealsLabel.setTranslateX(80);
		mealsLabel.setTranslateY(20);
		mealsLabel.setFont(new Font("Arial", 40));
		mealsLabel.setVisible(true); 
		TextField textField1 = new TextField();
			// textField1.set
		TextField textField2 = new TextField();
		TextField textField3 = new TextField();   
		TextField textField4 = new TextField();   
		 
		GridPane grid = new GridPane();
		/*TextField[][] textField = new TextField[4]4[] ;
		Label[][] l = new Label[4][4];
		
		
		for(int x =0; x < 2; x++){
		    for(int y= 0; y <2 ; y++){
		    	Label lbl = new Label("Chicken ");
		        TextField t = new TextField("0");
		        GridPane.setConstraints(t, y, x);
		        grid.getChildren().add(t);
		        textField[x][y]=t ;
		    }
		}*/
		
		grid.setMinSize(400, 200);
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(10); 
		grid.setHgap(10);
		grid.add(mealsLabel,0,0);
		grid.add(text1, 0, 2);  
		grid.add(textField1,1,2); 
		grid.add(text2, 0, 3);       
		grid.add(textField2, 1, 3);
		grid.add(text3, 0, 4); 
		grid.add(textField3, 1, 4); 
		grid.add(text4, 0, 5);       
		grid.add(textField4, 1, 5);
		BorderPane bp = new BorderPane();
		Group group = new Group();
		group.getChildren().addAll(bp,grid);
		bp.setTop(label);
		bp.setBottom(label1);
		Scene scene = new Scene(group,1000,800);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

}
