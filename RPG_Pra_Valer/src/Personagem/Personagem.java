/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

import Itens.Armadura;
import rpg_pra_valer.Atributo;

/**
 *
 * @author 6514286
 */
public abstract class Personagem extends Entidade{
    
    protected String Nome;
    protected Classe classe;
    protected Raca raça;
    protected Armadura armadura;

    public Personagem(String Nome, Classe classe, Raca raça, Armadura armadura, int LVL, Atributo atributos) {
        super(LVL, atributos);
        
        this.Nome = Nome;
        this.classe = classe;
        this.raça = raça;
        this.armadura = armadura;
        
        this.atributos = raça.ModificarAtributos(atributos);
        
        int PontosVida = calcularVida();
        int ClasseArmadura = CalcularCA(armadura);
        this.PV = PontosVida;
        this.PV_ATUAL = PontosVida;
        this.CA = ClasseArmadura;
    }

    public Personagem(String Nome, Classe classe, Raca raça, Armadura armadura, int LVL, int PV, int CA, Atributo atributos) {
        super(LVL, PV, CA, atributos);
        this.Nome = Nome;
        this.classe = classe;
        this.raça = raça;
        this.armadura = armadura;
    }

    public Classe getClasse() {
        return classe;
    }
    public Raca getRaça() {
        return raça;
    }
    public int calcularVida(){
        return classe.CalcularVida(LVL, atributos.getConstituicao());
    }
    
}
