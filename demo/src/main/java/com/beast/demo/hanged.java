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
			//leo la letra introducida por el usuario
			char letter = Character.toLowerCase(scanner.next().charAt(0));
			boolean foundWord = false;
			//bucle para comprobar si la letra introducida esta en la palabra secreta
			for (int i = 0; i < secretWord.length(); i++) {
				//Estructura condicional para comprobar si la letra introducida esta en la palabra secreta
				if (secretWord.charAt(i) == letter) {
					foundLetters[i] = letter;
					foundWord = true;
				}
			}
			//Estructura condicional para comprobar si la letra introducida no esta en la palabra secreta
			if (!foundWord) {
				attempts++;
				System.out.println("Letter not found, you have " + (maxAttempts - attempts) + " attempts left.");
			} else if(String.valueOf(foundLetters).equals(secretWord)) {
				wordFound = true;
				System.out.println("Congratulations, you found the word! The word was: " + secretWord);
			}
		}
		//Estructura condicional para comprobar si el usuario ha agotado los intentos
		if (attempts == maxAttempts) {
			System.out.println("You have run out of attempts, the word was: " + secretWord);
		}
		//cierro el scanner para evitar problemas de memoria
		scanner.close();
	}
}