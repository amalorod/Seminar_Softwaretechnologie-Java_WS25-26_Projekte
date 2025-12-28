# Hausaufgabe 6


In dieser Aufgabe finden Sie zwei Dateien/Klassen. In der Datei/Klasse `AsciiArt` sind die Methoden aus der letzten Aufgabe bereits verfügbar. Wenn Sie möchten, kopieren Sie hier gerne ihre eigenen Lösungen herein. Hier wollen wir noch eine Funktion ergänzen. Alle anderen Aufgaben sind in der Datei/Klasse `Exercise06` zu machen.

## Aufgabe 1

Schreiben Sie, gerne in der `main`-Funktion, Code, um ein `int`-Array mit der Länge 7 anzulegen. Benutzen Sie dann eine `for`-Schleife, um es mit den Zahlen von 0 bis 6 zu füllen.

## Aufgabe 2

Schreiben Sie eine Funktion `func1()`, die ein `int`-Argument nimmt und ein boolean-Array zurückliefert (`boolean[]`). Die Funktion soll für alle (ganzen) Zahlen zwischen Null (inklusive) und dem Argument (exklusive) ermitteln, ob sie gerade sind, und das Ergebnis davon in einem Array speichern. Dieses wird dann zurückgegeben. Das zurückgegebene Array sollte also so lange sein, wie das Argument das wir bekommen haben. 

Beispiel: Wenn wir als Argument `3` übergeben, sollte die Rückgabe das folgende Boolean-Array der Länge `3` sein: `[true, false, true]` (weil 0 und 2 gerade sind, 1 aber nicht).


## Aufgabe 3: printMultipleDots()

Unsere bisherige Funktion `printSingleDots()` ist ja nur in der Lage, ein einzelnes Pixel "schwarz" zu zeichnen. Daher schreiben wir eine neue Funktion (in der Klasse `AsciiArt`), die mehrere Pixel schwarz zeichnen kann. Diese Funktion `printMultipleDots()` bekommt als Argument wieder die Länge einer Zeile (ein `int`-Wert), sowie ein `int`-Array (`int[]`) in dem die Positionen der Pixel gespeichert sind, die wir schwarz zeichnen wollen.

Verwenden Sie die Funktion, um ein X zu zeichnen:

```
#....#
.#..#.
..##..
.#..#.
#....#
```

Hinweis: Teil der Funktion wird sein, dass Sie überprüfen muss, ob die aktuelle Position (wenn Ihre for-Schleife von links nach rechts durch die Zeile geht) im Array enthalten ist oder nicht. Dieses Problem zu lösen ist leichter, wenn Sie es in eine eigene Funktion auslagern. Diese würde dann zwei Argumente bekommen (ein `int` und ein `int[]`), und `boolean` zurückliefern, wenn das erste Argument im zweiten enthalten ist.