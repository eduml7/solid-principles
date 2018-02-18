# solid-principles

Se incluyen ejemplos de los 5 principios solid: bien aplicado y mal aplicado.

## Single Responsability

Debe definirse una responsabilidad para cada clase. Si la clase hay que cambiarla por dos motivos diferentes por ejemplo indicar si el gato es de pelo corto o largo (_como es el gato_) y reproducir un maullido (_comportamiento del gato_) tiene dos responsabilidades, tiene menos *cohesión* funcional y no cumple el principio.

####OK

* La clase Cat representa como es un gato.
* La clase CatService define lo que un gato es capaz de hacer.

####KO

* La clase Cat se encarga de las caracteristicas del gato, y además de lo que es capaz de hacer. No tiene una única responsabilidad.
