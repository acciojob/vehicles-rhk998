package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 2, 7, isManual, "Formula 1", 1);
    }



    public void accelerate(int rate){
         //set the value of new speed by using currentSpeed and rate
        int newSpeed = getCurrentSpeed()+ rate;
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */


        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }

        int currentGear;
        switch (newSpeed / 50) {
            case 0:
                currentGear = 1;
                break;
            case 1:
                currentGear = 2;
                break;
            case 2:
                currentGear = 3;
                break;
            case 3:
                currentGear = 4;
                break;
            case 4:
                currentGear = 5;
                break;
            default:
                currentGear = 6;
                break;
        }

        setCurrentGear(currentGear);
    }


}
