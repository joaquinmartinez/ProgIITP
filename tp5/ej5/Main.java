package tp5.ej5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("juan","42630924",new SueldoFijo(100));
        Empleado e2 = new Empleado("manuel","42630925", new SueldoVentas(1000,100, 25));
        Empleado e3 = new Empleado("tomas","42630926",new SueldoBonos(500,100,25,3,90));
        Empresa apple = new Empresa(new ArrayList<>());

        System.out.println("test 1");
        System.out.println(e1.getSueldoMensualFijo());
        System.out.println(e2.getSueldoMensualFijo());
        System.out.println(e3.getSueldoMensualFijo());
        System.out.println("test 1 off");

        System.out.println("cambio 1 - e1");
        e1.setSueldoMensualFijo(new SueldoFijo(3333));
        System.out.println(e1.getSueldoMensualFijo());

        System.out.println("cambio 2 - e1");
        SueldoFijo sf1 = new SueldoFijo(4444);
        e1.setSueldoMensualFijo(sf1);
        System.out.println(e1.getSueldoMensualFijo());

        System.out.println("test 2, todos los pagos cambian");
        SueldoFijo sf2 = new SueldoFijo(5555);
        e1.setSueldoMensualFijo(sf2);
        SueldoVentas sv1 = new SueldoVentas(1000,100,75);
        e2.setSueldoMensualFijo(sv1);
        SueldoBonos sb1 = new SueldoBonos(500,100,25,75,90);
        e3.setSueldoMensualFijo(sb1);
        System.out.println(e1.getSueldoMensualFijo());
        System.out.println(e2.getSueldoMensualFijo());
        System.out.println(e3.getSueldoMensualFijo());
        System.out.println("test 2 off");

    }
}
