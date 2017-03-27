import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class Month extends Application {
	public enum Name {
		January, February, March, April, May, June, July, August, September, October, November, December
	}

	public void start(Stage primaryStage) {
		Name choice[] = { Name.January, Name.February, Name.March, Name.April, Name.May, Name.June, Name.July,
				Name.August, Name.September, Name.October, Name.November, Name.December };

		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		ChoiceDialog<Name> dialog = new ChoiceDialog<>(choice[0], choice[1], choice[2], choice[3], choice[4], choice[5],
				choice[6], choice[7], choice[8], choice[9], choice[10], choice[11]);
		dialog.setHeaderText("Please Select Your Preffered Month");
		dialog.setTitle("Month Selection");
		dialog.showAndWait();
		Name input = dialog.getResult();
		while (input != null) {
			switch (input) {
			case January:
			case February:
			case December:
				alert.setContentText("Do you want to build a snow man?");
				alert.showAndWait();
				break;

			case March:
			case April:
			case May:
				alert.setContentText("Happy Spring days!");
				alert.showAndWait();
				break;
			case June:
			case July:
			case August:
				alert.setContentText("It’s a summer time.");
				alert.showAndWait();
				break;

			case September:
			case October:
			case November:
				alert.setContentText("Welcome to the foliage season!");
				alert.showAndWait();
				break;

			}
			ChoiceDialog<Name> dialog2 = new ChoiceDialog<>(choice[0], choice[1], choice[2], choice[3], choice[4],
					choice[5], choice[6], choice[7], choice[8], choice[9], choice[10], choice[11]);
			dialog2.setHeaderText("Please Select Your Preffered Month");
			dialog.setTitle("Month Selection");
			dialog2.showAndWait();
			input = dialog2.getResult();
		}
	}
}
