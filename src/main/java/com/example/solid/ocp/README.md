### Single Responsibility Principle
>"Software components should be open for extension, but closed for modification"

What does it mean? It means that your classes should be designed such a way that whenever fellow developers wants to change 
the flow of control in specific conditions in application, all they need to extend your class and override some functions and that’s it.  
If other developers are not able to design desired behavior due to constraints put by your class, then you should reconsider 
changing your class. I do not mean here that anybody can change the whole logic of your class, but he/she should be able to override 
the options provided by software in an unharmful way permitted by software.  
For example, if you take a look into any good framework like struts or spring, you will see that you can not change their 
core logic and request processing, BUT you modify the desired application flow just by extending some classes 
and plugin them in configuration files.