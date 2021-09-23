public class LeapYearOrNotALeapYear {
    public static void main(String[] args) {
        int year = 1582;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))

            System.out.println("It is a Leap Year");
        else
            System.out.println("It is not a Leap Year");
    }
}

/*
for a Leap Year Three Conditions will satisfy:
1.it is divisible by 100 and dividable by 4.
2.divisible by 400
3.a year that is evenly divisible by 100  is a leap year only if it is also evenly divisible by 400.
year % 4 == 0
1582 % 4 == 2 // condition is false;
so it is not a leap year
 */
