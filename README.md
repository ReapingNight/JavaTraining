# Java Training

## Lesson 1 - The basics
### Uitleg
In les 1 leer je de basis van het programmeren: rekenen.
In principe zijn alle dingen die je doet met een programma een vorm van rekensommen oplossen.
Hoe ingewikkelder het programma, hoe meer deze sommen verstopt worden onder andere programmeer principes.

```java
public int add(int a, int b) {
    int c = a + b;
    return c;
}
```

Het bovenstaande stukje code noemen we een "method" met de naam "add".
Dat is een kort stukje code wat één ding doet.
In dit geval: twee getallen 'a' en 'b' bij elkaar optellen.
Alles binnen de '{' en de '}' hoort bij deze methode.
Dit kan uiteraard ook meer zijn, zoals een hele berekening uitvoeren, maar laten we het voor nu simpel houden.
Hier zijn een aantal dingen waar je op moet letten:
- Het woordje ```int``` staat voor "integer", oftewel een heel getal (positief, negatief, nul).
- Elke regel code in Java eindigt met een ';' teken. De ';' geeft aan wanneer de regel code is afgelopen en waar de volgende begint.\
  (Dit betekent dus ook dat je technisch gezien ```int c = a + b; return c;``` op één regel had kunnen schrijven. Dit doet precies hetzelfde, maar wordt vaak als onleesbaar beschouwd)
- Het stukje ```int c = ...``` noemen we een "variable". 
  In dit geval is dat een heel getal (```int```) met de naam 'c'.
  Een variabele kan je zien als een doos waar je een waarde in kan stoppen.
  De waarde van 'c' (het getal in de doos) is gelijk aan ```a + b``` (het getal in doos 'a' plus de waarde in doos 'b').
  Je hoeft je voor nu nog geen zorgen te maken over waar de getallen in 'a' en 'b' vandaan komen. Geloof maar dat ze er zijn.
- Als laatste heb je het stukje ```return c;```.
  ```return``` is een speciale instructie dat betekent: "Geef terug aan de vrager".
  Dit geeft aan dat het resultaat van je berekening in variabele 'c' te vinden is.
  Later, als je je eigen methodes gaat schrijven, is dit het enige wat van buitenaf te zien is.

### Opdracht
Maak 3 methodes aan die de volgende dingen doen:\
```multiply``` - vermenigvuldigt twee getallen met elkaar\
```divide```   - deelt het eerste getal door het tweede getal\
```add5times``` - telt 5 op bij het eerste getal, en vermenigvuldigt vervolgens met het tweede getal\
Let op! Het is hierbij belangrijk dat de naam van de methode precies hetzelfde is als de naam hierboven. 
Anders werken de tests niet :(.
Maak eerst alle methodes aan, daarna kan je testen of het werkt door het programma te starten