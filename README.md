# Soundwave Bandpass Filter Coding Challenge (Java)
For this challenge, I built a test-driven Java program which takes an array of integers that represent the frequencies of a soundwave, and if any of these frequencies are below the lower limit of 40 or above the upper limit of 1000, they will be adjusted to those limits, and the updated array of integers will then be returned.


## Task
Company that designs plugins for digital audio workstations (DAWs)
Musicians writing electronic music apply filters to their tracks to change how they sound
Build a bandpass filter to make this possible
- Takes a soundwave and returns a soundwave of the same length
- The soundwave is an array of frequencies, for which each frequency is an integer
- The filter has default upper (1000) and lower limits (40)
- Any values out of this range are brought to these limits


## Input/Output Table
See below for example input and output of the program:

__Input__               |   __Output__
------------------------|--------------------------------------------
[10]                    |  [40]  
[2000]                  |  [1000]
[60,10,45,60,1500]      |  [60,40,45,60,1000]
Empty int array         |  Exception (argument error): "No frequencies have been supplied"
Incorrect data type     |  Exception (argument error): "Input must be an array of integers"
