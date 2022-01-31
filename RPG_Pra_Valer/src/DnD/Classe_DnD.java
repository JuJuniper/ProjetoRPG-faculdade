/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DnD;

import Personagem.Classe;
import rpg_pra_valer.Habilidade;

/**
 *
 * @author Samuel
 */
public class Classe_DnD extends Classe{

    public Classe_DnD(String Nome, int PV_Inicial, int PV_LVL) {
        super(Nome, PV_Inicial, PV_LVL);
    }

    @Override
    public int CalcularVida(int LVL, Habilidade Const) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ModAtaque(int LVL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
