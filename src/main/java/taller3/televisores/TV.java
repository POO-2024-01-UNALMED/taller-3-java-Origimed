package taller3.televisores;


public class TV {

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){

        this.marca = marca;
        this.estado = estado;
        numTV ++;
    }
    
/////////////// / / GETTERS ///////////////////////

    public Marca getMarca(){
        return this.marca;
    }
     
    public int getCanal(){
        return this.canal;
    }

    public int getPrecio(){
        return this.precio;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public Control getControl(){
        return this.control;
    }

    public static int getNumTV(){
        return numTV;
    }

    public boolean getEstado(){
        return this.estado;
    }

    

////////////////////////// SETTERS ////////////////////////


    public void setMarca(Marca marca){
        this.marca = marca;
    }
     
    public void setCanal(int canal){
        if (this.estado == true && canal >= 1 && canal <= 120){
            this.canal = canal;
        }
        
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public void setVolumen(int volumen){
        if (this.estado == true && volumen >= 0 && volumen <= 7){
            this.volumen = volumen;
        }
        
        
        
    }

    public void setControl(Control control){
        this.control = control;
    }
    public static void setNumTV(int numTV_){
        numTV = numTV_; 
    }

    // / / / / / / / / / METODOS  / / / // / / / / / 

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public void canalUp(){
        if (this.estado == true && this.canal < 120){
            this.canal += 1;
        }
        
    }

    public void canalDown(){
        if (this.estado == true && this.canal > 1){
            this.canal -= 1;
        }

    }

    public void volumenUp(){
        if (this.estado == true && this.volumen < 7){
            this.volumen += 1;
        }
        
        
    }

    public void volumenDown(){
        if (this.estado == true && this.volumen > 0){
            this.volumen -=1;
        }
        
    }

}

