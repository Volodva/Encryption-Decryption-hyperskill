# Encryption-Decryption-hyperskill

The program can encrypt messages taking as arguments:
-mode ("enc" or "dec")  
-key (int)  
-alg ( "unicode" or "shift")  
-data (message)  
-in (file.txt)  
-out (file.txt)  


1.If there is no -mode, the program work in the enc mode;  
2.If there is no -key, the program consider that key is 0;  
3.If there is no -data and no -in the program assume that the data is an empty string;  
4.If there is no -out argument, the program print data to the standard output;  
5.If there are both -data and -in arguments, program prefer -data over -in.  
