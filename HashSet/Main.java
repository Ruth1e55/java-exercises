import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        int ch = 0;
        Set<String> hash_Set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------------------------------------");
            System.out.println("--------Set Menu Operations------------");
            System.out.println(" 1. Add element \n 2. Remove element\n 3. Display elements\n 4. Size of the set \n 5. Clear the set \n 6. Check if it contains the element \n 7. Check if set is empty\n 8. Exit");
            System.out.println("---------------------------------------");
            System.out.println("Enter your Choice : ");
            ch = sc.nextInt();
            menu(hash_Set,ch);
        }
    }

    static void menu(Set<String> hash_Set, int ch)
    {
        Scanner sc = new Scanner(System.in);
        String ele = "";
        boolean check = false;
        switch(ch){
            case 1: System.out.println("---------------------------------------");
                System.out.println("Enter the element to be inserted : ");
                ele = sc.nextLine();
                hash_Set.add(ele);
                break;
            case 2: System.out.println("---------------------------------------");
                System.out.println("Enter the element to be removed : ");
                ele = sc.nextLine();
                hash_Set.remove(ele);
                break;
            case 3: for (String j: hash_Set)
            {
                System.out.println(j);
            }
                break;
            case 4: System.out.println("The size of the set is : " + hash_Set.size());
                break;
            case 5: if(hash_Set.isEmpty())
            {
                System.out.println("--------set is already empty------------");
            }
            else
            {
                hash_Set.clear();
                System.out.println("-----------Hash set has been cleared!--------");
            }
                break;
            case 6: System.out.println("---------------------------------------");
                System.out.println("Enter the element to be check : ");
                ele = sc.nextLine();
                check = hash_Set.contains(ele);
                if (check){
                    System.out.println("Element is present in the set");
                }
                else System.out.println("Element not found!");
                break;
            case 7: check = hash_Set.isEmpty();
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