
package reloj;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    private int tiempo; // para detener el reloj dependiendo cuantos segundos quiero que avance
    
    public Reloj(){ 
    }
    
    public Reloj(int hora, int minuto, int segundo, int tiempo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.tiempo = tiempo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
   
    public void mostrarHora(){
        System.out.println(hora+":"+minuto+":"+segundo);
    }
    
    public void incrementarSegundos(){
        try {

        Thread.sleep(1000);

        } catch (InterruptedException ex) {

        Thread.currentThread().interrupt();

        }
        segundo++;
    }
    
    public void incrementarMinutos(){
        minuto++;      
    }
    
    public void incrementarHoras(){
        hora++;
    }
    
    public int reset(){
        return 0;
    }
    
}
