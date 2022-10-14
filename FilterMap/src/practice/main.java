package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class main {
    public static void main (String args []){

        //Filter//

        List <Integer> list1 = Arrays.asList(10,3,20,9);

        /*list1.forEach(element->{
            if(element%2==0)
            System.out.println(element);
        });*/

       /* list1=list1.stream()
                .filter(element->element%2==0)
                .collect(Collectors.toList());
        System.out.println(list1);*/

        List <String> list2 = Arrays.asList("Mango", "Apple", "Papaya");
        list2 = list2.stream()
                .filter(element-> element.length()>3)
                .collect(Collectors.toList());
        System.out.println(list2);

        List <String> list3 = Arrays.asList("Mango",null, "Apple", "Papaya");
        list3 = list3.stream()
                .filter(element-> element!=null)
                .collect(Collectors.toList());
        System.out.println(list3);

        //Map//

        List<String> list4 = Arrays.asList("Bus", "train", "truck");
        List<String> vehicle = new ArrayList();

        /* list4.forEach(element->{
            vehicle.add(element.toUpperCase());
             System.out.println(vehicle);
        });*/

        list4.stream()
                 .map(element-> element.toUpperCase())
                 .forEach(System.out::println);

        list4.stream()
                .map(element-> element.length())
                .forEach(System.out::println);

        list1.stream()
                .filter(element-> element%2==0)
                .map(element-> element+10)
                .forEach(System.out::println);







    }
}
