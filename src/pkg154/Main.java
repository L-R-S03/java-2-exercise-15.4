/*
 * Project: Java 2 Programming exercise 15.4
 * Name: Lauren Smith
 * Date: 1/7/2021 
 * Description: Calculator that can add, subtract, multiply and divide two numbers
 */
package pkg154;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //makes HBox to store the buttons with spacing 
        HBox buttons=new HBox(10); 
        //sets HBox positioning 
        buttons.setAlignment(Pos.CENTER); 
        //lines 23-30 make and set text for each button 
        Button btnAdd = new Button();
        btnAdd.setText("Add"); 
        Button btnSub=new Button(); 
        btnSub.setText("Subtract"); 
        Button btnMul=new Button(); 
        btnMul.setText("Multiply"); 
        Button btnDiv=new Button(); 
        btnDiv.setText("Divide"); 
        //adds all the buttons to the Hbox
        buttons.getChildren().addAll(btnAdd,btnSub,btnMul,btnDiv); 
        
        //makes an HBox for the labels and text boxes 
        HBox display=new HBox(10); 
        display.setAlignment(Pos.CENTER); 
        //makes textboxes and labels for input 
        TextField num1=new TextField(); 
        //lines 43, 45 and 50 set width of text boxes 
        num1.setPrefWidth(50); 
        TextField num2=new TextField(); 
        num2.setPrefWidth(50); 
        Label n1=new Label("Number 1: "); 
        Label n2=new Label("Number 2: "); 
        Label r=new Label("Result: "); 
        TextField result=new TextField(); 
        result.setPrefWidth(50); 
        //adds boxes to the second hbox
        display.getChildren().addAll(n1,num1,n2,num2,r,result); 
        
        //codes all the buttons 
        //code for add button 
        btnAdd.setOnAction(e-> 
        {
            //makes double variables for outcome, num1 and num2
           double outcome=0; 
           //gets num1 and num2 values by parsing text in textboxes 
           double number1=Double.parseDouble(num1.getText()); 
           double number2=Double.parseDouble(num2.getText()); 
           //gets outcome by adding the two values
           outcome=number1+number2; 
           //parses outcome double to a string to set the result text 
           result.setText(Double.toString(outcome)); 
        });
        
        //codes subtract button
        btnSub.setOnAction(e-> 
        {
          //makes double variables for outcome, num1 and num2
           double outcome=0; 
           //gets num1 and num2 values by parsing text in textboxes 
           double number1=Double.parseDouble(num1.getText()); 
           double number2=Double.parseDouble(num2.getText()); 
           //gets outcome by subtracting the two values
           outcome=number1-number2; 
           //parses outcome double to a string to set the result text 
           result.setText(Double.toString(outcome)); 
        }); 
        
        //codes multiply button  
        btnMul.setOnAction(e-> 
        {
           //makes double variables for outcome, num1 and num2
           double outcome=0; 
           //gets num1 and num2 values by parsing text in textboxes 
           double number1=Double.parseDouble(num1.getText()); 
           double number2=Double.parseDouble(num2.getText()); 
           //gets outcome by multiplying the two values
           outcome=number1*number2; 
           //parses outcome double to a string to set the result text 
           result.setText(Double.toString(outcome)); 
        }); 
        
         //codes divide button 
        btnDiv.setOnAction(e-> 
        {
           //makes double variables for outcome, num1 and num2
           double outcome=0; 
           //gets num1 and num2 values by parsing text in textboxes 
           double number1=Double.parseDouble(num1.getText()); 
           double number2=Double.parseDouble(num2.getText()); 
           //gets outcome by dividing the two values
           outcome=number1/number2; 
           //parses outcome double to a string to set the result text 
           result.setText(Double.toString(outcome)); 
           
        });

        
        //makes a v box to combine the two HBoxes with spacing between them
        VBox pane=new VBox(20); 
        //adds two hboxes to vbox
        pane.getChildren().addAll(display,buttons);
        //displays the vbox 
        Scene scene = new Scene(pane, 400, 80);        
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
