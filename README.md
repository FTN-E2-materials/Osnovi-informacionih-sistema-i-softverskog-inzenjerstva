
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


<p>
  
## Nasleđivanje
###### Preuzimanje atributa i metoda iz roditeljske klase. Jednu roditeljsku klasu može da nasledi više klasa naslednica. Dok obrnuto ne važi – jedna klasa može da nasledi samo jednu roditeljsku klasu -> jednostruko nasleđivanje
  
## Veze tipa asocijacije i agregacije (UML i Java)
###### Veza tipa asocijacije je za atribute koji nisu isključivi deo glavne klase (klasa Proizvođač je u vezi tipa asocijacije sa klasom Avion), već mogu da postoje i nezavisno od glavne klase. <br />Veza tipa agregacije je za atribute koji su deo celine (Rezervoar 🡨 Avion, Krilo 🡨 Avion) i nema smisla da postoje nezavisno od glavne klase. <br /> Kardinalnost veze određuje da li će atribut biti promenljiva ili kolekcija (niz, ArrayLista i sl.)
  
## Modifikatori pristupa

 - ***public*** ~ vidljiv za sve klase
 - ***protected*** ~ vidljiv samo za klase naslednice i klase iz istog paketa
 - ***private*** ~ vidljiv samo unutar svoje klase
 - nespecificiran (friendly) ~ vidljiv samo za klase iz istog paketa (direktorijuma, foldera)
 
###### Modifikator pristupa klase : Klasa može da ima public modifikator ispred definicije. To znači da je vidljiva iz svih drugih klasa, bez obzira gde su definisane (bez obzira na paket-folder) <br /> Modifikator pristupa ispred konstruktora : Ako konstruktor ima public modifikator, to znači da ta klasa može da se kreira iz bilo koje druge klase (bez obzira u kom paketu-folderu se nalazi) a ako stavimo private modifikator ispred konstruktora, niko ne može da kreira instance te klase (uvod u Singleton šablon)
  
## Method overriding
###### Pojava da u klasi naslednici postoji metoda istog imena i parametara kao i u baznoj klasi -> Anotacija @Override
  
## Apstraktne klase
###### Klase koje ne mogu imati svoje objekte, već samo njene klase naslednice mogu da imaju objekte (ako i one nisu apstraktne).Ako klasa ima makar jednu apstraktnu metodu, mora da se deklariše kao apstraktna.Mada apstraktna klasa ne mora da ima apstraktne metode!



## Polimorfizam
###### Situacija kada se poziva metoda nekog objekta, a ne zna se unapred kakav je to konkretan objekat (ono što se zna je koja mu je bazna klasa). Tada je moguće u programu pozivati metode bazne klase, a da se zapravo pozivaju metode konkretne klase koja nasleđuje baznu klasu


## Interfejsi
###### Omogućavaju definisanje samo apstraktnih metoda, konstanti i statičkih atributa. <br /> Interfejs nije klasa! On je spisak metoda i atributa koje klasa koja implementira interfejs mora da poseduje. <br />Interfejsi se ne nasleđuju, već implementiraju a da bi klasa implementirala interfejs, mora da redefiniše sve njegove metode. Jedan interfejs može da nasledi drugog a jedna klasa može da implementira jedan ili više interfejsa.

## Unutrašnje klase

###### Klase definisane bilo gde unutar neke druge klase (ta druga klasa se zove spoljašnja klasa). <br /> Unutrašnju klasu kreiramo iz spoljašnje klase bez dodatnih intervencija. <br /> Anonimne unutrašnje klase: Definišu se bilo gde unutar druge klase može čak i unutar poziva metode! Nemaju ime.

</p>
























