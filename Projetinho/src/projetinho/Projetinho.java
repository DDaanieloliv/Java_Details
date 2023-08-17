package projetinho;
public class Projetinho {
    public static void main(String[] args) {
       Video v[] = new Video[3];
       v[0] = new Video("Aula 01 POO");
       v[1] = new Video("Aula 12 Php");
       v[2] = new Video("Aula 10 Html5"); 
       
       Gafanhoto g[] = new Gafanhoto[2]; 
       g[0] = new Gafanhoto("Jubileu", 22, "M",  "Juba");
       g[1] = new Gafanhoto("Creuza", 12, "F",  "Creuzita");
       
       
       //Visualizacao vv = new Visualizacao(v[0], g[0]);
       Visualizacao vv[] = new Visualizacao[5];
       vv[0] = new Visualizacao(v[0], g[0]); // assiste Aula 01 POO
       vv[0].avaliar();
       System.out.println(vv[0].toString());
       
       vv[1] = new Visualizacao(v[1], g[0]); // assiste Aula 12 Php
       vv[0].avaliar(87.0f);
       System.out.println(vv[1].toString());
       
       
       
       /*
       System.out.println("VIDEOS\n-----------------------------");
       System.out.println(v[0].toString());
       System.out.println(v[1].toString());
       System.out.println(v[2].toString());
       System.out.println("GAFANHOTOS\n-----------------------------");
       System.out.println(g[0].toString());
       System.out.println(g[1].toString());
        */
       }
    
}
