package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Mesero;

public class UIMeseroMenu {
    
    public static ArrayList<Mesero> meserosRegistrados =  new ArrayList<>();
    public static Mesero meseroLogeado;
    public static int Id = 0;

    public static void registrarMesero(){

        Scanner sc = new Scanner(System.in);
        String nombre, password, email;

        System.out.println("Bienvenido al Equipo");
        System.out.println("Ingresa los siguientes datos\n con los que seras identificado en el sistema.");
        System.out.println("Usuario :");
        nombre =  sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Password: ");
        password = sc.nextLine();

        meseroLogeado = new Mesero(nombre,email,password);
        meseroLogeado.setId(Id++);
        meserosRegistrados.add(meseroLogeado);

        System.out.println("Mesero registrado exitosamente.....");
        UIMenu.showMenu();
    }

    public static void iniciarSesion(){
        String password,user;
        boolean sesion = false;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Usuario :");
            user =  sc.nextLine();

            System.out.println("password :");
            password =  sc.nextLine();

            for(int i=0;i<meserosRegistrados.size();i++)
            {
                if(meserosRegistrados.get(i).getName() == user)
                {
                    if(meserosRegistrados.get(i).getPassword() == password)
                    {
                        System.out.println("Sesion iniciada correctamente");
                        sesion = true;   
                    }
                }
            }
            if(!sesion) System.out.println("ERROR en inicio de sesion \n comprubea que el nombre de usuario y password sean los correctos");
            
        } while (sesion);
    }
}
