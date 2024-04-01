package TocadoYHundido;

import java.util.HashMap;
import java.util.Map;
public class RegistroBarcos {
    private Map<String, HashMap<Integer,Barco>> tiposBarcos;
    private Map<Integer,Barco>numBarcos;
    private Map<String, Barco>nombreBarcos;

    public RegistroBarcos(){
        tiposBarcos = new HashMap<>();
        numBarcos = new HashMap<>(15);
        nombreBarcos = new HashMap<>(15);
    }

    //Cargar en las tablas por tipo

    public void cargarBarco(String tipo, int num, Barco barco){
        if(tiposBarcos.containsKey(tipo)){
            tiposBarcos.get(tipo).put(num, barco);
        }else{
            HashMap<Integer, Barco> aux = new HashMap<>();
            aux.put(num, barco);
            tiposBarcos.put(tipo, aux);
        }
        numBarcos.put(num, barco);
        nombreBarcos.put(barco.getClass().getSimpleName(), barco);
    }
}
