/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DnD;

import Itens.Armadura;
import Personagem.Classe;
import Personagem.Entidade;
import Personagem.Personagem;
import Personagem.Raca;
import rpg_pra_valer.Ataque;
import rpg_pra_valer.Atributo;

/**
 *
 * @author Samuel
 */
public class Personagem_DnD extends Personagem{

    public Personagem_DnD(String Nome, Classe classe, Raca raça, Armadura armadura, int LVL, Atributo atributos) {
        super(Nome, classe, raça, armadura, LVL, atributos);
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
