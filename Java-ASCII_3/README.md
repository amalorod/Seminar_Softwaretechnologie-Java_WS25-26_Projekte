# Hausaufgabe 7

## Finde die Fehler

In der Klasse `Exercise07` finden Sie einen Entwurf für ein Programm, das in der Console eine Art Kalender ausgeben soll. Der gewünschte Output ist

```
####### 2024 #######

January
 1  2  3  4  5  6  7 
 8  9 10 11 12 13 14 
15 16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 

February
          1  2  3  4 
 5  6  7  8  9 10 11 
12 13 14 15 16 17 18 
19 20 21 22 23 24 25 
26 27 28 29 

March
             1  2  3
...
```

für alle zwölf Monate. Der Output wird produziert von der Funktion `printCalendar()`, die neben dem gewünschten Jahr auch Informationen dazu braucht, auf welchen Wochentag der 1. Januar fällt (2024 war der 1. Januar ein Montag, deswegen wird beim Aufruf der Funktion innerhalb der `main`-Funktion eine `1` übergeben.

Leider enthält das Programm viele Fehler, so dass es nicht direkt ausgeführt werden kann (und Eclipse ganz viele Fehlermeldungen anzeigt). Finden und beheben Sie sie!

## AsciiArt 2.0 

Wir haben im Kurs unsere bisherigen Funktionen zur Generierung von AsciiArt so aufgepeppt, dass wir das Bild z.B. invertieren können. Dazu geben die Funktionen nicht mehr direkt etwas auf der Console aus, sondern geben einen String zurück, den wir dann nochmal manipulieren können. Sie finden den im Kurs entwickelten (und im Büro etwas aufgeräumten) Code in der Klasse `AsciiArt`.

Dort wollen wir noch zwei Funktionalitäten ergänzen, die dann jeweils in eigenen Funktionen stecken.

### Recode

Bisher haben wir immer `#` für ein schwarzes und `.` für ein weißes Pixel verwendet. In einer echten Anwendung wäre es schön, wenn das ein:e Benutzer:in verändern könnte. Wir brauchen also eine Funktion, die ein bestehendes Bild umwandelt. Dafür soll die Funktion fünf Argumente bekommen, nämlich das Bild selbst als String und jeweils das alte und neue Symbol für ein schwarzes und weißes Pixel. 

### Flipping horizontally

```
...#
..#.
.#..
#...
```

Die horizontal gespiegelte Version des obigen Bildes sieht so aus:

```
#...
.#..
..#.
...#
```

Schreiben Sie eine Funktion, die das Bild auf diese Weise spiegelt. Machen Sie sich zunächst abstrakt klar, wie hier der Ablauf aussieht: Das horizontale Spiegeln ist ja eine Operation, bei der die eigentliche Spiegelung innerhalb einer Zeile stattfindet: Aus `..#...#` wird `#...#..`. Eine Funktion, die eine einzelne Zeile spiegelt, könnte also einfach eine for-Schleife beinhalten, in der die Pixel von der Position `n` an die Position `lineLength - n` verschoben werden. 

Da wir das Bild ja aber als ein String-Objekt vorliegen haben, müssten wir es wieder in Zeilen überführen. Dazu gibt es in der String-Klasse die Funktion `split()`, der Sie ein Trennzeichen übergeben können, an der ein String aufgespalten wird. Hier könnten wir das Zeichen `\n`, also den Zeilenumbruch verwenden, um ein Array mit den einzelnen Zeilen des Bildes zu bekommen.

