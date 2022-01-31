/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_pra_valer;

/**
 *
 * @author Samuel
 */
public class Dado {
    
    private final int tipo;
    private final int qtd;

    public Dado(int qtd, int tipoDeDado) {
        this.tipo = tipoDeDado;
        this.qtd = qtd;
    }

    public Dado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int jogar(){
        int Total = 0;
        
        for (int i = 0; i < qtd; i++) {
            Total += (int)(Math.random()*tipo)+1;
        }
        return Total;
    }
}
