# **DD1396 Palinda-1 - Övning 1**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Kort presentation och kort om kursen och övningarna
	* Kommunikation - Slack fortsatt.
	* Ingen AI - anmäls. Inkluderar skriftliga svar.
	* Vid frånvaro, var beredd att kunna presentera dubbelt nästa övning.
	* Kort kurs så vi tar flera men kortare presentationer. 
	* Inte pushat i tid = Fail. Dubbelkolla alltid.
* Komma igång...
* Presentera veckans task
* RAST
* Övningar

## 💬**DD1396 Lösningar**
* Diskutera era lösningar i par.
  * Beskriv vad ni har gjort.
  * Vad gjorde ni annorlunda?
* Presentera!
  * Glöm inte att ta frågor och input!

## **Rast!**

## **Övningar**

### **Pekare**
```go
// Skapa två variabler
a := 1396
s := "palinda"

// Skapa pekare för int och string
// (Notera användandet av * innan TYPEN)!
var intPtr *int    
var strPtr *string 

// Låt pekarna peka på minnesadresserna för a och s
intPtr = &a
strPtr = &s

// Hämta värdet från en pekare
// (Notera användandet av * innan PEKARVARIABELN)!
b := *intPtr

// En funktion kan ta pekare som argument
func myFunction(ptr *int) {
    // ...
}

func myOtherFunction(ptr *string) {
    // ...
}

// Funktionen anropas
myFunc(intPtr)
// Alternativt kan vi ge addressen direkt
myFunc(&a)
```

#### **Pekare - övning**
```go
package main

import (
	"fmt"
)

func add(num1, num2 int) {
	num1 = num1 + num2
}

// TODO
// Gör en funktion addPointer som tar 2 argument: en int-pekare och en int.
// Funktionen ska addera int:en till pekarens värde.
// Funktionen ska INTE returnera någonting.


func main() {
	num := 5
	x := 10

	// Anropar add med x och num
	add(x, num)
	fmt.Printf("x efter add: %d\n\n", x)

	// TODO
	// Skapa en pekare som pekar till x


	// TODO
	// Anropa addPointer med din pekare och num

	fmt.Printf("x after addPointer %d\n\n", x)
}
```

### **Kanaler**
```go
// Skapa en (obuffrad) string-kanal.
ch := make(chan string)

// Skicka en string till kanalen.
ch <- "hej"

// Ta emot från kanalen och spara i en variabel.
receivedString := <- ch 

// Funktion som tar en string-kanal som argument.
// Kanalen kan både skicka och ta emot.
func foo(ch chan string) { 
	// ...
}

// Man kan även specificera om kanalen endast ska
// skicka eller ta emot data.
func foo(ch <-chan string) { // Skickar data 
	// ...
}

func foo(ch chan<- string) { // Tar emot data 
	// ...
}
```

#### **Kanaler - övning 1**
1. Om du ändrar i `ConcurrentSum`-funktionen i din kod i `twopartsum` så att du istället utför subtraktion istället för addition av de två listhalvorna, är programmet då deterministiskt? Motivera!
2. Skriv om `twopartsum` så att det istället utför subtraktion istället för addition av de två listhalvorna.


#### **SKIPPA DENNA OCH GÅ TILL NÄSTA ÖVNING!**
#### **Kanaler - övning 2**
```go
package main

import (
	"fmt"
	"strconv"
	"time"
)

// TODO
func kastare(ch chan<- string) {
	
}

// TODO 
func fångare(ch <-chan string) {

}

func main() {
	c := make(chan string)
	go kastare(c)
	go fångare(c)

	select {}
}
```

<details>
  <summary>Tips!</summary>

1. Använd oändliga for-loopar
2. En int kan konverteras till en sträng med funktionen `strconv.Itoa`
3. Använd `time.Sleep` för att styra hur ofta bollar kastas och hur snabbt 
texten skrivs ut efter att en boll har mottagits.

</details>

#### **Kanaler - en till övning!**
Det längsta ordet i svenskan är enligt Wikipedia: nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljningssystemdiskussionsinläggsförberedelsearbeten.

Ett ordhanteringsprogram har inte känt igen ordet och delat in det i 16 olika ord som:
```go
a := []string{"nord", "väster", "sjökust", "artilleri",
		"flyg", "spanings", "simulator", "anläggnings",
		"materiel", "underhålls", "uppföljnings", "system",
		"diskussions", "inläggs", "förberedelse", "arbeten"}
```

Använd goroutiner för att konkatinera de sexton orden till ett ord igen. Glöm inte att orden ska sluta upp i rätt ordning, hur kan vi lösa det? Tips: Använd kanaler!

Förväntat resultat: nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljningssystemdiskussionsinläggsförberedelsearbeten










 

