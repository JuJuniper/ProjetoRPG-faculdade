/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_pra_valer;

/**
 *
 * @author Samuel
 */
public class Atributo {
    private final Habilidade Forca;
    private final Habilidade Destreza;
    private final Habilidade Constituicao;
    private final Habilidade Inteligencia;
    private final Habilidade Sabedoria;
    private final Habilidade Carisma;

    public Atributo(int Forca, int Destreza, int Constituicao, int Inteligencia, int Sabedoria, int Carisma) {
        this.Forca = new Habilidade(Forca);
        this.Destreza = new Habilidade(Destreza);
        this.Constituicao = new Habilidade(Constituicao);
        this.Inteligencia = new Habilidade(Inteligencia);
        this.Sabedoria = new Habilidade(Sabedoria);
        this.Carisma = new Habilidade(Carisma);
    } 

    public Habilidade getCarisma() {
        return Carisma;
    }
    public void setCarisma(int Carisma) {
        this.Carisma.setValor(Carisma);
    }

    public Habilidade getConstituicao() {
        return Constituicao;
    }
    public void setConstituicao(int Constituicao) {
        this.Constituicao.setValor(Constituicao);
    }

    public Habilidade getDestreza() {
        return Destreza;
    }
    public void setDestreza(int Destreza) {
        this.Destreza.setValor(Destreza);
    }

    public Habilidade getForca() {
        return Forca;
    }
    public void setForca(int Forca) {
        this.Forca.setValor(Forca);
    }

    public Habilidade getInteligencia() {
        return Inteligencia;
    }
    public void setInteligencia(int Inteligencia) {
        this.Inteligencia.setValor(Inteligencia);
    }

    public Habilidade getSabedoria() {
        return Sabedoria;
    }
    public void setSabedoria(int Sabedoria) {
        this.Sabedoria.setValor(Sabedoria);
    }
    
    
}
