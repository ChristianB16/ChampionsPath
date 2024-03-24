package scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class dashboardController {

    private sceneConnector mainApp;
    @FXML
    private Text breakfastCal;
    @FXML
    private Text lunchCal;
    @FXML
    private Text dinnerCal;
    @FXML
    private Label calConsumed;
    @FXML
    private Label calBudget;
    @FXML
    private Button logMeal;
    @FXML
    private Text username;
    @FXML
    private Text weight;


    
    public sceneConnector getMainApp() {
        return mainApp;
    }

    public void setMainApp(sceneConnector mainApp) {
        this.mainApp = mainApp;
    }
}
