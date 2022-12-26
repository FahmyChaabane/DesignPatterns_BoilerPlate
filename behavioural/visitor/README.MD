This pattern allows us to add new operations to an object without modifying it.
We should use this pattern if our structure is fairly stable, but we want to support new operations frequently.

// as far as i understand, the difference between this pattern and the strategy pattern is that :

- strategy : the consumer does exist, and we are just to define which function(strategy) to choose/add.
- visitor : the consumer does exist, but we are just to define for each consumer how to handle the new operations.
