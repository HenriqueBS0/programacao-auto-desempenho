package exercicio02;

import java.util.LinkedList;

public class ControladorNumeros {
    
    public LinkedList<Integer> numeros = new LinkedList<Integer>();
    public int numerosRestantes;
    public int limite; 

    public ControladorNumeros(int limite) {

        this.limite = limite;

        for (int i = 1; i <= limite; i++) {
            numeros.add(i);
        }

        numerosRestantes = limite;
    }

    public void tentarRemoverNumero(int numero) {
        if(numeros.get(numero -1 ) == null) {
            return;
        }

        System.out.println(numeros.get(numero - 1));
        numeros.set(numero -1 , null);
        numerosRestantes--;
    }
}
