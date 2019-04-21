package calculatormvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    private double number1=0;
    private double number2=0;
    String calculator="";



    public CalculatorController(CalculatorView view,CalculatorModel model){
        this.view=view;
        this.model=model;

        view.oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!calculator.equals("")){
                    view.resultField.setText("");
                }
                view.resultField.setText(view.resultField.getText()+"1");
            }
        });
        view.twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!calculator.equals("")){
                    view.resultField.setText("");
                }
                view.resultField.setText(view.resultField.getText()+"2");
            }
        });
        view.threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!calculator.equals("")){
                    view.resultField.setText("");
                }
                view.resultField.setText(view.resultField.getText()+"3");
            }
        });
        view.fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!calculator.equals("")){
                    view.resultField.setText("");
                }
                view.resultField.setText(view.resultField.getText()+"4");
            }
        });
        view.fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!calculator.equals("")){
                    view.resultField.setText("");
                }
                view.resultField.setText(view.resultField.getText()+"5");
            }
        });
        view.sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!calculator.equals("")){
                    view.resultField.setText("");
                }
                view.resultField.setText(view.resultField.getText()+"6");
            }
        });
        view.sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!calculator.equals("")){
                    view.resultField.setText("");
                }
                view.resultField.setText(view.resultField.getText()+"7");
            }
        });
        view.eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!calculator.equals("")){
                    view.resultField.setText("");
                }
                view.resultField.setText(view.resultField.getText()+"8");
            }
        });
        view.nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!calculator.equals("")){
                    view.resultField.setText("");
                }
                view.resultField.setText(view.resultField.getText()+"9");
            }
        });

        view.clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!view.resultField.getText().equals("")){
                    System.out.println(view.resultField.getText());
                    view.resultField.setText("");
                }
            }
        });
        view.equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double answer=0;
                number2=Double.parseDouble(view.resultField.getText());
                switch (calculator){
                    case "+":

                        answer=model.sum(number1,number2);
                        break;
                    case "-":
                        answer=model.extraction(number1,number2);
                        break;
                    case "*":
                        answer=model.impact(number1,number2);
                        break;
                    case "/":
                        answer=model.septum(number1,number2);
                        break;
                    default:
                        break;
                }
                view.resultField.setText(String.valueOf(answer));
                calculator="";

            }
        });
        view.sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator="+";
                number1=Double.parseDouble(view.resultField.getText());

            }
        });
        view.extractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator="-";
                number1=Double.parseDouble(view.resultField.getText());

            }
        });
        view.impactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator="*";
                number1=Double.parseDouble(view.resultField.getText());
            }
        });
        view.septumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator="/";
                number1=Double.parseDouble(view.resultField.getText());
            }
        });
    }
}