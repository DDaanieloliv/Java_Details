package related;

/*
A Classe  'ThreadRunnable' apenas implementa a Classe 'Runnable',
ela não é de fato uma Thread. para ser uma Thread de verdade é preciso 
passar essa classe 'Runnable' para 'Thread'
 */

public class ThreadRunnable implements Runnable {


	private String nome;
	private int tempo;

	public ThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);	//O 'this' faz referencia a propria CLASSE
										//substituindo assim a linha 40(deste codigo).
		t.start();	//Substituido a linha 41(deste codigo).
	}									


	@Override
	public void run() {
		try {
			for (int i=0; i<6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome + " teminou a execução");
	}

	
	public static void main(String[] args) {
		ThreadRunnable Thread1 = new ThreadRunnable("#1" , 500);
		//Thread t1 = new Thread(Thread1); // --> Thread(Runnable target)
		//t1.start();
		
		ThreadRunnable Thread2 = new ThreadRunnable("#2" , 500);

		ThreadRunnable Thread3 = new ThreadRunnable("#3" , 800);

	}
	
/*
(REFERENTE A LINHA 40 E 41 DESTE CODIGO)
Thread t1 = new Thread(Thread1);: Aqui estamos criando uma nova instância
de Thread. Isso é feito passando o objeto ThreadRunnable como o 
"runnable target" para o construtor da Thread. 
Ou seja, t1 será uma thread que executará o código contido no método run 
de ThreadRunnable.

t1.start();: Esta linha inicia a execução da thread t1. Quando 
chamamos start(), a JVM (Java Virtual Machine) chama o método run() 
da thread.

Em resumo, este código cria uma instância de Thread chamada t1, que 
executará o código definido no método run() da instância de ThreadRunnable
chamada Thread1. Isso irá iniciar uma nova thread que executará o 
código especificado na classe ThreadRunnable. 
*/	
}
