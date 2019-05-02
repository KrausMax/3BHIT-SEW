/*
 * Author: Maximilian Kraus
 * Date: 26.04.2019
 *
 * Dieses Programm prüft Strings ab ob sie ein Pallindrom sind oder nicht
 */
#include "palindrom.h"
#include <stdio.h>
#include <mem.h>


void isPallindrom(char* string)
{
    char *p_str, *rev_str;

    p_str = strupr(string);

    while (*p_str != '\0') {
        ++p_str;
    }

    --p_str;

    for (rev_str = string; p_str >= rev_str;) {
        if (*p_str == *rev_str) {
            --p_str;
            rev_str++;
        }
        else
            break;
    }

    if (rev_str > p_str) {
        printf("Die eingegebene Zeichenkette ist ein Pallindrom");
    }
    else{
        printf("Die eingegebene Zeichenkette ist kein Pallindrom");
    }
}