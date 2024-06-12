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

Het bovenstaande stukje code noemen we een "method" met de naam ```add```.
Dat is een kort stukje code wat één ding doet.
In dit geval: twee getallen ```a``` en ```b``` bij elkaar optellen.
Alles binnen de ```{``` en de ```}``` hoort bij deze methode.
Dit kan uiteraard ook meer zijn, zoals een hele berekening uitvoeren, maar laten we het voor nu simpel houden.
Hier zijn een aantal dingen waar je op moet letten:
- Het woordje ```int``` staat voor "integer", oftewel een heel getal (positief, negatief, nul).
- Elke regel code in Java eindigt met een ```;``` teken. De ```;``` geeft aan wanneer de regel code is afgelopen en waar de volgende begint.\
  (Dit betekent dus ook dat je technisch gezien ```int c = a + b; return c;``` op één regel had kunnen schrijven. Dit doet precies hetzelfde, maar wordt vaak als onleesbaar beschouwd)
- Het stukje ```int c = ...``` noemen we een "variable". 
  In dit geval is dat een heel getal (```int```) met de naam ```c```.
  Een variabele kan je zien als een doos waar je een waarde in kan stoppen.
  De waarde van ```c``` (het getal in de doos) is gelijk aan ```a + b``` (het getal in doos ```a``` plus de waarde in doos ```b```).
  Je hoeft je voor nu nog geen zorgen te maken over waar de getallen in ```a``` en ```b``` vandaan komen. Geloof maar dat ze er zijn.
- Als laatste heb je het stukje ```return c;```.
  ```return``` is een speciale instructie dat betekent: "Geef terug aan de vrager".
  Dit geeft aan dat het resultaat van je berekening in variabele ```c``` te vinden is.
  Later, als je je eigen methodes gaat schrijven, is dit het enige wat van buitenaf te zien is.

### Opdracht
Maak 3 methodes aan die de volgende dingen doen:\
```multiply``` - vermenigvuldigt twee getallen met elkaar\
```divide```   - deelt het eerste getal door het tweede getal\
```add5times``` - telt 5 op bij het eerste getal, en vermenigvuldigt vervolgens met het tweede getal\
Let op! Het is hierbij belangrijk dat de naam van de methode precies hetzelfde is als de naam hierboven. 
Anders werken de tests niet :(.

## Lesson 2 - Let's do that again
### Uitleg
Simpele sommetjes maken lukt nu wel. Je weet nu als het goed is hoe je kan vermenigvuldigen, delen en hoe je de volgorde van operaties kan bepalen.
Maar hoe zit het nu met complexere vergelijkingen? Hoe bereken je machten en wortels?
Beide berekeningen kan je moeilijk of niet onder elkaar opschrijven tot je bij het antwoord komt.
Om machten en wortels goed te kunnen berekenen heb je een manier nodig om een stuk code een aantal keer te herhalen: 
de ```for``` en ```while``` loops.

Voor we loops kunnen introduceren moet je eerst leren vergelijken. Je hebt al gezien dat je met ```=``` een waarde aan een variabele kan toekennen.
Maar hoe kan je waardes uit een variabele vergelijken? Om waardes met elkaar te kunnen vergelijken heb je de ```==```[equals] operatie nodig. 
```java
int a = 5;
int b = 6;
boolean c = (a == b);
```
Het bovenste stukje code introduceert gelijk de ```boolean``` type.
Dit geeft aan dat de waarde in variabele ```c``` gelijk is aan ```true``` of ```false```.
De waarde van ```c``` wordt ```true``` als de waardes van ```a``` en ```b``` gelijk zijn aan elkaar, en anders ```false```.

Hiermee kunnen we de loops introduceren. De loop met de simpelste syntax is de ```while``` loop.
```java
while (condition) {
    // Code
}
```
Deze loop blijft de code herhalen zo lang de ```condition``` gelijk is aan ```true```. 
Let hierbij op dat je in een "infinite loop" kan belanden als de ```condition``` nooit false wordt.
Dit betekent dat je code nooit verder gaat buiten de loop en in sommige gevallen je computer vast loopt. 
Gelukkig houdt Intellij dit in de gaten en kan je handmatig je code stoppen door op het rode vierkantje of ```Ctrl + F2``` te drukken.

Als je weet hoeveel iteraties je nodig hebt, kan je ook een ```for``` loop gebruiken:
```java
for (initialise; condition; increment) {
    // Code
}
```
Hierboven staat de standaard syntax van een ```for``` loop. 
Een ```for``` loop heeft drie dingen nodig:
- ```initialise```: een beginwaarde om je iteraties bij te houden
- ```condition```: een conditie voor hoe lang je blijft herhalen
- ```increment```: een som om de beginwaarde te veranderen totdat de conditie niet meer waar is

Neem als voorbeeld de meest gebruikte vorm van een ```for``` loop:
```java
for (int i = 0; i < 10; i = i + 1) {
    // Code
}
```
De ```initialise``` maakt een variabele ```i``` (standaard naam) en zet die gelijk aan ```0```.
De conditie controleert vervolgens of de waarde van ```i``` minder is dan ```10```.
Zo ja, dan wordt de code uitgevoerd.
Als laatste wordt bij de waarde van ```i``` ```1``` opgeteld tijdens de ```increment```.
Deze loop voert zijn code dus altijd 10 keer uit en gaat dan verder.

### Opdracht
Gebruik je nieuwe kennis van loops om 2 methodes te maken:\
```power``` - berekent de macht van het eerste getal tot het tweede getal\
```fact``` - berekent de faculteit van een getal\
Hierbij is het belangrijk om te weten dat een variabele die binnen ```{``` en ```}``` aangemaakt wordt daar niet buiten gebruikt kan worden.

**Extra**\
Helaas is het onmogelijk voor alle getallen exact de wortel te berekenen, maar je kan het wel benaderen.
Maak een methode ```squareRoot``` aan die de vierkantswortel van een getal berekent tot 5 getallen achter de comma.
Hiervoor kan je dus geen hele getallen gebruiken.
Dit is een extra opdracht, dus hier moet je zelf wat meer voor uitzoeken. 
De volgende les gaat hier wat dieper op in.
Google is je vriend. Je kan dit!\
_Hint_ kijk naar https://en.wikipedia.org/wiki/Methods_of_computing_square_roots#Heron's_method