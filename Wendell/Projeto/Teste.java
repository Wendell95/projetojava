/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;






/**
 *
 * @author PC
 */
public class Teste {
    
   
    /**
     * @param args the command line arguments
     */
  
    

    public static void main(String[] args) {
          
        //Objeto da classe sistema
        Sistema s = new Sistema("Branco", "www.escolanet.com.br", "Ágil", "Mobile", "SO", 12, "Sexta", "300 MB", 2, "Windows 10");
        
       s.quantidadePessoasUsarSistema();
       s.mesDeManutencaoSistema();
       s.MemoriasSistema();
       s.LimitesEntrada();
       s.tipoWindows();
              System.out.println("Dados:"+s.getCor()+""+s.getenderecoBusca()+""+s.gettipometodologia()+""+s.gettipoferramenta()+""+s.getipodesistemadesenvolvido
              +""+s.getquantidadePessoas()+""+s.getdiasemana()+""+s.velocidadeMemoria+""+s.getentradas+""+s.sistemaOperacional());

        //Objeto da classe administrador
        Administrador a = new Administrador("Paulo", "4444", "Rua 12", "M", 12, 1220.00, 120.00, 12);
        
        a.calculoSaldoFGTS();
        a.calculoINSS();
        a.calculoSalarioLiquido();
        a.HoraExtra();
        a.SeguroDesemprego();
        System.out.println("Dados:"+a.getNome()+""+a.getTelefone()+""+
                a.getEndereco()+""+a.getSexo()+""+a.getIdade()+""+a.getSalario()+""+a.getDesconto()+""+a.getNumerohoras());
        
         //Objeto da classe servidor
        Servidor s1 = new Servidor("Julio", "3333", "Rua 15", "M", 14, 500.00, 10.00, 10);
         System.out.println("Dados:"+s1.getNome()+""+s1.getTelefone()+""+
                s1.getEndereco()+""+s1.getSexo()+""+s1.getIdade()+""+s1.getSalario()+""+s1.getDesconto()+""+s1.getNumerohoras());
         s1.calculoSaldoFGTS();
        s1.calculoINSS();
        s1.calculoSalarioLiquido();
        s1.HoraExtra();
        s1.SeguroDesemprego();
          //Objeto da classe professor
         Professor p = new Professor("Julia", "33333333", "Rua 5", "F", 12, 3500.00, 110.00, 50);
           System.out.println("Dados:"+p.getNome()+""+p.getTelefone()+""+
               p.getEndereco()+""+p.getSexo()+""+p.getIdade()+""+p.getSalario()+""+p.getDesconto()+""+p.getNumerohoras());
           p.calculoSaldoFGTS();
        p.calculoINSS();
        p.calculoSalarioLiquido();
        p.HoraExtra();
        p.SeguroDesemprego();
            //Objeto da classe diretor
           Diretor d = new Diretor("Joao", "55555", "Rua 19", "M", 111, 2300.00, 340.00, 10);
            System.out.println("Dados:"+d.getNome()+""+d.getTelefone()+""+
                d.getEndereco()+""+d.getSexo()+""+d.getIdade()+""+d.getSalario()+""+d.getDesconto()+""+d.getNumerohoras());
            d.calculoSaldoFGTS();
        d.calculoINSS();
        d.calculoSalarioLiquido();
        d.HoraExtra();
        d.SeguroDesemprego();
             //Objeto da classe coordenador
            Coordenador c = new Coordenador("Amilton", "111111", "Rua 50", "M", 222, 3000.00, 140.00, 60);
            System.out.println("Dados:"+c.getNome()+""+c.getTelefone()+""+
                c.getEndereco()+""+c.getSexo()+""+c.getIdade()+""+c.getSalario()+""+c.getDesconto()+""+c.getNumerohoras());
            c.calculoSaldoFGTS();
        c.calculoINSS();
        c.calculoSalarioLiquido();
        c.HoraExtra();
        c.SeguroDesemprego();
            //Objeto da classe aluno
            Aluno aa = new Aluno("Pedro", "4444444", "Rua 18", "M",20, 2, 4, 6, 8, 15, 800, 32,10);
            System.out.println("Dados:"+aa.getNome()+""+aa.getTelefone()+""+
                aa.getEndereco()+""+aa.getSexo()+""+aa.getIdade()+""
                    +aa.getN1()+""+aa.getN2()+""+aa.getN3()+""+aa.getN4()+""+
                            aa.getMaterias()+""+aa.getValormensal()+""+aa.getAlunossala()
                            +aa.getQuantidadefaltas());
            
            a.MediaNota();
            a.MateriasAprovadas();
            a.PagamentoMensalidade();
            a.QuantidadeAlunos();
            a.FrequenciaAulas();
    }}
