package related;

public class MyThread extends Thread {

	private String nome;
	
	public MyThread(String nome) {
		this.nome = nome;
		start();
	}
	
	public void run() {
		System.out.println("Executando Thread");
	}
	
	public static void main(String[] args) {
		MyThread thread = new MyThread("Thread1");
		
		//thread.start();
	}
}
