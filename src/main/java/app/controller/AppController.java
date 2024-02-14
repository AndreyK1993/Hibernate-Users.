package app.controller;

import app.service.AppService;
import app.view.AppView;

public class AppController {

    AppView view;
    AppService service;

    public AppController(AppView view, AppService service) {
        this.view = view;
        this.service = service;
    }

    public void runApp() {
        service.filterChoice(view.chooseOption());
    }
}
