package command;

import command.fx.Command;

public class ReseizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Reseizing");
    }

}
