#include <stdio.h>
#include <mem.h>
#include <time.h>
#include <stdlib.h>
#include <stdbool.h>

#define wertMIN = 1
#define wertMAX = 6
#define WUERFEL=2

//Wuerfelt die Zufallsergebnisse aus
int dice(int anzWuerfel);
int dice(int anzWuerfel){
    int wuerfelSumme = 0;

    for (int i = 0; i < anzWuerfel; ++i) {
        wuerfelSumme+= rand()%6+1;

    }
    printf("Wuerfelsumme: %d\n",wuerfelSumme);

    return wuerfelSumme;
}

//Prüft ob der Spieler richtig liegt
bool win(bool Wahl,int Summe);
bool win(bool Wahl,int Summe){
    bool gerade = false;
    int modo = Summe%2;
    fflush(stdin);
    fflush(stdout);
    if (modo==0){
        gerade=true;
    }

    if(gerade==Wahl){
        printf("Sie haben gewonnen, Ihr Gewinn wurde verdoppelt!\n---------------------------------------------------------\n");
        return true;
    }
    printf("Sie haben leider verloren, Ihre Einsatz wurde ihnen entzogen!\n");
    return false;
}

//In dieser Methode läuft das Spiel und die Benutzer interaktion
void play();
void play(){
    bool spielerWahl=false;
    int anzWuerfel = 2;
    int einsatz;
    int geldGes;
    bool playing=true;


    while (einsatz<10||einsatz>100) {
        printf("Einsatz (Von 10 bis 100 EUR!):");
        fflush(stdin);
        fflush(stdout);
        scanf("%ld", &einsatz);
        fflush(stdin);
        fflush(stdout);
    }

    geldGes=einsatz;


    while(playing==true){
        int i = 2;
        while(i!=0&&i!=1){
            printf("Bitte geben sie '0' fuer ungerade oder '1' fuer gerade ein:");
            fflush(stdin);
            fflush(stdout);
            scanf("%d",&i);
            fflush(stdin);
            fflush(stdout);
        }
        if(i==1){
            spielerWahl =true;

        }

        if (win(spielerWahl,dice(2))==true){
            geldGes=geldGes*2;
        }
        else{
            printf("Sie haben kein Geld mehr, bitte beehren Sie uns bald wieder!\n");
            fflush(stdin);
            fflush(stdout);
            return;
        }

        int j =2;
        printf("Wenn sie weiter spielen wird ihr gesammtes Geld (%d)EUR eingesetzt!\n",geldGes);
        fflush(stdin);
        fflush(stdout);
        while(j!=0&&j!=1){
            printf("Wollen Sie nochmal Spielen? \nBitte geben sie '0' fuer nein oder '1' fuer ja ein:");
            fflush(stdin);
            fflush(stdout);
            scanf("%d",&j);
            fflush(stdin);
            fflush(stdout);
        }
        if (j==0){
            playing=false;
        }
    }
    printf("Ihr Endgewinn betraegt %d EUR, Ihr Einsatz war(%d)EUR!, Sie haben nun %d EUR\n",geldGes-einsatz,einsatz,geldGes);
    fflush(stdin);
    fflush(stdout);


}

int main() {

    srand(time(NULL));

    play();

    return 0;
}
