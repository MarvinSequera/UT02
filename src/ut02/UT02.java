/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut02;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author marvin
 */
public class UT02 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double firstNum, secondNum, thirdNum, insideSquare, resultA, resultB;
        String beforeNum = "Introduce el valor del ";
        String afterNum = " coeficiente";
        System.out.println(beforeNum+"primer coeficiente"+afterNum);
        firstNum = scanner.nextDouble();
        System.out.println(beforeNum+"segundo"+afterNum);
        secondNum = scanner.nextDouble();
        System.out.println(beforeNum+"tercer"+afterNum);
        thirdNum = scanner.nextDouble();
        insideSquare = Math.pow(secondNum, 2.0)+(-4*firstNum*thirdNum);
        if(insideSquare < 0 ){
            System.out.println("No hay respuesta");
            return;
        }
        resultA = (-secondNum + Math.sqrt(insideSquare))/ (2 * firstNum);
        resultB = (-secondNum - Math.sqrt(insideSquare))/ (2 * firstNum);
        System.out.println("Las Repuesta son " + resultA + " y " + resultB);
    }
    
}
