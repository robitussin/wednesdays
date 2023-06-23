package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

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
import javafx.stage.Stage;
import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class LiyahController implements Initializable {
    @FXML
    Label lname1, lname2, lname3, lname4, lname5, lprice1, lprice2, lprice3, lprice4, lprice5;

    @FXML
    ImageView limg1, limg2, limg3, limg4, limg5;

    @FXML
    private Stage stage;

    @FXML
    ImageView productImage;

    @FXML
    Label description;

    @FXML
    MenuBar homemenubar;

    @FXML
    MenuItem Jeanne, Bianca, Liyah, Nivek, menmenuitem, womenmenuitem;

    @FXML
    Button lcartbutton, lcartbutton1, lcartbutton2, lcartbutton3, lcartbutton4, lcartbutton5,
            wednesdaysbutton, profileButton;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    static LBaggyPants lbpants = new LBaggyPants();
    static LPinkShorts lpshorts = new LPinkShorts();
    static LLeatherJacket lljacket = new LLeatherJacket();
    static LGlasses lglasses = new LGlasses();
    static LVest lvest = new LVest();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== Baggy Pants ================== //
        lname1.setText(HomeController.lbpants.getProductName());
        lprice1.setText(Double.toString(HomeController.lbpants.getProductPrice()));
        Image lbpantsImage = new Image(HomeController.lbpants.getProductImage());
        limg1.setImage(lbpantsImage);
        limg1.setOnMouseClicked(this::handleMouseClick);

        // ============== Pink Shorts ================== //
        lname2.setText(HomeController.lpshorts.getProductName());
        lprice2.setText(Double.toString(HomeController.lpshorts.getProductPrice()));
        Image lpshortsImage = new Image(HomeController.lpshorts.getProductImage());
        limg2.setImage(lpshortsImage);
        limg2.setOnMouseClicked(this::handleMouseClick);

        // ============== Leather Jacket ================== //

        lname3.setText(HomeController.lljacket.getProductName());
        lprice3.setText(Double.toString(HomeController.lljacket.getProductPrice()));
        Image lljacketImage = new Image(HomeController.lljacket.getProductImage());
        limg3.setImage(lljacketImage);
        limg3.setOnMouseClicked(this::handleMouseClick);

        // ============== Glasses ================== //

        lname4.setText(HomeController.lglasses.getProductName());
        lprice4.setText(Double.toString(HomeController.lglasses.getProductPrice()));
        Image lglassesImage = new Image(HomeController.lglasses.getProductImage());
        limg4.setImage(lglassesImage);
        limg4.setOnMouseClicked(this::handleMouseClick);

        // ============== Vest ================== //
        lname5.setText(HomeController.lvest.getProductName());
        lprice5.setText(Double.toString(HomeController.lvest.getProductPrice()));
        Image lvestImage = new Image(HomeController.lvest.getProductImage());
        limg5.setImage(lvestImage);
        limg5.setOnMouseClicked(this::handleMouseClick);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("WEDNESDAYS!", "Item Added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(lcartbutton1)) {

            HomeController.lbpants.setProductStatus(true);
            HomeController.lbpants.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.lpane1);

        } else if (sourceButton == lcartbutton2) {
            HomeController.lpshorts.setProductStatus(true);
            HomeController.lpshorts.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.lpane2);

        } else if (sourceButton == lcartbutton3) {
            HomeController.lljacket.setProductStatus(true);
            HomeController.lljacket.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.lpane3);

        } else if (sourceButton == lcartbutton4) {
            HomeController.lglasses.setProductStatus(true);
            HomeController.lglasses.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.lpane4);

        } else if (sourceButton == lcartbutton5) {
            HomeController.lvest.setProductStatus(true);
            HomeController.lvest.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.lpane5);

        }

        HomeController.cart.showItems();

    }

    // Goes to Checkout.fxml
    public void gotoCart(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cart1.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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

    public void gotoProfile(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Profile.fxml"));
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
            case "limg1":
                desc = HomeController.lbpants.getProductDescription();
                break;
            case "limg2":
                desc = HomeController.lpshorts.getProductDescription();
                break;
            case "limg3":
                desc = HomeController.lljacket.getProductDescription();
                break;
            case "limg4":
                desc = HomeController.lglasses.getProductDescription();
                break;
            case "limg5":
                desc = HomeController.lvest.getProductDescription();
                break;
        }

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/productpreview.fxml"));
            Parent root = loader.load();

            ProductViewController itemDetailsController = loader.getController();
            List<Product> items = new ArrayList<>();
            items.add(HomeController.lbpants);
            items.add(HomeController.lpshorts);
            items.add(HomeController.lljacket);
            items.add(HomeController.lglasses);
            items.add(HomeController.lvest);

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
