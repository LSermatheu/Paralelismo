/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lincoln
 * @since Classe criada em 22/02/2017
 */
public class TestaThread {
    public static void main(String []args){
        Processo P1, P2, P3, P4;
        int i = 0;
        while (i<100){
            P1 = new Processo("Fatec Ipiranga");
            P2 = new Processo("Lincoln");
            P3 = new Processo ("aaa");
            P4 = new Processo ("o rato roeu a roupa do rei de roma");
        
            P1.start();
            P2.start();
            P3.start();
            P4.start();
            i++;
        
        }//fim while
    
    
    }// fim do main

    private static void While(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}//fim da classe
