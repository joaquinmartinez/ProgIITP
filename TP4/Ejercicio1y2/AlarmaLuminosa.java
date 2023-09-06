package TP4.Ejercicio1y2;
/*Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
encienda una luz cuando alguno de los indicadores está activado.
Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
método encender(). */
public class AlarmaLuminosa extends Alarma {

    
    public AlarmaLuminosa(){
        super();
    }


    public void encenderLuz(){
        for(int i = 0; i < sensores.size(); i++){
            if(sensores.get(i).comprobar()){
                //Luz.encender();
                sensores.get(i).toString();
            }
            
        }

    }



}
