package calculatormvc;

import javax.swing.*;

public class StartApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalculatorView calculatorView=new CalculatorView();
                CalculatorModel calculatorModel=new CalculatorModel();

                new CalculatorController(calculatorView,calculatorModel);
            }
        });
    }
}
