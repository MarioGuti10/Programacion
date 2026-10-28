public class Enemigo {
    //Atributos privados
    private String nombreEnemigo;
    private int vidaActualEnemigo;
    private int vidaMaximaEnemigo;
    private int damageBaseEnemigo;

    //Constructor
    public Enemigo(String nombreEnemigo, int vidaMaximaEnemigo, int damageBaseEnemigo){
        this.nombreEnemigo = nombreEnemigo;
        this.vidaActualEnemigo = vidaMaximaEnemigo;
        this.vidaMaximaEnemigo = vidaMaximaEnemigo;
        this.damageBaseEnemigo = damageBaseEnemigo;
    }
    //Metodos principales
    public int recibirDamageAventureo (int damageAventurero){
        int recibirDamage = 0;
        if (vidaActualEnemigo > 0) {
            recibirDamage = vidaActualEnemigo - damageAventurero;
        }
        return recibirDamage;
    }
    public boolean estaDerrotadoEnemigo(){
        boolean estaDerrotadoEnemigo = false;
        if (vidaActualEnemigo <= 0) {
            estaDerrotadoEnemigo = true;
        }
        else{
            estaDerrotadoEnemigo = false;
        }
        return estaDerrotadoEnemigo;
    }
    public int atacarAventurero(Aventurero aventurero){
        int ataqueEnemigo = damageBaseEnemigo;
        return ataqueEnemigo;
    }

    
    //Getters
    public int getVidaActualEnemigo(){
        return vidaActualEnemigo;
    }
    public int getDamageBaseEnemigo(){
        return damageBaseEnemigo;
    }
}
