package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String noun;
        String verb;
        String adjective;
        String adverb;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        noun = sc.nextLine();

        System.out.print("Enter a verb: ");
        verb = sc.nextLine();

        System.out.print("Enter an adjective: ");
        adjective = sc.nextLine();

        System.out.print("Enter an adverb: ");
        adverb = sc.nextLine();

        System.out.println("Did you " + verb + " the " + adjective + " " + noun + " " + adverb);
    }
}
