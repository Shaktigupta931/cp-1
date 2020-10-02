import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Inte {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
      //  System.out.println("t");
        int t=s.nextInt();
        while(t!=0){
            int a=s.nextInt();
            int b=s.nextInt();
            int required=0;
            if(a==b){
                System.out.println(0);
            }
            else if(b>a){
                required=b-a;int moves=0;
                while(required>=10){
                    a=a+10;
                    moves=moves+1;
                    required=b-a;
                }
                if(required!=0){
                moves=moves+1;}
                System.out.println(moves);
            }
            else{
                required=a-b;int moves=0;
                    while (required>=10){
                        a=a-10;
                        moves=moves+1;
                        required=a-b;
                    }
                    if(required!=0){
                        moves=moves+1;}
                    System.out.println(moves);
            }
            t--;
        }

    }
}