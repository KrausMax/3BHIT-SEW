#include <stdio.h>
#include <mem.h>
#include <malloc.h>

void stringcat(char *s1, char *s2);
void stringcat(char *dest, char *src){

    fflush(stdout);
    fflush(stdin);

    int dest_len = strlen(dest);
    strcpy(dest+dest_len,src);

    printf("%s\n",dest);

}

void static stringCopy(char sEin[]);
void static stringCopy(char sEin[]){
    char* sAus;
    sAus = sEin;
    printf("%s",sAus);
}

int main() {

    char s1[] = "Hallo";
    char s2[] = " Welt1";

    stringcat(s1,s2);
    fflush(stdout);
    fflush(stdin);

    stringCopy("Hallo Welt2");

    return 0;
}
