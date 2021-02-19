# Magneto API

# Prerequisitos

- Se debe generar el jar con el comando 
``` 
   mvn clean package
  ```     
- El jar debe ser desplegado en la lambda de aws
````
    magneto-api
````

# Ejecutar desde postman

- Desde postman a este api-gateway de aws 
````
https://x16bmuaisl.execute-api.us-east-1.amazonaws.com/dev/mutant
````

- En body se coloca
````
{
“dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}
````

- Solo hay dos respuestas 200 y 403

````
200: mutante
403: no mutante
````
Nota: si pide authorization el secret key es:
````
SECRET KEY: AKIAWXF5DIATBMKMGIPH
SECRET ACCESS KEY: AKIAWXF5DIATBMKMGIPH,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
````

