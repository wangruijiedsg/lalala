import java.util.Random;
public class Ëæ»úÔÂ·Ý {
	public static void main(String[] args) {
		Random r = new Random();
        int x=r.nextInt(12);
        x=x+1;
        switch (x){
            case 1:
                System.out.println(x+" January");
                break;
            case 2:
                System.out.println(x+" February");
                break;
            case 3:
                System.out.println(x+" March");
                break;
            case 4:
                System.out.println(x+" April");
                break;
            case 5:
                System.out.println(x+" May");
                break;
            case 6:
                System.out.println(x+" June");
                break;
            case 7:
                System.out.println(x+" July");
                break;
            case 8:
                System.out.println(x+" August");
                break;
            case 9:
                System.out.println(x+" September");
                break;
            case 10:
                System.out.println(x+" October");
                break;
            case 11:
                System.out.println(x+" November");
                break;
            case 12:
                System.out.println(x+" December");
                break;
	}
}
}