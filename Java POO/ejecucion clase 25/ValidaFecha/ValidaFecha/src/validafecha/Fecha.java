/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validafecha;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author clabl
 */
public class Fecha {
    private int dia, mes, anno;
    
    public Fecha(){
        Date fecha = new Date();
        DateFormat formatfecha = new SimpleDateFormat("dd/MM/yyyy");
        String sFecha = formatfecha.format(fecha);
        String[] partes = sFecha.split("/");
        
        this.dia = Integer.parseInt(partes[0]);
        this.mes = Integer.parseInt(partes[1]);
        this.anno = Integer.parseInt(partes[2]);
    }
    
    public Fecha(int dia, int mes, int anno){
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }
    
    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getMes(){
        return this.mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getAnno(){
        return this.anno;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }
    
    public Calendar getFecha(){
        Calendar fecha = new GregorianCalendar(this.anno, this.mes, this.dia);
        System.out.println(fecha);

        return fecha;
    }
    
    public boolean fechaCorrecta(Calendar fecha){
        try{
            SimpleDateFormat formatFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatFecha.setLenient(false);
            formatFecha.parse(fecha);
        } catch (ParseException e){
            return false;
        }
        return true;
    }
    
    public String diaSiguiente(String fecha){
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anno = Integer.parseInt(partes[2]);
        Date fechareal = new Date(anno, mes, dia);
        Calendar c = Calendar.getInstance();
        c.setTime(fechareal);
        c.add(Calendar.DAY_OF_MONTH, 1);
        fechareal = c.getTime();
        DateFormat formatfecha = new SimpleDateFormat("dd/MM/yyyy");
        String sFecha = formatfecha.format(fechareal);
        
        return sFecha;
    }
}
