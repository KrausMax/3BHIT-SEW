#include <stdio.h>
#include <mem.h>

void static stradd(char s1[], char []);
void static stradd(char s1[], char s2[]){

    char sGes[strlen(s1)+ strlen(s2)];
    int i;
    for (i = 0; i < (strlen(s1) + strlen(s2)); ++i) {

        if(i< strlen(s1)){
            sGes[i]=s1[i];
        }
        else{
            sGes[i]=s2[i - strlen(s1)];
        }
    }
        sGes[i]='\0';
        printf("%s",sGes);
}

void static stringCopy(char sEin[]);
void static stringCopy(char sEin[]){
    int k;
    char sAus[strlen(sEin)];

    k=0;
    while(sEin[k]!= '\0'){
        sAus[k] = sEin[k];
        k++;
    }
    sAus[k]='\0';
    printf("%s",sAus);
}

int main() {

    //Variablen erstellen
    int i;
    int* p;

    //Wertzuweisung und pointer
    i=4;
    p=&i;

    printf("Wert von i:%d\n Wert von p:%d\n Adresse von a:%p\n Adresse von p:%p\n",i,*p,p,&p);
    stradd("Hallo ","Welt");
    printf("\n");
    stringCopy("Hallo Welt");

    return 0;
}
