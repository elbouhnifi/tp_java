package TP2;

import java.util.Scanner;

public class exercice1 {
	
	
		  public static void main(String[] args) {
			  Scanner scanner = new Scanner(System.in);
          //methode 1:
			  
			  
		       /* System.out.print("Entrez le nombre N SVP: ");
		        int N = scanner.nextInt();

		        int somme = 0;
		        int produit = 1;
		        int nombre;
		        int compteur = 0;

		        System.out.println("Entrez " + N + " nombres entiers SVP: ");
		        while (compteur < N) {
		            nombre = scanner.nextInt();
		            somme += nombre;
		            produit *= nombre;
		            compteur++;
		        }

		        double moyenne = (double) somme / N;

		        System.out.println("Somme : " + somme);
		        System.out.println("Produit : " + produit);
		        System.out.println("Moyenne : " + moyenne);*/
			  
			 //methode 2:
			  
			  
			   /*System.out.print("Entrez le nombre N SVP : ");
			     int N = scanner.nextInt();

			  		int somme = 0;
			  		 int produit = 1;
			  		  int nombre;
			  		  int compteur = 0;

		    System.out.println("Entrez " + N + " nombres entiers SVP : ");
			  		        do {
			  		            nombre = scanner.nextInt();
			  		            somme += nombre;
			  		            produit *= nombre;
			  		            compteur++;
			  		        } while (compteur < N);

			  		        double moyenne = (double) somme / N;

			  		        System.out.println("Somme : " + somme);
			  		        System.out.println("Produit : " + produit);
			  		        System.out.println("Moyenne : " + moyenne);*/
			 //methode3:
			  
			  		        System.out.print("Entrez le nombre N SVP : ");
			  		        int N = scanner.nextInt();

			  		        int somme = 0;
			  		        int produit = 1;

			  		        System.out.println("Entrez " + N + " nombres entiers SVP : ");
			  		        for (int i = 0; i < N; i++) {
			  		            int nombre = scanner.nextInt();
			  		            somme += nombre;
			  		            produit *= nombre;
			  		        }

			  		        double moyenne = (double) somme / N;

			  		        System.out.println("Somme : " + somme);
			  		        System.out.println("Produit : " + produit);
			  		        System.out.println("Moyenne : " + moyenne);
			  }
			  
			  		    }

			  
		    
		
		

