package controller;

import javafx.scene.Node;
import javafx.scene.input.KeyEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SignUpController {
    @FXML
    TextField ftextfield, ltextfield, etextfield, phonenumtextfield;

    @FXML
    PasswordField createpasswordfield, confirmPasswordField;

    @FXML
    Button signbutton, cancelbutton, backbutton, wednesdaysbutton;

    @FXML
    private DatePicker myDatePicker;

    @FXML
    Label passwordwarninglabel, matchlabel, genderLabel;

    @FXML
    private RadioButton rbutton1, rbutton2, rbutton3;

    @FXML
    // Home1Controller home1Controller = null;
    ProfileController profileController = null;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void signup(ActionEvent event) throws IOException {

        // Scene scene = new Scene(root);
        // scene.getStylesheets().add("/src/style.css");

        String firstname = ftextfield.getText();
        String lastname = ltextfield.getText();
        String email = etextfield.getText();
        String phonenum = phonenumtextfield.getText();

        LocalDate birthDate = myDatePicker.getValue();

        String fullname = firstname + " " + lastname;

        // Regex for password requirement: at least one letter, 8 characters and at
        // least one number
        String createPassword = createpasswordfield.getText();
        String confirmpassword = confirmPasswordField.getText();

        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d).{8,}$");
        Matcher matcher = pattern.matcher(createPassword);

        boolean match = matcher.matches();

        /*
         * proceeding to create account if created password matches confirm password,
         * and if phonenum textfield accepted digit input
         */
        if (createPassword.matches("^(?=.*[A-Za-z])(?=.*\\d).{8,}$") && confirmpassword.equals(createPassword)
                && (phonenum.matches("\\d+"))) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Profile.fxml"));
            root = loader.load();
            ProfileController profileController = loader.getController();
            profileController.displayProfileName(fullname);
            profileController.displayEmail(email);
            profileController.displayGender(getSelectedGender());
            profileController.displayPhoneNum(phonenum);
            // profileController.displayBirthdate(birthDate);

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        // if no input, animate shake & red border, and do not proceed to create account
        if (ftextfield.getText().length() == 0) {
            ftextfield.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            // new animatefx.animation.Shake(ftextfield).play();

        }

        if (ltextfield.getText().length() == 0) {
            ltextfield.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            // new animatefx.animation.Shake(ltextfield).play();
        }
        if (etextfield.getText().length() == 0) {
            etextfield.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            // new animatefx.animation.Shake(etextfield).play();
        }

        if (phonenumtextfield.getText().length() == 0) {
            phonenumtextfield.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            // new animatefx.animation.Shake(phonenumtextfield).play();
        }

        if (createpasswordfield.getText().length() == 0) {
            createpasswordfield.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            // new animatefx.animation.Shake(createpasswordfield).play();
        }
        if (confirmPasswordField.getText().length() == 0) {
            confirmPasswordField.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            // new animatefx.animation.Shake(confirmPasswordField).play();
        }
        if (!rbutton1.isSelected() && !rbutton2.isSelected() && !rbutton3.isSelected()) {
            rbutton1.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            rbutton2.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            rbutton3.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");

        }

        else {
            passwordwarninglabel.setVisible(false);
        }

    }

    public void getGender(ActionEvent event) {

        if (rbutton1.isSelected()) {

        } else if (rbutton2.isSelected()) {

        } else if (rbutton3.isSelected()) {

        }

    }

    private String getSelectedGender() {
        if (rbutton1.isSelected()) {
            return "Male";
        } else if (rbutton2.isSelected()) {
            return "Female";
        } else {
            return "";
        }

    }

    public void getDate(ActionEvent event) {
        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

    }

    public void gotoHome(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
