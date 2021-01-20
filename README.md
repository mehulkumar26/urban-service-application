# Urban Service Application 

## Introduction
Designed an android application which provides daily life urban services to the users like house help, plumber, haircut etc. The interface of the application is designed using recycler view.

## Methodology

### Constraint Layout
It simplifies creating complex layouts in Android by making it possible to build most of your UI using only the visual editor in Android Studio. Constraints layout was used for holding the view components and allowed to set the hierarchy of the view component. 

### Event Listener
An event listener is an interface in the View class that contains a single call back method.  In the application, OnclickListener is used to respond to the button clicks by executing the block of code corresponding to the onClick event.

### Recycler View 
Recycler View has a more extensible framework, especially since it provides the ability to implement both horizontal and vertical layouts. Recycler View widget is used when you have data collections whose elements change at runtime based on user action or network events. In the application, the recycler view is used to design the view of Main Activity, where the user can choose a service from the list of available services like plumber, electrician, mechanic etc.

### Fragments
A fragment defines and manages its layout, has its lifecycle, and can handle its input events. Fragments cannot live on their own they must be hosted by activity or another fragment. It introduces modularity and reusability into the activity’s User Interface by dividing the User Interface into discrete chunks.  Every Activity in the application is designed using multiple fragments so each chunk of the activity can perform independently.
