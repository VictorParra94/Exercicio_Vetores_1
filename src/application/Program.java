package application;

import entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rooms[] rent = new Rooms[10];

        System.out.print("How many rooms will be rented? = ");
        int rented = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=rented; i++){
            System.out.println("Rent #" + i);
            System.out.print("Name = ");
            String name = sc.nextLine();
            System.out.print("Email = ");
            String email = sc.nextLine();
            System.out.print("Room = ");
            int room = sc.nextInt();
            sc.nextLine();
            rent[room] = new Rooms(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i=0; i<10; i++){
            if (rent[i] != null){
                System.out.println(i + ": " + rent[i]);
            }
        }

    }
}

