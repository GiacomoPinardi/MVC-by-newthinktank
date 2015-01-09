
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giacomo
 */
public class CalculatorView extends JFrame{
    
    private JTextField firstNumber  = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);
	     
    CalculatorView(){

        // Sets up the view and adds the components

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);

        // End of setting up the components --------

    }

    public int getFirstNumber(){

        return Integer.parseInt(firstNumber.getText());

    }

    public int getSecondNumber(){

        return Integer.parseInt(secondNumber.getText());

    }

    public int getCalcSolution(){

        return Integer.parseInt(calcSolution.getText());

    }

    public void setCalcSolution(int solution){

        calcSolution.setText(Integer.toString(solution));

    }

    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed

    public void addCalculateListener(ActionListener listenForCalcButton){

        calculateButton.addActionListener(listenForCalcButton);

    }

    // Open a popup that contains the error message passed

    public void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }
    
}
