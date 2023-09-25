package related;

public class Threads {
	public static void main(String[] args) {
		new MinhaThread("1").start();
		new MinhaThread("2").start();
	}
	
}

class MinhaThread extends Thread {
	private String nome;
	public MinhaThread(String nome) {
		this.nome = nome;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Thread" + nome + ": " + i);
			System.out.println("Thread" + nome + "Concluido!");
	}
	
}