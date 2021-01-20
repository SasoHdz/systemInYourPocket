package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Bebida;
import model.Comida;
import model.Mesa;
import model.Mesero;

public class UIMenu {

    public static ArrayList<Bebida> menuBebidas =  new ArrayList<>();
    public static ArrayList<Comida> menuComida =  new ArrayList<>();
 
    public static Comida nuevoPlatillo; 
    public static Bebida nuevaBebida; 
    public static Mesa nuevaMesa; 

    public static void showMenu(){



        Scanner sc = new Scanner(System.in);
        int response;
        
        System.out.println("Bienvenido al mejor para meseros");
        System.out.println("System In Your Pocket : ");

        do {
            System.out.println("1. Registrar Mesero");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Registrar producto");
            System.out.println("0. Salir");
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    UIMeseroMenu.registrarMesero();
                    break;
                case 2:
                    //showUIMesero
                    break;
                case 3:
                    //showUIProducto
                    break;
                case 0:
                    System.out.println("Hasta la proxima");
                    break;
            }


        } while (response!=0);
        
        
    }


}
