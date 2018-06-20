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
public class Sistema {
    //Declaracao de variaveis
    private String cor;
    private String enderecoBusca;
    private String tipometodologia;
    private String tipoferramenta;
    private String tipodesistemadesenvolvido;
    private int quantidadePessoas;
    private String diasemana;
    private int velocidadememoria;
    private int entradas;
    private String sistemaoperacional;
    
      //Metodo construtor da classe sistema
        public Sistema(String cor, String enderecoBusca, String tipometodologia, String tipoferramenta, String tipodesistemadesenvolvido, int quantidadePessoas, String diasemana, String velocidadeMemoria, int entradas, String sistemaOperacional){
        this.cor=cor;
        this.enderecoBusca=enderecoBusca;
        this.tipometodologia=tipometodologia;
        this.tipoferramenta=tipoferramenta;
        this.tipodesistemadesenvolvido=tipodesistemadesenvolvido;
        this.quantidadePessoas=quantidadePessoas;
        this.sistemaoperacional=sistemaoperacional;
        this.entradas=entradas;
        this.velocidadememoria=velocidadememoria;
        this.diasemana=diasemana;
        }
        //metodo para mostrar a quantidade de pessoas que esta usando o sistema
    public void quantidadePessoasUsarSistema(){
        if (getQuantidadePessoas() > 40){
            System.out.println("Se essa quantidade de pessoas usar ao mesmo tempo o sistema, o sistema será congestionado e ficará lento");
        }else
            System.out.println("O sistema manterá=se normal");
                    
        }
    //Metodo para mostrar se o mes esta de manutencao do sistema ou nao
    public void MesdeManutencaoSistema(){
        switch(getDiasemana()){
    
        case "Janeiro":
           System.out.println("Sistema está em manutencao");
        case "Julho":
            System.out.println("Sistema está em manutencao");
        default:
            System.out.println("Sistema esta funcionando e não tem manutenção nesses meses");
                   }}
    //Metodo para mostrar se a quantidade de memoria esta apta pra usar o sistema
    public void MemoriaSistema(){
        if (getVelocidadememoria() > 500){
            System.out.println("Sistema está apto pra funcionamento");
        } else
            System.out.println("Sistema não está apto pra funcionamento");
        }
    public void LimitesEntrada(){
        if (getEntradas() > 10){
            System.out.println("Usuário não tem mais acesso ao sistema hoje");
        
    }else
    System.out.println("Usuarío ainda pode entrar no sistema hoje");
                  
}
        //Metodo para mostrar qual o tipo do windows que esta usando no sistema
    public void tipoWindows () {
        switch (getSistemaoperacional()){
            case "Windows 98":
                System.out.println("Não esta apto pra usar o sistema");
            case "Windows NT":
                System.out.println("Não esta apto pra usar o sistema");
            case "Windows XP":
                System.out.println("Não está apto pra usar o sistema");
            case "Windows 7":
                System.out.println("Esta apto pra usar o sistema");
            case "Windows 8":
                System.out.println("Esta apto pra usar o sistema");
            case "Windows 10":
                System.out.println("Está apto pra usar o sistema");
        }
        
        

}

    //Get e sets para retornar e sair os dados 
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEnderecoBusca() {
        return enderecoBusca;
    }

    public void setEnderecoBusca(String enderecoBusca) {
        this.enderecoBusca = enderecoBusca;
    }

    public String getTipometodologia() {
        return tipometodologia;
    }

    public void setTipometodologia(String tipometodologia) {
        this.tipometodologia = tipometodologia;
    }

    public String getTipoferramenta() {
        return tipoferramenta;
    }

    public void setTipoferramenta(String tipoferramenta) {
        this.tipoferramenta = tipoferramenta;
    }

    public String getTipodesistemadesenvolvido() {
        return tipodesistemadesenvolvido;
    }

    public void setTipodesistemadesenvolvido(String tipodesistemadesenvolvido) {
        this.tipodesistemadesenvolvido = tipodesistemadesenvolvido;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getDiasemana() {
        return diasemana;
    }

    public void setDiasemana(String diasemana) {
        this.diasemana = diasemana;
    }

    public int getVelocidadememoria() {
        return velocidadememoria;
    }

    public void setVelocidadememoria(int velocidadememoria) {
        this.velocidadememoria = velocidadememoria;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public String getSistemaoperacional() {
        return sistemaoperacional;
    }

    public void setSistemaoperacional(String sistemaoperacional) {
        this.sistemaoperacional = sistemaoperacional;
    }
    
}
