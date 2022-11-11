/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistEscola;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class Cad {
static int codp=1;
static int coda=1;
static int code=1;
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        

        do {
            System.out.println("==CADASTRO ESCOLA==");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Aluno");
            System.out.println("3 - Cadastrar Estagiário");
            System.out.println("4 - Listar Professor");
            System.out.println("5 - Listar Aluno");
            System.out.println("6 - Listar Estagiário");
            System.out.println("7 - Listar todos juntos");
            System.out.println("8 - SAIR");
            opcao = Integer.parseInt(ler.nextLine());

            if (opcao == 1) {
                professores();
            }

            if (opcao == 2) {
                alunos();
            }

            if (opcao == 3) {
                estagiarios();
            }

            if (opcao == 4) {
                listaProfessores();
            }

            if (opcao == 5) {
                listaAlunos();
            }

            if (opcao == 6) {
                listaEstagiarios();
            }

            if (opcao == 7) {
                listaProfessores();
                listaAlunos();
                listaEstagiarios();
            }

        } while (opcao != 8);

    }

    public static void professores() {
        Scanner ler = new Scanner(System.in);
        Professor nova = new Professor();
        
        
        System.out.println("CADASTRAR PROFESSOR");
        System.out.println("Nome: ");
        nova.setNome(ler.nextLine());
        System.out.println("CPF: ");
        nova.setCPF(ler.nextLine());
        System.out.println("RG: ");
        nova.setRG(ler.nextLine());
        System.out.println("Data de Nascimento: ");
        nova.setDatanasc(ler.nextLine());
        System.out.println("Endereço");
        nova.setEndereco(ler.nextLine());        
        System.out.println("Data de Adimissão: ");
        nova.setDataAdmissao(ler.nextLine());
        System.out.println("Disciplinas: ");
        nova.setDisciplinas(ler.nextLine());
        nova.setCodFuncionario(codp);
        codp++;
        Professor.listProfessor.add(nova);
        
        System.out.println("PROFESSOR CADASTRADO");
        System.out.println();

    }

    public static void alunos() {
        Scanner ler = new Scanner(System.in);
        Aluno nova = new Aluno();
    
      
       
        
        System.out.println("CADASTRAR ALUNO");
        System.out.println("Nome: ");
        nova.setNome(ler.nextLine());
        System.out.println("CPF: ");
        nova.setCPF(ler.nextLine());
        System.out.println("RG: ");
        nova.setRG(ler.nextLine());
        System.out.println("Data de Nascimento: ");
        nova.setDatanasc(ler.nextLine());
        System.out.println("Endereço");
        nova.setEndereco(ler.nextLine());
      
        System.out.println("Curso: ");
        nova.setCurso(ler.nextLine());
        System.out.println("Data Ingresso: ");
        nova.setDataIngresso(ler.nextLine());
        System.out.println("Semestre: ");
        nova.setSemestre(ler.nextLine());
        System.out.println("Valor mensalidade: ");
        nova.setValorMensalidade(ler.nextLine());
        nova.setCodAluno(coda);
        coda++;
        Aluno.listAluno.add(nova);
        System.out.println("ALUNO CADASTRADO");

    }

    public static void estagiarios() {
        Scanner ler = new Scanner(System.in);
        Estagiario nova = new Estagiario();
        
        System.out.println("CADASTRAR ESTAGIARIO");
        System.out.println("Nome: ");
        nova.setNome(ler.nextLine());
        System.out.println("CPF: ");
        nova.setCPF(ler.nextLine());
        System.out.println("RG: ");
        nova.setRG(ler.nextLine());
        System.out.println("Data de Nascimento: ");
        nova.setDatanasc(ler.nextLine());
        System.out.println("Endereço");
        nova.setEndereco(ler.nextLine());
        System.out.println("Valor bolsa: ");
        nova.setValorBolsa(ler.nextLine());
        nova.setCodEstag(code);
        code++;
        Estagiario.listEstag.add(nova);
        System.out.println("ESTAGIÁRIO CADASTRADO");
        System.out.println();

    }

    public static void listaProfessores() {
        if (Professor.listProfessor.isEmpty()) {
            System.out.println("Não há Professores cadastrados");
        } else {
            for (Professor imp : Professor.listProfessor) {
                System.out.println("LISTA PROFESSORES");
                System.out.println("Nome: " + imp.getNome());
                System.out.println("CPF: " + imp.getCPF());
                System.out.println("RG: " + imp.getRG());
                System.out.println("Data de Nascimento:" + imp.getDatanasc());
                System.out.println("Endereço: " + imp.getEndereco());
                System.out.println("Código de Funcionário: " + imp.getCodFuncionario());
                System.out.println("Data de Admissão: " + imp.getDataAdmissao());
                System.out.println("Disciplinas: " + imp.getDisciplinas());
                System.out.println();

            }
        }
    }

    public static void listaAlunos() {
        if (Aluno.listAluno.isEmpty()) {
            System.out.println("Não há Alunos cadastrados");
        } else {
            for (Aluno imp : Aluno.listAluno) {
                System.out.println("LISTA ALUNOS");
                System.out.println("Nome: " + imp.getNome());
                System.out.println("CPF: " + imp.getCPF());
                System.out.println("RG: " + imp.getRG());
                System.out.println("Data de Nascimento:" + imp.getDatanasc());
                System.out.println("Endereço: " + imp.getEndereco());
                System.out.println("Código de Aluno: " + imp.getCodAluno());
                System.out.println("Curso: " + imp.getCurso());
                System.out.println("Data de Ingresso: " + imp.getDataIngresso());
                System.out.println("Semestre: " + imp.getSemestre());
                System.out.println("Valor mensalidade: " + imp.getValorMensalidade());
                System.out.println();
            }
        }
    }

    public static void listaEstagiarios() {
        if (Estagiario.listEstag.isEmpty()) {
            System.out.println("Não há Estagiários cadastrados");
        } else {
            for (Estagiario imp : Estagiario.listEstag) {
                System.out.println("LISTA ESTAGIARIOS");
                System.out.println("Nome: " + imp.getNome());
                System.out.println("CPF: " + imp.getCPF());
                System.out.println("RG: " + imp.getRG());
                System.out.println("Data de Nascimento:" + imp.getDatanasc());
                System.out.println("Endereço: " + imp.getEndereco());
                System.out.println("Valor bolsa: " + imp.getValorBolsa());
                System.out.println();

            }
        }
    }

}
