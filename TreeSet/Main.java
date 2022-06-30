import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int ch = 0;
        TreeSet<String> al= new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------------------------------------");
            System.out.println("--------Set Menu Operations------------");
            System.out.println(" 1. Add element \n 2. Remove element\n 3. Display elements\n 4. Size of the set \n 5. Clear the set \n 6. Check if it contains the element \n 7. Check if set is empty\n 8. Exit");
            System.out.println("---------------------------------------");
            System.out.println("Enter your Choice : ");
            ch = sc.nextInt();
            menu(al,ch);
        }
    }

    static void menu(TreeSet<String> treeSet, int ch)
    {
        Scanner sc = new Scanner(System.in);
        String ele = "";
        boolean check = false;
        switch(ch){
            case 1: System.out.println("---------------------------------------");
                System.out.println("Enter the element to be inserted : ");
                ele = sc.nextLine();
                treeSet.add(ele);
                break;
            case 2: System.out.println("---------------------------------------");
                System.out.println("Enter the element to be removed : ");
                ele = sc.nextLine();
                treeSet.remove(ele);
                break;
            case 3: for (String j: treeSet)
            {
                System.out.println(j);
            }
                break;
            case 4: System.out.println("The size of the set is : " + treeSet.size());
                break;
            case 5: if(treeSet.isEmpty())
            {
                System.out.println("--------set is already empty------------");
            }
            else
            {
                treeSet.clear();
                System.out.println("-----------Tree set has been cleared!--------");
            }
                break;
            case 6: System.out.println("---------------------------------------");
                System.out.println("Enter the element to be check : ");
                ele = sc.nextLine();
                check = treeSet.contains(ele);
                if (check){
                    System.out.println("Element is present in the set");
                }
                else System.out.println("Element not found!");
                break;
            case 7: check = treeSet.isEmpty();
                if (check){
                    System.out.println("Set is empty!");
                }
                else System.out.println("Set is not empty!");
                break;
            case 8: System.exit(-1);
            default: System.out.println("Invalid choice");
                System.exit(-1);
                break;
        }
    }
}