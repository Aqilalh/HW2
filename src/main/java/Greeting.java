import java.util.Scanner;
public class Greeting {
    //public static void String personName(String name) {
    public static void main (String[]args) {
        //https://www.youtube.com/watch?v=bI7kQq9cjmQ
        // create a scanner method
        Scanner scan = new Scanner(System.in);
        System.out.println("whats your name");
        String name = scan.nextLine();
        System.out.println(name);
        System.out.println("whats your name");
        name = scan.nextLine();
        // you need a if stament that prints out hello alice ore Bob only and anybody else print out not welcome
        //for (int i = 0; i < name.length(); i++) {
          while(true){
            if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
                System.out.println("hello welcome " + name);

            } else {
                System.out.println("whats your name");
                System.out.println(name = scan.nextLine());
            }
break;
        }

    }
        //   Hello names = new Hello();
       // System.out.println(names.helloName("Bob"));
        /* I need an if statment that when I did sout */
        }

