package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import alert.AlertMaker;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Product;


public class ProductViewController {

    @FXML
    private Button button1, addtoCart, cartbutton;
    @FXML
    private ImageView productImage;

    @FXML
    private Label descriptionLabel;
    @FXML
    Button nextbutton, previousbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    public void setProduct(Image image, String description) {
        productImage.setImage(image);

        descriptionLabel.setText(description);
    }

    private List<Product> items;
    private int currentIndex;

    public void setItems(List<Product> items) {
        this.items = items;
        currentIndex = 0;
    }

    public void handlePrev() {
        if (currentIndex > 0) {
            currentIndex--;
            updateProduct();
        }
    }

    public void handleNext() {
        if (currentIndex < items.size() - 1) {
            currentIndex++;
            updateProduct();
        }
    }

    public void updateProduct() {
        Product currentItem = items.get(currentIndex);

        productImage.setImage(new Image(currentItem.getProductImage()));
        descriptionLabel.setText(currentItem.getProductDescription());
    }

    public void getSize(ActionEvent event){

    }
    
    public void buy(ActionEvent event) throws IOException {
        AlertMaker.showSimpleAlert("Blahblahblah", "Item Added!");
          
         Button sourceButton = (Button) event.getSource();

        if(sourceButton.equals(addtoCart)){
            
            
        } 
    
}
    //     public void gotoCart (ActionEvent event)throws IOException {    

    //     // If  view shop button is pressed, go to home controller
    //     Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    //     FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Cart1.fxml"));
    //     Parent root = loader.load();
    //     Scene scene = new Scene(root);
    //     stage.setScene(scene);
    //     stage.show();
   
    //    }

         public void gotoCart(ActionEvent event) throws IOException {

        // Set initial total amount in checkout page
        checkoutController.getInitialAmount();

        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }






        // If addtocart button is pressed, set product status to true
        // if (sourceButton.equals(button1)) {
        //     blamp.setProductStatus(true);
        //     HomeController.blamp.setProductQuantity(1);
        //     checkoutController.addItem(checkoutController.pane1);
        // }
    
      
     
      
    
}