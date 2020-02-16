
package reloj;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    private boolean stop = true;
    private int tiempo;
    
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
    
    public void mostrarHora(){
        System.out.println(hora+":"+minuto+":"+segundo);
    }
    
    public void incrementarSegundos(){
        int cont = 0;
        while(stop==true){
            if(segundo!=0){
                mostrarHora();
            }
            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex) {

                Thread.currentThread().interrupt();

            }
            segundo++;
            cont++;
            if(segundo >= 60){
                mostrarHora();
                segundo = reset();
                incrementarMinutos();
            }
            if(cont==tiempo){
                stop = false;
            }
        }
      
    }
    
    public void incrementarMinutos(){
        if(stop == true){
            minuto++;
            if(minuto >= 60){ 
                minuto = reset(); 
                incrementarHoras();
            }
        } 
    }
    
    public void incrementarHoras(){
        hora++;
        if(hora == 24){
            hora = reset();
        }
    }
    
    public int reset(){
        return 0;
    }
    
}
