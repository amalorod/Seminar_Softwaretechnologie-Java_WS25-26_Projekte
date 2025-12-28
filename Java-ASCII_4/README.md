# Hausaufgabe 8

## Ascii-Art: Bildrotation

In der Klasse `AsciiArt` finden Sie unsere bisher entwickelten Funktionen zur Erstellung von Ascii-Art-Bildern. Schreiben Sie eine Funktion, um ein Bild, das als String repräsentiert wird, zu rotieren (ob im oder gegen den Uhrzeigersinn dürfen Sie sich aussuchen).

Hinweise:
- Aus dem Pixel an Koordinate 2 1 wird dann das Pixel an Koordinate 1 2.
- Damit das Bild am Ende wieder in einem String liegt, wäre es am einfachsten, diesen String zeilenweise aufzubauen. Um die Zeile 1 des Ergebnis-Strings zu erzeugen müssten Sie also der Reihe nach auf die Zeichen an Position 1 aller Zeilen des Eingabe-Strings zugreifen.