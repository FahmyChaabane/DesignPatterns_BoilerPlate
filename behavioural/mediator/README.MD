We are going to simulate a Desktop GUI framework to build an app for editing articles.
Mediate Pattern is a great solution for problems where we have a bunch of objects that need to talk to each other.
It is called the mediator pattern because the dialogbox is mediating the interaction of these objects, so they do not know each others, they only know their mediator.
// We can implement it also using the observer pattern.
// mosh used anonymous classes and lambdas
// Colleague is like our UIControl class
// in the diagram, Colleague seem to have a composition with the Mediator.
// in the diagram, ConcreteMediator seem to have a composition with the ConcreteColleague.
