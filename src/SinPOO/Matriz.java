package SinPOO;
import javax.swing.JOptionPane;

public class Matriz {

    // CREAMOS EL VECTOR O ARRAY ESTATICO NUMERICO
    int[][] matriz;

    // VARIABLE GLOBAL CONTADOR PARA SABER Y GUARDAR LA POSICION DEL VECTOR PARA
    // GUARDAR UNO POR UNO
    int contador = 0;
    int contador2 = 0;
    int contadorIngresados = 0;

    // OTRAS FORMAS DE CREARLO E INICIALIZARLO DE FORMA MAS DIRECTA
    /*
     * int [][] matriz = new int [2][2];
     */

    // CONSTRUCTOR
    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void IngresarElementos() {

        if (contadorIngresados < (matriz.length * matriz.length)) {
            // CREAMOS UNA VARIABLE LLAMADA NUMERO PARA GUARDARLA EN EL ARREGLO POR MEDIO DE
            // LA ENTRADA JOptionPane
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));

            // CONDICIONAL PARA SABER SI EL CONTADOR 2 QUE SERIA EL DE LAS COLUMNAS HA
            // LLEGADO AL TOPE ESTO PARA UN BUEN LLENADO DE LA MATRIZ
            if (contador2 >= matriz.length) {
                // SI HA LLEGAGO AL TOPE LA VARIABLE CONTADOR2 SE REINICIA A 0 Y SE AUMENTA EL
                // CONTADOR EN 1
                contador2 = 0;
                contador++;
            }

            // ASIGNAMOS AL VECTOR EL NUMERO, UTILIZANDO LA VARIABLE CONTADOR COMO INDICE
            matriz[contador][contador2] = numero;

            // CONDICIONAL PARA AUMENTAR EN 1 EL CONTADOR2
            if (contador2 < matriz.length) {
                contador2++;
            }

            contadorIngresados++;

        } else {
            JOptionPane.showMessageDialog(null, "LIMITE EXCEDIDO, NO SE PERMITE INGRESAR MAS");
        }

    }// FIN DE METODO INGRESAR

    // MOSTRAR EL ARREGLO

    // FORMA #1
    public void MostrarElementos() {
        // CRAMOS UNA VARIABLE LLAMADA RESPUESTA PARA GUARDAR LA INFORMACION DEL ARREGLO
        String respuesta = "";

        // POR MEDIO DE UN FOR ANIDADO RECORREMOS LA MATRIZ
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // GUARDAMOS ACUMULATIVAMENTE EN LA VARIABLE RESPUESTA ESTA CADENA DE TEXTO CON
                // LA INFORMACION DEL VECTOR
                respuesta += "El numero en el arreglo en la posicion: [" + i + "," + j + "]" + " es: " + matriz[i][j]
                        + "\n";
            }

        } // FIN DE FOR

        // MOSTRAMOS POR MEDIO DE JOptionPane EL RESULTADO
        JOptionPane.showMessageDialog(null, respuesta, "Informacion del arreglo", 1);
    }// FIN DE METODO MOSTRAR EL VECTOR COMPLETO

    public void MostrarElementoPorIndice(int indice1, int indice2) {
        // CRAMOS UNA VARIABLE LLAMADA RESPUESTA PARA GUARDAR LA INFORMACION DEL ARREGLO
        String respuesta = "";

        // CREAMOS ESTA CONDICIONAL PARA ASEGURARNOS QUE EL INDICE ESTE DENTRO DEL RANGO
        // DEL ARREGLO PARA EVITAR ERRORES
        if (indice1 >= 0 && indice1 <= matriz.length && indice2 >= 0 && indice2 <= matriz.length) {
            // GUARDAMOS EN LA VARIABLE RESPUESTA ESTA CADENA DE TEXTO CON
            // LA INFORMACION DEL ELEMENTO BUSCADO POR INDICE
            respuesta += "El numero en el arreglo en la posicion: [" + indice1 + "," + indice2 + "]" + " es: "
                    + matriz[indice1][indice2]
                    + "\n";

            // MOSTRAMOS POR MEDIO DE JOptionPane EL RESULTADO
            JOptionPane.showMessageDialog(null, respuesta, "Informacion del arreglo", 1);

        } else {
            // ACA LE INDICAMOS AL USUARIO QUE INGRESO UN NUMERO FUERA DEL LIMITE DEL
            // ARREGLO
            JOptionPane.showMessageDialog(null, "Indice fuera de limites del arreglo", "ERROR", 0);
        }

    }// FIN DEL METODO MOSTRAR ELEMENTO POR INDICE

    // FORMA #3
    public void MostrarElementoPorBusqueda(int elemento) {
        // CRAMOS UNA VARIABLE LLAMADA RESPUESTA PARA GUARDAR LA INFORMACION DEL ARREGLO
        String respuesta = "";

        // FOR PARA RECORRER EL ARREGLO
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                // CONDICIONAL PARA BUSCAR EL ELEMENTO EN EL ARREGLO
                if (elemento == matriz[i][j]) {

                    // SI EXISTE LO MUESTRA
                    respuesta = "El numero es: " + matriz[i][j] + " y esta en la posicion: [" + i + "," + j + "]";
                    JOptionPane.showMessageDialog(null, respuesta, "Informacion del arreglo", 1);
                    return;

                } else {
                    // SI NO EXISTE DA EL SIGUIENTE MENSAJE
                    respuesta = "NUMERO NO ENCONTRADO, INTENTE DE NUEVO";

                }
            } // FIN DE FOR

        } // FIN DE FOR

        // MOSTRAMOS POR MEDIO DE JOptionPane EL RESULTADO
        JOptionPane.showMessageDialog(null, respuesta, "Informacion del arreglo", 1);

    }// FIN DEL METODO MOSTRAR ELEMENTO POR BUSQUEDA

}
