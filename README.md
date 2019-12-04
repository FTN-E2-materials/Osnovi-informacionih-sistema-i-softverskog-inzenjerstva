

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

## Memorija
 - Na **steku** se nalaze **reference** !
 - Na **heap-u** se nalaze **objekti**

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




<h1 align = "center"> Kolekcije podataka,Paketi </h1>

<p align="center">
  <img width="600" height="200" src="https://docs.swift.org/swift-book/_images/CollectionTypes_intro_2x.png">
</p>

<p>

## Paketi
###### Način za hijerarhijsko organizovanje programa u module. <br /> CLASSPATH environment varijabla: Predstavlja spisak foldera i JAR arhiva gde VM traži klasu koja se koristi. Ako CLASSPATH ne postoji, podrazumevaju se tekući direktorijum i standardne Java biblioteke.A ako CLASSPATH postoji, mora da sadrži i tekući direktorijum (standardne Java biblioteke se podrazumevaju). <br /> JAR arhive: klasičan ZIP format koji sadrži i folder META-INF u kojem je najbitnija datoteka manifest.mf(verziju,ime kreatora,ime glavne klase ,ClassPath )
  
## Klasa Object
###### Sve Java klase implicitno nasleđuju klasu Object <br /> Reprezentativne metode: equals(o),toString(),hashCode(),getClass()

## Wrapper klase
###### Za sve primitivne tipove postoje odgovarajuće klase: int 🡪 Integer, long 🡪 Long, boolean 🡪 Boolean

## Autoboxing i unboxing
###### Ako metoda prima Integer kao parametar, može da se prosledi i int, odn. promenljivoj tipa Integer može da se dodeli vrednost promenljive tipa int.Radi i u obrnutom pravcu – promenljivoj tipa int može da se dodeli vrednost promenljive tipa Integer.

## Metode sa promenljivim brojem parametara
###### Ako su parametri reference na objekte neke klase, a znajući da sve klasenasleđuju klasu Object, dovoljno je definisati da metoda prima različit broj parametara tipa Object: void f2(Object... params)

## Enumeracije
###### Java donosi dodatne osobine enumeracijama. Enumeracije više ne predstavljaju samo celobrojne nabrojive tipove, već mogu da imaju konstruktore, atribute i metode. <br /> Spisak vrednosti enumeracije se dobija pozivom metode values().

## Tipizirane kolekcije 
###### Omogucuju smestanje samo jednog tipa podatka u kolekciju !

## Shallow copy
###### Java podrzava shallow copy tako sto u klasi Object ima metodu clone() ali ona je protected,zbog toga je potrebno implementirati interfejs Cloneable i redefinisati clone() 


</p>

<h1 align="center"> Ulazno izlazni podsistem </h1>

<p align="center">
  <img width="600" height="300" src="https://www.trzcacak.rs/myfile/full/295-2950247_laptop-image-transparent-desktop-frame-png.png">
</p>

<p>
  
###### Standardna biblioteka za ulazno/izlazne operacije. <br /> Izvorišta/odredišta: memorija, fajl sistem, mrežne konekcije. <br /> Oslanja se na tokove (streams) i čitače/pisače (reader/writer) a nezavisno od tokova/čitača postoji i RandomAccessFile klasa i File klasa.

## File klasa
###### Sluzi za manipulaciju datotekama i direktorijumima: kreiranje, brisanje, pristup datoteka i direktorijuma <br /> Kao i za modifikaciju naziva i atributa datoteka i direktorijuma

## Tokovi (streams)
###### Bazirani su na bajtovima( prenos jednog ili niza bajtova ) tj sluze sa prenos podataka ( datoteke, niz bajtova ...) . <br /> Osmišljeni kao mehanizam koji omogućuje ujedinjen pristup podacima. <br /> Koncept filtera donosi dodatnu funkcionalnost tokovima : prenos primitivnih tipova,baferizovan prenos podataka, prenos objekata,formatiranje podataka.

## Čitači/pisači (readers/writers)

###### Ispravljaju problem sa tokovima – slabu podršku Unicode rasporedu jer tokovi ne prenose dobro Unicode stringove a i poseban problem predstavljaju različite hardverske platforme (little-endian, big-endian). <br /> Čitači/pisači ne zamenjuju tokove – oni ih dopunjuju. <br /> Čitači/pisači se koriste kada je potrebno preneti Unicode stringove ili karaktere – u ostalim situacijama koriste se tokovi.<br /> Omogućuju prenos karaktera iz/u: datoteke, druge nizove karaktera, stringove. <br />

