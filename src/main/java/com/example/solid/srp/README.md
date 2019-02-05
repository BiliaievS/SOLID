### Single Responsibility Principle
>"One class should have one and only one responsibility"  

In other words, you should write, change and maintain a class for only one purpose. If it is model class then it should 
strictly represent only one actor/entity. This will give you the flexibility to make changes in future without worrying 
the impacts of changes for another entity.  
Similarly, If you are writing service/manager class then it should contain only that part of method calls and nothing else. 
Not even utility global functions related to module. Better separate them in another globally accessible class file. 
This will help in maintaining the class for that particular purpose, and you can decide the visibility of class to specific 
module only.
