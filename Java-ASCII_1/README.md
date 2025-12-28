# Hausaufgabe 5


## func1

In der Klasse `Exercise05` finden Sie eine Funktion `func1`, die eine Schleife enthält. Erstellen Sie eine Tabelle, in der Sie für jede Zeile dokumentieren, welchen Wert welche Variable hat. Orientieren Sie sich dabei am in der Sitzung besprochenen Vorgehen. Die Funktion wird mit den Argumenten `x=4` und `c='a'` aufgerufen.

Die Tabelle sollte also so anfangen:

```
| Zeile | x | c | b | i |
| ----- | - | - | - | - |
|     8 | 4 | a |   |   |
...
```


## func2

Schreiben Sie eine Funktion `func2`, die die ungeraden Zahlen zwischen 1 und 100 ausgibt. Benutzen Sie dabei Ihre Funktion `isOdd()` aus der vorherigen Übung, indem Sie sie in die aktuelle Übung reinkopieren. Die Funktion hat keinen Rückgabewert.



## ASCII-Art

Die nächsten drei Funktionen sind Bausteine, um ASCII-Art zu erzeugen. Dabei handelt es sich um Bilder, die durch Zeichen in einer Konsole entstehen, zum Beispiel das Folgende für einen Hund.

```
 _   _
/(. .)\    )
  (*)____/|
  /       |
 /   |--\ |
(_)(_)  (_)
```

Wir machen es uns etwas einfacher, indem wir nur zwei "Pixel" unterscheiden. Ein Punkt im Bild ist entweder weiß, dann wird er durch einen Punkt repräsentiert, oder schwarz, dann bekommt er ein `#`. Einen Pfeil könnten wir also so darstellen:


```
.......##..
........##.
###########
........##.
.......##..  
```

Wichtig dabei ist, dass alle unsere Bilder zeilenweise erzeugt werden müssen. Deswegen schreiben wir uns einige Bausteine, die zeilenweise bestimmte Dinge ausgeben.

### printEmptyLine()


Schreiben Sie eine Funktion `printEmptyLine()`, die ein `int`-Argument übergeben bekommt, und eine leere Zeile zeichnet die so lange ist wie das angegebene Argument. `printEmptyLine(15)` sollte also eine Zeile mit 15 Punkten ausgeben. Die Funktion hat keinen Rückgabewert.

Das eigentliche Ausgeben haben wir dabei bisher immer mit der Funktion `System.out.println()` gemacht. Diese hängt allerdings an jede Ausgabe einen Zeilenumbruch an. Eine Alternative, die das nicht macht, ist die Funktion `System.out.print()`.


### printSingleDot()

Schreiben Sie als nächstes eine Funktion, die zwei `int`-Argumente übergeben bekommt: Das erste ist wie bei `printEmptyLine` die Länge der Zeile. Das zweite Argument stellt die Position dar, an der ein schwarzes Pixel, also ein `#` gezeichnet wird. `printSingleDot(15, 3)` sollte also `..#............` ausgeben. Die Funktion hat keinen Rückgabewert.


### printDiagonal()

Schreiben Sie nun eine Funktion `printSlash()` die das unten stehende Bild erzeugt, indem Sie ihre vorher geschriebenen Funktionen aufrufen. Die Funktion hat keinen Rückgabewert.

```
#.........
.#........
..#.......
...#......
....#.....
.....#....
......#...
.......#..
........#.
.........#
```



 
