package com.starwars;

import com.cfs.bot.Bot;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StarWarsBot extends Bot {

    private static ArrayList<String> resources = new ArrayList<>();

    public StarWarsBot(){
        Scanner sc = new Scanner(System.in);

        resources.add("films");
        resources.add("people");
        resources.add("planets");
        resources.add("species");
        resources.add("starships");
        resources.add("vehicles");

        String input = getResource(sc);

        switch(input){
            case "films":
                sc.nextLine();
                films(sc);
                break;

            case "people":
                sc.nextLine();
                people(sc);
                break;

            case "planets":
                sc.nextLine();
                planets(sc);
                break;

            case "species":
                sc.nextLine();
                species(sc);
                break;

            case "starships":
                sc.nextLine();
                starships(sc);
                break;

            case "vehicles":
                vehicles(sc);
                break;
        }
    }

    private static String getResource(Scanner sc){
        while(true){
            System.out.println("Enter a resource. " + resources);
            String input = sc.next().toLowerCase();
            for(String str : resources){
                if(str.equals(input)){
                    return input;
                }
            }
            sc.nextLine();
            System.out.println("That isn't an option.");
        }
    }

    private static void people(Scanner sc){
        System.out.println("ID or search?");
        sc.nextLine();
        String input = sc.nextLine();
        Person person = null;
        if(input.trim().equalsIgnoreCase("ID")){
            System.out.println("Enter the id");
            try {
                person = new Person(sc.nextInt(), false);
            } catch(InputMismatchException e){
                e.printStackTrace();
            }
        } else if(input.trim().equalsIgnoreCase("search")){
            System.out.println("Enter the search");
            person = new Person(sc.nextLine().split(" "));
        } else {
            System.out.println("That was not an option.");
            people(sc);
        }
        System.out.println(person);
    }

    private static void films(Scanner sc){
        System.out.println("ID or search?");
        String input = sc.nextLine();
        Instance film = null;
        if(input.trim().equalsIgnoreCase("ID")){
            System.out.println("Enter the id");
            try {
                film = new Film(sc.nextInt(), false);
            } catch(InputMismatchException e){
                e.printStackTrace();
            }
        } else if(input.trim().equalsIgnoreCase("search")){
            System.out.println("Enter the search");
            film = new Film(sc.nextLine().split(" "));
        } else {
            System.out.println("That was not an option.");

            films(sc);
        }
        System.out.println(film);
    }

    private static void planets(Scanner sc){
        System.out.println("ID or search?");
        sc.nextLine();
        String input = sc.nextLine();
        Instance planet = null;
        if(input.trim().equalsIgnoreCase("ID")){
            System.out.println("Enter the id");
            try {
                planet = new Planet(sc.nextInt(), false);
            } catch(InputMismatchException e){
                e.printStackTrace();
            }
        } else if(input.trim().equalsIgnoreCase("search")){
            System.out.println("Enter the search");
            planet = new Planet(sc.nextLine().split(" "));
        } else {
            System.out.println("That was not an option.");
            planets(sc);
        }
        System.out.println(planet);
    }

    private static void species(Scanner sc){
        System.out.println("ID or search?");
        sc.nextLine();
        String input = sc.nextLine();
        Instance species = null;
        if(input.trim().equalsIgnoreCase("ID")){
            System.out.println("Enter the id");
            try {
                species = new Species(sc.nextInt(), false);
            } catch(InputMismatchException e){
                e.printStackTrace();
            }
        } else if(input.trim().equalsIgnoreCase("search")){
            System.out.println("Enter the search");
            species = new Species(sc.nextLine().split(" "));
        } else {
            System.out.println("That was not an option.");
            species(sc);
        }

        System.out.println(species);
    }

    private static void starships(Scanner sc){
        System.out.println("ID or search?");
        sc.nextLine();
        String input = sc.nextLine();
        Instance starship = null;
        if(input.trim().equalsIgnoreCase("ID")){
            System.out.println("Enter the id");
            try {
                starship = new Starship(sc.nextInt(), false);
            } catch(InputMismatchException e){
                e.printStackTrace();
            }
        } else if(input.trim().equalsIgnoreCase("search")){
            System.out.println("Enter the search");
            starship = new Starship(sc.nextLine().split(" "));
        } else {
            System.out.println("That was not an option.");
            starships(sc);
        }

        System.out.println(starship);
    }

    private static void vehicles(Scanner sc){
        System.out.println("ID or search?");
        sc.nextLine();
        String input = sc.nextLine();
        Instance vehicle = null;
        if(input.trim().equalsIgnoreCase("ID")){
            System.out.println("Enter the id");
            try {
                vehicle = new Vehicle(sc.nextInt(), false);
            } catch(InputMismatchException e){
                e.printStackTrace();
            }
        } else if(input.trim().equalsIgnoreCase("search")){
            System.out.println("Enter the search");
            vehicle = new Vehicle(sc.nextLine().split(" "));
        } else {
            System.out.println("That was not an option.");
            vehicles(sc);
        }

        System.out.println(vehicle);
    }

}
