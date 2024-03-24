package scenes;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class signUpController2 {
    private sceneConnector mainApp;
    
    // store the data passed from signUpScene1
    private double currentWeight;
    private double goalWeight;
    private double pace;

    @FXML
    private RadioButton male;
    @FXML
    private RadioButton female;
    @FXML
    private ChoiceBox<String> month;
    @FXML
    private ChoiceBox<Integer> day;
    @FXML
    private ChoiceBox<Integer> year;
    @FXML
    private ChoiceBox<String> height;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private Button next;
    @FXML
    private Button backButton;

    public sceneConnector getMainapp() {
        return mainApp;
    }

    // setters to hold passed info from signUpScene1
    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setGoalWeight(double goalWeight) {
        this.goalWeight = goalWeight;
    }

    public void setPace(double pace) {
        this.pace = pace;
    }

    @FXML
    //method to populate boxes with options
    private void initialize() {
        ObservableList<String> months = FXCollections.observableArrayList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        month.setItems(months);
        if (month.getValue() == null) {
            month.setValue(null); 
        }

        ObservableList<Integer> days = FXCollections.observableArrayList();
        for (int i = 1; i <= 31; i++) {
            days.add(i);
        }
        day.setItems(days);
        if (day.getValue() == null) {
            day.setValue(null);
        }

        ObservableList<Integer> years = FXCollections.observableArrayList();
        for (int i = 1950; i <= 2022; i++) {
            years.add(i);
        }
        year.setItems(years);
        if (year.getValue() == null) {
            year.setValue(null); // 
        }

        ObservableList<String> heights = FXCollections.observableArrayList();
        for (int feet = 4; feet <= 8; feet++) {
            for (int inch = 0; inch < 12; inch++) {
                heights.add(feet + " feet " + inch + " inches");
            }
        }
        height.setItems(heights);
        if (height.getValue() == null) {
            height.setValue(null);
        }
    }


    @FXML
    private void nextButtonHandler(ActionEvent event) {
        System.out.println("next button pressed");
        try {
            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "");
            String monthValue = month.getValue();
            int dayValue = day.getValue();
            int yearValue = year.getValue();
            String heightValue = height.getValue();

            // Pass the received parameters to signUpScene3 along with additional information
            mainApp.showSignUpScene3(currentWeight, goalWeight, pace, gender, monthValue, dayValue, yearValue, heightValue, firstName.getText(), lastName.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void backButtonHandler(ActionEvent event) {
        System.out.println("back button pressed");
        try {
            mainApp.showSignUpScene1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setMainApp(sceneConnector mainApp) {
        this.mainApp = mainApp;
    }
}
