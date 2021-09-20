package com.videos.controllers.usermenu;

import com.videos.controllers.Controller;
import com.videos.models.ActiveUser;
import com.videos.models.Session;

public class ExitUserMenuController extends Controller {

    public ExitUserMenuController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        ActiveUser.set(null);
        this.session.previous();
    }
}
