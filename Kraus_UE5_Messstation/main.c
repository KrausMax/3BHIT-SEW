/*
 * Author: Maximilian Kraus
 * Date: 02.05.2019
 *
 * Beschreibung: Dieses Programm beinhaltet eine Messstation welche verschiedene Messwerte erhält
 * und daraus Berechnungen wie Median, Standardabweichung, etc. erstellt.
 */
#include <time.h>
#include <stdlib.h>
#include <stdio.h>
#include <math.h>

void back(float *src,float *dest) {
    float temp;
    temp=*src;
    *src=*dest;
    *dest=temp;
}

float ber_median(float* messwerte,int anz_mw){
    int n = (anz_mw + 1) / 2 - 1;
    return *(messwerte + n);
}

float sensorWert(){
    float f;
        f =(float) (rand()%10000)/100;
        printf("%f\n",f);
    return f;
}

int main() {
    srand((unsigned int)time(NULL));
    int anz_mw;
    float *messwerte;

    do {
        printf("Bitte geben Sie an wieviele Messwerte Sie moechten(2-100):");
        fflush(stdin);
        fflush(stdout);
        scanf("%d", &anz_mw);
        fflush(stdin);
        fflush(stdout);
    }while (anz_mw<2||anz_mw>100);

    int i;

    //speicher reservieren
    messwerte = (float*)calloc(anz_mw, sizeof(float));

    //Werte in Pointer
    for ( i=0;i<anz_mw ; messwerte++,i++){
        *(messwerte+i) = sensorWert();
    }

    //sort
    for(int i = 0; i < anz_mw - 1; i++) {
        for(int j = 0;j < anz_mw-i-1; j++) {
            if(*(messwerte + j) > *(messwerte + j + 1))
                back((messwerte + j),(messwerte + j + 1));
        }
    }

    //Speicher für berechnete Werte
    float* ber_werte = (float*) calloc(6, sizeof(float));

    float sum;
    for(int i = 0; i < anz_mw; i++){
        sum += *(messwerte + i);
    }

    float mittelwert = sum / anz_mw;
    *ber_werte = mittelwert;

    //Median
    *(ber_werte +1) = ber_median(messwerte, anz_mw);

    //Standardabweichung
    float s_sum;
    for(int i = 0; i < anz_mw; i++){
        s_sum += pow((*(messwerte + i) - mittelwert), 2);
    }

    float standardabweichung = s_sum / anz_mw;
    *(ber_werte +2) = standardabweichung;

    //Größter Wert
    *(ber_werte +3) = *(messwerte + anz_mw - 1);

    //Kleinster Wert
    *(ber_werte +4) = *messwerte;

    //Quartile
    *(ber_werte +5) = ber_median(messwerte, anz_mw / 2);
    *(ber_werte +6) = ber_median(messwerte,anz_mw);
    *(ber_werte +7) = ber_median(messwerte + anz_mw / 2 + 1, anz_mw / 2);

    fflush(stdin);
    fflush(stdout);
    printf("Bitte waehlen Sie den Wert den Sie erhalten moechten:");
    fflush(stdin);
    fflush(stdout);
    printf("\n(1): Mittelwert");
    printf("\n(2): Median");
    printf("\n(3): Standardabweichung");
    printf("\n(4): groeßter Wert");
    printf("\n(5): kleinster Wert");
    printf("\n(6): Quartile\n");
    fflush(stdin);
    fflush(stdout);
    int eingabe;
    scanf("%d", &eingabe);
    switch (eingabe) {
        case 1: printf("\n%f",(*ber_werte)); break;
        case 2: printf("\n%f",(*(ber_werte + 1))); break;
        case 3: printf("\n%f",(*(ber_werte + 2))); break;
        case 4: printf("\n%f",(*(ber_werte + 3))); break;
        case 5: printf("\n%f",(*(ber_werte + 4))); break;
        case 6: printf("\n%f,\n%f,\n%f",(*(ber_werte + 5)),(*(ber_werte + 6)),(*(ber_werte + 7))); break;
        default: break;
    }

    

    return 0;
}

