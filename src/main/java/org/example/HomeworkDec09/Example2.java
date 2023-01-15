package org.example.HomeworkDec09;

public class Example2 {
    /*Create a program that displays a right triangle with contents of an array

    Input{1,2,3,4}
    Output:
            1
            12
            123
            1234
    Input{A,B,C,D}
    Output
            A
    AB
            ABC
    ABCD

     */
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4};
        int n = numbers.length;
        for (int i=1; i < 5; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(numbers[j]);

            }
            System.out.println();

        }
        String [] letters= {"A","B","C","D"};
        for(int i=1; i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(letters[j]);
            }
            System.out.println();
        }
    }

}