### Zaključak
###### Podaci se čitaju iz ulaznih tokova, a pišu u izlazne tokove. Iz programa se retko radi direktno sa bajtovima, zato se tokovi ugrađuju u Filter klase koje imaju odgovarajuće metode za čitanje/pisanje tj. zato imamo tokove objekata, tokove primitivnih tipova itd. a ako radimo sa karakterima/stringovima, koristimo čitače i pisače

## Skener 
###### Klasa Scanner služi za unos stringova i primitivnih tipova iz tekstualnih ulaza.<br /> Ona radi kao jednostavan parser teksta koji je u stanju da iz tekstualnog ulaza izdvoji stringove po nekom obrascu.<br /> Nakon izdvajanja stringa, u stanju je da konvertuje taj string u traženi primitivni tip.

## Serijalizacija objekata
###### Je prevodjenje objekta u niz bajtova i njegova rekonstrukcija iz niza u "ziv" objekat.<br /> Serijalizovan niz bajtova se moze snimiti u datoteku ili poslati preko mreze - i jedno i drugo upotrebom objekata. <br /> Da bi se neki objekat serijalizovao: potrebno je da implementira java.io.Serializable interfejs i da su atributi i parametri metoda takodje serijalizabilni. <br /> Primitivni tipovi su serijalizabilni kao i vecina biblioteckih klasa. <br> <br /> U javi postoji kljucna rec *transient* koja se moze staviti uz atribut, a ona oznacava da se vrednost atributa nece preneti prilikom serijalizacije. A ako ovu kljucnu rec stavimo uz atribut koji je primitivni tip,po rekonstrukciji objekta, u njemu ce biti podrazumevana vrednost za taj tip,a null literal za reference.

</p>



<h1 align="center"> GUI u Javi [ Swing ] </h1>
<p align="center">
  <img width="1000" height="400" src="https://i.ytimg.com/vi/SpKANTHXwmo/maxresdefault.jpg">
</p>

<br>
<h1 align="center"> Uvod u GUI </h1>

<p>
  
###### Korisnički interfejs je upravljan događajima.<br /> Swing je napisan u Javi, pluggable look-and-feel, veliki broj komponenti, kompletna podrska za Unicode standard....

## Event Driven model
###### Program se ne izvrsava linearno(od gore prema dole) nego se pisu procedure koje se izvrsavaju po pojavi nekog dogadjaja korisnickog interfejsa( klik misa,pritisak tastera i sl. ). <br /> Svaka akcija nad komponentama korisnickog interfejsa izaziva generisanje objekata klasa naslednica *Event* klase a ti objekti se prosledjuju objektima klasa naslednice EventListener klase,koje "osluskuju" dogadjaje. 


## Dodavanje komponenti u prozor
###### Prilikom konstrukcije objekta klase naslednice JFrame dodaju se komponente na formu, nije dovoljno da se samo kreira komponenta nego se ona mora dodati na formu (metodom add...) !

## Kontejneri najvišeg nivoa (top-level) u Swing-u
 - JFrame - koristi se za implementaciju glavnog prozora aplikacije. Može imati menije, toolbarove itd.
 - JDialog - Nasleđuje se iz java.awt.Dialog i koristi se za kreiranje dijaloga aplikacije. Za kreiranje standardnih dijaloga koristi se klasa JOptionPane.
 - JWindow - prozor koji za razliku od JFrame-a nema naslov (titlebar) i sistemske akcije za manipulaciju prozorima
 - JApplet - klasa za kreiranje apleta u swingu


## Razlika u konstrukciji GUI-ja za Windows i Java aplikacije
###### Windows aplikacije koriste tzv. resurse za definisanje izgleda korisničkog interfejsa a Java aplikacije svoj korisnički interfejs grade programski, najčešće u toku inicijalizacije prozora.



</p>
<br>

<h1 align="center"> Prostorni raspored i dogadjaji </h1>
<p>

## Upravljanje prostornim rasporedom
###### Cilj je obezbediti konzistentan prikaz komponenti: pri promeni OS, jezika, rezolucije, fonta, geometrije kontejnera.
### Vrste upravljaca
 - BorderLayout ( slaze komponente po stranama sveta (podrazumevani upravljac za JFrame) )
 - FlowLayout ( slaze komponente po horizontali (podrazumevani upravljac za JPanel) )
 - GridLayout ( rasporedjuje komponente u mrezu sa zadatim brojem redova i kolona )
 - GridBagLayout ( slican kao GridLayout samo sto komponente mogu zauzimati vise celija )
 - GroupLayout
 - ...

