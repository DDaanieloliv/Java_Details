package related;

public class OtherThread extends Thread {

	private String nome;
	private int tempo;

	public OtherThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	public void run() {
		try {
			
			for (int i=0; i<6; i++) {
				System.out.println(nome + " contador " + i);
				//Thread.sleep(100);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



public static void main(String[] args) {
	OtherThread thread1 = new OtherThread("Thread1", 900);
	OtherThread thread2 = new OtherThread("Thread2", 200);

	//thread.start();
}
}


