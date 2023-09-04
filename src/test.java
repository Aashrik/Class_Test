import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String your_username = "2";
        String your_password = "1";
        System.out.println("Enter your Username");
        String username = sn.nextLine();
        System.out.println("Enter your password");
        String password = sn.nextLine();
        if (username.equals(your_username) && password.equals(your_password)) {
            System.out.println("You Have Successfully Logged in");
        }else {
            System.out.println("Please Enter Valid Username and Password");
            return;
        }

        int choice=0;

        System.out.println("1) Greatest Number between three Number ");
        System.out.println("2) Calculator");
        System.out.println("3) Result Calculator With 3 Grades");
        System.out.println("4) Guessing game");
//        guess=sn.nextInt();
        System.out.println("Enter number according to your choice ");
        choice=sn.nextInt();

        if (choice==1){
            int num1,num2,num3;
            System.out.println("Enter First number ");
            num1=sn.nextInt();
            System.out.println("Enter Second number ");
            num2=sn.nextInt();
            System.out.println("Enter Third number ");
            num3=sn.nextInt();
            if(num1>num2 && num1>num3){
                System.out.println("The Greatest Number is "+num1);
            } else if (num2>num1 && num2>num3) {
                System.out.println("The greatest number is "+num2);
            }else {
                System.out.println("The Greatest NUmber is "+num3);
            }
        } else if (choice==2) {
            System.out.println("Enter the operator you want ");
            String choicce = sn.next();
            System.out.println("Enter the First Number ");
            int first_number = sn.nextInt();
            System.out.println("Enter Second Number  ");
            int second_number = sn.nextInt();
            switch (choicce) {
                case "+":
                    System.out.println("Your answer is " + (first_number + second_number));
                    break;
                case "-":
                    System.out.println("Your answer is " + (first_number - second_number));

                case "*":
                    System.out.println("Your answer is " + (first_number * second_number));
                    break;


            }
        }    else if (choice==3) {
             System.out.print("Enter marks of Maths: ");
            float maths = sn.nextFloat();

            System.out.print("Enter marks of Physics: ");
            float physics = sn.nextFloat();

            System.out.print("Enter marks of Nepali: ");
            float nepali = sn.nextFloat();

            if (maths < 0 || physics < 0 || nepali < 0) {
                System.out.println("Marks should not be negative.");
                return;

            }

            float percent = ((maths + physics + nepali) / 300) * 100;
            float gpa = (percent / 100) * 4;
            System.out.println("GPA: " + gpa);

            if (maths < 27 || physics < 27 || nepali < 27) {
                System.out.println("NG");
            } else if (percent >= 90 && percent<=100) {
                System.out.println("A+");
            } else if (percent >= 80 && percent<90) {
                System.out.println("A");
            } else if (percent >= 70 && percent<80) {
                System.out.println("B+");
            } else if (percent >= 60 && percent<70) {
                System.out.println("B");
            } else if (percent >= 50 && percent<60) {
                System.out.println("C+");
            } else if (percent >= 40 && percent<50) {
                System.out.println("C");
            } else if (percent >= 27&& percent<40) {
                System.out.println("D+");
            } else {
                System.out.println("NG");
            }

        } else if (choice==4) {
            int Guess;
            int number = (int)(1* Math.random());
            System.out.println("Enter A Number");
            Guess= sn.nextInt();
            if(number==Guess){
                System.out.println("Your Guess IS correct");
            }else {
                System.out.println("Your Guess is incorrect");
            }

        }

    }


}
