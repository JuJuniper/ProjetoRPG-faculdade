/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Itens;

import rpg_pra_valer.Dado;

/**
 *
 * @author Samuel
 */
public class Arma extends Item{
   
    private final int margemCritico;
    private final Dado jogadaDeDados;

    public Arma(int margemCritico, Dado jogadaDeDados, String Nome) {
        super(Nome);
        this.margemCritico = margemCritico;
        this.jogadaDeDados = jogadaDeDados;
    }

    public int JogadaDeDano(boolean critico){
        int jogada = jogadaDeDados.jogar();
        if (critico)
            return jogada*2;
        else 
            return jogada;
    }

    public int getMargemCritico() {
        return margemCritico;
    }
    public String getNome() {
        return Nome;
    }
}
