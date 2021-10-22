import java.util.Scanner;
public class IBSN_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String data=input.next();
        int len=data.length();
        int sum=0;
        for(int i=0;i<len;++i){
            sum+=(data.charAt(i)-'0')*(i+1);
        }
        sum=sum%11;
        System.out.print("The ISBN - 10 number is "+data);
        if(sum==10){
            System.out.print("x");
        }else{
            System.out.println(sum);
        }
        input.close();
    }
    
}

