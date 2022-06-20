import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String [] args) throws IOException {

        Menu m = new Menu();
        m.runMenu();

        ArrayList<Product> product = new ArrayList<Product> ();

        Product p1 = new Product(1,"Nokia C30","Nokia C30 SmartPhone","Mobile","Nokia",2500.00,23);
        Product p2 = new Product(2,"Samsung Galaxy","Samsung Galaxy SmartPhone","Mobile","Samsung",2000.00,14);
        Product p3 = new Product(3,"Nokia C30","Nokia C30 SmartPhone","Mobile","Nokia",2500.00,23);

        product.add(p1);
        product.add(p2);
        product.add(p3);


        //Write
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
            //writer.write (String.valueOf(p1.display()));
            for (Product products: product
                 ) {
                writer.write (String.valueOf(products.display()+"\n"));
            }
            writer.close();

        }catch (IOException e){
            System.out.print(e+"IO Exception Write");
        }

        //Read
        try{

            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));

            String line ;
            while ((line = reader.readLine())!=null){
                System.out.println(line);
    
            }

            reader.close();

        }catch (IOException e){
            System.out.print(e+"IO Exception Read");
        }

    }

}

