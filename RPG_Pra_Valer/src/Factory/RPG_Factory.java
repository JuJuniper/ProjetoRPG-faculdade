/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Itens.Arma;
import Itens.Armadura;
import Personagem.Classe;
import Personagem.Criatura;
import Personagem.Raca;
import java.util.Collection;

/**
 *
 * @author 6514286
 */
public interface RPG_Factory {
    
    Collection<Raca> generateRaça();
    Collection<Classe> generateClasse();
    Collection<Criatura> generateCriatura();
    Collection<Arma> generateArma();
    Collection<Armadura> generateArmadura();
    
}
