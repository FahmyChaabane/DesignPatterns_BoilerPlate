We are going to simulate the history list in a browser. The thing here is that if we want the code to support changes (exp datastructure of urls list) we should not be effecting consumers.
The iterator pattern is used for that.
The consumer does not have to know what datastructure we have used for the iterator.
