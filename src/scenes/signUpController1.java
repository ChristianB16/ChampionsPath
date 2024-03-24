package scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.io.IOException;

public class signUpController1 {

    private sceneConnector mainApp;

    @FXML
    private TextField currentWeight;
    @FXML
    private TextField goalWeight;
    @FXML
    private RadioButton halfPound;
    @FXML
    private RadioButton onePound;
    @FXML
    private RadioButton poundHalf;
    @FXML
    private RadioButton twoPound;
    @FXML
    private Button nextButton;
    @FXML
    private Button backButton;
    
    public sceneConnector getMainApp() {
        return mainApp;
    }

    @FXML
    private void nextButtonHandler(ActionEvent event) {
        System.out.println("next button pressed");
        try {
            // pass info to signUpScene2
            mainApp.showSignUpScene2(
                    Double.parseDouble(currentWeight.getText()),
                    Double.parseDouble(goalWeight.getText()),
                    getSelectedPace()
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void backButtonHandler(ActionEvent event) {
        System.out.println("back button pressed");
        try {
            mainApp.homeScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double getSelectedPace() {
        if (halfPound.isSelected()) {
            return 0.5;
        } else if (onePound.isSelected()) {
            return 1.0;
        } else if (poundHalf.isSelected()) {
            return 1.5;
        } else if (twoPound.isSelected()) {
            return 2.0;
        }
        return 0.0;
    }

    public void setMainApp(sceneConnector mainApp) {
        this.mainApp = mainApp;
    }
}
