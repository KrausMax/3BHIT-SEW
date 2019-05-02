/*
 * Author: Maximilian Kraus
 * Date: 26.04.2019
 *
 * Dieses Programm prüft Strings ab ob sie ein Pallindrom sind oder nicht
 */
#include <stdlib.h>
#include <stdio.h>
#include "palindrom.h"

// Driver code
int main()
{
    char pallindrom_str[100] = "Hallo olla";

    isPallindrom(pallindrom_str);

    return 0;
}