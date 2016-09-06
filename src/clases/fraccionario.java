/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author yescobar7
 */
public class fraccionario {
private int numerador;
private int denominador;

public fraccionario(int numerador, int denominador){
this.numerador=numerador;
this.denominador=denominador;
}

public int getNumerador() {
return numerador;
}

public void setNumerador(int numerador) {
this.numerador = numerador;
}

public int getDenominador() {
return denominador;
}

public void setDenominador(int denominador) {
this.denominador = denominador;
}

public fraccionario Sumar(fraccionario f2){
fraccionario f;
int num, den;
num = this.numerador * f2.denominador + this.denominador * f2.numerador;
den= this.denominador * f2.denominador;
f= new fraccionario(num,den);
return f;
}
public fraccionario Restar(fraccionario f2){
fraccionario f;
int num, den;
num= this.numerador * f2.denominador - this.denominador * f2.numerador;
den= this.denominador * f2.denominador;
f= new fraccionario(num, den);
return f;
}
public fraccionario Multiplicacion(fraccionario f2){
fraccionario f;
int num, den;
num= this.numerador * f2.numerador;
den= this.denominador * f2.denominador;
f= new fraccionario(num, den);
return f;
}
}
