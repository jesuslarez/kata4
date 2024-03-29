package kata4.control;

import java.util.List;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author Jesus Larez
 */
public class Kata4 {

    public static void main(String[] args) {
        String fileName = new String("email.txt"); 
        List<Mail> mailList = MailListReader.read(fileName); //I
        Histogram histogram = MailHistogramBuilder.build(mailList); //P
        HistogramDisplay display = new HistogramDisplay(histogram);//O
        display.execute(); //O
    }
    
}
