# Hausaufgabe 9


In dieser Aufgabe finden Sie erstmal den vorgegebenen Code in einem Package. Mit der Einführung von Klassen in Java, wird der Anteil des bereits bestehenden Codes (bevor Sie mit der Aufgabe anfangen) größer: Es wird nun immer wieder Klassen geben, die Sie erweitern/verändern sollen. Planen Sie ein, dass Sie von nun an immer erstmal den bestehenden Code inspizieren und genau verstehen, wie er funktionert. Probieren Sie ggf. auch Dinge aus. 

## Dogs

Das package `koeln.uni.idh.java.ex9` soll lose dem entsprechen, was wir im Kurs besprochen haben. Sie sollen die vorhanden Klassen und Methoden folgendermaßen erweitern (nicht erwähnt ist der Code in `main()`, den Sie schreiben um Ihre Implementierung zu testen):

1. Die Klasse `Dog` repräsentiert naheliegenderweise einen Hund, der einen Namen bekommen kann und ein Alter hat. Fügen Sie zuerst eine Methode `birthday()` hinzu, die immer dann aufgerufen wird, wenn der Hund Geburtstag hat, also ein Jahr älter wird. Diese Methode sollte in erster Linie das Alter des Hundes erhöhen, kann aber auch einige geeignete Hunde-Geburtstags-Party-Emojis in der Konsole ausgeben. Die Methode hat keinen Rückgabewert.

2. In der Klasse `Main` befindet sich nur eine `main`-Methode für den Einstieg in unser Programm. Diese Main-Methode in eine eigene Klasse auszulagern ist guter Stil, weil es den Code übersichtlich hält. Fügen Sie dort nun Code ein, um a) drei Hunde zu erzeugen (die Sie beliebig benennen können) und b) diese für 20 Jahre altern zu lassen. 

3. Als nächstes sollen sich die Hunde paaren können. Dazu ergänzen Sie in der Klasse `Dog` eine Methode `mate`, die einen anderen Hund als Argument nimmt. Für diese Aufgabe nehmen wir an, dass Hunde ab einem Alter von 3 Jahren fortpflanzungsfähig sind. Im Falle dass *beide Hunde* älter als drei Jahre sind, sollte also ein neues Objekt vom Typ `Dog` erzeugt und zurückgegeben werden. Im Fall dass (mindestens) einer der beiden jünger ist, gibt die Methode `null` zurück.

4. Hunde werfen zwischen 1 und 10 Welpen (auch das nehmen wir für die Einfachheit der Aufgabe jetzt mal so an). Für unsere Methode `multimate` heißt das, dass sie mehr als einen Hund zurückgegben können sollte. Ergänzen Sie eine neue Methode `multimate`, die ein Array aus Hunden zurückgibt, also `Dog[]`. Erzeugen Sie mithilfe von `Math.random()` eine zufällige `double`-Zahl zwischen 0.0 und 1.0, und verrechnen Sie sie so, dass Sie eine int-Zahl im gewünschten Bereich bekommen (indem Sie die Zufallszahl mit 10 multiplizieren). Erzeugen Sie dann passend viele Hunde für das Array und geben Sie es zurück.
