package remoto;
/**
 *
 * @author Mary
 */
public class Remoto {
    public static void main(String[] args) {
       ControleRemoto c = new ControleRemoto();
       //c.ligar();
       //   "c.volume = 80;" - (Tal comando não é válido pois ele está privado "ENCAPSULADO") 
       //   Voce não podera chagar no "ControleRemoto" e tentar executar uma açao como a 
       //   anterior ou esta "c.setVolume(50);", pois tais métodos foram postos como PRIVADOS
       //   Fazendo com que ao voce acessar o OBJETO Controle Remoto voce tenha acesso somente 
       //   às ações disponiveis na INTERFACE. 
       //   POR fim, acabando por proteger as "coisas" do Controle Remoto devido ao ENCAPSULAMENTO.
       c.maisVolume();
       c.ligarMudo();
       c.play();
       c.abrirMenu();
       c.fecharMenu();
    }
    
}
