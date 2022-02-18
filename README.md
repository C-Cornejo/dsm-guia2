Crea una aplicación Android que cumpla con los siguientes requisitos:
La interfaz gráfica será una única pantalla (una actividad) que contará con un TextView al centro con el
siguiente texto inicial “0” y un Button debajo de este con el texto “+1”.
Al presionar el botón el mensaje del TextView se modificara aumentando su valor en 1. Siendo su valor
máximo 9 al superar ese valor el mensaje se reiniciará y volverá a mostrar “0”.
Cuando la aplicación gire o pase a segundo plano, al recuperar el focus el TextView deberá seguir
mostrando el número que poseía antes de girar. Es decir que la aplicación debe programarse para
preservar el estado de la UI.
Para la realización de esta discusión de resultados se recomienda el uso de ViewModel y LiveData.
