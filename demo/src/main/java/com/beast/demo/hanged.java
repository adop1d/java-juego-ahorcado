package com.beast.demo;

import java.util.Scanner;


public class hanged {
	public static void main(String[] args) {
		//añado el scanner para poder leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		System.out.println("¡Ahorcado!");
		System.out.println("Guess the word, good luck!");
		//añado los atributos que se usaran en el codigo
		String secretWord = "sinceridad";
		int maxAttempts = 20;
		int attempts = 0;
		boolean wordFound = false;

		//arrays para guardar las letras encontradas y las letras introducidas
		char[] foundLetters = new char[secretWord.length()];

		//inicializo el array de letras encontradas
		for (int i = 0; i < foundLetters.length; i++) {
			foundLetters[i] = '_';
		}
		//bucle informativo para que el usuario introduzca letras
		while (!wordFound && attempts < maxAttempts) {
			System.out.println("Found letters: " + String.valueOf(foundLetters));
			System.out.println("Introduce a letter: ");
			System.out.println("Attempts left: " + (maxAttempts - attempts));
			char letter = scanner.next().charAt(0);
	}

}
}