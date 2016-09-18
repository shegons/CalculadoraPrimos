package com.example.alumno.calculadoraprimos;

/**
 * Created by alumno on 15/09/2016.
 */
public class posPrimos {

    static int numPrimo(int pos){
        int numAct = 0;
        int posAct = 0;

        do{
            numAct++; //cada vez que entra al bucle aumenta el valor del numero actual
            if(esPrimo(numAct)==true) posAct ++; //si el numAct es primo, aumenta una posicion
        }while(posAct != pos);
        //sale del bucle si el valor de la posicion actual es igual a la posicion recibida

        return numAct;
    }

    //comprueba si es primo
    static boolean esPrimo(int num){

        int i = 2;
        boolean primo = true;

        //cuando el número sea primo no volvera a entrar en el bucle
        while(i<num && primo==true){
            if((num%i)==0) primo = false; //no es primo
            else i++;
        }

        if(primo==false) return false;
        else return true;
    }
}
