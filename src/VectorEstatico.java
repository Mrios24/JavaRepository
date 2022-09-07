import javax.swing.JOptionPane;

public class VectorEstatico {

    // CREAMOS EL VECTOR O ARRAY ESTATICO NUMERICO

    int arreglo[];

    // VARIABLE GLOBAL CONTADOR PARA SABER Y GUARDAR LA POSICION DEL VECTOR PARA
    // GUARDAR UNO POR UNO
    int contador = 0;

    // OTRAS FORMAS DE CREARLO E INICIALIZARLO DE FORMA MAS DIRECTA
    /*
     * int [] arreglo = new int [4];
     */

    public VectorEstatico(int[] arreglo) {
        this.arreglo = arreglo;
    }

    // METODO PARA LLENAR EL ARREGLO DE UNA VEZ
    public void LlenarVector() {
        // CREAMOS UN FOR PARA RECORRER EL ARREGLO Y LLENARLO
        for (int i = 0; i < arreglo.length; i++) {
            // CREAMOS UNA VARIABLE LLAMADA NUMERO PARA GUARDARLA EN EL ARREGLO POR MEDIO DE
            // LA ENTRADA JOptionPane
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
            // SE ASIGNA EL NUMERO A LA POSICION i EN EL ARREGLO
            arreglo[i] = numero;
        } // FIN DEL FOR

    }// FIN DEL METODO LLENAR VECTOR

    // CREAMOS METODO PARA LLENAR EL ARREGLO UNO X UNO

    public void LlenarArreglo1X1() {

        if (contador < arreglo.length) {
            // CREAMOS UNA VARIABLE LLAMADA NUMERO PARA GUARDARLA EN EL ARREGLO POR MEDIO DE
            // LA ENTRADA JOptionPane
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));

            // ASIGNAMOS AL VECTOR EL NUMERO, UTILIZANDO LA VARIABLE CONTADOR COMO INDICE
            arreglo[contador] = numero;

            // AUMENTAMOS EL CONTADOR EN UNO
            contador++;
        } else {
            JOptionPane.showMessageDialog(null, "LIMITE EXCEDIDO, NO SE PERMITE INGRESAR MAS");
        }

    }// FIN DE METODO LLENAR ARREGLO 1X1

    // MOSTRAR EL ARREGLO

    // FORMA #1
    public void MostrarVectorCompleto() {
        // CRAMOS UNA VARIABLE LLAMADA RESPUESTA PARA GUARDAR LA INFORMACION DEL ARREGLO
        String respuesta = "";

        // POR MEDIO DE UN FOR EACH RECORREMOS EL ARREGLO, ESTO SE PUEDE HACER CON EL
        // FOR NORMAL TAMBIEN
        for (int i : arreglo) {

            // GUARDAMOS ACUMULATIVAMENTE EN LA VARIABLE RESPUESTA ESTA CADENA DE TEXTO CON
            // LA INFORMACION DEL VECTOR
            respuesta += "El numero en el arreglo" + " es: " + i + "\n";

        } // FIN DE FOR

        // MOSTRAMOS POR MEDIO DE JOptionPane EL RESULTADO
        JOptionPane.showMessageDialog(null, respuesta, "Informacion del arreglo", 1);
    }// FIN DE METODO MOSTRAR EL VECTOR COMPLETO

    // FORMA #2

    public void MostrarElementoPorIndice(int indice) {
        // CRAMOS UNA VARIABLE LLAMADA RESPUESTA PARA GUARDAR LA INFORMACION DEL ARREGLO
        String respuesta = "";

        // CREAMOS ESTA CONDICIONAL PARA ASEGURARNOS QUE EL INDICE ESTE DENTRO DEL RANGO
        // DEL ARREGLO PARA EVITAR ERRORES
        if (indice >= 0 && indice <= arreglo.length) {
            // GUARDAMOS EN LA VARIABLE RESPUESTA ESTA CADENA DE TEXTO CON
            // LA INFORMACION DEL ELEMENTO BUSCADO POR INDICE
            respuesta = "El numero en el arreglo en la posicion: " + indice + " es: " + arreglo[indice];

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
        for (int i = 0; i < arreglo.length; i++) {

            // CONDICIONAL PARA BUSCAR EL ELEMENTO EN EL ARREGLO
            if (elemento == arreglo[i]) {
                // SI EXISTE LO MUESTRA
                respuesta = "El numero es: " + arreglo[i] + " y esta en la posicion: " + i;

            } else {
                // SI NO EXISTE DA EL SIGUIENTE MENSAJE
                respuesta = "NUMERO NO ENCONTRADO, INTENTE DE NUEVO";
            }
        } // FIN DE FOR

        // MOSTRAMOS POR MEDIO DE JOptionPane EL RESULTADO
        JOptionPane.showMessageDialog(null, respuesta, "Informacion del arreglo", 1);

    }// FIN DEL METODO MOSTRAR ELEMENTO POR BUSQUEDA

}
