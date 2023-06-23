package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
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
import java.util.List;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class BiaController implements Initializable {
    @FXML
    Label bname1, bname2, bname3, bname4, bname5,
            bprice1, bprice2, bprice3, bprice4, bprice5;

    @FXML
    ImageView bimg1, bimg2, bimg3, bimg4, bimg5;

    @FXML
    Button bcartbutton, bcartbutton1, bcartbutton2, bcartbutton3, bcartbutton4, bcartbutton5, wednesdaysbutton,
            profileButton;

    @FXML
    MenuItem Jeanne, Bianca, Liyah, Nivek, menmenuitem, womenmenuitem;

    @FXML
    private Stage stage;

    @FXML
    ImageView productImage;

    @FXML
    Label description;

    @FXML
    MenuBar homemenubar;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    static BBlackSkort bbskort = new BBlackSkort();
    static BCardigan bcardigan = new BCardigan();
    static BSleevelessTop bstop = new BSleevelessTop();
    static BSunglasses bsunglasses = new BSunglasses();
    static BWhiteShort bwshort = new BWhiteShort();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== Black Skort ================== //'

        bname1.setText(HomeController.bbskort.getProductName());
        bprice1.setText(Double.toString(HomeController.bbskort.getProductPrice()));
        HomeController.bbskort.setProductImage("images/balckskortOP.png");
        Image bbskortImage = new Image(HomeController.bbskort.getProductImage());
        bimg1.setImage(bbskortImage);
        bimg1.setOnMouseClicked(this::handleMouseClick);

        // ============== Cardigan ================== //
        bname2.setText(HomeController.bcardigan.getProductName());
        bprice2.setText(Double.toString(HomeController.bcardigan.getProductPrice()));
        HomeController.bcardigan.setProductImage("images/cardiganOP.png");
        Image bcardiganImage = new Image(HomeController.bcardigan.getProductImage());
        bimg2.setImage(bcardiganImage);
        bimg2.setOnMouseClicked(this::handleMouseClick);

        // ============== White Short ================== //
        bname3.setText(HomeController.bwshort.getProductName());
        bprice3.setText(Double.toString(HomeController.bwshort.getProductPrice()));
        // HomeController.bwshort.setProductImage("images/whiteshortsOP");
        Image bwshortImage = new Image(HomeController.bwshort.getProductImage());
        bimg3.setImage(bwshortImage);
        bimg3.setOnMouseClicked(this::handleMouseClick);

        // ============== Sleeveless Top ================== //
        bname4.setText(HomeController.bstop.getProductName());
        bprice4.setText(Double.toString(HomeController.bstop.getProductPrice()));
        HomeController.bstop.setProductImage("images/topOP.png");
        Image bstopImage = new Image(HomeController.bstop.getProductImage());
        bimg4.setImage(bstopImage);
        bimg4.setOnMouseClicked(this::handleMouseClick);

        // ============== Sunglasses ================== //
        bname5.setText(HomeController.bsunglasses.getProductName());
        bprice5.setText(Double.toString(HomeController.bsunglasses.getProductPrice()));
        HomeController.bsunglasses.setProductImage("images/sunglassesOP.png");
        Image bsunglassesImage = new Image(HomeController.bsunglasses.getProductImage());
        bimg5.setImage(bsunglassesImage);
        bimg5.setOnMouseClicked(this::handleMouseClick);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("WEDNESDAYS!", "Item Added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(bcartbutton1)) {
            HomeController.bbskort.setProductStatus(true);
            HomeController.bbskort.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.bpane1);

        } else if (sourceButton == bcartbutton2) {
            HomeController.bcardigan.setProductStatus(true);
            HomeController.bcardigan.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.bpane2);

        } else if (sourceButton == bcartbutton3) {
            HomeController.bwshort.setProductStatus(true);
            HomeController.bwshort.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.bpane3);

        } else if (sourceButton == bcartbutton4) {
            HomeController.bstop.setProductStatus(true);
            HomeController.bstop.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.bpane4);

        } else if (sourceButton == bcartbutton5) {
            HomeController.bsunglasses.setProductStatus(true);
            HomeController.bsunglasses.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.bpane5);

        }

        HomeController.cart.showItems();

    }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        // Load items to cart before switching to checkout page
        HomeController.checkoutController.showItems(HomeController.cart.getItemList());

        // Set initial total amount in checkout page
        HomeController.checkoutController.getInitialAmount();

        Scene scene = new Scene(HomeController.homeRoot);
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

    // Goes to Checkout.fxml
    public void gotoCart(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Cart1.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void handleMouseClick(MouseEvent event) {
        ImageView imageView = (ImageView) event.getSource();
        // imageView.setScaleX(1.2); // Increase X-axis scale
        // imageView.setScaleY(1.2); // Increase Y-axis scale
        String desc = "";
        switch (imageView.getId()) {
            case "bimg1":
                desc = HomeController.bbskort.getProductDescription();
                break;
            case "bimg2":
                desc = HomeController.bcardigan.getProductDescription();
                break;
            case "bimg3":
                desc = HomeController.bwshort.getProductDescription();
                break;
            case "bimg4":
                desc = HomeController.bstop.getProductDescription();
                break;
            case "bimg5":
                desc = HomeController.bsunglasses.getProductDescription();
        }

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/productpreview.fxml"));
            Parent root = loader.load();

            ProductViewController itemDetailsController = loader.getController();
            List<Product> items = new ArrayList<>();
            items.add(HomeController.bbskort);
            items.add(HomeController.bcardigan);
            items.add(HomeController.bwshort);
            items.add(HomeController.bstop);
            items.add(HomeController.bsunglasses);

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