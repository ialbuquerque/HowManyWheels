package com;

import static com.AutomobileType.*;

/**
 * Created by isa on 3/24/15.
 */
public class ResponseProcessor {


    public static void processResponse(String response) {
        Automobile automobile = new Automobile();

        switch (response) {
            case "1":
                automobile.setType(AUTOMOBILE_TYPE_CAR);
                automobile.setNumberOfWheels(4);
                IOHandler.sendAnswer(automobile);
                break;
            case "2":
                automobile.setType(AUTOMOBILE_TYPE_MOTORCYCLE);
                automobile.setNumberOfWheels(2);
                IOHandler.sendAnswer(automobile);
                break;
            case "9":
                System.out.println("Você está finalizando o programa!");
                break;
            default:
                IOHandler.sendErrorMessage(response);
                break;
        }

        IOHandler.sendStartMessage();
    }
}