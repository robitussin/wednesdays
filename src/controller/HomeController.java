package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
import javafx.scene.Node;

public class HomeController implements Initializable {

    static MLinenLongSleeves mclshirt = new MLinenLongSleeves();
    static MCrochetTankTop mcvest = new MCrochetTankTop();
    static MKnittedCoverUp mkcoverup = new MKnittedCoverUp();
    static MDenimShorts mdshorts = new MDenimShorts();
    static MPinkSweatshorts mkjshorts = new MPinkSweatshorts();
    static MCutworkShirt mcwshirt = new MCutworkShirt();

    static BBlackSkort bbskort = new BBlackSkort();
    static BCardigan bcardigan = new BCardigan();
    static BSleevelessTop bstop = new BSleevelessTop();
    static BSunglasses bsunglasses = new BSunglasses();
    static BWhiteShort bwshort = new BWhiteShort();

    static LBaggyPants lbpants = new LBaggyPants();
    static LPinkShorts lpshorts = new LPinkShorts();
    static LLeatherJacket lljacket = new LLeatherJacket();
    static LGlasses lglasses = new LGlasses();
    static LVest lvest = new LVest();

    static JPoloDress jpdress = new JPoloDress();
    static JBodySuit jbodysuit = new JBodySuit();
    static JSunnies jsunnies = new JSunnies();
    static JSlingBag jsbag = new JSlingBag();
    static JWhiteSkort jwskort = new JWhiteSkort();
    static JCoverUp jcup = new JCoverUp();

    static WLinenShort wlshort = new WLinenShort();
    static WAssymetricSkort waskort = new WAssymetricSkort();
    static WBomberJacket wbjacket = new WBomberJacket();
    static WCroppedBlazer wcblazer = new WCroppedBlazer();
    static WPalazzoTrousers wptrousers = new WPalazzoTrousers();
    static WPrintedDress wpdress = new WPrintedDress();

    static NKoreanTee nktee = new NKoreanTee();
    static NShades nshades = new NShades();
    static NTrousers ntrousers = new NTrousers();
    static NPoloShirt npshirt = new NPoloShirt();
    static NGraySweatShorts ngsshort = new NGraySweatShorts();

    @FXML
    Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, hpprice1, hpprice2, hpprice3,
            hpprice4, hpprice5, hpprice6, hpprice7, hpprice8, hpprice9, hpprice10, hpprice11, hpprice12, hpprice13,
            hpprice14, hpprice15, hpprice16, hpprice17, hpprice18;

    @FXML
    ImageView hpimg1, hpimg2, hpimg3, hpimg4, hpimg5, hpimg6, hpimg7, hpimg8, hpimg9, hpimg10, hpimg11, hpimg12,
            hpimg13, hpimg14, hpimg15, hpimg16, hpimg17, hpimg18;

    @FXML
    ImageView cover;

    @FXML
    Button profilebutton, cartbutton, wednesdaysbutton;

    @FXML
    MenuBar homemenubar;

    @FXML
    Menu menuowners, categories;

    @FXML
    MenuItem Jeanne, Bianca, Nivek, Liyah, menmenuitem, womenmenuitem;

    @FXML
    LoginController loginController = null;
    JeanneController jeanneController = null;

    @FXML
    static Parent homeRoot = null;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    @FXML
    static CheckoutController checkoutController = null;

    static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // -------- Men's Collection--------//
        mclshirt.setProductName("Linen Long Sleeves");
        mclshirt.setProductPrice(1200.00);
        mclshirt.setProductImage("images/longsleeves4.png");

        mcvest.setProductName("Crochet Tank Top");
        mcvest.setProductPrice(1000.00);
        mcvest.setProductImage("images/tanktop4.png");

        mkcoverup.setProductName("Knitted Cover Up");
        mkcoverup.setProductPrice(1300.00);
        mkcoverup.setProductImage("images/coverup3.png");

        mdshorts.setProductName("Denim Shorts");
        mdshorts.setProductPrice(1400.00);
        mdshorts.setProductImage("images/whitemaong4.png");

        mkjshorts.setProductName("Pink Sweatshorts");
        mkjshorts.setProductPrice(1500.00);
        mkjshorts.setProductImage("images/sweatshorts2.png");

        mcwshirt.setProductName("Cutwork Shirt");
        mcwshirt.setProductPrice(1100.00);
        mcwshirt.setProductImage("images/eyelettop1.png");

        // -------- Bia's Collection--------//
        bbskort.setProductName("Black Skort");
        bbskort.setProductPrice(1000.00);
        bbskort.setProductImage("images/balckskortOP.png");

