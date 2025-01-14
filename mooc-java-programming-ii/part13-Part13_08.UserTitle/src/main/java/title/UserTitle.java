package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

public class UserTitle extends Application {

    public void start(Stage stage) {
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        
        stage.setTitle(title);
        stage.show();
    }
}
