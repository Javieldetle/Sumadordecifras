package sumador;

public class ASumar {

	public int total(String valor_inicial) {

        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {

            // Cadena de un d�gito.

            String digito = valor_inicial.substring(i, i+1);

            suma = suma + Integer.parseInt(digito);  //Conversi�n de caracter a entero

        }

        return suma;

    }
}
