# **Övning DD1337 Programmering - Övning 5**
Mathias Grindsäter (grin@kth.se)

## 💬**Idag**
* Viktiga punkter från task 4
* Presentera veckans task
* RAST
* Vi bygger en (generisk) stack!
* Balanserade parenteser? (Om vi hinner, annars nästa vecka!)

## 💬**DD1337 Viktiga punkter**
* Angivna instruktioner och testfall.
* Kommentarer
* Skilj på att returnera och att printa.

## 💬**DD1337 Lösningar**
* Presentera era tasks i grupper om två.
* Glöm inte att ta frågor och input! 

## **Rast!**

## **Övningar**

### Att läsa från och skriva till fil
Vi börjar tillsammans att skriva en metod som läser varje ord från en
textfil...

Du ska nu skriva två metoder:

1. `public static List<String> filterWords(List<String> words, String substring)`
Metoden ska alltså returnera en `ArrayList`. Som indata ges en `ArrayList` med
orden och söksträngen. Varje ord som innehåller söksträngen ska vara med i 
listan som returneras.

Användbara metoden kan t.ex. hittas i `String`-klassen. Se [dokumentationen](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)

2. Nu ska vi skriva en metod som skriver resultatet till en fil.
Här får du en knuff i rätt riktning. Gör färdigt metoden.

```java
    public static void writeOutput(String outputFilePath, List<String> filteredWords) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            // Din kod här...    
        
        } catch (IOException e) {
            System.err.println("Error writing to the output file: " + e.getMessage());
        }
    }

```





