/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

import rpg_pra_valer.Habilidade;

/**
 *
 * @author 6514286
 */
public abstract class Classe {
    String Nome;
    int PV_Inicial;
    int PV_LVL;

    public Classe(String Nome, int PV_Inicial, int PV_LVL) {
        this.Nome = Nome;
        this.PV_Inicial = PV_Inicial;
        this.PV_LVL = PV_LVL;
    }
    
    abstract public int CalcularVida(int LVL, Habilidade Const); 

    public int getPV_Inicial() {
        return PV_Inicial;
    }
    public int getPV_LVL() {
        return PV_LVL;
    }
    public String getNome() {
        return Nome;
    }
    
    abstract public int ModAtaque(int LVL);
    
}
