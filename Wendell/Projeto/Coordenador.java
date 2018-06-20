/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Coordenador {
    
    //Declaracao de variaveis
    private String nome;
    private String telefone;
    private String endereco;
    private String sexo;
    private int idade;
    private double salario;
    private double desconto;
    private int numerohoras;
    //Metodo construtor da classe coordenador
    public Coordenador(String nome, String telefone, String endereco, String sexo, int idade, double salario, double desconto, int numerohoras){
    }
    //Metodo para calcular o FGTS
    public void CalculoSaldoFGTS(){
        double result= salario* 0.08;
    }
    //Metodo para calcular o INSS
     public void CalculoINSS(){
        double result= salario* 0.09;
    }
     //Metodo para calcular o salario
     public void CalculoSalarioLiquido(){
         double result= salario*0.09;
         double result1=salario-getDesconto()-result;
     }
     //Metodo para calcular a hora extra
     public void HoraExtra(){
         double result= getNumerohoras()/6;
         double result1=result*30;
         double result2=salario/result1;
     }
     //Metodo para calcular o seguro desemprego
     public void seguroDesemprego(){
         double result= salario*3/3;
         double result1= result-1222.77*0.5+978.22; 
     }
     //Get e sets para retornar e sair os dados 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getNumerohoras() {
        return numerohoras;
    }

    public void setNumerohoras(int numerohoras) {
        this.numerohoras = numerohoras;
    }

}

