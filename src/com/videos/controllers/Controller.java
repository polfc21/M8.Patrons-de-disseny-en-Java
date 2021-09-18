package com.videos.controllers;

import com.videos.models.Session;

public abstract class Controller {

    protected Session session;

    public Controller(Session session){
        this.session = session;
    }

    public abstract void control();
}
