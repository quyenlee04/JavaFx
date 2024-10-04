package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class GiaoDien extends Application {
	private static final double HEXAGON_RADIUS = 100;
	private Polygon greenHexagon;
	private Polygon yellowHexagon;
	 private Rotate rotateGreen = new Rotate(0, 200, 200);
	    private Rotate rotateYellow = new Rotate(0, 400, 200);

	    @Override
	    public void start(Stage primaryStage) {
	        // Tạo hai hình lục giác
	        greenHexagon = createHexagon(200, 200, HEXAGON_RADIUS, Color.GREEN);
	        yellowHexagon = createHexagon(400, 200, HEXAGON_RADIUS, Color.YELLOW);

	        // Áp dụng các phép quay ban đầu
	        greenHexagon.getTransforms().add(rotateGreen);
	        yellowHexagon.getTransforms().add(rotateYellow);

	        // Tạo các nút quay trái và phải
	        Button rotateLeftBtn = new Button("Quay Trái");
	        rotateLeftBtn.setOnAction(e -> rotateLeft());

	        Button rotateRightBtn = new Button("Quay Phải");
	        rotateRightBtn.setOnAction(e -> rotateRight());

	        // Layout cho các nút
	        HBox buttonBox = new HBox(10, rotateLeftBtn, rotateRightBtn);
	        buttonBox.setAlignment(Pos.CENTER);

	        Pane pane = new Pane(greenHexagon, yellowHexagon);
	        Scene scene = new Scene(new HBox(pane, buttonBox), 600, 400);

	        primaryStage.setTitle("Hexagon Rotation");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    // Tạo hình lục giác với vị trí và màu sắc cho trước
	    private Polygon createHexagon(double centerX, double centerY, double radius, Color color) {
	        Polygon hexagon = new Polygon();
	        for (int i = 0; i < 6; i++) {
	            double angle = Math.toRadians(60 * i);
	            double x = centerX + radius * Math.cos(angle);
	            double y = centerY + radius * Math.sin(angle);
	            hexagon.getPoints().addAll(x, y);
	        }
	        hexagon.setFill(color);
	        return hexagon;
	    }

	    // Hàm quay trái
	    private void rotateLeft() {
	        rotateGreen.setAngle(rotateGreen.getAngle() - 15);
	        rotateYellow.setAngle(rotateYellow.getAngle() - 15);
	    }

	    // Hàm quay phải
	    private void rotateRight() {
	        rotateGreen.setAngle(rotateGreen.getAngle() + 15);
	        rotateYellow.setAngle(rotateYellow.getAngle() + 15);
	    }

	
}
