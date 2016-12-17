int x = 0;      
Scanner leer = new Scanner(System.in);
float factorial  = 1;
// do while para la Validacion de que numero entrante este dentro del 
// rango indicado de [0-16]

do{
	try{
		System.out.println("Ingrese numero en un rango [0-16]");
		x = leer.nextInt();
	}catch(Exception e){
		System.out.println("Solo se acepta");
	}

}while(x<0 || x>16);


// while para crear el factorial del numero entrante.
int val = false;
while(x!=0){
	

		factorial = factorial*x;
		x--;
	
}
System.out.println(factorial);



