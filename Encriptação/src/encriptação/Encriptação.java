package encriptação;

import java.util.Scanner;                                                       // BIBLIOTECA IMPORTADO POR ONDE PODEREMOS USAR O 'Scanner'

public class Encriptação {
    public static void main(String[] args) {
       try (//Scanner entrada = new Scanner(System.in);                            // CRIANDO VARIAVEL TIPO 'Scanner'. Cujo comando nesta linha 
	Scanner entrad = new Scanner (System.in)) {									  // dá o nome de 'entrada' 'System.in' REPRESENTA O TECLADO   
           
       
       
       
       /*
            // Informa texto e chave de criptografia
            System.out.print("Informe o texto a ser criptografado: ");   
            String texto  = entrada.nextLine();                              
                                                                                // CRIANDO UMA VARIAVEL TIPO 'String', CUJO NOME É 'texto'. 
                                                                                // 'texto' IRÁ RECEBER O OBJETO 'entrada' QUE CHAMA O METODO 
                                                                                // nextLine(); "ou seja 'texto' RECEBE a CHAMADA(entrada.nextLine()) 
                                                                                // de um metodo a CHAMADA(entrada.nextLine()) de um metodo que irá 
                                                                                // capturar o dado na forma de texto dijitado pelo teclado e armazenar 
                                                                                // na variavel 'Texto'"
        
        System.out.print("Informe a chave de deslocamento: ");        
	int chave = entrada.nextInt();
	// Variavel que ira guardar o texto cifrado
	String textoCifrado = new String();
	int tamanhoTexto = texto.length();
	int letraCifradaASCII = 0; 
	// Criptografa cada caractere por vez 
	for(int c=0; c < tamanhoTexto; c++){
    // Transforma o caracter em codigo ASCII e criptografa
	int letranormal = ((int) texto.charAt(c));
	letraCifradaASCII = letranormal + chave;

	// Transforma codigo ASCII criptografado em 
	// caractere e adiciona ao novo texto
	textoCifrado = textoCifrado + ( (char) letraCifradaASCII );
        
        }
	System.out.println("\n\nTEXTO CRIPTOGRAFADO: " +((char) letraCifradaASCII));              
        
       */
		System.out.print("Informe o texto a ser criptografado: ");   
		   String textoCifrado = entrad.nextLine();
		   

		    // Imprime o texto cifrado que será quebrado.
		    System.out.println("Texto Cifrado: " + textoCifrado);
		    System.out.println("Possíveis Textos Descriptografados:");

		    // Loop para testar todas as chaves possíveis (0 a 25).
		    for (int chav = 0; chav < 26; chav++) {
		        // Chama a função descriptografar com a chave atual. OU percorre o o codigo manualmente.
		        
		        
		        //String textoDescriptografado = descriptografar(textoCifrado, chav);
		        
		        String textoDescriptografado = ""; // Variavel que ira receber o texto decriptado
		        
		        for (int c = 0; c < textoCifrado.length(); c++) {  // Loop para percorrer cada caractere no texto cifrado.
		        
		        int letraCifradaASCII = (int) textoCifrado.charAt(c);
		        
		        // Calcula o valor ASCII do caractere descriptografado.
		        int letranormal = letraCifradaASCII - chav;
		        
		        // Se o valor ASCII for menor que 'A' (65), ajusta para o final do alfabeto.
		        if (letranormal < 65) {
		            letranormal += 26;
		        }
		        
		        // Adiciona o caractere descriptografado ao texto final.
		        textoDescriptografado += (char) letranormal;
		        }
		        
		        // Imprime o texto descriptografado com a chave atual.
		        System.out.println("Chave " + chav + ": " + textoDescriptografado);
		    }
	}
           
       
       
       
       /*
            // Informa texto e chave de criptografia
            System.out.print("Informe o texto a ser criptografado: ");   
            String texto  = entrada.nextLine();                              
                                                                                // CRIANDO UMA VARIAVEL TIPO 'String', CUJO NOME É 'texto'. 
                                                                                // 'texto' IRÁ RECEBER O OBJETO 'entrada' QUE CHAMA O METODO 
                                                                                // nextLine(); "ou seja 'texto' RECEBE a CHAMADA(entrada.nextLine()) 
                                                                                // de um metodo a CHAMADA(entrada.nextLine()) de um metodo que irá 
                                                                                // capturar o dado na forma de texto dijitado pelo teclado e armazenar 
                                                                                // na variavel 'Texto'"
        
        System.out.print("Informe a chave de deslocamento: ");        
	int chave = entrada.nextInt();
	// Variavel que ira guardar o texto cifrado
	String textoCifrado = new String();
	int tamanhoTexto = texto.length();
	int letraCifradaASCII = 0; 
	// Criptografa cada caractere por vez 
	for(int c=0; c < tamanhoTexto; c++){
    // Transforma o caracter em codigo ASCII e criptografa
	int letranormal = ((int) texto.charAt(c));
	letraCifradaASCII = letranormal + chave;

	// Transforma codigo ASCII criptografado em 
	// caractere e adiciona ao novo texto
	textoCifrado = textoCifrado + ( (char) letraCifradaASCII );
        
        }
	System.out.println("\n\nTEXTO CRIPTOGRAFADO: " +((char) letraCifradaASCII));              
        
       */
    }

