/*
Crear la clase CuentaBancaria con los siguientes atributos privados:
-	nombreTitular (String)
-	saldo (double)
Crear un constructor público que permita inicializar los datos del titular y el saldo inicial.
Implementar los siguientes métodos propios públicos:
-	mostrarInformacion(): Muestra el nombre del titular y el saldo actual.
-	depositar(double monto): Aumenta el saldo.
-	retirar(double monto): Disminuye el saldo si hay suficiente dinero.
En la clase principal (Main):
-	Crear un objeto de tipo CuentaBancaria.
-	Llamar a los tres métodos en orden lógico.
-	Mostrar cómo se reutiliza la información del objeto en cada acción.

*/

public class CuentaBancaria {
    String nombreTitular;
    double saldo;

    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular= nombreTitular;
        this.saldo = saldo;
    }

    public void mostrarInformacion(){
        System.out.println("--Información del titular--");
        System.out.println("Titular: "+ nombreTitular);
        System.out.println("Saldo: "+ saldo);
    }

    public void depositar(double monto){
        saldo+=monto;
        System.out.println("Se depositaron $"+ monto);
        System.out.println("Total: "+ saldo);
    }
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -=monto;
            System.out.println("Se retiraron $" + monto);
            System.out.println("Total: " + saldo);
        } else {
            System.out.println("No hay dinero para retirar");
        }

    }
    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria("Justin Paladines", 1000);
        cuenta.mostrarInformacion();
        cuenta.depositar(300);
        cuenta.retirar(520);
        cuenta.mostrarInformacion();
    }
}
