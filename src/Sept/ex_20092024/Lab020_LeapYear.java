package Sept.ex_20092024;

public class Lab020_LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean flag = false;
        if (year%4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    flag = true;
                else
                    flag = false;
            } else
                flag = true;
        }
        else
            flag=false;

        if(flag)
            System.out.println(year + " is a Leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
