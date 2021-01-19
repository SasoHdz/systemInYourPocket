package ui;

import java.util.Scanner;

public class UIMenu {
    
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
                    //showUIRegistro
                    break;
                case 2:
                    //showUIMesero
                    break;
                case 3:
                    //showUIProducto
                    break;
                case 0:
                    break;
            }


        } while (response!=0);
        
        
    }
}
