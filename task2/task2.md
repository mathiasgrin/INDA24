**Övning DD1337 Programmering - Övning 2**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Viktiga punkter från task 1
* Presentera era lösningar
* RAST
* Övningar


## 💬**Viktiga punkter från task 1**

### Finn två fel (förutom att koden är okommenterad)
```java

public int sum(int a, int b) {
    return a+b;




}


```


## 💬**DD1337 Lösningar**
* Presentera era lösningar!

## **Rast!**

## **Övningar**

```java
public class Main {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("Positive");
        }
        else if (number == 0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Negative");
        }
    }
}

```


### 1. Gå igenom Car.java och hitta felen!

### 2. BankAccount.java

1) Skapa en klass `BankAccount` som har tre fält: `accountNumber`,
`accountHolderName` och `balance`. Låt `accountNumber` vara av typen
`String`.

2) Skapa en konstruktor som ger initiala värden till de tre fälten.
3) Skapa tre getter-metoder.
4) Skapa 2 setter-metoder (`balance` ska inte ha en setter ).
5) Skapa en metod `deposit`. När man kallar på metoden sätter man in
en given summa som argument. Fältet `balance` ska då uppdateras.
6) I metoden `deposit`, hur kan vi hindra att man inte kan sätta in negativa
summor? 
7) Skapa en metod `withdraw`. När man kallar på metoden anger
man hur stor summa man vill ta ut från sitt konto. Se till att
variabeln `balance` uppdateras.
8) I metoden `withdraw`, hur ser vi till att vi inte kan ta ut negativa
summor från bankkontot. Se även till att man inte kan
ta ut mer pengar än vad som finns på kontont (dvs `balance`)
9) Skapa ett eller flera objekt i `main`-metoden och kalla
på de metoder du skapat.
10) Om du är färdig kan du börja kolla in task 3 :)

### 3. Bash

#### Skapa directory och filer
1) Skapa ett nytt directory `test` för den här övningen med `mkdir`, använd 
sedan `cd` för att förflytta dig dit.
2) Skriv `pwd` och se att du är rätt. Skriv gärna också `whoami`...
3) Skapa några textfiler, t.ex. `test1.txt`, `test2.txt` osv mha. `touch`.
Ett tips är att använda `man` följt av det kommando du vill kolla upp för
att se hur det kan användas. Använd sedan kommandot `open` för att öppna var fil
för sig, skriv några meningar i varje textfil.

#### Lista filer
Lista nu dina skapade textfiler med `ls`. Titta gärna igenom manualen för
eventuella flaggor. Exempelvis kan man använda `a`, `l` och `t`. 
Vad gör dem?

#### Läs innehållet
Om vi vill skriva innehållet i en fil till stdout kan vi använda cat.
Vi kan också använda less för att läsa våra textfiler.

#### Hur vi söker
`find` används för att hitta filer. Använd manualen för att se hur 
kommandot används, testa sedan att söka efter alla filer som slutar
med extension `.txt` i ditt skapade directory. Ett tips är att söka 
efter strängen `*.txt`. `*` säger att det får stå vad som helst innan 
`txt`. Glöm inte att ange path. Hittar du dina skapade filer?

`grep` används för att söka i filer. Kommer du ihåg något som du skrev
i din textfil? Sök efter den strängen i din fil, använd `man` för att
se hur grep används.

#### awk
Skapa nu en textfil `names.txt` med följande innehåll:

```java
John Doe
Jane Smith
Alice Johnson
Bob Brown
```

Vi kan skapa en fil som bara innehåller efternamnen som:
awk \`{print $2}\` names.txt > surnames.txt

Hur skulle du skapa motsvarande fil för förnamnen?

#### Piping
Låt oss nu säga att vi vill igen vill skapa en fil med alla efternamn, 
men denna gång vill vi att den skapade filen ska ha efternamnen i
sorterad ordning.

Vi kan då göra såhär:
awk \`{print $2}\` names.txt | sort > surnames_sorted.txt

`|` kallas för `pipe` och "fångar in" det som hade hamnat i stdout 
på vänster sida så att vi kan använda denna output till ett annat
kommando, här `sort`.

#### Att radera
Ta nu bort alla filer med kommandot `rm`.
Ta slutligen bort ditt directory med `rmdir`.
