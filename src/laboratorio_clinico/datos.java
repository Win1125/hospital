/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_clinico;

import interfacez.Agendar_cita;
import static interfacez.Agendar_cita.jc_date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class datos {

    String turno = "", cliente = "", medico="", especialidad="", modalidad="", fecha_cita = "", hora_cita = "", sede = "";

    public void capturar_datos() {
        turno = Agendar_cita.txt_turn.getText();
        cliente = Agendar_cita.txt_client.getText();
        medico =  (String) Agendar_cita.cmb_medico.getSelectedItem();
        especialidad = (String) Agendar_cita.cmb_especialidad.getSelectedItem();
        modalidad = (String) Agendar_cita.cmb_modalidad.getSelectedItem();
        fecha_cita = ((JTextField) jc_date.getDateEditor().getUiComponent()).getText();
        hora_cita = Agendar_cita.combo_hora.getSelectedItem().toString();
        sede = (String) Agendar_cita.cmb_sede.getSelectedItem();

        //t_examen = Agendar_cita.combo_examen.getSelectedItem().toString();
        //n_examen = Agendar_cita.combo_examen.getSelectedItem().toString();
    }

    public void mostrar_datos() {
        JOptionPane.showMessageDialog(null, "Cita registrada con exito\n"
                + "Cita: #" + turno + "\n" + "Cliente: " + cliente + "\n"
                + "Medico:  " + medico + "\n" + "Especalidad:  " + especialidad + "\n" + "Modalidad: " + modalidad + "\n"
                + "Fecha Cita: " + fecha_cita + "\n" + "Hora Cita: " + hora_cita + "\n" + "Sede: " + sede);
                
    }
}
