package calculatormvc;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame{

    JButton oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,sevenButton,eightButton,nineButton;

    JButton clearButton,equalButton,sumButton,extractionButton,impactButton,septumButton;

    JLabel welcomeLabel;

    JTextField resultField;

    JPanel resultPanel, firstPanel, secondPanel,thirdPanel,fourthPanel;

    public CalculatorView(){
        this.setTitle("CALCULATOR");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400,400);
        this.setLayout(new FlowLayout());

        oneButton=new JButton("  1  ");
        twoButton=new JButton("  2 ");
        threeButton=new JButton("  3  ");
        fourButton=new JButton("  4  ");
        fiveButton=new JButton("  5  ");
        sixButton=new JButton("  6  ");
        sevenButton=new JButton(" 7 ");
        eightButton=new JButton("  8  ");
        nineButton=new JButton("  9  ");


        clearButton=new JButton("  CLEAR   ");
        equalButton=new JButton("   =   ");
        sumButton=new JButton(" +  ");
        extractionButton=new JButton("  -  ");
        impactButton=new JButton("  *  ");
        septumButton=new JButton("   /   ");

        welcomeLabel=new JLabel("Welcome          ");
        resultField= new JTextField(15);

        firstPanel=new JPanel();
        firstPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
        firstPanel.add(oneButton);
        firstPanel.add(twoButton);
        firstPanel.add(threeButton);
        firstPanel.add(sumButton);

        secondPanel=new JPanel();
        secondPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
        secondPanel.add(fourButton);
        secondPanel.add(fiveButton);
        secondPanel.add(sixButton);
        secondPanel.add(extractionButton);

        thirdPanel=new JPanel();
        thirdPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
        thirdPanel.add(sevenButton);
        thirdPanel.add(eightButton);
        thirdPanel.add(nineButton);
        thirdPanel.add(impactButton);

        fourthPanel=new JPanel();
        fourthPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
        fourthPanel.add(clearButton);
        fourthPanel.add(equalButton);
        fourthPanel.add(septumButton);

        resultPanel= new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        resultPanel.add(welcomeLabel);
        resultPanel.add(resultField);


        this.add(resultPanel);
        this.add(firstPanel);
        this.add(secondPanel);
        this.add(thirdPanel);
        this.add(fourthPanel);
        //this.pack();

    }

    public JButton getOneButton() {
        return oneButton;
    }

    public JButton getTwoButton() {
        return twoButton;
    }

    public JButton getThreeButton() {
        return threeButton;
    }

    public JButton getFourButton() {
        return fourButton;
    }

    public JButton getFiveButton() {
        return fiveButton;
    }

    public JButton getSixButton() {
        return sixButton;
    }

    public JButton getSevenButton() {
        return sevenButton;
    }

    public JButton getEightButton() {
        return eightButton;
    }

    public JButton getNineButton() {
        return nineButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getEqualButton() {
        return equalButton;
    }

    public JButton getSumButton() {
        return sumButton;
    }

    public JButton getExtractionButton() {
        return extractionButton;
    }

    public JButton getImpactButton() {
        return impactButton;
    }

    public JButton getSeptumButton() {
        return septumButton;
    }

    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    public JTextField getResultField() {
        return resultField;
    }
}