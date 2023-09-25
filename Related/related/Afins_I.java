/*
Faça um programa que crie uma classe Thread. Essa classe deverá 
receber três parâmetros em seu construtor(nome da thread, valor 
inicial e valor final) e imprimir todos os divisíveis por 3 e por 
5 presentes nesse intervalo.

Em seguida, crie 3 threads e passe para elas os intervalos 100 a 
300, 301 a 500 e 501 a 700. Execute essas threads.     
faça tudo isso em java 
*/

package related;

class DivisiveisThread extends Thread {
    private String nome;
    private int inicio;
    private int fim;

    public DivisiveisThread(String nome, int inicio, int fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run() {
        System.out.println(nome + " iniciou.");

        for (int i = inicio; i <= fim; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(nome + ": " + i);
            }
        }

        System.out.println(nome + " terminou.");
    }
}

public class Afins_I {
    public static void main(String[] args) {
        DivisiveisThread thread1 = new DivisiveisThread("Thread 1", 100, 300);
        DivisiveisThread thread2 = new DivisiveisThread("Thread 2", 301, 500);
        DivisiveisThread thread3 = new DivisiveisThread("Thread 3", 501, 700);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
