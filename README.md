## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Enoncé de l'exercice
    Enoncé tiré sur le net ` sans corrigé ` faute de manque d'idée.



Le poker d'as est un jeu de dé qui consiste à réaliser la combinaison la plus forte possible en trois jets de dés. Il y a cinq dés. Au premier jet, les 5 dés sont lancés, puis le joueur choisit parmi ces dés lesquels il garde et il relance les autres pour le deuxième jet et idem pour le troisième jet. Il peut n'en relancer aucun si la combinaison obtenue lui convient.
Chaque dé affiche un nombre compris entre 1 et 6. Lordre des dés nest pas pris en compte dans le jeu.
Les combinaisons sont les suivantes (de la plus forte à la moins forte):
    - Le poker : les cinq chiffres sont égaux. Exemple: 2 2 2 2 2
    - Le carré : quatre chiffres sont égaux et le cinquième différent. Exemple: 3 3 3 3 6
    - Le full : trois chiffres sont égaux et les deux chiffres sont égaux entre eux. Exemple: 2 2 2 6 6
    - La grande suite : les cinq chiffres sont différents et consécutifs. Exemple: 2 3 4 5 6
    - Le brelan : trois chiffres sont égaux et les deux autres différents. Exemple: 1 1 1 2 6
    - La petite suite : quatre chiffres sont différents et consécutifs. Le cinquième peut être égal à un de ces quatre ou différent, mais non consécutif. Exemples: 2 2 3 4 5 et 1 2 3 4 6
    - La double paire : il y a deux séries de deux chiffres égaux. Exemple: 5 5 2 2 3
    - La paire : deux chiffres sont égaux et les autres différents. Exemple 4 4 1 2 6
    - Rien : les autres combinaisons, celles qui ne correspondent à aucun des cas listés ci-dessus. Exemple: 1 2 4 5 6
Notez que seule la combinaison la plus forte est prise en compte. Par exemple, le tirage 2 2 3 4 5 est une petite suite et non pas une paire bien quil y ait eux chiffres égaux.

## Consigne
On donne le programme suivant qui réalise un tirage au sort d'une combinaison et l'affiche. Complétez ce programme pour qu'il affiche quelle combinaison est réalisée par ce tirage (s'il sagit d'un carré, d'une petite suite, etc).