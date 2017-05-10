## The Singleton Pattern
#### Definition
Ensure a class has only one instance, and provide a global point of access to it.

#### In Other (My) Words
This one is pretty straightforward to understand - it's an easy way to keep from having 
to pass around a reference to an object if you only need one of them and have to access it 
from different parts of your program.

#### Tidbits
Although this pattern seems easy enough, it has a few trouble spots depending on what 
you're doing with it.

The primary issue comes in to play when using it in a multi-threaded application. 
Strategies have to be employed to make sure the singleton is only access by one thread 
at a time and that only one instance is ever created.

The other main concern is when to initialize the object. As soon as the program loads 
is one option that simplifies things, but may not be great if there is no guarantee that 
it will be needed early on (or at all) - especially if the object takes significant resources 
to initialize.

#### When Not To Use
Any time you may need more than one of something, Singleton is obviously not the right pattern. 
But often things that seem like they fit the single item requirement still may not be a good 
fit for the pattern. If global access isn't needed, a regular object may be a better choice.
