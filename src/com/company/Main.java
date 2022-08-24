package com.company;

import java.util.Scanner;

public class Main {

    static String nome, rg, cpf;
    static int idade, unidade, escolha;

    public static void main(String[] args) {

        boasVindas();
        cadastro();
        escolhaUnidade();
        relatorio();

    }

    static void boasVindas(){
        System.out.println("============================");
        System.out.println("Bem Vindo ao Sistema Fiep!!!");
        System.out.println("============================");
    }

    static void cadastro(){
        Scanner scanner = new Scanner(System.in);
        Scanner registroGeral = new Scanner(System.in);
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite sua Idade: ");
        idade = scanner.nextInt();
        System.out.println("Digite seu RG: ");
        rg = registroGeral.nextLine();
        System.out.println("Digite seu CPF: ");
        cpf = leitura.nextLine();
        System.out.println("Parabéns " + nome + " seu cadastro foi efetuado com sucesso!");
    }

    static void escolhaUnidade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println(nome + " Qual unidade do Senai você gostaria de realizar seus estudos? ");
        System.out.println("(1) Unidade Senai CIC");
        System.out.println("(2) Unidade Senai Jardim Botânico");
        System.out.println("(3) Unidade Senai Dr. Celso Charuri");
        System.out.println("(4) Unidade Senai Boqueirão");
        System.out.println("=============================================================");
        unidade = scanner.nextInt();
        if(unidade == 1){
            System.out.println("A unidade Escolhida foi Senai CIC");
            escolhaCurso();
        }else if (unidade == 2){
            System.out.println("A unidade Escolhida foi Senai Jardim Botânico");
            escolhaCurso();
        }else if (unidade == 3){
            System.out.println("A unidade Escolhida foi Senai Dr.Celso Charuri");
            escolhaCurso();
        }else if(unidade == 4){
            System.out.println("A unidade Escolhida foi Senai Boqueirão");
            escolhaCurso();
        }else{
            System.out.println("Essa Unidade nao existe, ERROR 404");
        }

    }
    static void escolhaCurso(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("Os cursos disponiveis na unidade são: ");
        System.out.println("(1) Desenvolvimento de Sistemas");
        System.out.println("(2) Mecatrônica");
        System.out.println("(3) Gastronomia");
        System.out.println("(4) Administração");
        System.out.println("=============================================================");
        escolha = scanner.nextInt();
        if(escolha == 1){
            System.out.println("Curso escolhido foi Desenvolvimento de Sistemas");
        }else if(escolha == 2){
            System.out.println("Curso escolhido foi Mecatrônica");
        }else if (escolha == 3){
            System.out.println("Curso escolhido foi Gastronomia");
        }else if(escolha == 4){
            System.out.println("Curso escolhido foi Administração");
        }


    }

    static void relatorio(){
        System.out.println("=============================================================");
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("CPF: " + cpf + "     " + "RG: " + rg);
        System.out.println("ID da unidade: " + unidade);
        System.out.println("ID do curso: " + escolha);
        System.out.println("=============================================================");
    }


}
