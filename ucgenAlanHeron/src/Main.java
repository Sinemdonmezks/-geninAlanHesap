import java.util.Scanner;
public class Main {
    /** @sinemdönmez */

    public static void main(String[] args) {
	Scanner girdi=new Scanner(System.in);
    double a,b,c,u,alan;
        System.out.print("1.kenarı giriniz:");
        a=girdi.nextDouble();
        System.out.print("2.kenari giriniz:");
        b= girdi.nextDouble();
        System.out.print("3.kenarı giriniz:");
    c= girdi.nextDouble();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("üçgenin alanı="+alan);
    }
}
