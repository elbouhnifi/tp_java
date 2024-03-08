package TP2;

import java.util.Scanner;

public class exercice6_2 {
	
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("saisir un nombre N : ");
	        int N = scanner.nextInt();
	        System.out.println("Les nombres premiers entre 1 et " + N + " sont :");
	        for (int i = 2; i <= N; i++) {
	            if (estPremier(i)) {
	                System.out.print(i + " ");
	            }
	        }

	    }

	    
	    public static boolean estPremier(int nombre) {
	        if (nombre <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(nombre); i++) {
	            if (nombre % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

