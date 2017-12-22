/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatediffdate;

import java.util.Date;

/**
 *
 * @author Sergio
 */
public class CalculateDiffDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(calculateDiffDate(new Date(),new Date("2018/02/21 15:00:00") )); 
        
    }

    public static String calculateDiffDate(Date fechaInicio, Date fechaFin) {

        int diferencia = (int) ((fechaFin.getTime() - fechaInicio.getTime()) / 1000);

        int dias = 0;
        int horas = 0;
        int minutos = 0;
        if (diferencia > 86400) {
            dias = (int) Math.floor(diferencia / 86400);
            diferencia = diferencia - (dias * 86400);
        }
        if (diferencia > 3600) {
            horas = (int) Math.floor(diferencia / 3600);
            diferencia = diferencia - (horas * 3600);
        }
        if (diferencia > 60) {
            minutos = (int) Math.floor(diferencia / 60);
            diferencia = diferencia - (minutos * 60);
        }
        return "Hay " + dias + " dias, " + horas + " horas, " + minutos + " minutos y " + diferencia + " segundos de diferencia";

    }

}
