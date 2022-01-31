/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tormenta;

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
public class Personagem_Tormenta extends Personagem{

    public Personagem_Tormenta(String Nome, Classe classe, Raca raça, Armadura armadura, int LVL, Atributo atributos) {
        super(Nome, classe, raça, armadura, LVL, atributos);
    }

    
    @Override
    public int CalcularModificadorAtaque() {
        return classe.ModAtaque(LVL) + atributos.getForca().modificador();
    }

    @Override
    public int CalcularModificadorDano() {
        return atributos.getForca().modificador() + (LVL/2);
    }

    @Override
    public boolean Atacar(Entidade inimigo, Ataque ataque) {
        inimigo.TomarDano(ataque.JogadaDeAtaque(inimigo.getCA()));
        
        return inimigo.getPV_ATUAL() <= 0;
    }
}
