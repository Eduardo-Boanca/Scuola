#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

/****************************************************************
                        genitore.c
***************************************************************/

int main()
{
    pid_t pid;
    pid_t pid2;
    pid_t padre;

    int calcoloPadre;
    int calcoloFiglio1;
    int calcoloFiglio2;
    int calcoloFinale;

    padre = getpid();

    if (padre == getpid())
        pid = fork();

   
    if (pid == 0)
    {
        if (execl("figlio1", "figlio1", NULL) < 0)
        {
            perror("errore di exec"); /*normalmente non si arriva qui!*/
            exit(EXIT_FAILURE);
        }
    }
    
    else if ((pid2 = fork()) == 0)
    {
        if (execl("figlio2", "figlio2", NULL) < 0)
        {
            perror("errore di exec");
            exit(EXIT_FAILURE);
        }
    }

        // Processo genitore
        calcoloPadre = 2 * 6;
        printf("Padre: calcolo padre = 2 * 6\n");
        waitpid(pid, &calcoloFiglio1, 0);
        waitpid(pid2, &calcoloFiglio2, 0);
        calcoloFinale = calcoloPadre + (WEXITSTATUS(calcoloFiglio1) * WEXITSTATUS(calcoloFiglio2));
        printf(" Calcolo padre: = 2 * 6 = %d\n Calcolo figlio 1: = 1 + 4 = %d\n Calcolo figlio 2: = 5 - 2 = %d\n Calcolo risultato finale: = padre + (calcoloFiglio1 * calcoloFiglio2) = %d\n", calcoloPadre, WEXITSTATUS(calcoloFiglio1), WEXITSTATUS(calcoloFiglio2), calcoloFinale);


    return 0;
}