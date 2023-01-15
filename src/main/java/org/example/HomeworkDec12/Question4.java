package org.example.HomeworkDec12;

public class Question4 {
    /* Write a method to filter the customers with customer ID last two digits ending
    with 25 to 99. Ending with 0-24 are eligible for promotion, others are not. Your method
    should return like "Customer (customer ID = XXXXXX) is not eligible
     for promotion" or "Customer (customer ID = XXXXXX) is eligible for promotion"
     */
    public void Promotion(){
        int customerId = 2301;
        int lastDigit=customerId/100;
        if(lastDigit<25 && lastDigit>0){
            System.out.println("Customer "+ "(customer ID ="+ customerId +")"+"is eligible for promotion");
        }else if (lastDigit>24 && lastDigit<100){
            System.out.println("Customer "+ "(customer ID ="+ customerId +")"+"is not eligible for promotion");
        }

    }

    public static void main(String[] args) {
        Question4 a = new Question4();
        a.Promotion();
    }

}
