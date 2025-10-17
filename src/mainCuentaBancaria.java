public class mainCuentaBancaria {
    public static void main (String[] args){
        CuentaBancaria cuenta= new CuentaBancaria();
        cuenta.setTitular("Justin");
        System.out.println("--Depositar $100--");
        cuenta.depositar(100.00);
        cuenta.Info();
        System.out.println("--Retirar $50--");
        cuenta.retirar(50.00);
        cuenta.Info();
        System.out.println("--Retirar mayor al saldo--");
        cuenta.retirar(120.00);

    }
}
