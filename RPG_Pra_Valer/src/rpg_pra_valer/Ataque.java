/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_pra_valer;

import Itens.Arma;

/**
 *
 * @author 6514286
 */
public class Ataque {
    private Arma arma;
    private String descricao;
    private int modificadorAtaque;
    private int modificadorDano;

    public Ataque(Arma arma, String descricao, int modificadorAtaque, int modificadorDano) {
        this.arma = arma;
        this.descricao = descricao;
        this.modificadorAtaque = modificadorAtaque;
        this.modificadorDano = modificadorDano;
    }

    

    public void AlterarDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void AlterarModificadores(int Atq, int Dano){
        this.modificadorAtaque = Atq;
        this.modificadorDano = Dano;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public int JogadaDeAtaque(int CA){
        Dado D20 = new Dado(1, 20);
        int jogada = D20.jogar();
        
        if (jogada >= arma.getMargemCritico())
            return arma.JogadaDeDano(true)+modificadorDano*2;
        else if (jogada+modificadorAtaque >= CA)
            return arma.JogadaDeDano(false)+modificadorDano;
        else
            return 0;
    }
}
