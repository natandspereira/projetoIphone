package SmartPhone;

import AppsIphone.Musica;
import AppsIphone.Ligacao;
import AppsIphone.Navegador;

public class Iphone implements Musica,Ligacao,Navegador {
    public static void main(String[] args) {
        
    }
    public void Navegador() {
        System.out.println("ACESSANDO NAVEGADOR");
    }

    
    public void ligacao() {
        System.out.println("FAZENDO LIGAÇÃO");
    }

    
    public void musica() {
        System.out.println("TOCANDO MUSICA");
    }
}
