package command;

import java.util.ArrayList;
import java.util.List;

import command.fx.Command;

public class CompositeCommand implements Command{
    private List<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for(Command command : commands) {
            command.execute();
        }        
    }
    
}
