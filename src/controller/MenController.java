package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.plaf.metal.MetalCheckBoxIcon;

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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import alert.AlertMaker;

public class MenController implements Initializable {
    @FXML
    Label mname1, mname2, mname3, mname4, mname5, mname6,
            mprice1, mprice2, mprice3, mprice4, mprice5, mprice6;

    @FXML
    ImageView mimg1, mimg2, mimg3, mimg4, mimg5, mimg6;

    @FXML
    ImageView productImage;

    @FXML
    Button mcartbutton, mcartbutton1, mcartbutton2, mcartbutton3, mcartbutton4, mcartbutton5, mcartbutton6,
            addtoCart, profileButton, wednesdaysbutton;

    @FXML
    MenuBar homemenubar;

    @FXML
    MenuItem Jeanne, Bianca, Liyah, Nivek, menmenuitem, womenmenuitem;

    @FXML
    Menu menuowners, categories;

    @FXML
    Label description;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    static MLinenLongSleeves mclshirt = new MLinenLongSleeves();
    static MCrochetTankTop mcvest = new MCrochetTankTop();
    static MKnittedCoverUp mkcoverup = new MKnittedCoverUp();
    static MDenimShorts mdshorts = new MDenimShorts();
    static MPinkSweatshorts mkjshorts = new MPinkSweatshorts();
    static MCutworkShirt mcwshirt = new MCutworkShirt();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // 1 ============== LINEN LONG SLEEVES ================== //
        mname1.setText(HomeController.mclshirt.getProductName());
        mprice1.setText(Double.toString(HomeController.mclshirt.getProductPrice()));
        HomeController.mclshirt.setProductImage("images/longsleeves4.png");
        Image mclshirtImage = new Image(HomeController.mclshirt.getProductImage());
        mimg1.setImage(mclshirtImage);

        mimg1.setOnMouseClicked(this::handleMouseClick);

        // 2 ============== CROCHET (vest) TANK TOP ================== //
        mname2.setText(HomeController.mcvest.getProductName());
        mprice2.setText(Double.toString(HomeController.mcvest.getProductPrice()));
        HomeController.mcvest.setProductImage("images/tanktop4.png");
        Image mcvestImage = new Image(HomeController.mcvest.getProductImage());
        mimg2.setImage(mcvestImage);

        mimg2.setOnMouseClicked(this::handleMouseClick);

        // 3 ============== KNITTED COVER UP ================== //
        mname3.setText(HomeController.mkcoverup.getProductName());
        mprice3.setText(Double.toString(HomeController.mkcoverup.getProductPrice()));
        HomeController.mkcoverup.setProductImage("images/coverup3.png");
        Image mkcoverupImage = new Image(HomeController.mkcoverup.getProductImage());
        mimg3.setImage(mkcoverupImage);

        mimg3.setOnMouseClicked(this::handleMouseClick);

        // 4 ============== DENIM SHORTS ================== //

        mname4.setText(HomeController.mdshorts.getProductName());
        mprice4.setText(Double.toString(HomeController.mdshorts.getProductPrice()));
        HomeController.mdshorts.setProductImage("images/whitemaong4.png");
        Image mdshortsImage = new Image(HomeController.mdshorts.getProductImage());
        mimg4.setImage(mdshortsImage);

        mimg4.setOnMouseClicked(this::handleMouseClick);

        // 5 ============== PINK SWEATSHORTS ================== //

        mname5.setText(HomeController.mkjshorts.getProductName());
        mprice5.setText(Double.toString(HomeController.mkjshorts.getProductPrice()));
        HomeController.mkjshorts.setProductImage("images/sweatshorts2.png");
        Image mkjshortsImage = new Image(HomeController.mkjshorts.getProductImage());
        mimg5.setImage(mkjshortsImage);

        mimg5.setOnMouseClicked(this::handleMouseClick);

        // 6 ============== CUTWORK SHIRT ================== //

        mname6.setText(HomeController.mcwshirt.getProductName());
        mprice6.setText(Double.toString(HomeController.mcwshirt.getProductPrice()));
        HomeController.mcwshirt.setProductImage("images/eyelettop1.png");
        Image mcwshirtImage = new Image(HomeController.mcwshirt.getProductImage());
        mimg6.setImage(mcwshirtImage);

        mimg6.setOnMouseClicked(this::handleMouseClick);

    }

    public void handleMouseClick(MouseEvent event) {
        ImageView imageView = (ImageView) event.getSource();
        // imageView.setScaleX(1.2); // Increase X-axis scale
        // imageView.setScaleY(1.2); // Increase Y-axis scale
        String desc = "";
        switch (imageView.getId()) {
            case "mimg1":
                desc = HomeController.mclshirt.getProductDescription();
                break;
            case "mimg2":
                desc = HomeController.mcvest.getProductDescription();
                break;
            case "mimg3":
                desc = HomeController.mkcoverup.getProductDescription();
                break;
            case "mimg4":
                desc = HomeController.mdshorts.getProductDescription();
                break;
            case "mimg5":
                desc = HomeController.mkjshorts.getProductDescription();
                break;
            case "mimg6":
                desc = HomeController.mcwshirt.getProductDescription();
        }

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/productpreview.fxml"));
            Parent root = loader.load();

            ProductViewController itemDetailsController = loader.getController();
            List<Product> items = new ArrayList<>();
            items.add(HomeController.mclshirt);
            items.add(HomeController.mcvest);
            items.add(HomeController.mkcoverup);
            items.add(HomeController.mdshorts);
            items.add(HomeController.mkjshorts);
            items.add(HomeController.mcwshirt);

            itemDetailsController.setItems(items);
            itemDetailsController.setProduct(imageView.getImage(), desc);

            Stage productStage = new Stage();
            productStage.setScene(new Scene(root));
            productStage.show();
        } catch (Exception e) {
            // TODO: handle exception
        }

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

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(mcartbutton1)) {
            HomeController.mclshirt.setProductStatus(true);
            HomeController.mclshirt.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.mpane1);

        } else if (sourceButton == mcartbutton2) {
            HomeController.mcvest.setProductStatus(true);
            HomeController.mcvest.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.mpane2);

        } else if (sourceButton == mcartbutton3) {
            HomeController.mkcoverup.setProductStatus(true);
            HomeController.mkcoverup.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.mpane3);

        } else if (sourceButton == mcartbutton4) {
            HomeController.mdshorts.setProductStatus(true);
            HomeController.mdshorts.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.mpane4);

        } else if (sourceButton == mcartbutton5) {
            HomeController.mkjshorts.setProductStatus(true);
            HomeController.mkjshorts.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.mpane5);

        }

        else if (sourceButton == mcartbutton6) {
            HomeController.mcwshirt.setProductStatus(true);
            HomeController.mcwshirt.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.mpane6);
        }

        HomeController.cart.showItems();

    }

}
