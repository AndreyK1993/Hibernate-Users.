package app.service;

import app.controller.UserController;
import app.exceptions.OptionException;
import app.utils.AppStarter;
import app.utils.Constants;
import app.view.*;

public class AppService {

    UserController controller = new UserController();

    public void filterChoice(int choice) {
        switch (choice) {
            case 1 -> controller.createUser();
            case 2 -> controller.readUsers();
            case 3 -> controller.updateUser();
            case 4 -> controller.deleteUser();
            case 5 -> controller.readUserById();
            case 0 -> new AppView().getOutput(Integer.toString(choice));
            default -> {
                try {
                    throw new OptionException(Constants.INCORRECT_OPTION_MSG);
                } catch (OptionException e) {
                    new AppView().getOutput(e.getMessage());
                    AppStarter.startApp();
                }
            }
        }
    }
}
