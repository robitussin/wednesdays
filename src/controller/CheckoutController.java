package controller;

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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class CheckoutController implements Initializable {

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    Pane mpane1, mpane2, mpane3, mpane4, mpane5, mpane6,
            wpane1, wpane2, wpane3, wpane4, wpane5, wpane6,
            bpane1, bpane2, bpane3, bpane4, bpane5,
            jpane1, jpane2, jpane3, jpane4, jpane5, jpane6,
            lpane1, lpane2, lpane3, lpane4, lpane5,
            npane1, npane2, npane3, npane4, npane5;

    @FXML
    Button backbutton;

    @FXML
    VBox myvbox;

    @FXML
    Label mname1, mname2, mname3, mname4, mname5, mname6, mprice1, mprice2, mprice3, mprice4, mprice5, mprice6,
            wname1, wname2, wname3, wname4, wname5, wname6, wprice1, wprice2, wprice3, wprice4, wprice5, wprice6,
            jname1, jname2, jname3, jname4, jname5, jname6, jprice1, jprice2, jprice3, jprice4, jprice5, jprice6,
            bname1, bname2, bname3, bname4, bname5, bname6, bprice1, bprice2, bprice3, bprice4, bprice5, bprice6,
            lname1, lname2, lname3, lname4, lname5, lname6, lprice1, lprice2, lprice3, lprice4, lprice5, lprice6,
            nname1, nname2, nname3, nname4, nname5, nprice1, nprice2, nprice3, nprice4, nprice5,
            total;

    @FXML
    ImageView mimg1, mimg2, mimg3, mimg4, mimg5, mimg6, wimg1, wimg2, wimg3, wimg4, wimg5, wimg6,
            jimg1, jimg2, jimg3, jimg4, jimg5, jimg6, bimg1, bimg2, bimg3, bimg4, bimg5, bimg6,
            limg1, limg2, limg3, limg4, limg5, nimg1, nimg2, nimg3, nimg4, nimg5;

    @FXML
    private ChoiceBox<String> mchoicebox1, mchoicebox2, mchoicebox3, mchoicebox4, mchoicebox5, mchoicebox6,
            wchoicebox1, wchoicebox2, wchoicebox3, wchoicebox4, wchoicebox5, wchoicebox6,
            jchoicebox1, jchoicebox2, jchoicebox3, jchoicebox4, jchoicebox5, jchoicebox6,
            bchoicebox1, bchoicebox2, bchoicebox3, bchoicebox4, bchoicebox5,
            lchoicebox1, lchoicebox2, lchoicebox3, lchoicebox4, lchoicebox5,
            nchoicebox1, nchoicebox2, nchoicebox3, nchoicebox4, nchoicebox5;

    private String[] quantity = { "1", "2", "3", "4" };

    @FXML
    MenuBar homemenubar;

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // =========== MEN COLLECTION ===========//
        mname1.setText(HomeController.mclshirt.getProductName());
        mprice1.setText(Double.toString(HomeController.mclshirt.getProductPrice()));
        Image mclshirtImage = new Image(HomeController.mclshirt.getProductImage());
        mimg1.setImage(mclshirtImage);

        mname2.setText(HomeController.mcvest.getProductName());
        mprice2.setText(Double.toString(HomeController.mcvest.getProductPrice()));
        Image mcvestImage = new Image(HomeController.mcvest.getProductImage());
        mimg2.setImage(mcvestImage);

        mname3.setText(HomeController.mkcoverup.getProductName());
        mprice3.setText(Double.toString(HomeController.mkcoverup.getProductPrice()));
        Image mkcoverupImage = new Image(HomeController.mkcoverup.getProductImage());
        mimg3.setImage(mkcoverupImage);

        mname4.setText(HomeController.mdshorts.getProductName());
        mprice4.setText(Double.toString(HomeController.mdshorts.getProductPrice()));
        Image mdshortsImage = new Image(HomeController.mdshorts.getProductImage());
        mimg4.setImage(mdshortsImage);

        mname5.setText(HomeController.mkjshorts.getProductName());
        mprice5.setText(Double.toString(HomeController.mkjshorts.getProductPrice()));
        Image mkjshortsImage = new Image(HomeController.mkjshorts.getProductImage());
        mimg5.setImage(mkjshortsImage);

        mname6.setText(HomeController.mcwshirt.getProductName());
        mprice6.setText(Double.toString(HomeController.mcwshirt.getProductPrice()));
        Image mcwshirtImage = new Image(HomeController.mcwshirt.getProductImage());
        mimg6.setImage(mcwshirtImage);

        // =========== WOMEN COLLECTION ===========//

        wname1.setText(HomeController.wlshort.getProductName());
        wprice1.setText(Double.toString(HomeController.wlshort.getProductPrice()));
        Image wlshortImage = new Image(HomeController.wlshort.getProductImage());
        wimg1.setImage(wlshortImage);

        wname2.setText(HomeController.waskort.getProductName());
        wprice2.setText(Double.toString(HomeController.waskort.getProductPrice()));
        Image waskortImage = new Image(HomeController.waskort.getProductImage());
        wimg2.setImage(waskortImage);

        wname3.setText(HomeController.wbjacket.getProductName());
        wprice3.setText(Double.toString(HomeController.wbjacket.getProductPrice()));
        Image wbjacketImage = new Image(HomeController.wbjacket.getProductImage());
        wimg3.setImage(wbjacketImage);

        wname4.setText(HomeController.wcblazer.getProductName());
        wprice4.setText(Double.toString(HomeController.wcblazer.getProductPrice()));
        Image wcBlazerImage = new Image(HomeController.wcblazer.getProductImage());
        wimg4.setImage(wcBlazerImage);

        wname5.setText(HomeController.wptrousers.getProductName());
        wprice5.setText(Double.toString(HomeController.wptrousers.getProductPrice()));
        Image wpTrousersImage = new Image(HomeController.wptrousers.getProductImage());
        wimg5.setImage(wpTrousersImage);

        wname6.setText(HomeController.wpdress.getProductName());
        wprice6.setText(Double.toString(HomeController.wpdress.getProductPrice()));
        Image wDress = new Image(HomeController.wpdress.getProductImage());
        wimg6.setImage(wDress);

        // ========= JEANNE COLLECTION ==========//
        jname1.setText(HomeController.jpdress.getProductName());
        jprice1.setText(Double.toString(HomeController.jpdress.getProductPrice()));
        Image jpdressImage = new Image(HomeController.jpdress.getProductImage());
        jimg1.setImage(jpdressImage);

        jname2.setText(HomeController.jbodysuit.getProductName());
        jprice2.setText(Double.toString(HomeController.jbodysuit.getProductPrice()));
        Image jbodysuitImage = new Image(HomeController.jbodysuit.getProductImage());
        jimg2.setImage(jbodysuitImage);

        jname3.setText(HomeController.jsunnies.getProductName());
        jprice3.setText(Double.toString(HomeController.jsunnies.getProductPrice()));
        Image jsunniesImage = new Image(HomeController.jsunnies.getProductImage());
        jimg3.setImage(jsunniesImage);

        jname4.setText(HomeController.jsbag.getProductName());
        jprice4.setText(Double.toString(HomeController.jsbag.getProductPrice()));
        Image jsbagImage = new Image(HomeController.jsbag.getProductImage());
        jimg4.setImage(jsbagImage);

        jname5.setText(HomeController.jwskort.getProductName());
        jprice5.setText(Double.toString(HomeController.jwskort.getProductPrice()));
        Image jwskortImage = new Image(HomeController.jwskort.getProductImage());
        jimg5.setImage(jwskortImage);

        jname6.setText(HomeController.jcup.getProductName());
        jprice6.setText(Double.toString(HomeController.jcup.getProductPrice()));
        Image jcupImage = new Image(HomeController.jcup.getProductImage());
        jimg6.setImage(jcupImage);

        // ========= BIA COLLECTION ==========//
        bname1.setText(HomeController.bbskort.getProductName());
        bprice1.setText(Double.toString(HomeController.bbskort.getProductPrice()));
        Image bbskortImage = new Image(HomeController.bbskort.getProductImage());
        bimg1.setImage(bbskortImage);

        bname2.setText(HomeController.bcardigan.getProductName());
        bprice2.setText(Double.toString(HomeController.bcardigan.getProductPrice()));
        Image bcardiganImage = new Image(HomeController.bcardigan.getProductImage());
        bimg2.setImage(bcardiganImage);

        bname3.setText(HomeController.bstop.getProductName());
        bprice3.setText(Double.toString(HomeController.bstop.getProductPrice()));
        Image bstopImage = new Image(HomeController.bstop.getProductImage());
        bimg3.setImage(bstopImage);

        bname4.setText(HomeController.bsunglasses.getProductName());
        bprice4.setText(Double.toString(HomeController.bsunglasses.getProductPrice()));
        Image bsunglassesImage = new Image(HomeController.bsunglasses.getProductImage());
        bimg4.setImage(bsunglassesImage);

        bname5.setText(HomeController.bwshort.getProductName());
        bprice5.setText(Double.toString(HomeController.bwshort.getProductPrice()));
        Image bwshortImage = new Image(HomeController.bwshort.getProductImage());
        bimg5.setImage(bwshortImage);

        // ========= JUJUSTROLL HAHAHAHA ==========//
        lname1.setText(HomeController.lbpants.getProductName());
        lprice1.setText(Double.toString(HomeController.lbpants.getProductPrice()));
        Image lbPantstImage = new Image(HomeController.lbpants.getProductImage());
        limg1.setImage(lbPantstImage);

        lname2.setText(HomeController.lpshorts.getProductName());
        lprice2.setText(Double.toString(HomeController.lpshorts.getProductPrice()));
        Image lbShortsImage = new Image(HomeController.lpshorts.getProductImage());
        limg2.setImage(lbShortsImage);

        lname3.setText(HomeController.lljacket.getProductName());
        lprice3.setText(Double.toString(HomeController.lljacket.getProductPrice()));
        Image lJacketImage = new Image(HomeController.lljacket.getProductImage());
        limg3.setImage(lJacketImage);

        lname4.setText(HomeController.lglasses.getProductName());
        lprice4.setText(Double.toString(HomeController.lglasses.getProductPrice()));
        Image lGlassesImage = new Image(HomeController.lglasses.getProductImage());
        limg4.setImage(lGlassesImage);

        lname5.setText(HomeController.lvest.getProductName());
        lprice5.setText(Double.toString(HomeController.lvest.getProductPrice()));
        Image lVestImage = new Image(HomeController.lvest.getProductImage());
        limg5.setImage(lVestImage);

        // ======== NEBS COLLECTION =========//
        nname1.setText(HomeController.nktee.getProductName());
        nprice1.setText(Double.toString(HomeController.nktee.getProductPrice()));
        Image nkteeImage = new Image(HomeController.nktee.getProductImage());
        nimg1.setImage(nkteeImage);

        nname2.setText(HomeController.nshades.getProductName());
        nprice2.setText(Double.toString(HomeController.nshades.getProductPrice()));
        Image nshadesImage = new Image(HomeController.nshades.getProductImage());
        nimg2.setImage(nshadesImage);

        nname3.setText(HomeController.ntrousers.getProductName());
        nprice3.setText(Double.toString(HomeController.ntrousers.getProductPrice()));
        Image ntrousersImage = new Image(HomeController.ntrousers.getProductImage());
        nimg3.setImage(ntrousersImage);

        nname4.setText(HomeController.npshirt.getProductName());
        nprice4.setText(Double.toString(HomeController.npshirt.getProductPrice()));
        Image npshirtImage = new Image(HomeController.npshirt.getProductImage());
        nimg4.setImage(npshirtImage);

        nname5.setText(HomeController.ngsshort.getProductName());
        nprice5.setText(Double.toString(HomeController.ngsshort.getProductPrice()));
        Image ngsshortImage = new Image(HomeController.ngsshort.getProductImage());
        nimg5.setImage(ngsshortImage);

        // Set default quantities in choicebox to 1
        mchoicebox1.setValue("1");
        mchoicebox2.setValue("1");
        mchoicebox3.setValue("1");
        mchoicebox4.setValue("1");
        mchoicebox5.setValue("1");
        mchoicebox6.setValue("1");

        wchoicebox1.setValue("1");
        wchoicebox2.setValue("1");
        wchoicebox3.setValue("1");
        wchoicebox4.setValue("1");
        wchoicebox5.setValue("1");
        wchoicebox6.setValue("1");

        jchoicebox1.setValue("1");
        jchoicebox2.setValue("1");
        jchoicebox3.setValue("1");
        jchoicebox4.setValue("1");
        jchoicebox5.setValue("1");
        jchoicebox6.setValue("1");

        bchoicebox1.setValue("1");
        bchoicebox2.setValue("1");
        bchoicebox3.setValue("1");
        bchoicebox4.setValue("1");
        bchoicebox5.setValue("1");

        lchoicebox1.setValue("1");
        lchoicebox2.setValue("1");
        lchoicebox3.setValue("1");
        lchoicebox4.setValue("1");
        lchoicebox5.setValue("1");

        nchoicebox1.setValue("1");
        nchoicebox2.setValue("1");
        nchoicebox3.setValue("1");
        nchoicebox4.setValue("1");
        nchoicebox5.setValue("1");

        // Insert quantity array to choicebox
        mchoicebox1.getItems().addAll(quantity);
        mchoicebox2.getItems().addAll(quantity);
        mchoicebox3.getItems().addAll(quantity);
        mchoicebox4.getItems().addAll(quantity);
        mchoicebox5.getItems().addAll(quantity);
        mchoicebox6.getItems().addAll(quantity);

        wchoicebox1.getItems().addAll(quantity);
        wchoicebox2.getItems().addAll(quantity);
        wchoicebox3.getItems().addAll(quantity);
        wchoicebox4.getItems().addAll(quantity);
        wchoicebox5.getItems().addAll(quantity);
        wchoicebox6.getItems().addAll(quantity);

        jchoicebox1.getItems().addAll(quantity);
        jchoicebox2.getItems().addAll(quantity);
        jchoicebox3.getItems().addAll(quantity);
        jchoicebox4.getItems().addAll(quantity);
        jchoicebox5.getItems().addAll(quantity);
        jchoicebox6.getItems().addAll(quantity);

        bchoicebox1.getItems().addAll(quantity);
        bchoicebox2.getItems().addAll(quantity);
        bchoicebox3.getItems().addAll(quantity);
        bchoicebox4.getItems().addAll(quantity);
        bchoicebox5.getItems().addAll(quantity);

        lchoicebox1.getItems().addAll(quantity);
        lchoicebox2.getItems().addAll(quantity);
        lchoicebox3.getItems().addAll(quantity);
        lchoicebox4.getItems().addAll(quantity);
        lchoicebox5.getItems().addAll(quantity);

        nchoicebox1.getItems().addAll(quantity);
        nchoicebox2.getItems().addAll(quantity);
        nchoicebox3.getItems().addAll(quantity);
        nchoicebox4.getItems().addAll(quantity);
        nchoicebox5.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        mchoicebox1.setOnAction(this::computeTotal);
        mchoicebox2.setOnAction(this::computeTotal);
        mchoicebox3.setOnAction(this::computeTotal);
        mchoicebox4.setOnAction(this::computeTotal);
        mchoicebox5.setOnAction(this::computeTotal);
        mchoicebox6.setOnAction(this::computeTotal);

        wchoicebox1.setOnAction(this::computeTotal);
        wchoicebox2.setOnAction(this::computeTotal);
        wchoicebox3.setOnAction(this::computeTotal);
        wchoicebox4.setOnAction(this::computeTotal);
        wchoicebox5.setOnAction(this::computeTotal);
        wchoicebox6.setOnAction(this::computeTotal);

        jchoicebox1.setOnAction(this::computeTotal);
        jchoicebox2.setOnAction(this::computeTotal);
        jchoicebox3.setOnAction(this::computeTotal);
        jchoicebox4.setOnAction(this::computeTotal);
        jchoicebox5.setOnAction(this::computeTotal);
        jchoicebox6.setOnAction(this::computeTotal);

        bchoicebox1.setOnAction(this::computeTotal);
        bchoicebox2.setOnAction(this::computeTotal);
        bchoicebox3.setOnAction(this::computeTotal);
        bchoicebox4.setOnAction(this::computeTotal);
        bchoicebox5.setOnAction(this::computeTotal);

        lchoicebox1.setOnAction(this::computeTotal);
        lchoicebox2.setOnAction(this::computeTotal);
        lchoicebox3.setOnAction(this::computeTotal);
        lchoicebox4.setOnAction(this::computeTotal);
        lchoicebox5.setOnAction(this::computeTotal);

        nchoicebox1.setOnAction(this::computeTotal);
        nchoicebox2.setOnAction(this::computeTotal);
        nchoicebox3.setOnAction(this::computeTotal);
        nchoicebox4.setOnAction(this::computeTotal);
        nchoicebox5.setOnAction(this::computeTotal);

        clearItems();

        showItems(HomeController.cart.getItemList());

        getInitialAmount();
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double mitem1Amount = 0;
        double mitem2Amount = 0;
        double mitem3Amount = 0;
        double mitem4Amount = 0;
        double mitem5Amount = 0;
        double mitem6Amount = 0;

        double witem1Amount = 0;
        double witem2Amount = 0;
        double witem3Amount = 0;
        double witem4Amount = 0;
        double witem5Amount = 0;
        double witem6Amount = 0;

        double jitem1Amount = 0;
        double jitem2Amount = 0;
        double jitem3Amount = 0;
        double jitem4Amount = 0;
        double jitem5Amount = 0;
        double jitem6Amount = 0;

        double bitem1Amount = 0;
        double bitem2Amount = 0;
        double bitem3Amount = 0;
        double bitem4Amount = 0;
        double bitem5Amount = 0;

        double litem1Amount = 0;
        double litem2Amount = 0;
        double litem3Amount = 0;
        double litem4Amount = 0;
        double litem5Amount = 0;

        double nitem1Amount = 0;
        double nitem2Amount = 0;
        double nitem3Amount = 0;
        double nitem4Amount = 0;
        double nitem5Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // ======MEN COLLECTION======//
        if (HomeController.mclshirt.getProductStatus()) {

            double qty = Double.parseDouble(mchoicebox1.getValue());
            HomeController.mclshirt.setProductQuantity(qty);
            mitem1Amount = HomeController.mclshirt.getProductPrice() * qty;

            if (source == mchoicebox1) {
                mitem1Amount = HomeController.mclshirt.getProductPrice() * qty;
            }
        }

        if (HomeController.mcvest.getProductStatus()) {

            double qty = Double.parseDouble(mchoicebox2.getValue());
            HomeController.mcvest.setProductQuantity(qty);
            mitem2Amount = HomeController.mcvest.getProductPrice() * qty;

            if (source == mchoicebox2) {
                mitem2Amount = HomeController.mcvest.getProductPrice() * qty;
            }
        }

        if (HomeController.mkcoverup.getProductStatus()) {

            double qty = Double.parseDouble(mchoicebox3.getValue());
            HomeController.mkcoverup.setProductQuantity(qty);
            mitem3Amount = HomeController.mkcoverup.getProductPrice() * qty;

            if (source == mchoicebox3) {
                mitem3Amount = HomeController.mkcoverup.getProductPrice() * qty;
            }
        }

        if (HomeController.mdshorts.getProductStatus()) {

            double qty = Double.parseDouble(mchoicebox4.getValue());
            HomeController.mdshorts.setProductQuantity(qty);
            mitem4Amount = HomeController.mdshorts.getProductPrice() * qty;

            if (source == mchoicebox4) {
                mitem4Amount = HomeController.mdshorts.getProductPrice() * qty;
            }
        }

        if (HomeController.mkjshorts.getProductStatus()) {

            double qty = Double.parseDouble(mchoicebox5.getValue());
            HomeController.mkjshorts.setProductQuantity(qty);
            mitem5Amount = HomeController.mkjshorts.getProductPrice() * qty;

            if (source == mchoicebox5) {
                mitem5Amount = HomeController.mkjshorts.getProductPrice() * qty;
            }
        }
        if (HomeController.mcwshirt.getProductStatus()) {

            double qty = Double.parseDouble(mchoicebox6.getValue());
            HomeController.mcwshirt.setProductQuantity(qty);
            mitem6Amount = HomeController.mcwshirt.getProductPrice() * qty;

            if (source == mchoicebox6) {
                mitem6Amount = HomeController.mcwshirt.getProductPrice() * qty;
            }
        }

        if (HomeController.wlshort.getProductStatus()) {

            double qty = Double.parseDouble(wchoicebox1.getValue());
            HomeController.wlshort.setProductQuantity(qty);
            witem1Amount = HomeController.wlshort.getProductPrice() * qty;

            if (source == wchoicebox1) {
                witem1Amount = HomeController.wlshort.getProductPrice() * qty;
            }
        }
        // ======WOMEN COLLECTION======//

        if (HomeController.waskort.getProductStatus()) {

            double qty = Double.parseDouble(wchoicebox2.getValue());
            HomeController.waskort.setProductQuantity(qty);
            witem2Amount = HomeController.waskort.getProductPrice() * qty;

            if (source == wchoicebox2) {
                witem2Amount = HomeController.waskort.getProductPrice() * qty;
            }
        }

        if (HomeController.wbjacket.getProductStatus()) {

            double qty = Double.parseDouble(wchoicebox3.getValue());
            HomeController.wbjacket.setProductQuantity(qty);
            witem3Amount = HomeController.wbjacket.getProductPrice() * qty;

            if (source == wchoicebox3) {
                witem3Amount = HomeController.wbjacket.getProductPrice() * qty;
            }
        }

        if (HomeController.wcblazer.getProductStatus()) {

            double qty = Double.parseDouble(wchoicebox4.getValue());
            HomeController.wcblazer.setProductQuantity(qty);
            witem4Amount = HomeController.wcblazer.getProductPrice() * qty;

            if (source == wchoicebox4) {
                witem4Amount = HomeController.wbjacket.getProductPrice() * qty;

            }
        }

        if (HomeController.wptrousers.getProductStatus()) {

            double qty = Double.parseDouble(wchoicebox5.getValue());
            HomeController.wptrousers.setProductQuantity(qty);
            witem5Amount = HomeController.wptrousers.getProductPrice() * qty;

            if (source == wchoicebox5) {
                witem5Amount = HomeController.wptrousers.getProductPrice() * qty;

            }
        }

        if (HomeController.wpdress.getProductStatus()) {

            double qty = Double.parseDouble(wchoicebox6.getValue());
            HomeController.wpdress.setProductQuantity(qty);
            witem6Amount = HomeController.wpdress.getProductPrice() * qty;

            if (source == wchoicebox6) {
                witem6Amount = HomeController.wpdress.getProductPrice() * qty;

            }
        }

        // ======JEANNE COLLECTION======//

        if (HomeController.jpdress.getProductStatus()) {

            double qty = Double.parseDouble(jchoicebox1.getValue());
            HomeController.jpdress.setProductQuantity(qty);
            jitem1Amount = HomeController.jpdress.getProductPrice() * qty;

            if (source == wchoicebox1) {
                jitem1Amount = HomeController.jpdress.getProductPrice() * qty;

            }
        }
        if (HomeController.jbodysuit.getProductStatus()) {

            double qty = Double.parseDouble(jchoicebox2.getValue());
            HomeController.jbodysuit.setProductQuantity(qty);
            jitem2Amount = HomeController.jbodysuit.getProductPrice() * qty;

            if (source == wchoicebox2) {
                jitem2Amount = HomeController.jbodysuit.getProductPrice() * qty;
            }
        }
        if (HomeController.jsunnies.getProductStatus()) {

            double qty = Double.parseDouble(jchoicebox3.getValue());
            HomeController.jsunnies.setProductQuantity(qty);
            jitem3Amount = HomeController.jsunnies.getProductPrice() * qty;

            if (source == wchoicebox3) {
                jitem3Amount = HomeController.jsunnies.getProductPrice() * qty;
            }
        }
        if (HomeController.jsbag.getProductStatus()) {

            double qty = Double.parseDouble(jchoicebox4.getValue());
            HomeController.jsbag.setProductQuantity(qty);
            jitem4Amount = HomeController.jsbag.getProductPrice() * qty;

            if (source == wchoicebox4) {
                jitem4Amount = HomeController.jsbag.getProductPrice() * qty;
            }
        }
        if (HomeController.jwskort.getProductStatus()) {

            double qty = Double.parseDouble(jchoicebox5.getValue());
            HomeController.jwskort.setProductQuantity(qty);
            jitem5Amount = HomeController.jwskort.getProductPrice() * qty;

            if (source == wchoicebox5) {
                jitem5Amount = HomeController.jwskort.getProductPrice() * qty;
            }
        }
        if (HomeController.jcup.getProductStatus()) {

            double qty = Double.parseDouble(jchoicebox6.getValue());
            HomeController.jcup.setProductQuantity(qty);
            jitem6Amount = HomeController.jcup.getProductPrice() * qty;

            if (source == wchoicebox6) {
                jitem6Amount = HomeController.jcup.getProductPrice() * qty;
            }
        }

        // ======BIA COLLECTION======//

        if (HomeController.bbskort.getProductStatus()) {

            double qty = Double.parseDouble(bchoicebox1.getValue());
            HomeController.bbskort.setProductQuantity(qty);
            bitem1Amount = HomeController.bbskort.getProductPrice() * qty;

            if (source == bchoicebox1) {
                bitem1Amount = HomeController.bbskort.getProductPrice() * qty;
            }
        }

        if (HomeController.bcardigan.getProductStatus()) {

            double qty = Double.parseDouble(bchoicebox2.getValue());
            HomeController.bcardigan.setProductQuantity(qty);
            bitem2Amount = HomeController.bcardigan.getProductPrice() * qty;

            if (source == bchoicebox2) {
                bitem2Amount = HomeController.bcardigan.getProductPrice() * qty;
            }
        }

        if (HomeController.bstop.getProductStatus()) {

            double qty = Double.parseDouble(bchoicebox3.getValue());
            HomeController.bstop.setProductQuantity(qty);
            bitem3Amount = HomeController.bstop.getProductPrice() * qty;

            if (source == bchoicebox3) {
                bitem3Amount = HomeController.bstop.getProductPrice() * qty;
            }
        }

        if (HomeController.bsunglasses.getProductStatus()) {

            double qty = Double.parseDouble(bchoicebox4.getValue());
            HomeController.bsunglasses.setProductQuantity(qty);
            bitem4Amount = HomeController.bsunglasses.getProductPrice() * qty;

            if (source == bchoicebox4) {
                bitem4Amount = HomeController.bsunglasses.getProductPrice() * qty;
            }
        }

        if (HomeController.bwshort.getProductStatus()) {

            double qty = Double.parseDouble(bchoicebox5.getValue());
            HomeController.bwshort.setProductQuantity(qty);
            bitem5Amount = HomeController.bwshort.getProductPrice() * qty;

            if (source == bchoicebox5) {
                bitem5Amount = HomeController.bwshort.getProductPrice() * qty;
            }
        }

        // -----------

        if (HomeController.lbpants.getProductStatus()) {

            double qty = Double.parseDouble(lchoicebox1.getValue());
            HomeController.lbpants.setProductQuantity(qty);
            litem1Amount = HomeController.lbpants.getProductPrice() * qty;

            if (source == lchoicebox1) {
                litem1Amount = HomeController.lbpants.getProductPrice() * qty;
            }
        }

        if (HomeController.lpshorts.getProductStatus()) {

            double qty = Double.parseDouble(lchoicebox2.getValue());
            HomeController.lpshorts.setProductQuantity(qty);
            litem2Amount = HomeController.lpshorts.getProductPrice() * qty;

            if (source == lchoicebox2) {
                litem2Amount = HomeController.lpshorts.getProductPrice() * qty;
            }
        }

        if (HomeController.lpshorts.getProductStatus()) {

            double qty = Double.parseDouble(lchoicebox2.getValue());
            HomeController.lpshorts.setProductQuantity(qty);
            litem2Amount = HomeController.lpshorts.getProductPrice() * qty;

            if (source == lchoicebox2) {
                litem2Amount = HomeController.lpshorts.getProductPrice() * qty;

            }
        }

        if (HomeController.lljacket.getProductStatus()) {

            double qty = Double.parseDouble(lchoicebox3.getValue());
            HomeController.lljacket.setProductQuantity(qty);
            litem3Amount = HomeController.lljacket.getProductPrice() * qty;

            if (source == lchoicebox3) {
                litem3Amount = HomeController.lljacket.getProductPrice() * qty;

            }
        }

        if (HomeController.lglasses.getProductStatus()) {

            double qty = Double.parseDouble(lchoicebox4.getValue());
            HomeController.lglasses.setProductQuantity(qty);
            litem4Amount = HomeController.lglasses.getProductPrice() * qty;

            if (source == lchoicebox4) {
                litem4Amount = HomeController.lglasses.getProductPrice() * qty;

            }
        }

        if (HomeController.lvest.getProductStatus()) {

            double qty = Double.parseDouble(lchoicebox5.getValue());
            HomeController.lvest.setProductQuantity(qty);
            litem5Amount = HomeController.lvest.getProductPrice() * qty;

            if (source == lchoicebox5) {
                litem5Amount = HomeController.lvest.getProductPrice() * qty;

            }
        }

        // ====== NEBS ======//
        if (HomeController.nktee.getProductStatus()) {

            double qty = Double.parseDouble(nchoicebox1.getValue());
            HomeController.nktee.setProductQuantity(qty);
            nitem1Amount = HomeController.nktee.getProductPrice() * qty;

            if (source == nchoicebox1) {
                nitem1Amount = HomeController.nktee.getProductPrice() * qty;
            }
        }
        if (HomeController.nshades.getProductStatus()) {

            double qty = Double.parseDouble(nchoicebox2.getValue());
            HomeController.nshades.setProductQuantity(qty);
            nitem2Amount = HomeController.nshades.getProductPrice() * qty;

            if (source == nchoicebox2) {
                nitem2Amount = HomeController.nshades.getProductPrice() * qty;
            }
        }
        if (HomeController.ntrousers.getProductStatus()) {

            double qty = Double.parseDouble(nchoicebox3.getValue());
            HomeController.ntrousers.setProductQuantity(qty);
            nitem3Amount = HomeController.ntrousers.getProductPrice() * qty;

            if (source == nchoicebox3) {
                nitem3Amount = HomeController.ntrousers.getProductPrice() * qty;
            }
        }

        if (HomeController.npshirt.getProductStatus()) {

            double qty = Double.parseDouble(nchoicebox4.getValue());
            HomeController.npshirt.setProductQuantity(qty);
            nitem4Amount = HomeController.npshirt.getProductPrice() * qty;

            if (source == nchoicebox4) {
                nitem4Amount = HomeController.npshirt.getProductPrice() * qty;
            }
        }

        if (HomeController.ngsshort.getProductStatus()) {

            double qty = Double.parseDouble(nchoicebox5.getValue());
            HomeController.ngsshort.setProductQuantity(qty);
            nitem5Amount = HomeController.ngsshort.getProductPrice() * qty;

            if (source == nchoicebox5) {
                nitem5Amount = HomeController.ngsshort.getProductPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = mitem1Amount + mitem2Amount + mitem3Amount + mitem4Amount + mitem4Amount + mitem5Amount
                + mitem1Amount + witem1Amount + witem2Amount + witem3Amount + witem4Amount + witem5Amount + witem6Amount
                + jitem1Amount + jitem2Amount + jitem3Amount + jitem4Amount + jitem5Amount + jitem6Amount
                + bitem1Amount + bitem2Amount + bitem3Amount + bitem4Amount + bitem5Amount
                + litem1Amount + litem2Amount + litem3Amount + litem4Amount + litem5Amount
                + nitem1Amount + nitem2Amount + nitem3Amount + nitem4Amount + nitem5Amount;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    public void getInitialAmount() {

        double totalAmount = 0.00;
        // === men ==== //
        if (HomeController.mclshirt.getProductStatus()) {
            totalAmount += HomeController.mclshirt.getProductPrice();
        }
        if (HomeController.mcvest.getProductStatus()) {
            totalAmount += HomeController.mclshirt.getProductPrice();
        }
        if (HomeController.mkcoverup.getProductStatus()) {
            totalAmount += HomeController.mkcoverup.getProductPrice();
        }
        if (HomeController.mdshorts.getProductStatus()) {
            totalAmount += HomeController.mdshorts.getProductPrice();
        }
        if (HomeController.mkjshorts.getProductStatus()) {
            totalAmount += HomeController.mkjshorts.getProductPrice();
        }
        if (HomeController.mcwshirt.getProductStatus()) {
            totalAmount += HomeController.mcwshirt.getProductPrice();
        }

        // === women ====//
        if (HomeController.wlshort.getProductStatus()) {
            totalAmount += HomeController.wlshort.getProductPrice();
        }
        if (HomeController.waskort.getProductStatus()) {
            totalAmount += HomeController.waskort.getProductPrice();
        }
        if (HomeController.wbjacket.getProductStatus()) {
            totalAmount += HomeController.wbjacket.getProductPrice();
        }
        if (HomeController.wcblazer.getProductStatus()) {
            totalAmount += HomeController.wcblazer.getProductPrice();
        }
        if (HomeController.wptrousers.getProductStatus()) {
            totalAmount += HomeController.wptrousers.getProductPrice();
        }
        if (HomeController.wpdress.getProductStatus()) {
            totalAmount += HomeController.wpdress.getProductPrice();
        }

        // ==== jeanne ====//
        if (HomeController.jpdress.getProductStatus()) {
            totalAmount += HomeController.jpdress.getProductPrice();
        }
        if (HomeController.jbodysuit.getProductStatus()) {
            totalAmount += HomeController.jbodysuit.getProductPrice();
        }
        if (HomeController.jsunnies.getProductStatus()) {
            totalAmount += HomeController.jsunnies.getProductPrice();
        }
        if (HomeController.jsbag.getProductStatus()) {
            totalAmount += HomeController.jsbag.getProductPrice();
        }
        if (HomeController.jwskort.getProductStatus()) {
            totalAmount += HomeController.jwskort.getProductPrice();
        }
        if (HomeController.jcup.getProductStatus()) {
            totalAmount += HomeController.jcup.getProductPrice();
        }

        // ==== bia=====//
        if (HomeController.bbskort.getProductStatus()) {
            totalAmount += HomeController.bbskort.getProductPrice();
        }
        if (HomeController.bcardigan.getProductStatus()) {
            totalAmount += HomeController.bcardigan.getProductPrice();
        }
        if (HomeController.bstop.getProductStatus()) {
            totalAmount += HomeController.bstop.getProductPrice();
        }
        if (HomeController.bsunglasses.getProductStatus()) {
            totalAmount += HomeController.bsunglasses.getProductPrice();
            HomeController.bsunglasses.getProductPrice();
        }
        if (HomeController.bwshort.getProductStatus()) {
            totalAmount += BiaController.bwshort.getProductPrice();
        }
        // ======liyah=====//

        if (HomeController.lbpants.getProductStatus()) {
            totalAmount += HomeController.lbpants.getProductPrice();
        }
        if (HomeController.lpshorts.getProductStatus()) {
            totalAmount += HomeController.lpshorts.getProductPrice();
        }
        if (HomeController.lljacket.getProductStatus()) {
            totalAmount += HomeController.lljacket.getProductPrice();
        }
        if (HomeController.lglasses.getProductStatus()) {
            totalAmount += HomeController.lglasses.getProductPrice();
        }

        if (HomeController.lvest.getProductStatus()) {
            totalAmount += HomeController.lvest.getProductPrice();
        }

        // ==== nebs =====//
        if (HomeController.nktee.getProductStatus()) {
            totalAmount += HomeController.nktee.getProductPrice();
        }
        if (HomeController.nshades.getProductStatus()) {
            totalAmount += HomeController.nshades.getProductPrice();
        }
        if (HomeController.ntrousers.getProductStatus()) {
            totalAmount += HomeController.ntrousers.getProductPrice();
        }
        if (HomeController.npshirt.getProductStatus()) {
            totalAmount += HomeController.npshirt.getProductPrice();
        }
        if (HomeController.ngsshort.getProductStatus()) {
            totalAmount += HomeController.ngsshort.getProductPrice();
        }

        total.setText(Double.toString(totalAmount));
    }

    public void gotoHome(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
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

    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }

    public void clearItems() {
        myvbox.getChildren().removeAll(myvbox.getChildren());
    }

}
