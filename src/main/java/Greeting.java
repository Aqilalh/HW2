import java.util.Scanner;
public class Greeting {
    //public static void String personName(String name) {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("whats your name");
        String name = scan.nextLine();
        System.out.println(name);
        if (name.equalsIgnoreCase("Alcia") || name.equalsIgnoreCase("Bob")) {
            System.out.println("hello welcome " + name);
        } else{
            System.out.println("hello your not welcome");
        }
    }


        //   Hello names = new Hello();
       // System.out.println(names.helloName("Bob"));
        /* I need an if statment that when I did sout */
        }

