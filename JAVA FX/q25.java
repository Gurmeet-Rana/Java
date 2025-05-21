/* Design  a  JavaFX-based  movie  ticket  booking  system 
where users  can  select  a  movie,  choose  a  showtime, 
and specify the number of tickets they wish to 
purchase. 

a) The system should calculate the total cost 
based  on  the  movie  and  the  number  of 
tickets, and display it in the UI.  
(b) Users  can  confirm  their  booking  with  a 
button,  which  will  show  a  confirmation 
message.  
(c) Additionally,  a  reset  button  should  allow 
users to clear all selections and start over.  
(d) Provide an exit button to close the 
application.

*/


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class q25 {
    public static void main(String[] args) {
        Application.launch(MovieBookingApp.class, args);
    }

    public static class MovieBookingApp extends Application {
        private ComboBox<String> movieCombo;
        private ComboBox<String> showtimeCombo;
        private Spinner<Integer> ticketSpinner;
        private Label totalLabel;
        private double[] moviePrices = {200.0, 250.0, 180.0};

         
        public void start(Stage primaryStage) {
            Label movieLabel = new Label("Select Movie:");
            movieCombo = new ComboBox<>();
            movieCombo.getItems().addAll("Avengers", "Inception", "Interstellar");
            movieCombo.getSelectionModel().selectFirst();

            Label showtimeLabel = new Label("Select Showtime:");
            showtimeCombo = new ComboBox<>();
            showtimeCombo.getItems().addAll("10:00 AM", "1:00 PM", "4:00 PM", "7:00 PM");
            showtimeCombo.getSelectionModel().selectFirst();

            Label ticketLabel = new Label("Number of Tickets:");
            ticketSpinner = new Spinner<>(1, 10, 1);

            totalLabel = new Label("Total: ₹0.0");

            Button calcBtn = new Button("Calculate Total");
            calcBtn.setOnAction(e -> calculateTotal());

            Button confirmBtn = new Button("Confirm Booking");
            confirmBtn.setOnAction(e -> {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Booking Confirmed!\n" + totalLabel.getText());
                alert.setHeaderText("Success");
                alert.showAndWait();
            });

            Button resetBtn = new Button("Reset");
            resetBtn.setOnAction(e -> resetForm());

            Button exitBtn = new Button("Exit");
            exitBtn.setOnAction(e -> primaryStage.close());

            HBox movieBox = new HBox(10, movieLabel, movieCombo);
            HBox showtimeBox = new HBox(10, showtimeLabel, showtimeCombo);
            HBox ticketBox = new HBox(10, ticketLabel, ticketSpinner);
            HBox btnBox = new HBox(10, calcBtn, confirmBtn, resetBtn, exitBtn);

            VBox root = new VBox(15, movieBox, showtimeBox, ticketBox, totalLabel, btnBox);
            root.setPadding(new Insets(20));
            Scene scene = new Scene(root, 400, 250);

            primaryStage.setTitle("Movie Ticket Booking");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        private void calculateTotal() {
            int movieIndex = movieCombo.getSelectionModel().getSelectedIndex();
            int tickets = ticketSpinner.getValue();
            double total = moviePrices[movieIndex] * tickets;
            totalLabel.setText("Total: ₹" + total);
        }

        private void resetForm() {
            movieCombo.getSelectionModel().selectFirst();
            showtimeCombo.getSelectionModel().selectFirst();
            ticketSpinner.getValueFactory().setValue(1);
            totalLabel.setText("Total: ₹0.0");
        }
    }
}