        bcardigan.setProductName("Pink Cardigan");
        bcardigan.setProductPrice(599.00);
        bcardigan.setProductImage("images/cardiganOP.png");

        bstop.setProductName("Sleeveless Top");
        bstop.setProductPrice(499.00);
        bstop.setProductImage("images/topOP.png");

        bwshort.setProductName("White Short");
        bwshort.setProductPrice(399.00);
        bwshort.setProductImage("images/whiteshortsOP.png");

        bsunglasses.setProductName("Sunglasses");
        bsunglasses.setProductPrice(299.00);
        bsunglasses.setProductImage("images/sunglassesOP.png");

        // ============== Liyah's Collection ================== //

        lbpants.setProductName("Baggy Pants");
        lbpants.setProductPrice(499.00);
        lbpants.setProductImage("images/baggypantsOP.png");

        lpshorts.setProductName("Pink Shorts");
        lpshorts.setProductPrice(499.00);
        lpshorts.setProductImage("images/pinkshortOP.png");

        lljacket.setProductName("Leather Jacket");
        lljacket.setProductPrice(399.00);
        lljacket.setProductImage("images/leatherjacketOP.png");

        lglasses.setProductName("Glasses");
        lglasses.setProductPrice(299.00);
        lglasses.setProductImage("images/glassesOP.png");

        lvest.setProductName("Vest");
        lvest.setProductPrice(399.00);
        lvest.setProductImage("images/l.VestHome.png");

        // ============== Jeanne's Collection ================== //

        jpdress.setProductName("Polo Dress");
        jpdress.setProductPrice(1499.00);
        jpdress.setProductImage("images/dressOP.png");

        jbodysuit.setProductName("Bodysuit");
        jbodysuit.setProductPrice(800.00);
        jbodysuit.setProductImage("images/bodysuitOP.png");

        jsunnies.setProductName("Sunnies");
        jsunnies.setProductPrice(499.00);
        jsunnies.setProductImage("images/sunniesOP.png");

        jsbag.setProductName("Sling Bag");
        jsbag.setProductPrice(1700.00);
        jsbag.setProductImage("images/slingbagOP.png");

        jwskort.setProductName("White Skort");
        jwskort.setProductPrice(800.00);
        jwskort.setProductImage("images/whiteskortOP.png");

        jcup.setProductName("Striped Cover Up");
        jcup.setProductPrice(1200.00);
        jcup.setProductImage("images/coverupOP.png");

        // ============== Nebs Collection ================== //

        nktee.setProductName("Korean Tee");
        nktee.setProductPrice(1200.00);
        nktee.setProductImage("images/teeOP.png");

        nshades.setProductName("Shades");
        nshades.setProductPrice(500.00);
        nshades.setProductImage("images/shadesOP.png");

        ntrousers.setProductName("Black Pants");
        ntrousers.setProductPrice(1500.00);
        ntrousers.setProductImage("images/trousersOP.png");

        npshirt.setProductName(" Polo Shirt");
        npshirt.setProductPrice(1800.00);
        npshirt.setProductImage("images/poloshirtOP.png");

        ngsshort.setProductName("Gray Sweatshort");
        ngsshort.setProductPrice(900.00);
        ngsshort.setProductImage("images/shortsOP.png");

        // ============== Women's Collection ================== //

        wlshort.setProductName("Linen Short");
        wlshort.setProductPrice(800.00);
        wlshort.setProductImage("images/linenshort1.png");

        waskort.setProductName("Pink Skort");
        waskort.setProductPrice(750.00);
        waskort.setProductImage("images/skort1.png");

        wbjacket.setProductName("Bomber Jacket");
        wbjacket.setProductPrice(2000.00);
        wbjacket.setProductImage("images/bomberjacket2.png");

        wcblazer.setProductName("Blazer");
        wcblazer.setProductPrice(1800.00);
        wcblazer.setProductImage("images/blazer2.png");

        wptrousers.setProductName("White Pants");
        wptrousers.setProductPrice(999.00);
        wptrousers.setProductImage("images/whitepants1.png");

        wpdress.setProductName("White Pants");
        wpdress.setProductPrice(999.00);
        wpdress.setProductImage("images/dress3.png");

        FXMLLoader loader = null;

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Cart1.fxml"));
            loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
    }

    public void gotoHome(ActionEvent event) throws IOException {

        // If view shop button is pressed, go to home controller
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void gotoLogin(ActionEvent event) throws IOException {

        // If view shop button is pressed, go to home controller
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
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

    public void gotoProfile(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Profile.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

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

}
