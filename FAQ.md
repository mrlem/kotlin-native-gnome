# FAQ

## Why create a new GTK binding instead of reusing one of the existing ones?

This question is perfectly legitimate. I would have liked to rely on an existing binding (I could have focused on creating tools around it),
however I finally chose not to for the following reasons:

* the https://github.com/kropp/kotlin-native-gtk lib is interesting in that it features **GTK binding generation using GIR**, but overall, to me,
  it feels like it's **API is too low-level** (CPointers based)
* the https://github.com/Doomsdayrs/kotlinx-gtk lib does provide **higher-level objects**, but misses elements, for which I feel its **wrapper
  objects** approach will show its shortcomings:
  * for instance Container.getChildren() isn't implemented (see
    https://github.com/Doomsdayrs/kotlinx-gtk/blob/main/nativex/src/nativeMain/kotlin/nativex/gtk/widgets/container/Container.kt#L51), and
    unless I'm mistaken the 2 options will be either to recreate wrapper objects at every call, or replicate the list of children with a 
    list of wrappers (that'll need to be updated at each call impacting children). The current approach seems to lean towards recreation
    (see https://github.com/Doomsdayrs/kotlinx-gtk/blob/main/nativex/src/nativeMain/kotlin/nativex/gtk/Application.kt#L43)
  * another example: for glade, loading glade XML files isn't currently supported (and the author intends to), but with the wrappers
    approach, the components tree provided by GtkBuilder will need either to be replicated in a wrappers tree, or with the current
    recreation approach only top-level components will be provided, and their methods will cause constant instanciations of wrappers.
* I wanted to learn about Kotlin native c-interop :-)

To me, **Glade files binding is critical** and was an objective from day 1, as it's what I miss most in GTK development. Wrappers make that
complicated as they leave 2 options: 1/ reinstanciating objects constantly or 2/ maintain a shadow component tree of wrappers mirroring the
low-level components.

I feel this is not memory efficient, elegant, and practical in terms of implementation, hence my attempt at getting away without wrappers only
with type-aliases and extension functions.

I'd be happy to be proven wrong and be able to use another binding, though :) (that would allow me to focus on other features)

So, though it feels a bit like (https://xkcd.com/927/) ;-), my issue with the existing bindings is not a mere implementation detail,
(otherwise I would have tried to contribute fixes / missing features), but the general approach.
