package com.videos.controllers.mainmenu;

import com.videos.controllers.Controller;
import com.videos.models.Session;

public class ExitAppController extends Controller {

    public ExitAppController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        this.session.exit();
    }
}
