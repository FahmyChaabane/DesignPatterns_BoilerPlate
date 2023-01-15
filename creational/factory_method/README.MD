We should use this Pattern to difer the creation of an object to subclasses.
// Let's say we gonna create a web framework.
// What if we wanna allow other devs who use our framework to be able to use their own view engine ?
// lot of people implement the factory_method like this poor way thro static methods : ViewEngineFactory.createViewEngine .. this is no the right way cuz we cannot override a static method in java.
We are allowing the subclasses to create a different kind of ViewEngine. thro inheritence and polymorphism
