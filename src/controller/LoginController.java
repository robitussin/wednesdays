package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.BBlackSkort;
import model.BCardigan;
import model.BSleevelessTop;
import model.BSunglasses;
import model.BWhiteShort;
import model.JBodySuit;
import model.JCoverUp;
import model.JPoloDress;
import model.JSlingBag;
import model.JSunnies;
import model.JWhiteSkort;
import model.LBaggyPants;
import model.LGlasses;
import model.LLeatherJacket;
import model.LPinkShorts;
import model.LVest;
import model.MCrochetTankTop;
import model.MCutworkShirt;
import model.MDenimShorts;
import model.MKnittedCoverUp;
import model.MLinenLongSleeves;
import model.MPinkSweatshorts;
import model.NGraySweatShorts;
import model.NKoreanTee;
import model.NPoloShirt;
import model.NShades;
import model.NTrousers;
import model.WAssymetricSkort;
import model.WBomberJacket;
import model.WCroppedBlazer;
import model.WLinenShort;
import model.WPalazzoTrousers;
import model.WPrintedDress;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.Initializable;

public class LoginController implements Initializable {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    ImageView ikea, cover;

    @FXML
    Button loginbutton, signupbutton, nextimagebutton, backbutton;

    @FXML
    Label mywarninglabel;

    @FXML
    CheckoutController checkoutController = null;

    FXMLLoader loader = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

    }

    public void login(ActionEvent event) throws IOException {

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (mytextfield.getText().length() == 0) {
            mytextfield.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            // new animatefx.animation.Shake(mytextfield).play();
        }
        if (mypasswordfield.getText().length() == 0) {
            mypasswordfield.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            // new animatefx.animation.Shake(mypasswordfield).play();
        }

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            // } else if (!(username.equals("wednesdays") && password.equals("Wednesdays")))
            // {
            // mywarninglabel.setVisible(true);

        }
    }

    public void signup(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SignUp.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    Image nextImage = new Image(getClass().getResourceAsStream("/images/cover.jpg"));

    public void displaynextimage(ActionEvent event) throws IOException {
        ikea.setImage(nextImage);
    }

    public void back(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}