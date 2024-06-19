# Splash Screen API

Es una implementación de **Screen Splash API** en Android utilizando Kotlin y Jetpack Compose.

## Como funciona

Cuando el usuario ejecuta la aplicación y el proceso de la misma no se está ejecutando (_cold start_) 
o la actividad no ha sido creada (_warm start_), ocurren los siguientes eventos:

1. El sistema muestra la splash screen utilizando los temas y animaciones que se definan.
2. Cuando la aplicación está lista, la splash screen se cierra y la aplicación se muestra.

## Requisitos

La splash screen se debe adherir a las siguientes especificaciones:

* Establecer un solo color de fondo de la ventana sin transparencia.
* El icono animado debe ser un _AnimatedVectorDrawable_.
* La duración no debe exceder los 1,000 ms.
* Se debe establecer una tiempo apropiado para que el usuario pueda cerrar la splash screen.

## Establecer un tema para la splash screen y cambiar su apariencia

Se puede especificar los siguientes atributos en el tema de la actividad para customizar la 
splash screen.

1. Utilizar ```windowSplashScreenAnimatedIcon``` para reemplazar el icono del centro de la ventana de inicio.
2. Utilizar ```windowSplashScreenBackground``` para rellenar el fondo de la ventana con un único color.
3. Utilizar ```windowSplashScreenIconBackgroundColor``` para establecer un fondo detrás del icono de la splash screen.

## Vista

<img alt="splash_screen.jpg" src="app%2Fsrc%2Fmain%2Fres%2Fdrawable-nodpi%2Fsplash_screen.jpg" width="250"/>

## Referencias

* [Splash Screen Api](https://developer.android.com/develop/ui/views/launch/splash-screen?hl=en)
* [Making Splash Screen with SplashScreen API](https://samed-harman.medium.com/android-compose-making-splash-screen-with-splashscreen-api-and-animatedvector-resource-9d1108a91cab)