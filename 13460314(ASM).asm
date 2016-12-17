	.model small
		.stack 64
	.data
		x db 5
		f db 1
	.code
	.startup
	regreso:	
		mov AH,x
		mov AL,0
		cmp AH,AL
		jl fin
		jmp regreso
		mov AL,16
		cmp AH,ALS
		jg fin
		jmp regreso
	fin:
		mov AL,0
		jmp regreso
	regreso2:	
		mov AH,0
		cmp AH,AL
		jne if_true
		je fin2

	if_true: 
		mov DH,f
		mul DH,x
		mov f,DH
		mov BH,f 
		dec x
		jmp regreso

	fin2:
	.exit
	end

