package taller3.televisores;
import taller3.televisores.TV;

public class Control {
    private TV tv;


    public void enlazar(TV tv_){

        this.tv = tv_;

        this.tv.control = this;
    }

    public TV getTv(){
        return this.tv;
    }

    public void setTv(TV tv_1){
        this.tv = tv_1;
    }

    public void turnOn(){

        tv.turnOn();
    }

    public void turnOff(){

        tv.turnOff();
    }

    public void canalUp(){

        tv.canalUp();
    }

    public void canalDown(){

        tv.canalDown();
    }

    public void volumenUp(){

        tv.volumenUp();
    }

    public void volumenDown(){

        tv.volumenDown();
    }

    public void setCanal(int canal){
        tv.setCanal(canal);
    }

    public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }

}
