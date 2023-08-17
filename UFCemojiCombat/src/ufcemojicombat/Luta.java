package ufcemojicombat;

import java.util.Random;

// Clicando na lampada vc importa a classe "Random"
// que irá gerar a um num aleatorio.

public class Luta {
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //METODOS ESPECIAIS 
    public Luta() {
    }
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
    public void setRounds(int rds){
        this.rounds = rds;
    }
    public int getRounds(){
        return rounds;
    }
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
    public boolean getAprovada(){
        return aprovada;
    }
    
    //METODOS 
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 ){           
            aprovada = true;
            desafiado = l1;
            desafiante = l2;   
        } else { 
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // irá gerar numeros 0 1 2 
            System.out.println("===== RESULTADO DA LUTA =====");
            switch(vencedor) {
                case 0: //EMPATE
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //DESAFIADO VENCE
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //DESAFIANTE VENCE    
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("===== RESULTADO DA LUTA =====");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
}