## Adapter klase
###### One su uvedene za sve xxxListener interfejse koje imaju vise od jedne metode, sa ciljem da olaksaju pisanje reakcije na dogadjaje tj one implementiraju Listener interfejse i obezbedjuju podrazumevanje reakcije na dogadjaje.

## EVD - Event Dispatching Thread
###### Svaka awt ili swing aplikacija pocinje sa 2 niti , u jednoj se izvrsava main metoda a u drugoj se obradjuju dogadjaji(EDT).Dogadjaji se obradjuju serijski i bitno je da se slanje svih dogadjaja obavlja iz EDT.<br /> Problem je ako se iz listenera startuje dugotrajan posao sa potrebom da se azurira stanje GUI komponenti desava se da se "zamrzava" ekran. <br /> Najbolje rešenje je upotreba SwingWorker klase koja resava taj problem, samo je potrebno naslediti SwingWorker i redefinisati metode.


</p>

<br>
<br>

<h1 align="center"> Komponente u Swingu </h1>

<p align="center">
  <img width="600" height="400" src="http://www.eeng.dcu.ie/~ee553/ee402notes/html/figures/JDialogExample.gif">
</p>
<br>

<p>

## JComboBox
###### Karakteriše je prisustvo dva koncepta: koncept *modela podataka* i koncept *renderera*. 
### JComboBox model 
###### Ako je potrebno modelovati podatke na specifičan način, implementira se interfejs ComboBoxModel i redefinisu potrebne metode.<br /> ComboBoxModel je uveden da bi se na poseban nacin predstavili nasi podaci.
### JComboBox renderer
###### Ako je potrebno prikazati podatke iz ćelije na specifičan način, implementira se interfejs ListCellRenderer. <br /> Renderer je vezan za stavku koja se prikazuje.

## JList
###### Karakteriše je prisustvo dva koncepta: koncept *modela podataka* i koncept *renderera*. <br /> Isto kao i JComboBox samo se implementiraju drugaciji interfejsi.

## JTabbedPane
###### Reprezentuje sistem međusobno preklopljenih prozora do kojih se dolazi klikom po odgovarajućoj “kartici”. Kartice su reprezentovane panelima (JPanel) i dodaju se metodom add:

## JTable
###### Reprezentuje tabelu. Karakteriše je prisustvo tri koncepta: koncept *modela podataka*, koncept *editora* i koncept *renderera*.<br /> Ako je potrebno modelovati podatke na specifičan način, implementira se interfejs TableModel.<br /> Ako je potrebno prikazati podatke iz ćelije na specifičan način, implementira se interfejs TableCellRenderer. Renderer je vezan za kolonu. <br /> Ako je potrebno editovati podatke iz ćelije na specifičan način, implementira se interfejs TableCellEditor.Editor je vezan za kolonu

## JTree
###### Služi za hijerarhijski prikaz (stablo). Stablo se kreira dodavanjem čvorova, počev od prvog (root).<br /> Ako je potrebno modelovati podatke na specifičan način, implementira se interfejs TreeModel. <br /> Ako je potrebno prikazati podatke iz čvora na specifičan način, implementira se interfejs TreeCellRenderer.

### Zakljucak
###### Ako zelimo da modelujemo podatke implementiramo interfejs za odredjenu komponentu koja ima modelovanje <br /> Ako zelimo da prikazemo podatke implemntiramo intefejs koji ima renderovanje. <br /> A ako zelimo da menjamo podatke ( kod nekih komponenti je i to moguce) implementiramo interfejs koji nam omogucava editovanje.

## Dijalozi 
###### Služe za interakciju sa korisnikom. Mogu biti: modalni (ne može se preći na glavni ekran dok se ne ugasi dijalog) i nemodalni (može se preći na glavni ekran).<br /> Postoje predefinisani dijalozi (JOptionPane- uvek modalni) i dijalozi koje kreira korisnik (JDialog- modalnost zavisi od parametara konstruktora).

## LookAndFeel
###### Java poseduje mehanizam definisanja izgleda GUI komponenti.LookAndFeel mehanizam omogućuje promenu izgleda aplikacije bez restarta.


</p>
















