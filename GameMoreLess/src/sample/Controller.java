package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
//import javafx.scene.input.KeyCode;
//import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import model.Handler;
import model.NegativeHandler;
import model.PositiveHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;

import java.util.Optional;

public class Controller {

    Handler chain;
    public Label rightAnswers;
    public Button number1;
    public Button number2;
    public Label falseAnswers;
    public static int SUCCESS = 1;
    public static int LOSS = 3;
    int a = (int) (5 + Math.random() * 40);
    int b = (int) (5 + Math.random() * 40);
    int c = 0;
    String convert = Integer.toBinaryString(a);
    String convert1 = Integer.toBinaryString(b);
    int convertINt = Integer.parseInt(convert);
    int convertINt1 = Integer.parseInt(convert1);
    public int count = 0;
    public int count1 = 0;

    public void initialize() {
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert1.setTitle("Примечание!");
        alert1.setHeaderText("Чтобы начать игру, нажмите кнопку ниже");
        ButtonType replay = new ButtonType("Начать", ButtonBar.ButtonData.OK_DONE);
        alert1.getButtonTypes().clear();
        alert1.getButtonTypes().addAll(replay);
        Optional<ButtonType> option = alert1.showAndWait();
        option.get();
        number1.setText(convert);
        number2.setText(convert1);
        rightAnswers.setText(String.valueOf(count));
        falseAnswers.setText(String.valueOf(count1));
        chain = new PositiveHandler(new NegativeHandler(null));

    }


    @FXML
    public Button button1;
    @FXML
    public Button button2;

    public void handle(MouseEvent mouseEvent) {

        if (convertINt1 >= convertINt) {
            count++;
            rightAnswers.setText(String.valueOf(count));
        } else {
            count1++;
            falseAnswers.setText(String.valueOf(count1));
        }
        convertINt = convertINt1;
        number1.setText(String.valueOf(convertINt));
        c = (int) (5 + Math.random() * 40);
        convert = Integer.toBinaryString(c);
        convertINt1 = Integer.parseInt(convert);
        number2.setText(String.valueOf(convertINt1));
        if (count == 10) {
            chain.process(SUCCESS);
            count = 0;
            count1 = 0;
            rightAnswers.setText(String.valueOf(count));
            falseAnswers.setText(String.valueOf(count1));
        }
        if (count1 == 6) {
            chain.process(LOSS);
            count = 0;
            count1 = 0;
            rightAnswers.setText(String.valueOf(count));
            falseAnswers.setText(String.valueOf(count1));
        }


            if (convertINt1 <= convertINt) {
                count++;
                rightAnswers.setText(String.valueOf(count));
            } else {
                count1++;
                falseAnswers.setText(String.valueOf(count1));
            }
            convertINt = convertINt1;
            number1.setText(String.valueOf(convertINt));
            convert = Integer.toBinaryString(c);
            convertINt1 = Integer.parseInt(convert);
            number2.setText(String.valueOf(convertINt1));
            if (count == 10) {
                chain.process(SUCCESS);
                count = 0;
                count1 = 0;
                rightAnswers.setText(String.valueOf(count));
                falseAnswers.setText(String.valueOf(count1));
            }
            if (count1 == 6) {
                chain.process(LOSS);
                count = 0;
                count1 = 0;
                rightAnswers.setText(String.valueOf(count));
                falseAnswers.setText(String.valueOf(count1));
            }

    }

    public void click1(ActionEvent actionEvent) {
        if (convertINt1 >= convertINt) {
            count++;
            rightAnswers.setText(String.valueOf(count));
        } else {
            count1++;
            falseAnswers.setText(String.valueOf(count1));
        }
        convertINt = convertINt1;
        number1.setText(String.valueOf(convertINt));
        c = (int) (5 + Math.random() * 40);
        convert = Integer.toBinaryString(c);
        convertINt1 = Integer.parseInt(convert);
        number2.setText(String.valueOf(convertINt1));
        if (count == 10) {
            chain.process(SUCCESS);
            count = 0;
            count1 = 0;
            rightAnswers.setText(String.valueOf(count));
            falseAnswers.setText(String.valueOf(count1));
        }
        if (count1 == 6) {
            chain.process(LOSS);
            count = 0;
            count1 = 0;
            rightAnswers.setText(String.valueOf(count));
            falseAnswers.setText(String.valueOf(count1));
        }
    }

    public void click2(ActionEvent actionEvent) {
        if (convertINt1 <= convertINt) {
            count++;
            rightAnswers.setText(String.valueOf(count));
        } else {
            count1++;
            falseAnswers.setText(String.valueOf(count1));
        }
        convertINt = convertINt1;
        number1.setText(String.valueOf(convertINt));
        convert = Integer.toBinaryString(c);
        convertINt1 = Integer.parseInt(convert);
        number2.setText(String.valueOf(convertINt1));
        if (count == 10) {
            chain.process(SUCCESS);
            count = 0;
            count1 = 0;
            rightAnswers.setText(String.valueOf(count));
            falseAnswers.setText(String.valueOf(count1));
        }
        if (count1 == 6) {
            chain.process(LOSS);
            count = 0;
            count1 = 0;
            rightAnswers.setText(String.valueOf(count));
            falseAnswers.setText(String.valueOf(count1));
        }
    }
}
