# TITLE TBC Coding Challenge (Java)

For this challenge, I built a test-driven Java program which TBC.
The program takes TBC and outputs TBC.


## Task
Digital audio workstation plugins
Musicians writing electronic music apply filters to their tracks to change how they sound
Build a bandpass filter
- Takes a soundwave and returns a soundwave of the same length
- The soundwave is an array of frequencies, for which each frequency is an integer
- The filter has default upper (1000) and lower limits (40)
- Anything out of range is brought to these limits


## Input/Output Table
See below for example input and output of the program:

__Input__               |   __Output__
------------------------|--------------------------------------------
[60,10,45,60,1500]      |  [60,40,45,60,1000]
                        |  
                        |  
                        |  
                        |  
                        |  
Empty array             |  Exception (argument error): "No frequencies have been supplied"
Incorrect data type     |  Exception (argument error): "Input should be........"