    /*
    // Função para descriptografar o texto cifrado com uma determinada chave.
    public static String descriptografar(String textoCifrado, int chave) {
        String textoDescriptografado = "";

        // Loop para percorrer cada caractere no texto cifrado.
        for (int c = 0; c < textoCifrado.length(); c++) {
            int letraCifradaASCII = (int) textoCifrado.charAt(c);
            
            // Calcula o valor ASCII do caractere descriptografado.
            int letranormal = letraCifradaASCII - chave;
            
            // Se o valor ASCII for menor que 'A' (65), ajusta para o final do alfabeto.
            if (letranormal < 65) {
                letranormal += 26;
            }
            
            // Adiciona o caractere descriptografado ao texto final.
            textoDescriptografado += (char) letranormal;
        }

        // Retorna o texto descriptografado.
        return textoDescriptografado;
    }
    */
}        
        
// Ou 



/*

Scanner entrada = new Scanner(System.in);
	    		   
	// Informa texto e chave de criptografia
	System.out.print("Informe o texto a ser criptografado: ");   		String texto = entrada.nextLine();    
	System.out.print("Informe a chave de deslocamento: ");        
	int chave = entrada.nextInt();
		
	// Variavel que ira guardar o texto cifrado
	String textoCifrado = new String();
	String textoConvertido = new String();
	int tamanhoTexto = texto.length();
	int letraCifradaASCII; 
	
	System.out.println("Texto inserido: " + texto);
	
	// Criptografa cada caractere por vez 
	for(int c=0; c < tamanhoTexto; c++)
	{
	// Transforma o caracter em codigo ASCII e criptografa
	int letranormal = ((int) texto.charAt(c));
	letraCifradaASCII = letranormal + chave;
	
	/ Transforma codigo ASCII criptografado em 
	// caractere e adiciona ao novo texto
        textoCifrado = textoCifrado + ( (char) letraCifradaASCII );
        }
		
        tamanhoTexto = textoCifrado.length();
        System.out.println("\n\nTEXTO CRIPTOGRAFADO: " + textoCifrado);              
	        
	        
         for(int c=0; c < tamanhoTexto; c++)
       {
	// Transforma o caracter em codigo ASCII e criptografa
	int letranormal = (int) textoCifrado.charAt(c);
	letraCifradaASCII = letranormal - chave; 
	
        textoConvertido += ((char) letraCifradaASCII);
		        
	}
	        
        System.out.println("\n\nTEXTO CONVERTIDO: " + textoConvertido );

*/

