int x;
long factorial = 1;
boolean val = false;

:do 
  leer x
  if x.type.int goto :pro
    goto :error
:error
imprimir "Solo se aceptan numeros." 
:pro
  if x>0 goto :iftrue1
  	 :iftrue1
  	    if x < 16 goto :iftrue2
  	 :iftrue2
  	  	goto :fin
   goto :do
:findo

:while
  if !val goto :fact
  	goto :ifwelse
:fact
   if2 x!=0 goto :metod
   goto :ifwelse
:ifwelse
  t1 = factoial * x;
  factoria = t1;
  t2= x-1;
  x=t2;
  goto :while
:ifwelse
  t3 = true;
  val= t3;
  goto :while
:finwhile
imprimir t2gm