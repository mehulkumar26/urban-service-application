# Urban Service Application 

## Introduction
Designed an android application which provides daily life urban services to the users like house help, plumber, haircut etc. The interface of the application is designed using recycler view.

## Meathodology

### Constraint Layout
The application is using constraint layout to position and set the size of the buttons and the text view. Constraint layout, which is currently the default format in Android Studio, gives you numerous approaches to place objects. 

### Event Listener
To handle events in the android studio, the studio has event listener. The event listener is present in the View Class. All the components are derived from the class and those built in class help us perform various action on the listing and recording data from the clicks on the button. 

### Recycler View 
RecyclerView is a listing drawing library that basically provides a fixed-size window to load a big dataset into. It is different from the other event listener as it when the view goes out of the scope of the screen or when the user moves another activity then the recycler view saves or recycle the view. When the application needs the view then it can reuse the view as it was virtually present outside the window and never got lost.

### Fragments
Fragments in android studio is used to set a part of the activity its own lifecycle. A fragment can be used by using FragmentActivity.  An Activity can contain multiple fragments and every segment of the activity has its own lifecycle. By which I mean it received its own input an event and those events can be removed when the activity is running and the fragments are dependent on the activity for their input event.

