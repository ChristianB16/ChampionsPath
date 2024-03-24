package scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class homeScreenControl {

	 private sceneConnector mainApp; 

     @FXML
     private Button logInButton;

     @FXML
     private Button signUpButton;

     public void setMainApp(sceneConnector mainApp) {
         this.mainApp = mainApp;
     }
     
     
    @FXML
    private void loginHandler(ActionEvent event) {
    	System.out.println("logIn button pressed");
        try {
            mainApp.showLogInScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void signUpHandler(ActionEvent event) {
        System.out.println("signup button pressed");
        try {
            mainApp.showSignUpScene1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 	public sceneConnector getMainApp() {
		return mainApp;
		
	}
 	
 	
 
}

