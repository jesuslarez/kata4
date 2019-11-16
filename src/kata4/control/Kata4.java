/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.control;

import java.util.List;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author Usuario
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = new String("email.txt"); 
        List<Mail> mailList = MailListReader.read(fileName); //I
        Histogram histogram = MailHistogramBuilder.build(mailList); //P
        HistogramDisplay display = new HistogramDisplay(histogram);//O
        display.execute(); //O
    }
    
}
