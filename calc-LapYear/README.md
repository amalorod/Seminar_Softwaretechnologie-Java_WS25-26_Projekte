# Hausaufgabe 4


## Nomenklatur

In der Datei `Labeling` finden Sie (nicht sehr sinnvolles) Java-Programm. In dieser Aufgabe müssen Sie nichts programmieren, sondern sollen die verschiedenen Teile des Programmes benennen. Vergeben Sie dabei die folgenden Bezeichnungen:

- Statement
- Expression (oder Ausdruck)
- Deklaration einer Variablen
- Verwendung einer Variablen
- Datentyp
- Funktionsaufruf
- Literaler Wert
- Kommentar

Am einfachsten ist vermutlich, wenn Sie das Programm ausdrucken und von Hand markieren. Wenn Sie alternativ Kommentare im Code verwenden, achten Sie darauf, dass Sie klar bezeichnen, worauf sich der Kommentar bezieht. Laden Sie ggf. ein Foto/Scan ihrer Annotation hoch.

## Schaltjahre

Schreiben Sie innerhalb der Klasse `LeapYear` eine Funktion:

Kalender und Zeitverläufe sind ein komplexes Problem, über das wir nur in Schaltjahren nachdenken (und [hier](https://www.youtube.com/watch?v=qkt_wmRKYNQ) gibt es ein schönes Video dazu). Schaltjahre wurden eingeführt, weil ein [tropisches Jahr](https://de.wikipedia.org/wiki/Tropisches_Jahr) (der Zeitraum zwischen einer Jahreszeit in einem Jahr und der gleichen Jahreszeit im nächsten Jahr) leider nicht exakt 365 Tage lang ist, sondern 365 Tage, 5 Stunden, 48 Minuten und 45,261 Sekunden. 

Schreiben Sie ein Programm, um zu ermitteln, ob ein Jahr ein Schaltjahr ist. Das Jahr selbst steht am Anfang des Programms in der `int`-Variablen `year`. Das Ergebnis soll in der `boolean`-Variablen `isLeapYear` stehen. Die Regeln zur Erkennung von Schaltjahren (im [Gregorianischen Kalender](https://de.wikipedia.org/wiki/Gregorianischer_Kalender), dem wir bis heute folgen),  sind: 

1. Wenn sich das Jahr durch 4 teilen lässt, ist es ein Schaltjahr.
2. Wenn sich das Jahr durch 100 teilen lässt, ist es kein Schaltjahr.
3. Wenn sich das Jahr durch 400 teilen lässt, ist es ein Schaltjahr.

Alle anderen Jahre sind keine Schaltjahre. Die Regeln können einander überschreiben: 2024 ist ein Schaltjahr, da es durch 4 teilbar ist (4 × 506 = 2024), aber nicht durch 100. Das Jahr 2100 wird *kein* Schaltjahr sein, obwohl es durch 4 teilbar ist (2100 = 4 × 525, weil es durch 100 teilbar ist (2100 = 100 × 524).
