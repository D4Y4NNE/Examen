public class Cliente 
{
    String nombre;
    String apepal;
    String apemat;
    int dni;
    ClienteControlador clientecontrolador;

    Cliente(String nombre, String apepal, String apemat, int dni)
    {
        this.nombre = nombre;
        this.apepal = apepal;
        this.apemat = apemat;
        this.dni = dni;
    }
    void setClienteControlador(ClienteControlador clientecontrolador)
    {
        this.clientecontrolador = clientecontrolador;
    }
    void imprimir()
    {
        System.out.println("Nombre del cliente = " + nombre);
        System.out.println("Apepal del cliente = " + apepal);
        System.out.println("Apemat del cliente = " + apemat);
        System.out.println("DNI del cliente = " + dni);
    }

    class ClienteControlador
    {
        String cliente;
        int contador;

        ClienteControlador(String cliente, int contador)
        {
            this.cliente = cliente;
            this.contador = contador;
        }
        void imprimir()
        {
            System.out.println("Cliente = " + cliente);
            System.out.println("Contador = " + contador);
        }
    }
    public static void main(String args[])
    {
        Cliente cliente = new Cliente("Jean", "1234", "abcd", "34528436");
        ClienteControlador clienteControlador = cliente.new ClienteControlador("Jin", "5");
        cliente.setClienteControlador(clientecontrolador);
        cliente.imprimir();
        cliente.clientecontrolador.imprimir();
    }

}
