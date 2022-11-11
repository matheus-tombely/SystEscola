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
public class Aluno extends Escola {
    
    public static List<Aluno> listAluno = new ArrayList ();
    
    String dataIngresso;
    int codAluno;
    String curso;
    String semestre;
    String valorMensalidade;

    public Aluno(String dataIngresso, int codAluno, String curso, String semestre, String valorMensalidade, String nome, String RG, String CPF, String datanasc, String endereco) {
        super(nome, RG, CPF, datanasc, endereco);
        this.dataIngresso = dataIngresso;
        this.codAluno = codAluno;
        this.curso = curso;
        this.semestre = semestre;
        this.valorMensalidade = valorMensalidade;
    }

    public Aluno() {
        
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(String valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    
    
    
    
    
}
