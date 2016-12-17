int x;
float factorial = 1;

:do 
  leer x
  if x>0 goto :iftrue1
  	 :iftrue1
  	    if x < 16 goto :iftrue2
  	 :iftrue2
  	  	goto :fin
   goto :do
:findo

:while
  if x!=0 goto :fact
  	goto :finwhile
:fact
  t1 = factoial * x;
  factoria = t1;
  t2= x-1;
  x=t2;
  goto while

:finwhile
imprimir t2