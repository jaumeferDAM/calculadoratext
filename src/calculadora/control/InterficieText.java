/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.control;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ALUMNEDAM
 */
public class InterficieText {
    Scanner lector = new Scanner(System.in);
     public String mostrarMenu() {

            System.out.println("\nSeleccionar opció: "
                    + "\n1 Sumar."
                    + "\n2 Restar"
                    + "\n3 Multiplicar"
                    + "\n4 Divisió"
                    + "\n5 Sortir");
            return lector.nextLine();
        }

        public double demanarOperand(String missatge) {
            System.out.println(missatge);
            double oper = lector.nextDouble();
            return oper;
        }

        public void mostrarResultat(double resultat) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            System.out.println("Resultat: " + formatter.format(resultat));
        }

        public void mostrarMissatge(String missatge) {
            System.out.println(missatge);
        }
        
}
