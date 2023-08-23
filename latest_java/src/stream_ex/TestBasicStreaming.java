package stream_ex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.*;
import java.util.stream.Collector.*;
import java.util.*;

public class TestBasicStreaming {

    public static void streamDemo(){
        Stream<Integer> intStream = Stream.of(11,12,13,15);
        
        System.out.println("No.of Integer in List: "+ intStream.count());
        System.out.println("------------------------");

        //intStream.forEach(System.out::println);

        Integer[] arr = new Integer[]{16,10,58,11,20};
        intStream = Arrays.stream(arr);
        System.out.println("Square of Values :");
        intStream = intStream.map(m->m*m);

        intStream.forEach(System.out::println);

        System.out.println("Only first two element: ");
        Arrays.stream(arr).limit(2).forEach(System.out::println);

        System.out.println("Except first 2 elements:");
        Arrays.stream(arr).skip(2).forEach(System.out::println);

        List<String> stringList = Arrays.asList("Apple","Pineapple","Cherry","Orange");
        Stream<String> fruitStream = stringList.stream();

        System.out.println("String in Capital Letters: ");
        List<String> fruitList = fruitStream.map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println(fruitList);
        
        System.out.println("String in Lower Letters: ");
        fruitStream = stringList.stream();
        // List<String> fruitListLower = fruitStream.map(str->str.toLowerCase()).collect(Collectors.toList());
        // fruitListLower.forEach(System.out::println);

        fruitStream.map(str->str.toLowerCase()).forEach(System.out::println);
        System.out.println(stringList);
    }

    public static long countEmptyString(Stream<String> obj){
        long count =0;
        count = obj.filter(str->str.isEmpty()).count();
        return count;
    }

    public static long countLength(Stream<String> obj,int num){
        long number = obj.filter(str->str.length() > num).count();
        return number;       
        
    }

    public static List<String> removeEmptyString(Stream<String> obj){
        List<String> nonEmptyList = obj.filter(str->!str.isEmpty()).collect(Collectors.toList());
        return nonEmptyList;
    }


    public static List<Integer> getSquareDistinct(Stream<Integer> obj){
        List<Integer> newList = obj.distinct().map(i->i * i).collect(Collectors.toList());
        return newList;
    }

    public static void showData(Stream<Integer> obj){
        IntSummaryStatistics statObj = obj.mapToInt((i)->i).summaryStatistics();
        System.out.println("max number = "+statObj.getMax());
        System.out.println("min number = "+statObj.getMin());
        System.out.println("Avg number = "+statObj.getAverage());
        System.out.println("Sum of number = "+statObj.getSum());
    }

    public static void main(String[] args) {
        List<String> countryList = Arrays.asList("India","","UK","USA","","");
        System.out.println("Country List :"+ countryList);

        Stream<String> countryStream = countryList.stream();
        long count = TestBasicStreaming.countEmptyString(countryStream);
        System.out.println("Null Count is : "+count);

        System.out.println("Counting the length of String : ");
        count = TestBasicStreaming.countLength(countryList.stream(),3);
        System.out.println(count);

        System.out.println("List without Empty values: ");
        List<String> nonEmpty = TestBasicStreaming.removeEmptyString(countryList.stream());
        System.out.println(nonEmpty);

        System.out.println("----------------------Integer---------------------");

        List<Integer> numbers = Arrays.asList(2,3,5,2,3,6);
        Stream<Integer> intStream = numbers.stream();

        List<Integer> squareList = TestBasicStreaming.getSquareDistinct(intStream);
        System.out.println("Square are:"+ squareList);

        TestBasicStreaming.showData(numbers.stream());
    }
}
