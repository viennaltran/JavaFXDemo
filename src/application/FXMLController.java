package application;

import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class FXMLController implements Initializable {

    int count;

    @FXML
    Button myButton;

    @FXML
    Label myLabel;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myButton.setText("count");
        myLabel.setText("0");

    }

    @FXML
    protected void handleButtonAction(ActionEvent event) {
        count++;
        myLabel.setText("" + count);
    }
}
