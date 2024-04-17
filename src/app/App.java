
package app;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Font;

public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        TextField TB1 = new TextField();
        
        TB1.setEditable(false);
        
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        Button btn7 = new Button();
        Button btn8 = new Button();
        Button btn9 = new Button();
        Button btn0 = new Button();
        Button btn00 = new Button();
        Button btnDot = new Button();
        Button btnDlt = new Button();
        Button btnDltAll = new Button();
        Button btnCalc = new Button();
        
        
        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();
        HBox h4 = new HBox();
        HBox h5 = new HBox();
        HBox h6 = new HBox();
        HBox h7 = new HBox();
        HBox h8 = new HBox();
        HBox h9 = new HBox();
        HBox h10 = new HBox();
        HBox h11 = new HBox();
        HBox h12 = new HBox();
        HBox h13 = new HBox();
        HBox h14 = new HBox();
        HBox h15 = new HBox();
        
        VBox v1 = new VBox();
        VBox v2 = new VBox();
        
        
        h2.setSpacing(12);
        h3.setSpacing(12);
        h4.setSpacing(12);
        h5.setSpacing(12);
        h6.setSpacing(12);
        h7.setSpacing(48);
        
        btn1.setText("1");
        btn1.setPrefSize(70,30);
        btn1.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue;");
        btn2.setText("2");
        btn2.setPrefSize(70,30);
        btn2.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue;");
        btn3.setText("3");
        btn3.setPrefSize(70,30);
        btn3.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue;");
        btn4.setText("4");
        btn4.setPrefSize(70,30);
        btn4.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btn5.setText("5");
        btn5.setPrefSize(70,30);
        btn5.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btn6.setText("6");
        btn6.setPrefSize(70,30);
        btn6.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btn7.setText("7");
        btn7.setPrefSize(70,30);
        btn7.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btn8.setText("8");
        btn8.setPrefSize(70,30);
        btn8.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btn9.setText("9");
        btn9.setPrefSize(70,30);
        btn9.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btn0.setText("0");
        btn0.setPrefSize(70,30);
        btn0.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btn00.setText(".00");
        btn00.setPrefSize(70,30);
        btn00.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btnDot.setText(".");
        btnDot.setPrefSize(70,30);
        btnDot.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btnDlt.setText("←");
        btnDlt.setPrefSize(111,30);
        btnDlt.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        btnDltAll.setText("|←");
        btnDltAll.setPrefSize(111,30);
        btnDltAll.setStyle("fx-text-size: 16; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-text-fill: lightblue");
        
        btnCalc.setText("Calculate");
        btnCalc.setPrefSize(234,40);
        btnCalc.setStyle("-fx-text-fill: lightblue;"
                + "fx-text-size: 20; "
                + "-fx-background-color: #4d4d4d; "
                + "-fx-border-color: white; "
                + "-fx-font-weight: bold;");
        
        Text T1 = new Text();
        btn1.setOnAction(e ->TB1.appendText("1"));
        btn2.setOnAction(e ->TB1.appendText("2"));
        btn3.setOnAction(e ->TB1.appendText("3"));
        btn4.setOnAction(e ->TB1.appendText("4"));
        btn5.setOnAction(e ->TB1.appendText("5"));
        btn6.setOnAction(e ->TB1.appendText("6"));
        btn7.setOnAction(e ->TB1.appendText("7"));
        btn8.setOnAction(e ->TB1.appendText("8"));
        btn9.setOnAction(e ->TB1.appendText("9"));
        btn0.setOnAction(e ->TB1.appendText("0"));
        btn00.setOnAction(e ->TB1.appendText(".00"));
        btnDot.setOnAction(e ->TB1.appendText("."));
        btnDlt.setOnAction(e ->TB1.deleteText(TB1.getText().length() - 1,TB1.getText().length()));
        btnDltAll.setOnAction(e ->TB1.deleteText(0,TB1.getText().length()));
        
        ToggleGroup percent = new ToggleGroup();
        
        RadioButton fifteen = new RadioButton("15%");
        fifteen.setToggleGroup(percent);
        fifteen.setTextFill(Color.LIGHTBLUE);
        RadioButton eighteen = new RadioButton("18%");
        eighteen.setTextFill(Color.LIGHTBLUE);
        eighteen.setToggleGroup(percent);
        RadioButton twenty = new RadioButton("20%");
        twenty.setTextFill(Color.LIGHTBLUE);
        twenty.setToggleGroup(percent);
        
        TB1.setStyle("-fx-background-color: #2b1b17;"
                + "-fx-border-color: white;" 
                + "-fx-text-fill: lightblue;"
                + "-fx-font-weight: bold;");
        
        TB1.setPrefHeight(40);
        TB1.setPrefWidth(234);
        TB1.setFont(Font.font("Calibri",20));
        
        Pane root = new Pane();
        root.setStyle("-fx-background-color: #4d4d4d");
        h14.setPadding(new Insets (10,10,10,10));
        h13.setPadding(new Insets (10,10,10,10));
        h12.setPadding(new Insets (10,10,10,10));
        h11.setPadding(new Insets (10,10,10,10));
        h10.setPadding(new Insets (10,10,10,10));
        h9.setPadding(new Insets (10,10,10,10));
        h8.setPadding(new Insets (10,10,10,10));
        h7.setPadding(new Insets (10,10,10,10));
        h6.setPadding(new Insets (10,10,10,10));
        h5.setPadding(new Insets (10,10,10,10));
        h4.setPadding(new Insets (10,10,10,10));
        h3.setPadding(new Insets (10,10,10,10));
        h2.setPadding(new Insets (10,10,10,10));
        h1.setPadding(new Insets (10,10,10,10));
        
       Text N1 =  new Text("The original price of your meal is:");
       N1.setStyle("-fx-text-size:16");
       N1.setFill(Color.LIGHTBLUE);
       Text N2 = new Text();
       N2.setStyle("-fx-text-size:20;"
                  +"-fx-font-weight: bold;");
       N2.setFill(Color.LIGHTBLUE);
       Text N3 = new Text("The total tip amount for your meal is:");
       N3.setStyle("-fx-text-size:16");
       N3.setFill(Color.LIGHTBLUE);
       Text N4 = new Text();
       N4.setStyle("-fx-text-size:20;"
                  +"-fx-font-weight: bold;" );
        N4.setFill(Color.LIGHTBLUE);
       Text N5 = new Text("The total price of your meal (including tip) is:");
        N5.setStyle("-fx-text-size:16");
        N5.setFill(Color.LIGHTBLUE);
       Text N6 = new Text();
       N6.setStyle("-fx-text-size:20;"
                  +"-fx-font-weight: bold;" );
        N6.setFill(Color.LIGHTBLUE);
        btnCalc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try{
                Double value = Double.parseDouble(TB1.getText(0, TB1.getText().length()));
                
                Double tip = new Double(0);
                Double total = new Double(0);
                if (fifteen.isSelected()==true){
                    tip = value * .15;
                    total = tip+value;
                    N2.setText("$"+String.format("%.2f",value));
                    N4.setText("$"+String.format("%.2f",tip));
                    N6.setText("$"+String.format("%.2f",total));}
                    else if (eighteen.isSelected()==true){
                        tip = value * .18;
                        total = tip+value;
                        N2.setText("$"+String.format("%.2f",value));
                        N4.setText("$"+String.format("%.2f",tip));
                         N6.setText("$"+String.format("%.2f",total));}
                        else{
                            tip = value * .2;
                            total = tip+value;
                            N2.setText("$"+String.format("%.2f",value));
                            N4.setText("$"+String.format("%.2f",tip));
                            N6.setText("$"+String.format("%.2f",total));
                }
            }
                catch (NumberFormatException n){
                   TB1.deleteText(0,TB1.getText().length()) ;
                   N2.setText("ERROR");
                   N2.setFill(Color.RED);
                   N2.setStyle("-fx-text-style:bold");
                }
            }
        });
        
 
       
        h1.getChildren().add(TB1);
       h14.getChildren().add(N6);
       h13.getChildren().add(N5);
       h12.getChildren().add(N4);
       h11.getChildren().add(N3);
       h10.getChildren().add(N2);
       h9.getChildren().add(N1);
       h8.getChildren().add(btnCalc);
       h7.getChildren().addAll(fifteen,eighteen,twenty);
       h6.getChildren().addAll(btnDlt,btnDltAll);
       h5.getChildren().addAll(btn00,btn0,btnDot);
       h4.getChildren().addAll(btn7,btn8,btn9);
       h2.getChildren().addAll(btn1,btn2,btn3,T1);
       h3.getChildren().addAll(btn4,btn5,btn6);
       v1.getChildren().addAll(h1,h2,h3,h4,h5,h6,h7,h8);
       v2.getChildren().addAll(h9,h10,h11,h12,h13,h14);
       h15.getChildren().addAll(v1,v2);
        root.getChildren().add(h15);
        
        Scene scene = new Scene(root, 520, 420);
        
        primaryStage.setTitle("Tip Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
