package scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class sceneConnector extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        homeScreen();
    }

    /////scene setup
    public void homeScreen() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("homeScreen.fxml"));
        Parent root = loader.load();
        homeScreenControl controller = loader.getController();
        controller.setMainApp(this);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home Screen");
        primaryStage.show();
    }

    public void showSignUpScene1() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signUpScene1.fxml"));
        Parent root = loader.load();
        signUpController1 controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sign Up Scene 1");
        primaryStage.show();
    }

    public void showSignUpScene2(double currentWeight, double goalWeight, double pace) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUpScene2.fxml"));
        Parent root = loader.load();
        signUpController2 controller = loader.getController();
        controller.setCurrentWeight(currentWeight);
        controller.setGoalWeight(goalWeight);
        controller.setPace(pace);
        controller.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sign Up Scene 2");
        primaryStage.show();
    }

    
    public void showSignUpScene3(double currentWeight, double goalWeight, double pace, String gender, String monthValue, int dayValue, int yearValue, String heightValue, String string, String string2) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signUpScene3.fxml"));
        Parent root = loader.load();
        signUpController3 controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sign Up Scene 3");
        primaryStage.show();
    }
    
    public void showLogInScreen() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("logInScene.fxml"));
        Parent root = loader.load();
        loginSceneController controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("LoginScreen");
        primaryStage.show();
    }
    
    public void showDashBoard() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
        Parent root = loader.load();
        dashboardController controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("LoginScreen");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
