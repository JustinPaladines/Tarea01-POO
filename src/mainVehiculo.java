public class mainVehiculo {
    public static void main(String[] args){
        Vehiculo vehiculo1= new Vehiculo(200);
        //ver directamente
        vehiculo1.marca="Toyota";
        System.out.println("Marca: " + vehiculo1.marca);

        vehiculo1.setModelo("Prius");

        //color invalido
        System.out.println("--Agregando color morado...--");
        vehiculo1.setColor("morado");

        //color valido
        System.out.println("--Agregando color rojo...--");
        vehiculo1.setColor("rojo");

        //info completa
        vehiculo1.mostrarInfo();

    }
}
