/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistEscola;

/**
 *
 * @author laboratorio
 */
public class Escola {
    
    private String nome;
    private String RG;
    private String CPF;
    private String datanasc;
    private String endereco;
    

    public Escola(String nome, String RG, String CPF, String datanasc, String endereco) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.datanasc = datanasc;
        this.endereco = endereco;
    }
    public Escola (){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
