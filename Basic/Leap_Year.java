import java.util.*;

public class Leap_Year {
    public static void main(String[] args){
        String yn;
        do{Scanner sc = new Scanner(System.in);
            System.out.print("Enter the year you want to check: ");
            int year = sc.nextInt();

            //To check if the year is a leap year:
            if(year % 4 == 0)
            {
                if(year % 100 == 0)
                {
                    if(year % 400 == 0)
                    {
                        if(year < 2024)
                        {
                            System.out.println(year + " was a leap year");
                        } else if (year == 2024)
                        {
                            System.out.println(year + " is a leap year");
                        }
                        else{
                            System.out.println(year + " will be a leap year");
                        }
                    }else {
                        if(year < 2024)
                        {
                            System.out.println(year + " was not a leap year");
                        } else if (year == 2024)
                        {
                            System.out.println(year + " is not a leap year");
                        }
                        else{
                            System.out.println(year + " will not be a leap year");
                        }
                    }
                } else
                {
                    if(year < 2024)
                    {
                        System.out.println(year + " was a leap year");
                    } else if (year == 2024)
                    {
                        System.out.println(year + " is a leap year");
                    }
                    else{
                        System.out.println(year + " will be a leap year");
                    }
                }
            } else
            {
                if(year < 2024)
                {
                    System.out.println(year + " was not a leap year");
                } else if (year == 2024)
                {
                    System.out.println(year + " is not a leap year");
                }
                else{
                    System.out.println(year + " will not be a leap year");
                }
            }
            System.out.print("Type in YES to rerun the program or press any other key to continue: ");
            yn = sc.next().toUpperCase();
            System.out.println("\n");
        }while(yn.equals("YES"));
    }
}
