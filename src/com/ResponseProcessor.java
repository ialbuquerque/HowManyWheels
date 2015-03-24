package com;

import static com.AutomobileType.*;

/**
 * Created by isa on 3/24/15.
 */
public class ResponseProcessor {


    public static void processResponse(String response) {
        Automobile automobile = new Automobile();
        if (response.equals("1")) {
            automobile.setType(AUTOMOBILE_TYPE_CAR);
            automobile.setNumberOfWheels(4);
            IOHandler.sendAnswer(automobile);
        } else if (response.equals("2")) {
            automobile.setType(AUTOMOBILE_TYPE_MOTORCYCLE);
            automobile.setNumberOfWheels(2);
            IOHandler.sendAnswer(automobile);
        } else {
            IOHandler.sendErrorMessage(response);
        }

        IOHandler.sendStartMessage();
    }
}