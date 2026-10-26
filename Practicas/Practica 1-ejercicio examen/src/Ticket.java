public class Ticket {
    // Constantes
    private static final double precioAdultos = 9.6D; //Deberia ser PRECIO_ADULTO 
    private static final double precioNinhos = 4.95D; //Deberia ser PRECIO_NINHOS
    private static final double precioAudioguias = 3.5D; //Deberia ser PRECIO_AUDIOGUIA
    private static final double descuentoguias = (precioAudioguias * 0.17); //Deberia ser DESCUENTO_GUIAS
    // Atributos privados
    private int entradasAdultos;
    private int entradasNinhos;
    private int audioguias;
    private String Cliente;
    // Constructor
    public Ticket( int entradasAdultos, int entradasNinhos, int audioguias, String Cliente){
        this.entradasAdultos = entradasAdultos;
        this.entradasNinhos = entradasNinhos;
        this.audioguias = audioguias;
    }
    // Métodos principales
    public double calcularSubtotal() {
        double subtotal = (precioAdultos * entradasAdultos) + (precioNinhos * entradasNinhos) + (precioAudioguias * audioguias);
        return subtotal;
    }
    public double calcularDescuentoAudioguias(){
        double audioguiasConDescuento = precioAudioguias - descuentoguias;
        double ahorro = precioAudioguias - audioguiasConDescuento;
        return ahorro;
    }
    public double calcularTotal() {
        double totalConDescuento = calcularSubtotal() - calcularDescuentoAudioguias(); //Puedo quitar el double y hacer el return del tiron
        return totalConDescuento;
    }
    public void imprimirTicket(){
        String cueva = "Cueva de Nerja";
        System.out.println("=========================================");
        System.out.printf("%25s\n", cueva);
        System.out.println("=========================================");
        
        System.out.printf("Cliente: %s\n", Cliente);
        System.out.println();

        String producto = "Producto";
        String cantidad = "Cant.";
        System.out.printf("%-20s %-10s Importe\n", producto, cantidad);
        System.out.println("-----------------------------------------");
        String adultos = "Adultos";
        System.out.printf("%-20s %-10d %,.02f €\n", adultos, entradasAdultos, precioAdultos );
        String ninhos = "Niños";
        System.out.printf("%-20s %-11d %,.02f €\n", ninhos, entradasNinhos, precioNinhos );
        String guias = "Guías";
        System.out.printf("%-20s %-10d %,.02f €\n", guias, audioguias, precioAudioguias );
        System.out.println("-----------------------------------------");


        System.out.println();
        System.out.printf("%-31s %,.02f €\n" ,"subtotal", calcularSubtotal());

        String descuento = "Descuento";
        System.out.printf("%-32s %,.02f €\n", descuento, descuentoguias);

        String total = "\033[47mTotal a pagar:";
        System.out.printf("\033[01m\033[47m\033[31m%-36S %,.02f €\033[00m\n", total, calcularTotal());
        System.out.println("=========================================");
    }
    
    // Getters
    public int getEntradasAdultos() {
        return this.entradasAdultos;
    }
    public int getEntradasNinhos(){
        return this.entradasNinhos;
    }
    public int getNumeroAudioguias(){
        return this.audioguias;
    }
    public double getIngresos(){
        return this.calcularTotal();
    }
    public double getDescuentoAudioguias(){
        return this.calcularDescuentoAudioguias();
    }
}

