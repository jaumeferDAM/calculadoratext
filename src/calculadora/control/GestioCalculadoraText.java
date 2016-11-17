/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.control;

import calculadora.model.Operacions;

/**
 *
 * @author ALUMNEDAM
 */
public class GestioCalculadoraText implements IGestioCalculadora {

    private Operacions opers;
    private InterficieText intText;

    public GestioCalculadoraText() {
        this.opers = new Operacions();
        this.intText = new InterficieText();
        seleccionarOpcioMenu();
    }

   

    public void seleccionarOpcioMenu() {
        String accio = intText.mostrarMenu();

        switch (accio) {
            case "1":
                suma();
                break;
            case "2":
                resta();
                break;
            case "3":
                multiplicacio();
                break;
            case "4":
                divisio();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                intText.mostrarMissatge("Operacio Incorrecta");
                break;
        }
    }

    @Override
    public void suma() {
        this.intText.mostrarResultat(this.opers.suma(
                this.intText.demanarOperand("Introduir operand1"),
                this.intText.demanarOperand("Introduir operand2")));
    }

    @Override
    public void resta() {
        this.intText.mostrarResultat(this.opers.resta(
                this.intText.demanarOperand("Introduir operand1"),
                this.intText.demanarOperand("Introduir operand2")));
    }

    @Override
    public void multiplicacio() {
        this.intText.mostrarResultat(this.opers.multiplicacio(
                this.intText.demanarOperand("Introduir operand1"),
                this.intText.demanarOperand("Introduir operand2")));
    }

    @Override
    public void divisio() {
       double op1,op2,resultat;
               op1= this.intText.demanarOperand("Introduir operand1");
               op2= this.intText.demanarOperand("Introduir operand2");
               if(op2==0) {
                   this.intText.mostrarMissatge("No es pot dividir entre 0");
               } else{
                  this.intText.mostrarResultat(this.opers.divisio(op1, op2));
               }
    }
   
}
