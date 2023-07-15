import java.util.*;
import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
int totalRounds=3;
int score=0;
for(int j=1;j<=totalRounds;j++)
{
System.out.println("Round="+j);
int attempts=0;
while(attempts<5)
{
int i=sc.nextInt();
Random ran = new Random();
int num = ran.nextInt(100);
System.out.println("Random number between 0 and 100: " + num);
if(i>num){
System.out.println("Number is Greater than RandomNumber");
score--;
    }
else if(i<num) {
System.out.println("Number is Lesser than RandomNumber");
score--;
    }
else {
System.out.println("Number Matches the RandomNumber");
score++;
break;
}
attempts++;
}
System.out.println("Score="+score);
System.out.println("Points="+ attempts);
}
}
}
