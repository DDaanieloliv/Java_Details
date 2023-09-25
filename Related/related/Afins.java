/*
 Exercício: Verificar Palíndromo

Escreva um programa Java que verifica se uma palavra é um palíndromo. Um palíndromo
 é uma palavra, frase ou qualquer outra sequência de caracteres que se lê da mesma 
 forma tanto de trás para frente como da frente para trás (desconsiderando espaços, 
 pontuação e diferenciação entre maiúsculas e minúsculas).

Exemplo:

"radar" é um palíndromo.
"java" não é um palíndromo.
Você pode implementar a solução em um único arquivo Java ou dividi-la em classes, 
conforme preferir. Lembre-se de testar seu código com diferentes palavras para garantir 
que ele funcione corretamente. 
 */

package related;

import java.util.ArrayList;
import java.util.Scanner;

public class Afins{
	
	public static void Verificacao () {
		//Função que irá  verificar se a palavra é um palindromo.
		ArrayList<Object> wordList = new ArrayList<>(); 
		
		//Criando variaveis para verificação de palindromos.
		Scanner scan = new Scanner(System.in);	//instancia que ira receber a string.
		
		String palavra;
		//Armazenando string na  variavel 'palavra' recebida da instancia 'scan' .
		palavra = scan.nextLine();
		
		
		// Percorra a string e adicione cada letra ao ArrayList.
		for(int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);
			wordList.add(letra);	
		}
		
		
		System.out.println("Esta palavra digitada foi armazenada no Array assim: \n\n " + wordList);
		
		//Criando novo arrayList para comparação e verificação se a palavra é um Palindromo.
		ArrayList<Object> wordList_ = new ArrayList<>(); 
		
		/*
		for(int i = 10; i > palavra.length(); i-- ) {
    	char letra = palavra.charAt(i);
    	wordList_.add(letra);
		} 
		
		O loop acima tem alguns problemas:

		1. Condição Incorreta: A condição i > palavra.length() está incorreta. Ela está dizendo
		 para continuar o loop enquanto i for maior que o comprimento da palavra. Isso significa 
		 que o loop nunca será executado, pois i começa em 10 e o comprimento da maioria das palavras será muito menor que isso.

		2. Acesso a um Índice Inválido: Quando i é maior que o comprimento da palavra, 
		você está tentando acessar um índice que não existe, o que resultará em um 
		erro (IndexOutOfBoundsException).

		3. Direção do Loop: A ideia de percorrer a palavra de trás para frente está correta, mas
		a lógica do loop não está invertendo a ordem corretamente.

		Para corrigir isso, o loop deve ser reescrito para começar no último índice da palavra 
		(palavra.length() - 1) "O '-1' é devido o ArralyList sempre iniciar na casa 0." 
		e continuar até o primeiro índice (>= 0) "O '>= 0' serve para poder pegar a letra que
		esta alocada na casa 0 do ArrayList", decrementando i a cada iteração:
		
		*/ 
		
		
		//Loop que ira percorrer o array e adicionar as letras de maneira (Ao cintrario).
		for(int i = palavra.length() - 1; i >= 0; i--) {
		    char letra = palavra.charAt(i);
		    wordList_.add(letra);
		}
		
		
		System.out.println("Esta palavra digitada (Ao contrario) foi armazenada no Array assim: \n\n " + wordList_);
		
		if (wordList.equals(wordList_)) {
			System.out.println("Word Is Palindromo.");
		} else {
			System.out.println("Word Isn't Palindromo.");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Digite uma palavra: ");
		Verificacao();
		
	}

}

