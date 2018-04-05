import io.datafx.controller.flow.Flow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FlowLauncher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Flow flow = new Flow(LayoutController.class);
        flow.startInStage(primaryStage);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
