import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Colors {
    public static void main(String[] args)
    {
        ArrayList<String> colorsList = new ArrayList(Arrays.asList("red", "green", "blue", "yellow"));
        System.out.println(colorsList);
        contains(colorsList);

    }

    private static void contains(ArrayList<String> colorsList)
    {
        Scanner sc = new Scanner(System.in);
        String element = sc.next();
        System.out.println("enter the element you want to search " + element);
        System.out.println("The boolean value for the element in the list is :" + colorsList.contains(element));

    }

}