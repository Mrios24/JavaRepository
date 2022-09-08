package POO;

import javax.swing.JOptionPane;

/**
 *
 * Mauricio Rios
 */
public class Principal {

    // CREAMOS EL ARREGLO DE 2x2 POSICIONES
    private static int arreglo[][] = new int[2][2];
    // CREAMOS EL OBJETO VECTOR
    private static Matriz matriz = new Matriz(arreglo);

    public static void main(String[] args) {
        menu();

    }

    // METODO MENU DONDE CREAMOS EL MENU DEL PROGRAMA
    public static void menu() {

        // VARIABLE DE SELECCION ES DECIR LA QUE SE ENCARGA DE DECIDIR QUE OPCION DEL
        // SWITCH
        int seleccion = 0;
        do {

            // VARIABLE DE OPCIONES
            String opciones = "Ingrese la opcion deseada: \n1.Ingresar \n2.Mostrar Elementos" +
                    "\n3.Mostrar por Indice \n4.Buscar elemento \n5.Salir";

            // VARIABLE OPCION QUE GUARDARA SOLAMENTE LA OPCION QUE EL USUARIO ELIJA
            String opcion = JOptionPane.showInputDialog(null, opciones);

            // GUARDAMOS EN LA VARIABLE SELECCION Y PARSEAMOS
            seleccion = Integer.parseInt(opcion);

            // SWITCH CON LAS DIFERENTES OPCIONES DEL MENU Y LLAMAMOS AL METODO
            // CORRESPONDIENTE
            switch (seleccion) {
                case 1:
                    matriz.IngresarElementos();

                    break;

                case 2:
                    matriz.MostrarElementos();
                    break;

                case 3:
                    // VARIABLE INDICE
                    int indice1 = 0;
                    int indice2 = 0;
                    // GUARDAMOS EN UN STRING EL NUMERO QUE DIGITE EL USUARIO
                    String n1 = JOptionPane.showInputDialog(null, "Ingrese el numero de fila");
                    String n2 = JOptionPane.showInputDialog(null, "Ingrese numero de columna");
                    // PARSEAMOS
                    indice1 = Integer.parseInt(n1);
                    indice2 = Integer.parseInt(n2);
                    // LLAMAMOS AL METODO

                    matriz.MostrarElementoPorIndice(indice1, indice2);
                    break;

                case 4:
                    // VARIABLE INDICE
                    int elemento = 0;
                    // GUARDAMOS EN UN STRING EL NUMERO QUE DIGITE EL USUARIO
                    String numeroABuscar = JOptionPane.showInputDialog(null, "Ingrese el elemento que desea buscar");
                    // PARSEAMOS
                    elemento = Integer.parseInt(numeroABuscar);
                    // LLAMAMOS AL METODO
                    matriz.MostrarElementoPorBusqueda(elemento);

                    break;

                case 5:
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

}
