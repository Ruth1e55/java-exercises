import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int ch = 0;
        String str = "";
        int ind = 0;
        List<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("-------------------Menu-------------------");
            System.out.println(" 1. Add element. \n 2. Get element. \n 3. Set element.\n 4. Remove Indexed element. \n 5. Length. \n 6. Clear the list. \n 7. Display the elements \n 8. Press 8 to exit");
            System.out.println("------------------------------------------");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            menu(arr,ch);
        }
    }
    static void menu(ArrayList<String> arr,int ch)
    {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int ind = 0;

        switch(ch)
        {
            case 1 :
                System.out.println("Enter the element : ");
                str = sc.nextLine();
                arr.add(str);
                break;

            case 2 :
                System.out.println("Enter the Index of the element : ");
                ind = sc.nextInt();
                arr.get(ind);
                break;

            case 3 :
                System.out.println("Enter the index : ");
                ind = sc.nextInt();
                System.out.println("Enter the element : ");
                str = sc.nextLine();
                arr.set(ind,str);
                break;

            case 4 :
                System.out.println("Enter the index of the element to be removed : ");
                ind = sc.nextInt();
                break;

            case 5 :
                int size = arr.size();
                System.out.println("The length of the array : " + size);
                break;

            case 6 :
                arr.clear();
                System.out.println("-------------------Array is cleared and empty----------------");
                break;

            case 7 :
                System.out.println("------------------------------------------");
                System.out.println("The elements of the array are : ");
                for (String ele: arr) {
                    System.out.println(ele);
                }
                break;
            case 8 :
                System.out.println("-----------------EXITING----------------");
                System.exit(-1);

            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}