DATA SEGMENT PARA PUBLIC 'DATA'
NR DW 12345
NRS DW ?,'$'
D DW 10
DATA ENDS

CODE SEGMENT PARA PUBLIC 'CODE'
ASSUME CS:CODE,DS:DATA
START PROC FAR
PUSH DS
XOR AX,AX
PUSH AX
MOV AX,DATA
MOV DS,AX

MOV AX,NR
MOV SI,0
LOOP1:
DIV D
PUSH DX
INC SI
CMP AX,0
JNE LOOP1


MOV CX,SI

NEXT:
POP AX
ADD AX,3030H
MOV AX,NRS
LEA DX,NRS
MOV AH,09H
INT21H
LOOP NEXT

RET
START ENDP
CODE ENDS
END START