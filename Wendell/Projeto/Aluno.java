/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;






/**
 *
 * @author PC
 */
public class Aluno {
     private String nome;
    private String telefone;
    private String endereco;
    private String sexo ;
    private int idade;
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int materias;
    private int valormensal;
    private int alunossala;
    private int quantidadefaltas;
     
    //metodo construtor da classe aluno
    public Aluno(String nome, String telefone, String endereco, String sexo, int idade, int n1, int n2, int n3, int n4, int materias, int valormensal, int alunossala, int quantidadefaltas) {
        this.nome=nome;
        this.telefone=telefone;
        this.endereco=endereco;
        this.sexo=sexo;
        this.idade=idade;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.materias=materias;
        this.valormensal=valormensal;
        this.alunossala=alunossala;
        this.quantidadefaltas=quantidadefaltas;
    }
    
    
    //Calcular a media da nota do aluno e saber atraves da media se ele ta aprovado ou nao
    public void MediaNota(){
        double media = getN1()+getN2()+getN3()+getN4()/4;
        if (media <= 7){
            System.out.println("Aluno Aprovado");
        }
        else 
            System.out.println("Aluno Reprovado");
    }
    //Quantas materias o aluno foi aprovado ou reprovado
    public void MateriasAprovadas(){
        if (getMaterias() == 5){
            System.out.println("Aluno Aprovado no semestre");
        }
        else if (getMaterias() == 4){
            System.out.println("Aluno aprovado com dependencia");
        }
        else if(getMaterias() <=3){
            System.out.println("Aluno Reprovado");
                    } }     
    //Mostrar qual e o pagamento que o aluno faz pelos estudos
        public void PagamentoMensalidade(){
          if (getValormensal() == 550){
              System.out.println("Pagamento com desconto");
          }        
          else if (getValormensal() >= 550){
              System.out.println("Pagamento sem desconto");
          }
          else if (getValormensal() < 550){
              System.out.println("Valor invalido");
          
        }}
        //Quantidade de alunos na sala
         public void QuantidadeAlunos() {
            if (getAlunossala() >= 15 && getAlunossala() <= 35){
                System.out.println("Turma formada");
            }
            
            else 
                System.out.println("Turma não formada");
            
          }        
         //Verificar a frequencia de aulas do aluno
         public void FrequenciaAulas(){
             if (getQuantidadefaltas() < 30){
                 System.out.println("Aluno não vai ser reprovado por falta");
             }
             else
                 System.out.println("Aluno vai ser reprovado por falta");
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

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }

    public int getValormensal() {
        return valormensal;
    }

    public void setValormensal(int valormensal) {
        this.valormensal = valormensal;
    }

    public int getAlunossala() {
        return alunossala;
    }

    public void setAlunossala(int alunossala) {
        this.alunossala = alunossala;
    }

    public int getQuantidadefaltas() {
        return quantidadefaltas;
    }

    public void setQuantidadefaltas(int quantidadefaltas) {
        this.quantidadefaltas = quantidadefaltas;
    }
    
}

