import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio Rios
 */
public class Principal {

    // CREAMOS EL ARREGLO DE 4 POSICIONES
    private static int arreglo[] = new int[4];
    // CREAMOS EL OBJETO VECTOR
    private static VectorEstatico vector = new VectorEstatico(arreglo);

    // METODO MAIN
    public static void main(String[] args) {
        // LLAMAMOS AL METODO MENU
        menu();

    }

    // METODO MENU DONDE CREAMOS EL MENU DEL PROGRAMA
    public static void menu() {

        // VARIABLE DE SELECCION ES DECIR LA QUE SE ENCARGA DE DECIDIR QUE OPCION DEL
        // SWITCH
        int seleccion = 0;
        do {

            // VARIABLE DE OPCIONES
            String opciones = "Ingrese la opcion deseada: \n1.Ingresar de una vez \n2.Ingresar 1x1" +
                    "\n3.Mostrar arreglo completo \n4.Mostrar por Indice \n5.Buscar elemento \n6.Salir";

            // VARIABLE OPCION QUE GUARDARA SOLAMENTE LA OPCION QUE EL USUARIO ELIJA
            String opcion = JOptionPane.showInputDialog(null, opciones);

            // GUARDAMOS EN LA VARIABLE SELECCION Y PARSEAMOS
            seleccion = Integer.parseInt(opcion);

            // SWITCH CON LAS DIFERENTES OPCIONES DEL MENU Y LLAMAMOS AL METODO
            // CORRESPONDIENTE
            switch (seleccion) {
                case 1:
                    vector.LlenarVector();
                    break;

                case 2:
                    vector.LlenarArreglo1X1();
                    break;

                case 3:
                    vector.MostrarVectorCompleto();
                    break;

                case 4:
                    // VARIABLE INDICE
                    int indice = 0;
                    // GUARDAMOS EN UN STRING EL NUMERO QUE DIGITE EL USUARIO
                    String numero = JOptionPane.showInputDialog(null, "Ingrese el indice que desea buscar");
                    // PARSEAMOS
                    indice = Integer.parseInt(numero);
                    // LLAMAMOS AL METODO
                    vector.MostrarElementoPorIndice(indice);
                    break;

                case 5:
                    // VARIABLE INDICE
                    int elemento = 0;
                    // GUARDAMOS EN UN STRING EL NUMERO QUE DIGITE EL USUARIO
                    String numeroABuscar = JOptionPane.showInputDialog(null, "Ingrese el indice que desea buscar");
                    // PARSEAMOS
                    elemento = Integer.parseInt(numeroABuscar);
                    // LLAMAMOS AL METODO
                    vector.MostrarElementoPorBusqueda(elemento);
                    break;

                case 6:
                    // FIN DEL PROGRAMA
                    JOptionPane.showMessageDialog(null, "FIN DEL PROGRAMA");
                    System.exit(0);
                    break;

                default:
                    // OPCION DEFAULT
                    JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
                    break;
            }

            // MIENTRAS SELECCION SEA DIFERENTE A 6
        } while (seleccion != 6);
    }// FIN DE MENU

}// FIN DE LA CLASE
