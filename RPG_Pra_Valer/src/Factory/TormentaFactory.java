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
import Tormenta.Classe_Tormenta;
import Tormenta.Criatura_Tormenta;
import Tormenta.Raca_Tormenta;
import java.util.ArrayList;
import java.util.Collection;
import rpg_pra_valer.Atributo;
import rpg_pra_valer.Dado;

/**
 *
 * @author Samuel
 */
public class TormentaFactory implements RPG_Factory{

    @Override
    public Collection<Raca> generateRaça() {
        Collection<Raca> retornavel = new ArrayList<>();
        
        retornavel.add(new Raca_Tormenta(new Atributo(0, -2, 4, 0, 2, 0), "Anao"));
        retornavel.add(new Raca_Tormenta(new Atributo(0, 4, -2, 2, 0, 0), "Elfo"));
        retornavel.add(new Raca_Tormenta(new Atributo(0, 4, 2, 0, 0, -2), "Gobling"));
        retornavel.add(new Raca_Tormenta(new Atributo(-2, 4, 0, 0, 0, 2), "Halfling"));
        retornavel.add(new Raca_Tormenta(new Atributo(0, 0, 0, 0, 0, 0), "Humano"));
        retornavel.add(new Raca_Tormenta(new Atributo(4, 0, 2, 0, 0, -2), "Minotauro"));
        retornavel.add(new Raca_Tormenta(new Atributo(0, 0, 0, 2, -2, 4), "Qareen"));
        
        return retornavel;
    }

    @Override
    public Collection<Classe> generateClasse() {
        Collection<Classe> retornavel = new ArrayList<>();
        
        retornavel.add(new Classe_Tormenta(Classe_Tormenta.UM_LVL, "Barbaro", 24, 6));
        retornavel.add(new Classe_Tormenta(Classe_Tormenta.UM_LVL, "Guerreiro", 20, 5));
        retornavel.add(new Classe_Tormenta(Classe_Tormenta.TRES_A_CADA_QUATRO_LVL, "Ladino", 12, 3));
        retornavel.add(new Classe_Tormenta(Classe_Tormenta.UM_LVL, "Monge", 16, 4));
        retornavel.add(new Classe_Tormenta(Classe_Tormenta.UM_LVL, "Paladino", 20, 5));
        retornavel.add(new Classe_Tormenta(Classe_Tormenta.UM_LVL, "Ranger", 16, 4));
        retornavel.add(new Classe_Tormenta(Classe_Tormenta.UM_LVL, "Samurai", 20, 5));
        retornavel.add(new Classe_Tormenta(Classe_Tormenta.UM_LVL, "Swashbuckler", 16, 4));
        
        return retornavel;
    }

    @Override
    public Collection<Criatura> generateCriatura() {
        Collection<Criatura> retornavel = new ArrayList<>();
        
        Criatura_Tormenta Lobo;
        Lobo = new Criatura_Tormenta(Criatura_Tormenta.GRANDE, Criatura_Tormenta.ANIMAL, "Lobo das cavernas", 6, new Atributo(23, 15, 9, 2, 12, 6));
        Lobo.addAtaque(new Arma(20, new Dado(1, 8), "mordida"), "mordida");
        retornavel.add(Lobo);
        
        Criatura_Tormenta Urso;
        Urso = new Criatura_Tormenta(Criatura_Tormenta.GRANDE, Criatura_Tormenta.ANIMAL, "Urso coruja", 5, new Atributo(21, 12, 21, 2, 12, 10));
        Urso.addAtaque(new Arma(20, new Dado(1, 6), "Garra"), "Garra");
        Urso.addAtaque(new Arma(20, new Dado(1, 6), "Garra"), "Garra");
        Urso.addAtaque(new Arma(20, new Dado(1, 8), "Bicada"), "Bicada");
        retornavel.add(Urso);
        
        Criatura_Tormenta Objeto;
        Objeto = new Criatura_Tormenta(Criatura_Tormenta.DESCOMUNAL, Criatura_Tormenta.CONSTRUCTO, "Objeto inanimado", 16, new Atributo(24, 6, 10, 10, 10, 10));
        Objeto.addAtaque(new Arma(20, new Dado(2, 6), "Pancada"), "Pancada");
        retornavel.add(Urso);
        
        Criatura_Tormenta Elemental;
        Elemental = new Criatura_Tormenta(Criatura_Tormenta.ENORME, Criatura_Tormenta.ESPIRITO, "Elemental", 16, new Atributo(18, 25, 18, 6, 11, 11));
        Elemental.addAtaque(new Arma(20, new Dado(4, 8), "Pancada"), "Pancada");
        retornavel.add(Elemental);
        
        Criatura_Tormenta Bugbear;
        Bugbear = new Criatura_Tormenta(Criatura_Tormenta.MEDIO, Criatura_Tormenta.HUMANOIDE, "Bugbear", 4, new Atributo(13, 13, 16, 10, 9, 6));
        Bugbear.addAtaque(new Arma(20, new Dado(1, 6), "Maca"), "maca");
        retornavel.add(Bugbear);
        
        Criatura_Tormenta Dragao;
        Dragao = new Criatura_Tormenta(Criatura_Tormenta.ENORME, Criatura_Tormenta.MONSTRO, "Dragao", 22, new Atributo(33, 11, 21, 16, 19, 16));
        Dragao.addAtaque(new Arma(19, new Dado(2, 8), "Mordida"), "Mordida");
        retornavel.add(Dragao);
        
        
        return retornavel;
    }

    @Override
    public Collection<Arma> generateArma() {
        Collection<Arma> retornavel = new ArrayList<>();
        
        retornavel.add(new Arma(19, new Dado(1, 4), "Adaga"));
        retornavel.add(new Arma(20, new Dado(1, 6), "Machadinha"));
        retornavel.add(new Arma(19, new Dado(1, 6), "Espada curta"));
        retornavel.add(new Arma(19, new Dado(1, 8), "Espada longa"));
        retornavel.add(new Arma(19, new Dado(2, 6), "Espada grande"));
        retornavel.add(new Arma(18, new Dado(1, 6), "Florete"));
        retornavel.add(new Arma(20, new Dado(1, 6), "Lanca"));
        retornavel.add(new Arma(20, new Dado(1, 8), "Machado"));
        retornavel.add(new Arma(20, new Dado(1, 8), "Maca"));
        retornavel.add(new Arma(20, new Dado(1, 8), "Tridente"));
        retornavel.add(new Arma(20, new Dado(1, 10), "Tacape"));
        
        return retornavel;
    }

    @Override
    public Collection<Armadura> generateArmadura() {
        Collection<Armadura> retornavel = new ArrayList<>();
        
        retornavel.add(new Armadura(1, 0, "Armadura acolchoada"));
        retornavel.add(new Armadura(2, 0, "Corselete de couro"));
        retornavel.add(new Armadura(3, 1, "Couro batido"));
        retornavel.add(new Armadura(4, 2, "Camisa cota de malha"));
        
        retornavel.add(new Armadura(3, 2, "Gibao de peles"));
        retornavel.add(new Armadura(4, 2, "Brunca"));
        retornavel.add(new Armadura(5, 3, "Cota de Malha"));
        retornavel.add(new Armadura(5, 4, "Couraca"));
        
        retornavel.add(new Armadura(6, 4, "Cota de talas"));
        retornavel.add(new Armadura(6, 5, "Loriga segmentada"));
        retornavel.add(new Armadura(7, 4, "Meia armadura"));
        retornavel.add(new Armadura(8, 5, "Armadura completa"));
        
        return retornavel;        
    }
}
