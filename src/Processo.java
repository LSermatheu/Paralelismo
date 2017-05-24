
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
public class Processo extends Thread {
    //extends p/ designar herança. Threads é superclasse nativa da linguagem
    int sleepTime;
    JFrame frame = new JFrame();
    JPanel painel = new JPanel();
    JLabel label = new JLabel();
    
    public Processo(String nome){
        super(nome);
        //calculo do tempo de dormencia entre 0 e 5 seg
        sleepTime = (int)(Math.random() * 5000);
        // 5000 milisegundos = 5 seg 
        // sleepTime é um inteiro, mas math.random retorna um double, é necessário portanto fazer um cast (int)
        label.setText("teste");
        painel.add(label);
        painel.setBackground(Color.getHSBColor((float)(Math.random() * 1000), (float)sleepTime, (float)sleepTime));
        frame.add(painel);
        frame.setSize(50, 220);
        System.out.println("A thread " + getName() + " irá dormir por " + sleepTime + " ms");
                
    }//fim do construtor
    
    //Metodo para execução da thread
    @Override
    public void run(){
        try {
            frame.setLocation((int)(Math.random() * 1000), (int)(Math.random() * 1000));
            frame.setVisible(true);
            sleep(sleepTime);
            
        } catch (InterruptedException ex) {
            System.out.println("A Thread " + getName() + " foi interrompida!!");
            
        }
        System.err.println("A Thread " + getName() + "====> ACORDOU");
        frame.setVisible(false);
    
    }
    
    
    
    
}//fim da classe
