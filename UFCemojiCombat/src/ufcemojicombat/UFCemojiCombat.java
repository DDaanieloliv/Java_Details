package ufcemojicombat;
/**
 *
 * @author Mary
 */
public class UFCemojiCombat {
    public static void main(String[] args) {
        //EXEMPLO
        // Lutador l = new Lutador("Pretty boy","França",31,1.75f,68.9f,11, 3, 1);
        
        //NO Lugar de declarar l como um novo Lutador iremos fazer com que o l seja um vetor de 6 posições. 
        
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty boy","França",31,1.75f,68.9f,11, 3, 1);
        l[1] = new Lutador("Putscript","Brasil",29, 1.68f, 57.8f,14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f,12, 2, 1);
        l[3] = new Lutador("Dead code", "Australia", 28, 1.93f, 81.6f,13, 0, 2);
        l[4] = new Lutador("Dirty code", "Russia", 27, 1.83f, 85.6f,11, 3, 2);
        l[5] = new Lutador("Marco", "Brasil", 27, 1.73f, 71.6f,13, 0, 3);
        
        /*
        l[0].apresentar();
        l[1].apresentar();
        
        l[0].perderLuta();
        l[1].ganharLuta();
        l[1].status();
        */
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
    }
    
}
