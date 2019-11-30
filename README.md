
<h1 align="center"> Uvod u OOP </h1>

<p align="center">
  <img width="600" height="200" src="https://javatutorial.net/wp-content/uploads/2014/11/class-object-featured-image.png">
</p>


<p>

###### U objektno orijentisanom programiranju, u sklopu opisa problema, potrebno je uočiti entitete (jedinice posmatranja) koji se nalaze u svetu (domen) u kojem se nalazi i problem koji se rešava. <br /> Potrebno je uočiti koji entiteti se nalaze u svetu, opisati ih i navesti operacije nad njima, a kojima se problem rešava.

###### Klasa: model objekta koji uključuje atribute i metode <br /> Objekat: instanca klase ( kreira se upotrebom ključne reči new )
<br>

## Method overloading 

###### U klasi može da postoji više metoda sa istim imenom <br /> Razlikuju se po parametrima. Metode se nikada ne razlikuju po povratnoj vrednosti

## Podrazumevani konstruktor

###### Ukoliko se unutar definicije klase ne navede nijedan konstruktor, kompajler će sam generisati tzv. podrazumevani konstruktor koji nema parametre, a telo mu je prazno. Taj konstruktor se neće kreirati na nivou izvornog koda, već na nivou bajt-koda (prevedenog koda). Konstruktor se automatski poziva prilikom kreiranja objekta.

## Constructor overloading

###### Možemo imati više konstruktora. Ako ne napravimo default konstruktor, a napravimo barem još jedan konstruktor, default konstruktor se više ne pravi u bajt-kodu! ( -> preporuka je napraviti default konstruktor uvek )

## Uništavanje objekata – Garbage collector
###### Radi kao poseban proces u pozadini koji ima  automatsku dealokaciju i defragmentacija memorije a poziva se po potrebi(bez naseg znanja ~ ne postoji destruktor).

## Deep vs. shallow copy
######  Operator '=' kod primitivnih tipova radi deep copy dok kod referenci ne radi deep copy objekta, već kopira reference. <br /> Kada primenimo operator '=' na reference tada i originalna promenljiva i nova ukazuju na isti objekat [ shallow copy ].

## Ključna reč static
###### Definiše statičke atribute i metode a one postoje i bez kreiranje objekta zato im se može pristupiti preko imena klase. <br /> Statički atributi imaju istu vrednost u svim objektima, ako promenim statički atribut u jednom objektu, on će se promeniti i kod svih ostalih objekata. <br> <br />Statički blok se izvršava samo jednom, prilikom prvog korišćenja klase.Unutar statičkog bloka može se pristupati samo statičkim atributima i mogu se pozivati samo statičke metode.

</p>

<h1 align="center"> Principi OOP-a </h1>
<p align="center">
  <img width="600" height="300" src="https://miro.medium.com/max/1073/1*uyQ61XHkTY2qHhovclaLIQ.png">
</p>




