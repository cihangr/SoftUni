package ConditionalStatementsAndLoops;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program that emulates typing an SMS, following this guide:
1 -
2 - abc
3 - def
4 - ghi
5 - jkl
6 - mno
7 - pqrs
8 - tuv
9 - wxyz
0 - space

 */
public class Messages {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        for (int i=0; i<N; i++){
            int lastdigit,index, offset, offset2, digitnumber=0;
            int number = Integer.parseInt(inp.nextLine());
            if (number==0){
                System.out.print(" ");
                continue;
            }
            lastdigit = number%10;
            offset = (lastdigit-2)*3;
            offset2 = (lastdigit-2)*3+1;
            while (number!=0){
                int last=number%10;
                number-=last;
                number/=10;
                digitnumber++;
            }
            if (lastdigit==8 || lastdigit==9){
                index=(offset2+digitnumber)-1;
            } else {
                index=(offset+digitnumber)-1;
            }
            System.out.print((char)(index+97));
        }
    }
}
