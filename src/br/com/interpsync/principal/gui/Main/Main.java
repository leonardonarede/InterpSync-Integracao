/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.interpsync.principal.gui.Main;
import br.com.interpsync.controller.Integracao;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Leonardo
 */
public class Main {
    public static void main(String[] args) {
        int tempo = 300;
        int periodo = 30000;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
        {
           public void run()
           {
            Integracao integra = new Integracao();
            integra.executar();
           }
        }, tempo, periodo);

    }
}
