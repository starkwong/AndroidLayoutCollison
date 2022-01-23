# AndroidLayoutCollison


This sample demonstrates two behaviors of merging multiple libraries with the same layout name. Referenced in post https://www.studiokuma.com/home.php?article=310

## What does it demonstrates?
- Library will load the layout overriden by other libraries / hosted app, thus causing crash when the library tries to access expected child views
- Hosted application is able to hijack the user interface of library even if no need to extend the library Activity

## How to examine the behaviors?
- All behaviors can be triggered when clicking the "Hello World! 1" TextView after launched the application
- Click "library1" to examine the crash when Library 1 tries to access the child view that is expected to exist
- Click "library2" to examine the hosted app hijacked the TextView text by changing the root view of the layout

## Directory placement for the layout files
- Host Application: 
    - activity_main.xml (To be collide with same file in library1)
    - activity_library.xml (To be collide with same file in library2)
- library1: 
    - activity_main.xml (To be replaced due to collision, causing library1 to crash)
- library2:
    - activity_library.xml (To be hijacked due to collision)

