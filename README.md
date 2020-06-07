# FavouriteItems
### This project is created under 30daysOfKotlin challenge. This app contains a login page, after logging in it shows a list of cartoon shows, on clicking on the name of the show it shows the details about the show and one can share the link of that show with his/her friends on various apps.
## Screenshots of the UI
### Login page and List of cartoon shows. On clicking show's name it shows the details of that show in a webview. On clicking share we can share the link of that show on different apps.
  <img src="https://github.com/tanupriyanavnita/hello_kotlin/blob/master/page1.png" width="200">    <img src="https://github.com/tanupriyanavnita/hello_kotlin/blob/master/page2.png" width="200">   <img src="https://github.com/tanupriyanavnita/hello_kotlin/blob/master/page3.png" width="200">  <img src="https://github.com/tanupriyanavnita/hello_kotlin/blob/master/page4.png" width="200">



## Snippets from the code
### Here I have used lateinit variables for student's name to make compiler sure that these values are not null and will be initialized before use. Also I have used data class to store login credentials of students. I have hard coded some students' details by creating objects and directly used comparison on the objects for login check as they are objects of data class the data of the objects will be compared by default. 
<img src="https://github.com/tanupriyanavnita/hello_kotlin/blob/master/login.png" width="400">

### In the second page I have linked recycler view with custom adapter. In order to bind each data to a view I have created the inner class viewholder. The inner class extends recycler view's viewholder class(implemented inheritence). 
<img src="https://github.com/tanupriyanavnita/hello_kotlin/blob/master/innerclass.png" width="400">

### I have created a Singleton class as we need only one instance of list of cartoons in the entire application. I have used data class to store name and url of each cartoon show. 
<img src="https://github.com/tanupriyanavnita/hello_kotlin/blob/master/CnameUrl.png" width="400">
