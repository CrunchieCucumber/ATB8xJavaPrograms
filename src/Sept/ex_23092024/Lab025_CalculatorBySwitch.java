package Sept.ex_23092024;

public class Lab025_CalculatorBySwitch {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        switch("Prod"){
            case "Sum":
                System.out.println(num1+num2);
                break;
            case "Diff":
                System.out.println(num1-num2);
                break;
            case "Prod":
                System.out.println(num1*num2);
                break;
            case "Divs":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
