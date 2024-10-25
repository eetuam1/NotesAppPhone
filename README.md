# Notes App

## Projekti

Notes App on yksinkertainen Android-sovellus, joka mahdollistaa käyttäjien luoda, tallentaa ja poistaa muistiinpanoja. Sovelluksessa käytetään SharedPreferences-tallennusta, jotta muistiinpanot voidaan säilyttää laitteen sulkemisen jälkeen. Sovellus tarjoaa käyttäjäystävällisen käyttöliittymän, jonka avulla käyttäjät voivat hallita muistiinpanojaan helposti.

## Projektin idea

Projektin tarkoituksena on tarjota käyttäjille helppokäyttöinen sovellus, jossa he voivat tallentaa ajatuksiaan, muistiinpanojaan tai mitä tahansa tietoja, joita he haluavat pitää mielessään. Tämä sovellus on hyvä harjoitus Android-kehitykselle ja tarjoaa perustiedot muistiinpanojen tallentamisesta ja näyttämisestä.

## Aloittaminen

### Tarvittavat työkalut

- **Android Studio**: Asenna viimeisin versio [Android Studiosta](https://developer.android.com/studio) kehitysympäristönä.
- **Java**: Varmista, että sinulla on Java JDK asennettuna. Android Studio asentaa sen yleensä automaattisesti.

### Projektin kloonaaminen

Voit kloonata projektin seuraavalla komennolla:

```bash
git clone https://github.com/kayttajanimi/notes-app.git
Korvaa kayttajanimi omalla GitHub-käyttäjänimelläsi.

Projektin käynnistäminen
Avaa Android Studio.
Valitse "Open an existing project" ja valitse kloonattu projekti.
Varmista, että Gradle-projekti on synkronoitu. Android Studion pitäisi automaattisesti ladata tarvittavat kirjastot ja riippuvuudet.
Kytke Android-laite tai avaa Android-emulaattori.
Käynnistä sovellus Android Studiossa valitsemalla "Run" -painike.
Tarvittavat riippuvuudet
Projektissa käytetään seuraavia Android-kirjastoja:

AndroidX: Peruskirjastot Android-sovelluksille.
JUnit: Yksikkötestauksen tuki.
Riippuvuudet määritellään build.gradle-tiedostossa. Varmista, että sinulla on käytössä oikeat versiot kirjastosta.

Sovelluksen käyttö
Avaa sovellus ja syötä muistiinpanon otsikko ja sisältö.
Paina "Tallenna" tallentaaksesi muistiinpanon.
Napauta tallennettua muistiinpanoa poistaaksesi sen.
