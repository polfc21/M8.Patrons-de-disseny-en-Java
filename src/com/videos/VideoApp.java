package com.videos;

import com.videos.controllers.Controller;
import com.videos.controllers.mainmenu.MainMenuController;
import com.videos.controllers.usermenu.UserMenuController;
import com.videos.models.Session;
import com.videos.types.StateValue;

import java.util.HashMap;
import java.util.Map;

public class VideoApp {

    private Session session;
    private Map<StateValue, Controller> controllers;

    VideoApp() {
        this.session = new Session();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.MAIN_MENU, new MainMenuController(this.session));
        this.controllers.put(StateValue.USER_MENU, new UserMenuController(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }

    void execute() {
        Controller controller;
        do {
            controller = this.controllers.get(this.session.getValueState());
            if (controller != null) {
                controller.control();
            }
        } while (controller != null);
    }

    public static void main(String[] args) {
        new VideoApp().execute();
    }
}
