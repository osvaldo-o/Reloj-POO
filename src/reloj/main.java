
package reloj;

public class main {

    public static void main(String[] args) {
        int contador=0;
        Reloj reloj1 = new Reloj(13, 59, 50, 20);
        
        while(reloj1.getTiempo()!= contador){
            reloj1.mostrarHora();
            reloj1.incrementarSegundos();
            contador++;
            if(reloj1.getSegundo() >= 60){
                reloj1.incrementarMinutos();
                reloj1.setSegundo(reloj1.reset());
            }
            if(reloj1.getMinuto() >= 60){
                reloj1.incrementarHoras();
                reloj1.setMinuto(reloj1.reset());
            }
            if(reloj1.getHora()>=25){
                reloj1.setHora(1);
            }
        }
        reloj1.mostrarHora();

    }
    
}
