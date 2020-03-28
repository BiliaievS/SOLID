### Interface Segregation Principle
>"Clients should not be forced to implement unnecessary methods which they will not use"

Take an example. Developer Alex created an interface Reportable and added two methods generateExcel() and generatedPdf(). 
Now client ‘A’ wants to use this interface, but he intends to use reports only in PDF format and not in excel. 
Will he achieve the functionality easily.  
NO. He will have to implement two methods, out of which one is extra burden put on him by designer of software. 
Either he will implement another method or leave it blank. So are not desired case, right?  
So what is the solution? The solution is to create two interfaces by breaking the existing one. They should be like PdfReportable 
and ExcelReportable. This will give the flexibility to user to use only required functionality only.