package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inicio {

	public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			List<Integer> listaNumeros;
			listaNumeros = new ArrayList<Integer>();

	public static void introducirNumeros(List<Integer> listaNumeros) {
		Scanner sc = new Scanner(System.in);
		int tamanio;
		System.out.println("Introduzca la cantidad de elementos que desee añadir:");
		tamanio = sc.nextInt();
		for (int i = 0; i < tamanio; i++) {
			System.out.println("Introduzca número entero");
			listaNumeros.add(sc.nextInt());
		}
	}


	public static void mostrarLista(List<Integer> listaNumeros) {
	        
	        System.out.println("Lista de numeros:");
	        for(int numeros:listaNumeros) {
	        System.out.println(numeros);}
	        }

	public static void intercambiarPosicion(List<Integer>listaNumeros) {
	            if (listaNumeros.size()>=4) {
	                int aux=listaNumeros.get(1);
	                listaNumeros.set(1, listaNumeros.get(3));
	                listaNumeros.set(3,  aux);
	            }
	        }

	public static void listaModificada(List<Integer>listaNumeros) {
	        	System.out.println("Lista modificada:");
	        	for(int i =0; i<listaNumeros.size();i++) {
	        		System.out.println(i + ":" + listaNumeros.get(i));
	        	}
	        }
	}
	
