/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_pra_valer;

/**
 *
 * @author 6514286
 */
public class Habilidade {
    
    private int valor;

    public Habilidade(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
    public int modificador(){        
        return (valor-10)/2 ;
    }
    private int valorAleatorio(){
        int menor = 0;
        int soma = 0;
        
        Dado D6 = new Dado(1, 6);
        
        menor = D6.jogar();
        
        for (int i = 0; i < 3; i++) {
            int novo = D6.jogar();
            
            if (novo < menor) {
                soma += menor;
                menor = novo;
            }
            else
                soma += novo;            
        }
        
        return soma;
    }
    
}
