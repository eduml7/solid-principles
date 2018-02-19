# solid-principles

Se incluyen ejemplos de los 5 principios solid: bien aplicado y mal aplicado.

## Single Responsability

Debe definirse una responsabilidad para cada clase. Si la clase hay que cambiarla por dos motivos diferentes por ejemplo indicar si el gato es de pelo corto o largo (_como es el gato_) y reproducir un maullido (_comportamiento del gato_) tiene dos responsabilidades, tiene menos **cohesión** funcional y no cumple el principio.

**####OK**

* La clase Cat representa como es un gato.
* La clase CatService define lo que un gato es capaz de hacer.

**####KO**

* La clase Cat se encarga de las caracteristicas del gato, y además de lo que es capaz de hacer. No tiene una única responsabilidad.

## Open / closed

Indica que una clase si tiene una implementación y es necesaria otra, no debe modificarse la primera (_cerrado_ a modificación) sino que debe extenderse y crear una nueva respetando la anterior (_abierto_ a extensión)

**####OK**

* La clase AnimalFeatures es abstracta e indica una plantilla que deben seguir todos los animales.
* CatFeatures y DogFeatures extienden la plantilla con sus diferentes formas de implementar los acciones que son capaces de hacer los animales.
* A AnimalControl no le interesa saber que animales hay, segun el animal que le llegue llevará a cabo una implementación de la accion u otra.
* Si hay mas animales, solo tiene que volver a extender la plantilla AnimalFeatures y para AnimalControl será transparente.

**####KO**

* Si hay un nuevo animal se extiende la clase AnimalFeatures, pero además AnimalControl tiene la voz de los animales y distingue entre ellos para poder lanzar su voz, luego si hay un nuevo animal tendra que ser modificada
