###Liskov’s Substitution Principle
>"Derived types must be completely substitutable for their base types"

If 'S' is a declared subtype of 'T', objects of type 'S' should behave as objects of type 'T' are expected to behave, if they are treated as objects of type 'T'. 
Note that the LSP is all about expected behaviour of objects. 
One can only follow the LSP if one is clear about what the expected behavior of objects is. 
[T. S. Norvell, 2003](http://www.engr.mun.ca/~theo/Courses/sd/5895-downloads/sd-principles-3.ppt.pdf)  
It means that the classes fellow developer created by extending your class should be able to fit in application without failure. 
I.e. if a fellow developer poorly extended some part of your class and injected into framework/application then it should 
not break the application or should not throw fatal exceptions.  
This can be insured by using strictly following first rule. If your base class is doing one thing strictly, the fellow developer 
will override only one feature incorrectly in worst case. This can cause some errors in one area, but whole application will not do down.
