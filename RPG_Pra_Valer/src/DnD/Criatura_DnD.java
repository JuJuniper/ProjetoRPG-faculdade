/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DnD;

import Personagem.Criatura;
import Personagem.Entidade;
import rpg_pra_valer.Ataque;
import rpg_pra_valer.Atributo;

/**
 *
 * @author Samuel
 */
public class Criatura_DnD extends Criatura{

    public Criatura_DnD(String Nome, int LVL, Atributo atributos) {
        super(Nome, LVL, atributos);
    }

    @Override
    public boolean Atacar(Entidade inimigo, Ataque ataque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int CalcularModificadorAtaque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int CalcularModificadorDano() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
