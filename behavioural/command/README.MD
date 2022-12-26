We are going to design a graphical user interface framework.
We use the Command Design Pattern to decouple a sender (Invoker) from a receiver (Receiver) => The Invoke can talk to the receiver without being aware of it.

Button == Invoker
Command == Command
AddCustomer == ConcreteCommand
CustomerService == Receiver

// mosh demonstrated command undo execution
// in the diagram, AddCustomer seem to have a composition with the CustomerService.
