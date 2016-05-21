# Concurrency and Multi-theading with Java Patterns

# Hilos

* Un hilo es un se refiere a una o mas tareas que se ejecutan "al mismo tiempo" sobre un programa.
* Existe un termino llamado "Race condition" el cual ocurre cuando dos o mas hilos pueden accesar a informacion que es compartida.
* Es importante correr los hilos con el metodo start(), ya que el metodo run() solo ejecuta en el que se encuentra actualmente corriendo nuestro programa "main" por default.


# Estados de un Hilo

* Un hilo puede estar corriendo o no.
* Existen tres estados "NEW", "RUNNABLE", "TERMINATED".
* Dentro del estado RUNNABLE existen otros estados, como por ejemplo: BLOCKED, WAITING y TIMED_WAITING

# Race Condition

Race condition es una situacion no deseable que ocurre cuando el dispositivo o sistema intenta ejecutar dos o mas operaciones al mismo tiempo, pero por la naturaleza del dispositivo o sistema, la operacion tiene que hacerse en la secuencia apropiada para que se haga correctamente.

#Synchronization

* Protege nuestro bloque de codigo para que este tenga contro de acceso de los hilos que estan siendo ejecutados sobre el.
* Garantiza que este bloque de codigo esta siendo ejecutado por solo un hilo.
*
