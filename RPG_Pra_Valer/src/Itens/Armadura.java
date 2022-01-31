/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Itens;

/**
 *
 * @author 6514286
 */
public class Armadura extends Item{
    
    private final int bonusCA;
    private final int penalidade;

    public Armadura(int bonusCA, int penalidade, String Nome) {
        super(Nome);
        this.bonusCA = bonusCA;
        this.penalidade = penalidade;
    }

    public String getNome() {
        return Nome;
    }
    public int BonusCA() {
        return bonusCA;
    }
    public int Penalidada() {
        return penalidade;
    }    
}
