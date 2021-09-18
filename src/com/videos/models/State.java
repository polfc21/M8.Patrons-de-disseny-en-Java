package com.videos.models;

import com.videos.types.StateValue;

public class State {

    private StateValue stateValue;

    public State() {
        this.stateValue = StateValue.MAIN_MENU;
    }

    public void next() {
        this.stateValue = StateValue.values()[this.stateValue.ordinal()+1];
    }

    public void previous() {
        this.stateValue = StateValue.values()[this.stateValue.ordinal()-1];
    }

    public void exit() {
        this.stateValue = StateValue.EXIT;
    }

    public StateValue getStateValue() {
        return this.stateValue;
    }

}
