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
public class Professor extends Escola {

    public static List<Professor> listProfessor = new ArrayList();

    private String dataAdmissao;
    private int codFuncionario;
    private String disciplinas;
    private int cod;
    int setCodFuncionario;

    public Professor(String dataAdmissao, int codFuncionario, String disciplinas, int cod) {
        this.dataAdmissao = dataAdmissao;
        this.codFuncionario = codFuncionario;
        this.disciplinas = disciplinas;
      
    }

   

    public Professor() {

    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

   

    

}
