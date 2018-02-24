# Dagger 2 Android Sample Code

Sample code to clarify some of the main concepts for Dagger and Android. 

## Scoping
Based on [article series by Eugene Matsyuk](https://android.jlelse.eu/dagger-2-part-i-basic-principles-graph-dependencies-scopes-3dfd032ccd82)

The app has 2 features, each of which have 2 screens. 
2 global dependencies are shared across features and screens.
Each feature has dependency shared across the 2 screens.
Finally each screen has a unique/non-shared dependency.

The desired sharing of dependencies is confirmed by running the app, clicking around and noting the 7 digit codes (Object hashcodes/identity) displayed.
Would like to add a color-highlighting scheme but this works for now.

The branch *subcomponents* handles scoping/modularity using the Dagger 2 subcomponent mechanism.
The branch *dependencies* handles this using the legacy Dagger 1 dependency.

The *master* branch currently reflects subcomponents.

## Asynchronous Injection
Based on [Async Injection in Dagger 2 with RxJava](http://frogermcs.github.io/async-injection-in-dagger-2-with-rxjava/) 
and [Dependency injection with Dagger 2 — Producers](https://medium.com/@froger_mcs/dependency-injection-with-dagger-2-producers-c424ddc60ba3) by [Mirek Stanek]

Contained in the *master* branch


