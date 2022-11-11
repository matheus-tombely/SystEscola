/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistEscola;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class Estagiario extends Escola {
    
    public static List<Estagiario> listEstag = new ArrayList ();
    String valorBolsa;
    private int codEstag;

    public Estagiario(String valorBolsa, int codEstag) {
        this.valorBolsa = valorBolsa;
        this.codEstag = codEstag;
    }

    

    

    public Estagiario() {
        
    }

    public String getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(String valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    public int getCodEstag() {
        return codEstag;
    }

    public void setCodEstag(int codEstag) {
        this.codEstag = codEstag;
    }

    
    
    
}
