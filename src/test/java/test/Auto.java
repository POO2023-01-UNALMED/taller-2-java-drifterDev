package test;

import test.Asiento;

public class Auto{
 String modelo;
 int precio;
 Asiento[] asientos;
 String marca;
 Motor motor;
 int registro;
 static int cantidadCreados; 

 public int cantidadAsientos(){
  int cantidad=0;
  for(int i =0;i<this.asientos.length;i++){
    if (this.asientos[i] instanceof Asiento){
      cantidad++;
    }
  }
  return cantidad;
 }

 public String verificarIntegridad(){
  if (this.motor.registro!=this.registro){
    return "Las piezas no son originales";
  }
  for (int j=0;j<this.asientos.length;j++){
    if (this.asientos[j] instanceof Asiento){
      if (this.asientos[j].registro!=this.registro){
        return "Las piezas no son originales";
      }
    }
  }
  return "Auto original";
 }
}