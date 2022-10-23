package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main (String [] args){

        List<Integer> numbers = Arrays.asList(10,50,70,60,55);

        numbers = numbers.stream()
                .filter(element-> element%2==0)
                .collect(Collectors.toList());
        System.out.println(numbers);

        List<String> fruits = Arrays.asList("Apple", "Mango", "Papaya", "Pineapple");

      /*  fruits = fruits.stream()
                .filter(element-> element.length()>2)
                .collect(Collectors.toList());
        System.out.println(fruits);*/

        /*List<String> fruits1 = fruits.stream()
                .filter(element-> element != null)
                .collect(Collectors.toList());
        System.out.println(fruits1);*/

        numbers.forEach(element->{
            if(element%2==0)
                System.out.print(element+" ");
        });
        System.out.println();

        List<String> fruty = new ArrayList<>();
        fruits.forEach(element->{
            fruty.add(element.toUpperCase());
            System.out.println(fruty);
        });

        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        numbers = numbers.stream()
                .filter(element-> element%2==0)
                .map(element-> element+100)
                .collect(Collectors.toList());
        System.out.println(numbers);

        numbers.stream()
                .map(element-> element+10)
                .forEach(System.out::println);
    }

}
