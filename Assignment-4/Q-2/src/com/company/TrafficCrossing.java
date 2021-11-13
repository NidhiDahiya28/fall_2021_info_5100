package com.company;

public class TrafficCrossing {
    boolean isGreen;
    public TrafficCrossing() {
        this.isGreen = true;
    }

    public void carReached(
            int carNum,
            int roadNum,
            int direction,
            Runnable turnGreen,
            Runnable crossCar
    ) {
        synchronized(this){
            if(roadNum==1){
                if(!this.isGreen){
                    this.isGreen = true;
                    turnGreen.run();
                }
            }else{
                if(this.isGreen){
                    this.isGreen = false;
                    turnGreen.run();
                }
            }
            crossCar.run();
        }
    }
}

