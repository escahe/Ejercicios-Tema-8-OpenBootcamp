public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fulano","+573555555555",33,10000);
        System.out.println("\nDatos del cliente: "+
        "\nNombre: "+cliente.getNombre()+
        "\nEdad: "+ cliente.getEdad()+
        "\nTelefono: "+cliente.getTelefono()+
        "\nCrédito: $"+cliente.getCredito());

        Trabajador trabajador = new Trabajador("Sutano", "+573444444444", 44, 30000);
        System.out.println("\nDatos del trabajador: "+
        "\nNombre: "+trabajador.getNombre()+
        "\nEdad: "+ trabajador.getEdad()+
        "\nTelefono: "+trabajador.getTelefono()+
        "\nSalario: $"+trabajador.getSalario());

    }
}
