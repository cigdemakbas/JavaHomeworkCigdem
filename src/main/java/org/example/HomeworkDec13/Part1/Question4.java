package org.example.HomeworkDec13.Part1;

public class Question4 {
    /* write a method that accepts 3 parameters: 2 numbers and one operator,
	 	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;

     */
    public static void main(String[] args) {
        Question4 d= new Question4();
        d.Calculation(10,2,"*");
        d.Calculation(2,5,"*");
    }
    public void Calculation (int x, int y, String a ){
        a="*";
        int calc = x*y;
        System.out.println(calc);
    }

}
