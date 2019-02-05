###Liskov’s Substitution Principle
>"Derived types must be completely substitutable for their base types"

It means that the classes fellow developer created by extending your class should be able to fit in application without failure. 
I.e. if a fellow developer poorly extended some part of your class and injected into framework/application then it should 
not break the application or should not throw fatal exceptions.  
This can be insured by using strictly following first rule. If your base class is doing one thing strictly, the fellow developer 
will override only one feature incorrectly in worst case. This can cause some errors in one area, but whole application will not do down.
