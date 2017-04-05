## The Strategy Pattern
#### Definition (From The Book)
Define a family of algorithms, encapsulate each one, and make them interchangeable. 
Strategy lets the algorithm vary independently from clients that use in.

#### In Other (My) Words
Use interfaces so you can use different versions of a behavior without changing 
your code as much. Use interfaces to allow variations in how the same behavior 
is implemented.

#### Tidbits
The most interesting part of this pattern is subtle and could easily be missed when 
first encountered: encapsalate behavior (that changes).

Objects are often comprised of data and methods to interact with that data, but this 
pattern uses the idea of encapsalating behavior only. Of course, there might be data 
connected with behavior, but it's a different mindset.

#### When Not To Use
With all design patterns, knowing when *not* to use the pattern is just as important 
as knowing when *to* use the pattern. 

Here the deciding factor is whether or not a behavior needs different implementations. 
If there's a good chance only one type of a specific behavior will ever be needed, 
avoid code bloat by waiting until the pattern is actually needed - when you're trying 
to add that second implementation.

When in doubt, [YAGNI](https://en.wikipedia.org/wiki/You_aren't_gonna_need_it).
