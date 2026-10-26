public class Caja {
    //Atributos privados estáticos
    private static int adultosAcumulados;
    private static int ninhosAcumulados;
    private static int audioguiasAcumuladas;
    private static double ingresosAcumulados;
    private static double descuentoAcumulado;
    //Métodos principales
    public static  void registrarTicket(Ticket ticket){
        adultosAcumulados += ticket.getEntradasAdultos();
        ninhosAcumulados += ticket.getEntradasNinhos();
        audioguiasAcumuladas += ticket.getNumeroAudioguias();
        ingresosAcumulados += ticket.getIngresos();
        descuentoAcumulado += ticket.getDescuentoAudioguias();
    }
    public void mostrarResumenDia(){
        System.out.printf("Total de tickets de adultos vendidos: \n",adultosAcumulados);
        System.out.printf("Total de tickets de niños vendidos: \n",ninhosAcumulados);
        System.out.printf("Total de adioguias vendidas: \n",audioguiasAcumuladas);
        System.out.printf("Total de ingresos acumulado: \n",ingresosAcumulados);
        System.out.printf("Total de descuento acumulado: \n",descuentoAcumulado);
    }
}
