import java.util.Scanner;

public class Main {


    static  boolean isAsal(int x,int sayac){
        if (sayac==x){
            System.out.println(x+ " sayısı asaldır.");
            return true;

        } else if (x%sayac==0) {
            System.out.println(x+ " sayısı asal değildir");
            return false;

        }
        return isAsal(x,sayac+1);
        }

    public static void main(String[] args) {
        System.out.println(isAsal(9,2));

    }}