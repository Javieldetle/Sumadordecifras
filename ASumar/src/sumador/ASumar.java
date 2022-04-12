package sumador;

public class ASumar {

	public int total(String valor_inicial) {

        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {

            // Cadena de un dígito.

            String digito = valor_inicial.substring(i, i+1);

            suma = suma + Integer.parseInt(digito);  //Conversión de caracter a entero

        }

        return suma;

    }
}
