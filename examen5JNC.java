import java.util.Scanner;
public class examen5JNC {
    static Scanner it=new Scanner(System.in);
    public static void ejer1() {
        //datos de entrada
        //nivel de del perfil del estudiante
        //4 niveles
        double a, b,c,d;
        
        String mensaje;
        System.out.println("ingrese la nota del examen de conocimiento");
        a=it.nextInt();
        System.out.println("ingrese la entrevista pesonal");
        b=it.nextInt();
        System.out.println("ingrese la nota de test psicologico");
        c=it.nextInt();
        //proceso
        //examen de conocimiento 40%
        //examen personal 35%
        //test psicologico 25%
        d=(a*0.4)+(b*0.35)+(c*0.25);
        if (d>=17) {
            mensaje="usted obtuvo un vacante, su nivel es 4";
        } else if (d>=14) {
            mensaje="usted obtuvo un vacante, su nivel es 3 ";
        } else if (d>=11) {
            mensaje="usted obtuvo un vacante, su nivel es 2";
        }else {
            mensaje="usted no puede obtener el vacante, su nivel es 1";
        }
        System.out.println(mensaje);
    }
    public static void ejer2() {
        //datos de entrada
        //calcualr el IGV, 
        //el descuento y caunto debe pagar
    double a,b; 
    int IGV;
    int elpago;
    String mensaje;
    System.out.println("ingrese el monto para saber cuanto debe pagar ");
    elpago=it.nextInt();
    System.out.println("ingrese el IGV");
    IGV=it.nextInt();
    //desarrollo
    if (elpago>2000) {
    a=(elpago)-(elpago*0.1)+(elpago*IGV);
    mensaje="usted supero el monto de 2000 recibio un descuento de 10% y pagara "+a;
    }else if (elpago>1000) {
    a=(elpago)-(elpago*0.05)+(elpago*IGV);
    mensaje="usted supero el monto de 1000$, por lo tando recibira el descuento de 5% y pagara " +a;
    }else{
    a=(elpago)-(elpago*0.02)+(elpago*IGV);
    mensaje="usted supero el monto de 500$ y recibira un descuento de 2% y pagara "+a;
    }
    //datos de salida
    System.out.println(mensaje);
    }
    public static void ejer3() {
        //ejercicio 4
        //algoritmo de que vacuna poner :v 
        String mensaje;
        int edad;
        System.out.println("introduzca la edad del paciente");
        edad=it.nextInt();
        //desarrollo
        if (edad>=70) {
            mensaje="usted recibe la vacuna tipo c";
        }else if (edad>16) {
            mensaje="usted recibe la vacuna tipo B";
        }else {
            mensaje="usted recibe la bacuna tipo A";
        }
        System.out.println(mensaje);
    }
    public static void main(String[] args) {
        ejer1();
        ejer2();
        ejer3();


   
        
    }
}
