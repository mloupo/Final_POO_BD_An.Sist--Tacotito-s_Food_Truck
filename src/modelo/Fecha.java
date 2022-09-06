package modelo;

import java.util.Calendar;

/**
 *
 * @author Zen
 */
public class Fecha {

    int dia;
    int mes;
    int año;

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

    public Fecha() {
        dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mes = Calendar.getInstance().get(Calendar.MONTH + 1);
        año = Calendar.getInstance().get(Calendar.YEAR);
    }

}
