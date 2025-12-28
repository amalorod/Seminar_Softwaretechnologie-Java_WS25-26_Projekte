# Exercise 04

Schreiben Sie innerhalb der Klasse `Exercise_04` die folgenden Funktionen. Vermutlich möchten Sie auch eine `main`-Funktion mit einigen Ausgaben ergänzen, damit Sie Ihre Funktionen testen können.


## func1
Funktion `func1` soll einen `int`-Wert zurückgeben und zwei `double`-Werte als Argument nehmen. 
Innerhalb der Funktion werden die beiden Argumente miteinander multipliziert und dann durch sieben geteilt.
Das Ergebnis der Berechnung wird von der Funktion zurückgegeben.


## dayOfYear
Die Funktion `dayOfYear` bekommt zwei `int`-Werte, die Tag und Monat eines Datums repräsentieren. Sie soll 
einen `float`-Wert zurückliefern, der angibt, wie groß der Anteil des Jahres ist, der schon vergangen ist.
Einige Beispiele:

```
dayOfYear(1,1);   // liefert 0.00277778
dayOfYear(15,7);  // liefert 0.54166667
dayOfYear(30,12); // liefert 1.0
```

Sie können der Einfachheit halber davon ausgehen, dass jeder Monat 30 Tage hat und ein Jahr also 360 Tage lang ist.


## isOdd

Die Funktion `isOdd` soll überprüfen ob eine Zahl ungerade ist. Ist sie das, gibt die 
Funktion `true` zurück, andernfalls `false`.

## isLeapYear (optional)

Wenn Sie möchten, nehmen Sie Ihre (ggf. korrigierte) Lösung aus Übung 3 zur Berechnung eines Schaltjahres und 'verpacken' Sie sie in eine Funktion. Welchen Datentyp sollte sie zurückgeben? Welche Argumente bekommt sie? 

