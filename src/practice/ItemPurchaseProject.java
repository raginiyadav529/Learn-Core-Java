package practice;
import java.util.Scanner;

public class ItemPurchaseProject {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter How many item you would like to buy !");
        int size = sc.nextInt();
        sc.nextLine(); // Fix: consumes the leftover Enter/newline
        String []item= new String[size];

//        System.out.println("Enter your item to buy !");
        for (int i = 0; i <item.length;i++){
            System.out.println("Enter your item "+ (i+1 )+" to buy !");
            item[i] = sc.nextLine();
        }
        for (String items : item){
            System.out.println("You have bought  : "+ items);
        }
        count= item.length;
        System.out.println("You were entered to buy : "+ count+" items");

        System.out.println("Your shopping list and items : ");
        for (String items : item) {
            System.out.print(items);
        }
    }
}
