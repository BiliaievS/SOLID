### Dependency Inversion Principle
>"Depend on abstractions, not on concretions"

In other words. you should design your software in such a way that various modules can be separated from each other using 
an abstract layer to bind them together. The classical use of this principle of BeanFactory in spring framework. In spring framework, 
all modules are provided as separate components which can work together by simply injected dependencies in other module. 
They are so well closed in their boundaries that you can use them in other software modules apart from spring with same case.  
This has been achieved by dependency inversion and open closed principles. All modules expose only abstraction which is useful 
in extending the functionality or plugin in another module.  
External link [The Dependency Inversion Principle, Robert C. Martin, C++ Report, May 1996](https://web.archive.org/web/20110714224327/http://www.objectmentor.com/resources/articles/dip.pdf)