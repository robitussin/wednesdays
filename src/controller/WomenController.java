package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.input.MouseEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import alert.AlertMaker;

public class WomenController implements Initializable {
    @FXML
    Label wname1, wname2, wname3, wname4, wname5, wname6,
            wprice1, wprice2, wprice3, wprice4, wprice5, wprice6;

    @FXML
    AnchorPane womenAnchorPane;

    @FXML
    Button wcartbutton, wcartbutton1, wcartbutton2, wcartbutton3, wcartbutton4, wcartbutton5,
            wcartbutton6, profileButton, wednesdaysbutton;

    @FXML
    ImageView wimg1, wimg2, wimg3, wimg4, wimg5, wimg6;

    @FXML
    MenuBar homemenubar;

    @FXML
    MenuItem Jeanne, Bianca, Liyah, Nivek, menmenuitem, womenmenuitem;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    static WLinenShort wlshort = new WLinenShort();
    static WAssymetricSkort waskort = new WAssymetricSkort();
    static WBomberJacket wbjacket = new WBomberJacket();
    static WCroppedBlazer wcblazer = new WCroppedBlazer();
    static WPalazzoTrousers wptrousers = new WPalazzoTrousers();
    static WPrintedDress wpdress = new WPrintedDress();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== LINEN SHORT ==================//
        wname1.setText(HomeController.wlshort.getProductName());
        wprice1.setText(Double.toString(HomeController.wlshort.getProductPrice()));
        Image wlshortImage = new Image(HomeController.wlshort.getProductImage());
        wimg1.setImage(wlshortImage);

        // Add hover listener for images
        wimg1.setOnMouseClicked(this::handleMouseClick);

        // ============== PINK SKORT ==================//
        wname2.setText(HomeController.waskort.getProductName());
        wprice2.setText(Double.toString(HomeController.waskort.getProductPrice()));
        Image waskortImage = new Image(HomeController.waskort.getProductImage());
        wimg2.setImage(waskortImage);

        wimg2.setOnMouseClicked(this::handleMouseClick);

        // ============== BOMBER JACKET ==================//
        wname3.setText(HomeController.wbjacket.getProductName());
        wprice3.setText(Double.toString(HomeController.wbjacket.getProductPrice()));
        Image wbjacketImage = new Image(HomeController.wbjacket.getProductImage());
        wimg3.setImage(wbjacketImage);

        wimg3.setOnMouseClicked(this::handleMouseClick);

        // ============== BLAZER ==================//
        wname4.setText(HomeController.wbjacket.getProductName());
        wprice4.setText(Double.toString(HomeController.wcblazer.getProductPrice()));
        Image wcblazerImage = new Image(HomeController.wcblazer.getProductImage());
        wimg4.setImage(wcblazerImage);

        wimg4.setOnMouseClicked(this::handleMouseClick);

        // ============== WHITE PANTS ==================//
        wname5.setText(HomeController.wptrousers.getProductName());
        wprice5.setText(Double.toString(HomeController.wptrousers.getProductPrice()));
        Image wptrousersImage = new Image(HomeController.wptrousers.getProductImage());
        wimg5.setImage(wptrousersImage);

        wimg5.setOnMouseClicked(this::handleMouseClick);

        // ============== DRESS ==================//
        wname6.setText(HomeController.wpdress.getProductName());
        wprice6.setText(Double.toString(HomeController.wpdress.getProductPrice()));
        Image wpdressImage = new Image(HomeController.wpdress.getProductImage());
        wimg6.setImage(wpdressImage);

        wimg6.setOnMouseClicked(this::handleMouseClick);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(wcartbutton1)) {
            HomeController.wlshort.setProductStatus(true);
            HomeController.wlshort.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.wpane1);

        } else if (sourceButton == wcartbutton2) {
            HomeController.waskort.setProductStatus(true);
            HomeController.waskort.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.wpane2);

        } else if (sourceButton == wcartbutton3) {
            HomeController.wbjacket.setProductStatus(true);
            HomeController.wbjacket.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.wpane3);

        } else if (sourceButton == wcartbutton4) {
            HomeController.wcblazer.setProductStatus(true);
            HomeController.wcblazer.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.wpane4);

        } else if (sourceButton == wcartbutton5) {
            HomeController.wptrousers.setProductStatus(true);
            HomeController.wptrousers.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.wpane5);

        }

        else if (sourceButton == wcartbutton6) {
            HomeController.wpdress.setProductStatus(true);
            HomeController.wpdress.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.wpane6);
        }

        HomeController.cart.showItems();

    }

    public void gotoProfile(ActionEvent event) throws IOException {

        // If view shop button is pressed, go to home controller
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Profile.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // Goes to Checkout.fxml
    public void gotoCart(ActionEvent event) throws IOException {

        // If view shop button is pressed, go to home controller
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Cart1.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------Lagay niyo to sa lahat ng collection
    // controller-----------------------------------------------
    public void gotoJeannes(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/JeanneCollection.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoBias(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/BiaCollection.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoLiyahs(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/LiyahCollection.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoNiveks(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/NebsCollection.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoMens(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/men.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoWomens(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Women.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoHome(ActionEvent event) throws IOException {

        // If view shop button is pressed, go to home controller
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/finalhomepage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void handleMouseClick(MouseEvent event) {
        ImageView imageView = (ImageView) event.getSource();
        // imageView.setScaleX(1.2); // Increase X-axis scale
        // imageView.setScaleY(1.2); // Increase Y-axis scale
        String desc = "";
        switch (imageView.getId()) {
            case "wimg1":
                desc = HomeController.wlshort.getProductDescription();
                break;
            case "wimg2":
                desc = HomeController.waskort.getProductDescription();
                break;
            case "wimg3":
                desc = HomeController.wbjacket.getProductDescription();
                break;
            case "wimg4":
                desc = HomeController.wcblazer.getProductDescription();
                break;
            case "wimg5":
                desc = HomeController.wptrousers.getProductDescription();
                break;
            case "wimg6":
                desc = HomeController.wpdress.getProductDescription();
        }

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/productpreview.fxml"));
            Parent root = loader.load();

            ProductViewController itemDetailsController = loader.getController();
            List<Product> items = new ArrayList<>();
            items.add(HomeController.wlshort);
            items.add(HomeController.waskort);
            items.add(HomeController.wbjacket);
            items.add(HomeController.wcblazer);
            items.add(HomeController.wptrousers);
            items.add(HomeController.wpdress);

            itemDetailsController.setItems(items);
            itemDetailsController.setProduct(imageView.getImage(), desc);

            Stage productStage = new Stage();
            productStage.setScene(new Scene(root));
            productStage.show();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
