import java.util.Random;
import java.util.Scanner;
public class lottery_ticket {
    public static void main(String[] args) {
        System.out.print("Please give money: ");
        Random r = new Random();
        Scanner input=new Scanner(System.in);
        int x=100+r.nextInt(899);
        int a=x/100;//百
        int c=x%10;//个
        int b=(x-c-a*100)/10;//十
        int y=input.nextInt();
        int o=y/100;//百
        int q=y%10;//个
        int p=(y-q-100*o)/10;//十
        if(y==x){
            System.out.println("Your are winning 10000$");
        }else{
            if((a==o&&b==q&&c==p)||(a==p&&b==o&&c==q)||(a==p&&b==q&&c==o)||(a==q&&b==o&&c==p)||(a==q&&b==p&&c==o)){
                System.out.println("Your are winning 3000$");
            }else{
                if((a==o)||(a==p)||(a==q)||(b==o)||(b==p)||(b==q)||(c==o)||(c==p)||(c==q)){
                    System.out.println("Your are winning 1000$");
                }else{
                    System.out.println("Your are winning 0$");
                }
            }
        }
        input.close();
    }
}

