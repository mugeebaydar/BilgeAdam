package calculatormvc;

public class CalculatorModel {
    private double result;

    public double sum(double number1,double number2){
        result=number1+number2;
        return result;
    }

    public double extraction(double number1, double number2){
        if(number1>number2){
            result=number1-number2;
        }else{
            result=number2-number1;
        }
        return result;
    }

    public double impact(double number1,double number2){
        result=number1*number2;
        return result;
    }

    public double septum(double number1,double number2){
        if(number1>number2){
            result=number1/number2;
        }else{
            result=number2/number1;
        }
        return result;
    }
}