package com.videos.models;

import com.videos.types.StateValue;

public class Session {

    private State state;

    public Session() {
        this.state = new State();
    }

    public void next() {
        this.state.next();
    }

    public void previous() {
        this.state.previous();
    }

    public void exit() {
        this.state.exit();
    }

    public StateValue getValueState() {
        return this.state.getStateValue();
    }


}
