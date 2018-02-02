/** DAVID PRAISE CHUKWUMA KALU **/

class Calculator {

    public static int array [] = new int[10];
    public static int counter = 0;
    int value;

    public Calculator(){
        counter += 1;
    }

    public Calculator(int value){
        this.value = value;
        counter += 1;
    }

    public static Calculator ADD(int value){
        Calculator calculator = new Calculator();
        array[counter] = value;
        return calculator;
    }

    public static Calculator SUBTRACTION(int value){
        Calculator calculator = new Calculator();
        array[counter] = (-value);
        return calculator;
    }

    public static int value(){
        int count = 0;
        for (int i =0; i < array.length; i++) {
            count += array[i];
        }
        return count;
    }

    public static void main(String [] args){
        Calculator cal = new Calculator();
        System.out.println("The answer is : "+cal.ADD(5).ADD(5).SUBTRACTION(5).value());
    }
}
