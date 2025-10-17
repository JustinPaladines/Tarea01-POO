public class CuentaBancaria {
    private double saldo = 0;
    private String titular;

    public void depositar(Double monto){
        if(monto > 0){
            saldo+=monto;
        } else {
            System.out.println("El numero debe ser positivo");
        }
    }
    public void retirar(Double monto){
        if(saldo>monto){
            saldo-=monto;
        } else {
            System.out.println("No hay fondos disponibles para retirar.");
        }
    }
    public void setTitular(String nuevoTitular){
        this.titular=nuevoTitular;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void Info (){
        System.out.println("TITULAR: "+ getTitular());
        System.out.println("SALDO: "+ getSaldo());
    }

}
