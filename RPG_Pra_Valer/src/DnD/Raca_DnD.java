/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DnD;

import Personagem.Raca;
import rpg_pra_valer.Atributo;

/**
 *
 * @author Samuel
 */
public class Raca_DnD extends Raca{

    public Raca_DnD(Atributo modificadorRacial, String Nome) {
        super(modificadorRacial, Nome);
    }

    @Override
    public Atributo ModificarAtributos(Atributo AtributoFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
