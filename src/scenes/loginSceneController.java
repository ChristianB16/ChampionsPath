package scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import data.NutritionData; // Assuming NutritionData is in the data package

public class loginSceneController {

    private sceneConnector mainApp;
    private NutritionData nutritionData; // Declare NutritionData variable

    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private Button signInButton;
    @FXML
    private Button backButton;

    public sceneConnector getMainApp() {
        return mainApp;
    }

    public void initialize() {
        // Initialize NutritionData
        nutritionData = new NutritionData();
    }

    @FXML
    private void signInButtonHandler(ActionEvent event) throws IOException {
        String userEmail = email.getText();
        String userPassword = password.getText();

        // Check user credentials using NutritionData class
        if (nutritionData.loginUser(userEmail, userPassword)) {
            System.out.println("User logged in successfully");
            // Navigate to dashboard or next scene
            mainApp.showDashBoard();
        } else {
            System.out.println("Invalid email or password");
            // Display error message or handle invalid credentials
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

    public void setMainApp(sceneConnector mainApp) {
        this.mainApp = mainApp;
    }
}
