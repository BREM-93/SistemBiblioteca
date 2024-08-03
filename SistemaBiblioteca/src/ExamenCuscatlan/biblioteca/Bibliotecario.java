package ExamenCuscatlan.biblioteca;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public class Bibliotecario {
    private int idPersonal;

    public Bibliotecario(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void reserva(Pedido pedido, String fecha){
        pedido.reservar(new DateFormat() {
            @Override
            public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
                return null;
            }

            @Override
            public Date parse(String source, ParsePosition pos) {
                return null;
            }
        });
    }
    public void entrega(Pedido pedido, String fecha){
        pedido.entregar(new DateFormat() {
            @Override
            public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
                return null;
            }

            @Override
            public Date parse(String source, ParsePosition pos) {
                return null;
            }
        });
    }

    public int getIdPersonal( ) {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void add(Bibliotecario bibliotecario) {
    }
}
