#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

/****************************************************************
 *                      genitore.c
 ****************************************************************/

int main()
{
    pid_t pid;
    pid_t pid2;
    pid_t padre;

    int x;
    int y;
    int z;
    int w;
    int h;

    padre = getpid();

    if (padre == getpid())
    {
        pid2 = fork();
    }

    pid = fork();
    if (pid == 0)
    {
        if (execl("figlio1", "figlio1", NULL) < 0)
        {
            perror("errore di exec"); /*normalmente non si arriva qui!*/
            exit(EXIT_FAILURE);
        }
    }
    else
    {
        if (pid2 == 0)
        {
            if (execl("figlio2", "figlio2", NULL) < 0)
            {
                perror("errore di exec");
                exit(EXIT_FAILURE);
            }
        }
        else
        {
            // Processo genitore
            x = 2 * 6;
            printf("Padre: calcolo x = 2 * 6\n");
            waitpid(pid, &y, 0);
            waitpid(pid2, &z, 0);
            w = x + (WEXITSTATUS(y) * WEXITSTATUS(z));
            printf("Calcolo x: = 2 * 6 = %d, Calcolo y: = 1 + 4 = %d, Calcolo z: = 5 - 2 = %d, Calcolo w: = x + (y * z) = %d", x, WEXITSTATUS(y), WEXITSTATUS(z), w);
        }
    }

    return 0;
}