package org.example;
import javax.swing.JOptionPane;
import java.io.IOException;

public class Inicio {
    public static void main(String[] args) throws IOException {

        int opcion_menu = -1;
        String[] botones = {"1. Ver Gatos", "2. Ver favoritos", "3. Salir"};

        do {
            // Menú Principal.
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos Java", "Menú Principal", JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);

            // validamos qué opción selecciona el usuario.
            for (int i = 0; i< botones.length; i++){
                if (opcion.equals(botones[i])){
                    opcion_menu = i;
                }
            }

            switch (opcion_menu){
                case 0:
                    GatosService.verGatos();
                    break;
                case 1:
                    Gatos gatos = new Gatos();
                    GatosService.verFavorito(gatos.getApikey());
                default:
                    break;
            }

        } while(opcion_menu != 1);

    }
}