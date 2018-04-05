import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import java.net.URL;
import java.util.ResourceBundle;

public class LayoutController implements Initializable {

    @FXML
    Parent subLayout;
    @FXML
    SubLayoutController subLayoutController;

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initializing " + getClass().getSimpleName());

        if (location.getPath().contains("sub")) {
            System.out.println("The the layout's initialize method is being called with the sublayout's location");
        } else {

//            System.out.println("Here is the subLayout that's been injected into the LayoutController: " +
//                    subLayoutController.toString());
        }

    }
}
