
import java.util.*;

public class Menu extends Product{

    public Menu(){
        super();

    }

    public Menu(int id, String name, String description,String category,String brand,double price,int amountStock){
        super(id, name, description,category,brand,price,amountStock);
    }

    boolean exit;

    public void runMenu(){
        printHeader();
        while(!exit){
            printMenu();
            int option = getInput();
            performAction(option);

        }

    }

    private void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|    Welcome to E-Commerce Site    |");
        System.out.println("+-----------------------------------+");
        System.out.println("\n");
    }

    private void printMenu() {
        System.out.println("Please make a selection");
        System.out.println("1) Select 1 ");
        System.out.println("2) Select 2 ");
        System.out.println("3) Select 3 ");
        System.out.println("4) Select 4 ");
        System.out.println("5) Select 5 ");
        System.out.println("6) Select 6 ");
        System.out.println("7) Select 7 ");
        System.out.println("8) Select 8 ");
    }
    private int getInput(){
        Scanner sc = new Scanner(System.in);
        int option = -1;
        while (option < 0 || option >=8){
            try{
                System.out.println("\nEnter your choice: ");
                option = Integer.parseInt(sc.nextLine());
                //option = sc.nextInt();

            }catch(NumberFormatException e){
                System.out.println("NumberFormatException"+e);
            }

        }
        return option;

    }

    private void performAction(int option){
        switch (option){

            case 1:


                break;

            case 2:
                exit = true;
                System.out.println("Thank you for using our application");
                break;

            default: System.out.println("An unknown error has occured");
        }

    }
}
