package Ali.aastudy.SwitchStatement;

import java.util.ArrayList;
import java.util.Scanner;

public class switchStatement {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<>();

        int counter = 0;
        while(scan.hasNext()){

            a.add(scan.nextLine());
            counter++;
            if(counter==10){

                break;
            }

        }

        System.out.println(a);
/*
        Create Scanner then int number whichMonth

                   if the number is 1
                   print month is January

                   if the number is 2
                   print month is February

                   if the number is 3
                   print month is March

                   if the number is 4
                   print month is April

                   if the number is 5
                   print month is May

                   if the number is 6
                   print month is June

 */



            Scanner sca = new Scanner(System.in);

//        int num=sca.nextInt();
//
//        switch(num)
//        {
//            case 1:
//                System.out.println("Month is January");
//                break;
//            case 2:
//                System.out.println("Month is February");
//                break;
//            case 3:
//                System.out.println("Month is March");
//                break;
//            case 4:
//                System.out.println("Month is April");
//                break;
//            case 5:
//                System.out.println("Month is May");
//
//            case 6:
//                System.out.println("Month is June");
//
//            default:
//                System.out.println("Number is not valid ");
//        }



    /*
            TASK 2
       char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
     */


    /*      TASK 3
        Number of sibling

                Create one number enter how many siblings do you have

                if the number 0
                print you dont have any sibling
                if the number 1
                print you have one sibling
                if the number 2
                print you have 2 sibling
                if the number 3
                print you have three sibling

                else
                print you have a lot of siblings

                DO THIS TASK WITH SWITCH STATEMENT

    */
//          TASK 3
//        int num=sca.nextInt();
//        switch(num) {
//            case 0:
//                System.out.println("you dont have any sibling");
//                break;
//            case 1:
//                System.out.println("you have one sibling");
//                break;
//            case 2:
//                System.out.println("you have 2 sibling");
//                break;
//            case 3:
//                System.out.println("you have three sibling");
//                break;
//            default:
//                System.out.println("you have a lot of siblings");
//        }


/*
            TASK 4

               Create byte age
               if the age is 1
               print you can crawl

               if the age is 2
               print you can talk

               if the age is 3
               print you can walk

               if the age is 4
               print you should have some vaccines

               if the age is 5
               print you can start reading

               else go to school

               DO THIS WITH SWITCH STATEMENT

*/

/*

        Create one String whereYouLive

            if where you live is equals to "US"

            print you live in United States

            if where you live is equals to "BEL"

            print you live in Belgium

            if where you live is equals to "CAN"

            print you live in Canada

            if where you live is equals to "DEU"

            print you live in Germany

         */

    switch("de"){
        case "de":
            System.out.println("sadsa");
    }


    }

}
