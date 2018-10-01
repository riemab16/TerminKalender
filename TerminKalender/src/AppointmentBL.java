
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class AppointmentBL extends AbstractListModel {
    ArrayList<Appointment> appointments = new ArrayList<>();

    @Override
    public int getSize() {
        return this.appointments.size();
    }

    @Override
    public Object getElementAt(int i) {
       return appointments.get(i);
    }
    
    

    public void add(Appointment ap) {
        this.appointments.add(ap);
        fireIntervalAdded(ap, this.appointments.size()-1, this.appointments.size()-1);
    }
}
