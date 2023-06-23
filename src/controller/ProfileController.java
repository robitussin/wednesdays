package controller;

import java.io.IOException;
import java.time.LocalDate;

import javafx.beans.property.SetProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ProfileController {

    
    public static LinkedList<String> info = new LinkedList<>();

    Queue<String> fname = new LinkedList<>();
    Queue<String> lname = new LinkedList<>();
    Queue<String> email = new LinkedList<>();
    Queue<String> bday = new LinkedList<>();
    Queue<Integer> mnumber = new LinkedList<>();
    Queue<String> gender = new LinkedList<>();
    private int size;
    
    @FXML
    Label nameLabel, emailLabel, genderLabel,phonenumLabel ;

    @FXML
    DatePicker myDatePicker;

    @FXML
    Button backtohome_prof;



    @FXML
    HomeController homeController = null;

    Object[] row = new Object[6];  


    public void displayProfileName(String fullname) {
        nameLabel.setText(fullname);

    }
    public void displayEmail(String email) {
        emailLabel.setText(email);
    }
    public void displayGender(String gender){
        genderLabel.setText(gender);
    }
    public void displayPhoneNum(String phonenum){
        phonenumLabel.setText(phonenum);
    }


    public void actionPerformed(ActionEvent e){
        String obj = "";
        size = info.size();


    }


    public void backtohome_profile (ActionEvent event) throws IOException {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

    }
    
}



