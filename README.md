![](matrix-demo.gif)
# Matrix
Mobile App
An Android platform for drivers to share traffic condition events. 
After register and login, the driver can upload and share events, check details and give comments on the Google Map interface. 
Matrix uses  Firebase to establish a flexible and maintainable backend service group. The user-friendly UI framework is built by using Toolbar, ViewPager, and NavigationView combination. 

A Google MapView within MapFragment to display the events nearby and avoid the traffic 

A Google Firebase Realtime Database to store and manage the user-generated content for better data synchronization

The event-trigger Firebase Message System with Google Cloud Functions to support app notification 

A user-friendly UI with standard widgets (RecyclerView, ViewPager, etc) and  Espresso Instrumented Test to test core flows

MD5 encryption and Google Firebase Authentication to improve data security 

In-App simple voice control with Google Speech Recognition to provide hand-free event reports
