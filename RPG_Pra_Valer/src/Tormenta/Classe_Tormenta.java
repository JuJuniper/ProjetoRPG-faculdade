/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tormenta;

import Personagem.Classe;
import rpg_pra_valer.Habilidade;

/**
 *
 * @author Samuel
 */
public class Classe_Tormenta extends Classe{

    private final double BBA;

    public static final double UM_LVL = 1;
    public static final double UM_A_CADA_DOIS_LVL = 0.5;
    public static final double TRES_A_CADA_QUATRO_LVL = 0.75;

    public Classe_Tormenta(double BBA, String Nome, int PV_Inicial, int PV_LVL) {
        super(Nome, PV_Inicial, PV_LVL);
        this.BBA = BBA;
    }

    @Override
    public int CalcularVida(int LVL, Habilidade Const) {
        return getPV_Inicial()+Const.modificador() + (getPV_LVL()+Const.modificador())*(LVL-1);
    }
    
    @Override
    public int ModAtaque(int LVL){
        return (int) (BBA*LVL);
    }
}
