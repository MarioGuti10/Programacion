public class Aventurero {
    //Atributos privados
    private String nombreAventurero;
    private int vidaActualAventurero;
    private int vidaMaximaAventurero;
    private int damageBaseAventurero;
    private int numPocionesSanacion;

    //Constantes
    private static final int curacionPocion = 20;


    //Constructor
     public Aventurero(String nombreAventurero, int vidaActualAventurero, int vidaMaximaAventurero, int damageBaseAventurero, int numPocionesSanacion){
        this.nombreAventurero = nombreAventurero;
        this.vidaActualAventurero = vidaMaximaAventurero;
        this.vidaMaximaAventurero = vidaMaximaAventurero;
        this.damageBaseAventurero = damageBaseAventurero;
        this.numPocionesSanacion = numPocionesSanacion;
    }
    //Metodos principales
    public int atacarEnemigo (Enemigo enemigo){
        int atacarEnemigo = damageBaseAventurero;
        return atacarEnemigo;
    }
    public void beberPocion(){
        int beber = 0;
        if (numPocionesSanacion > 0) {
            beber = numPocionesSanacion - 1;
            vidaActualAventurero = vidaActualAventurero + curacionPocion;
        }
    }
    public int recibirDamageEnemigo;


    public int getDamageBaseAventurero(){
        return this.damageBaseAventurero;
    }
}
