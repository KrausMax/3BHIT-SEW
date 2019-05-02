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

float sensorWert(){
    float f;
        f =(float) rand()/1000;
        printf("%f\n",f);
    return f;
}

int main() {
    srand((unsigned int)time(NULL));
    int num;
    float *messwerte;

    do {
        printf("Bitte geben Sie an wieviele Messwerte Sie moechten(2-100):");
        fflush(stdout);
        scanf("%d", &num);
        fflush(stdin);
    }while (num<2||num>100);

    int i;
    messwerte = (float*)calloc(num, sizeof(float));
    for ( i=0;i<num ; messwerte++,i++){
        *messwerte = sensorWert();
        printf("%f\n",*messwerte);
    }
    return 0;
}

