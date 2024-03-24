package scenes;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class signUpController3 {
	private sceneConnector mainApp;
	@FXML
	private TextField name;
	@FXML
	private TextField email;
	@FXML
	private TextField password;
	@FXML
	private Button backButton;
	@FXML
	private Button submit;

	public sceneConnector getMainapp() {
		return mainApp;
	}
	
    @FXML
    private void backButtonHandler(ActionEvent event) {
    	System.out.println("back button pressed");
    	try {
    		mainApp.showSignUpScene2(0, 0, 0);
    	} catch (IOException e){
    		e.printStackTrace();
    	}
    }

	
	public void setMainApp(sceneConnector mainApp) {
		this.mainApp = mainApp;
	}

}
