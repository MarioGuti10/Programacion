public class Enemigo {
    //Atributos privados
    private String nombreEnemigo;
    private int vidaActualEnemigo;
    private int vidaMaximaEnemigo;
    private int damageBaseEnemigo;

    //Constructor
    public Enemigo(String nombreEnemigo, int vidaActualEnemigo, int vidaMaximaEnemigo, int damageBaseEnemigo){
        this.nombreEnemigo = nombreEnemigo;
        this.vidaActualEnemigo = vidaActualEnemigo;
        this.vidaMaximaEnemigo = vidaMaximaEnemigo;
        this.damageBaseEnemigo = damageBaseEnemigo;
    }
    //Metodos principales
    public int recibirDamageAventureo (int damageAventurero){
        int recibirDamage = vidaActualEnemigo - Enemigo.getDamageBaseAventurero();
        if (vidaActualEnemigo >= 0) {
            recibirDamage = vidaActualEnemigo - damageAventurero;
        }
        return recibirDamage;
    }
    public boolean estaDerrotadoEnemigo(){
        boolean estaDerrotado = false;
        if (vidaActualEnemigo <= 0) {
            estaDerrotado = true;
        }
        else{
            estaDerrotado = false;
        }
        return estaDerrotado;
    }
    public int atacarAventurero(){
        int ataqueEnemigoAventurero = damageBaseEnemigo;
        return ataqueEnemigoAventurero;
    }
    //Getters
}
