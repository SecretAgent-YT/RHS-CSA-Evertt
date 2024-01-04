package student;

import constants.Buttons;
import internal.EngineAPI;

import static internal.EngineAPI.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {
    
    /**
     * This method is called when a single button is clicked.
     * You don't get notifications of multiple clicks at once, so you'll have to store data for later usage by using the EngineAPI methods.
     * 
     * @param buttonName The name of the button that was clicked. This should always match one String from the {@link Buttons} class in Buttons.java.
     */
    private static List<String> staticValues = new ArrayList<String>();

    static {
        staticValues.add(Buttons.ZERO);
        staticValues.add(Buttons.ONE);
        staticValues.add(Buttons.TWO);
        staticValues.add(Buttons.THREE);
        staticValues.add(Buttons.FOUR);
        staticValues.add(Buttons.FIVE);
        staticValues.add(Buttons.SIX);
        staticValues.add(Buttons.SEVEN);
        staticValues.add(Buttons.EIGHT);
        staticValues.add(Buttons.NINE);
        staticValues.add(Buttons.DECIMAL_POINT);
    }

    public static void handleButtonClick(String buttonName) {
        if (staticValues.contains(buttonName)) {
            EngineAPI.appendToExpression(buttonName);
        } else {
            handleButton(buttonName);
        }
        //TODO Handle as many buttons as possible! See the list of Buttons constants in the Buttons.java class.
        //Whenever you find yourself repeating code, you may want to create other static methods in this class to help!
    }

    private static void handleButton(String buttonName) {
        switch (buttonName) {
            case Buttons.BACKSPACE:
                EngineAPI.deleteLastDigitFromEntry();
            case Buttons.SQUARE_ROOT:
                EngineAPI.setExpression(String.valueOf(Math.pow(EngineAPI.getEntryAsDouble(), 1/2)));
        }
    }

}
