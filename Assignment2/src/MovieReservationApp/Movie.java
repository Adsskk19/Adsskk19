package MovieReservationApp;

import java.util.Scanner;

public class Movie{


	public static void main(String[] args) {
	        MovieApp ob = new MovieApp();

	        MovieApp[] moviename = new MovieApp[2];
	        moviename[0] = ob;
	        Theater a=new Theater();
	        moviename[1] =a;

	        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
	        System.out.println("---------1.list of movies and their prices--------- \n-------2.acces and book tickets through theaters---");

	        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	        Scanner d = new Scanner(System.in);
	        int h = d.nextInt();
	        switch (h) {
	            case 1: { 
	                ob.movies();
	                break;
	            }
	            case 2: {
	             
	               a.th();
	            }
	        }

	    }

	}