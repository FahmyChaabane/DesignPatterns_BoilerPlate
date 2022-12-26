package command;

import command.fx.Button;
import command.fx.Command;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Command command = new AddCustomerCommand(customerService);
        Button btn = new Button(command);
        btn.click();
        System.out.println("~~~~~~~");
        // ~~~~~~~
        Command reseizeCommand = new ReseizeCommand();
        Command blackAndWhiteCommand = new BlackAndWhiteCommand();
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(blackAndWhiteCommand);
        compositeCommand.addCommand(reseizeCommand);
        Button button = new Button(compositeCommand);
        button.click();
    }
}
