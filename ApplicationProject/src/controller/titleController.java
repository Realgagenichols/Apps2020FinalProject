/**
 * 
 */
package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Region;

/**
 * @author oep957
 *
 */
public class titleController 
{
	

	Image image = new Image("/images/deck.jpg");
	BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
	BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
	Background background = new Background(backgroundImage);
	
	@FXML
	private void handle(ActionEvent event)
    {
		Main.url=Main.class.getResource("/fxml/SlapJackScreen.fxml");
		Main.loader.setLocation(Main.url);	
        try {
			Main.scene.setRoot(FXMLLoader.load(getClass().getResource("/fxml/SlapJackScreen.fxml")));
		    Main.scene.getStylesheets().add(getClass().getResource("/css/BeggarMyNeighbor.css").toExternalForm());

			Main.root=(AnchorPane)Main.loader.load();

			Main.stage.setScene(Main.scene);
			Main.stage.setTitle("Slap Jack"); //Changing the title of the primaryStage to better fit the purpose of the application
			Main.stage.show();
		
			System.out.println("Slap Jack");
		}
        catch (IOException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Connecting to the FXML
		 
    }
	
	@FXML
	private void handleWar(ActionEvent event)
    {
		
		Main.url=Main.class.getResource("/fxml/warScreen.fxml");
		Main.loader.setLocation(Main.url);	
        try {
			Main.scene.setRoot(FXMLLoader.load(getClass().getResource("/fxml/warScreen.fxml")));
		    Main.scene.getStylesheets().add(getClass().getResource("/css/BeggarMyNeighbor.css").toExternalForm());

			Main.root=(AnchorPane)Main.loader.load();

			Main.stage.setScene(Main.scene);
			Main.stage.setTitle("War"); //Changing the title of the primaryStage to better fit the purpose of the application
			Main.stage.show();
		
			System.out.println("war");
		}
        catch (IOException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Connecting to the FXML
		 
		 
    }
	
	
	@FXML
	private void handlePlayBMN(ActionEvent event) throws IOException
    {
		Main.url=Main.class.getResource("/fxml/BeggarMyNeighbor.fxml");
		Main.loader.setLocation(Main.url);	

        try {
        	
  			Main.scene.setRoot(FXMLLoader.load(getClass().getResource("/fxml/BeggarMyNeighbor.fxml")));
		    Main.scene.getStylesheets().add(getClass().getResource("/css/BeggarMyNeighbor.css").toExternalForm());
			Main.stage.setScene(Main.scene);
			Main.stage.setTitle("BeggarMyNeighbor"); //Changing the title of the primaryStage to better fit the purpose of the application
			Main.stage.setHeight(800);
			Main.stage.setWidth(800);
			Main.stage.setResizable(false);
			Main.stage.show();
			
		}
        catch (IOException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Connecting to the FXML
		  
    }
	
	@FXML
	private void handlePoker(ActionEvent event) throws IOException
    {
		Main.url=Main.class.getResource("/fxml/Poker.fxml");
		Main.loader.setLocation(Main.url);	
        try {

        	
        
			Main.scene.setRoot(FXMLLoader.load(getClass().getResource("/fxml/Poker.fxml")));
		    Main.scene.getStylesheets().add(getClass().getResource("/css/Poker.css").toExternalForm());
			Main.stage.setScene(Main.scene);
			Main.stage.setTitle("Poker"); //Changing the title of the primaryStage to better fit the purpose of the application
			Main.stage.setHeight(800);
			Main.stage.setWidth(800);
			Main.stage.setResizable(false);
			Main.stage.show();
			
		}
        catch (IOException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Connecting to the FXML
		  
    }
	
	
}
