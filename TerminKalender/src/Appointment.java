
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class Appointment {
    private LocalDateTime datum;
    private String text;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm");
    public LocalDateTime getDatum() {
        return datum;
    }

    public String getText() {
        return text;
    }
    
    
    public Appointment(LocalDateTime datum, String text) {
        this.datum = datum;
        this.text = text;
        
    }
    
    public String toString(){
        return String.format("%s --> %s",this.datum.format(dtf),this.text);
    }
    
    
    
}
