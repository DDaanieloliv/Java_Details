package contabanco;

public class ContaBanco {
    public static void main(String[] args) {
        Conta p1 = new Conta();
       
        p1.setnumConta(1111);
        p1.setDono("Kritos");
        p1.abrirConta("CC");
        
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();
        
        Conta p2 = new Conta();
        p2.setnumConta(2222);
        p2.setDono("kemel");
        p2.abrirConta("CP"); // Voce teve que passar uma String pois a funçao 
                               // "abrirConta(String t)" <-- possui um parametro 
                               // que deve ser transmitido.
        p2.depositar(500);
        p2.sacar(100);
                               
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}