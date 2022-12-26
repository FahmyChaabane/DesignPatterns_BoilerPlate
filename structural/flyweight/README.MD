We use this Pattern in applications where we have a large number of objects, And these objects take a significant amount of memory => With the Flyweight pattern, we can reduce the amount of memory consumed by these objects.
A flyweight is an object that we can share.
// with this implementation, we're storing the icons in a single place in memory
// we need to seperate the data that we need to share, store it somewhere else in a flyweight class, PointIcon in this case, and then implement a factory for caching these objects.
// in the diagram, pointService seem to have a composition with the PointIconFactory. // or maybe not if it was a real app. // maybe yes?
