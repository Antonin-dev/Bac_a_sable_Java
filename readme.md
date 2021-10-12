# Bac à sable Java
## JAVA01: Arguments de la ligne de commande
Un argument
L'exercice consiste à faire en sorte que, à l'exécution, l'argument passé à la ligne de commande soit écrit à l’écran.

Si la ligne de commande est :
$ java TpJava01 Guillaume
le programme doit écrire :
Bonjour Guillaume

Help: utiliser un System.out.println(...).
Plusieurs arguments
Cette partie d'exercice ne peut se faire que si on sait manipuler des boucles et lorsqu'on à quelques connaissances sur les tableaux.

L'exercice consiste à faire en sorte que, à l'exécution, tous les arguments passés à la ligne de commande soient écrits à l’écran, un par ligne.

Si la ligne de commande est :
$ java TpJava01 Christophe Guillaume Clément
le programme doit écrire :
Bonjour Christophe
Bonjour Guillaume
Bonjour Clément

Pour chaque TP JAVA01 à JAVA07, faire une nouvelle classe TpJavaXX avec une méthode “main”.

## JAVA02: Conversion & Primitifs
Convertir un entier en flottant
Le but de ce TP est de visualiser les problèmes de conversion que l’on peut rencontrer.

L'exercice consiste à effectuer une série d’affectation.

Affecter la valeur 1234 à une variable int, le stocker dans une variable de type float et afficher les deux valeurs par System.out.println(...).
Refaire la même opération avec la valeur 123456789
Afficher les valeurs spéciales des flottants
Le but de ce TP est de visualiser le résultat d’une division par zéro.

L'exercice consiste à effectuer une série de calcul limite.

Affecter la valeur 15 à une variable x de type float.
Affecter la valeur 0 à une variable z de type float.
Affecter la valeur -123 à une variable y de type float.
Affecter la valeur x / z à une variable a de type float.
Affecter la valeur y / z à une variable b de type float.
Affecter la valeur a / b à une variable c de type float.
Afficher toutes les valeurs par System.out.println(...).



aPour chaque TP JAVA01 à JAVA07, faire une nouvelle classe TpJavaXX avec une méthode “main”.

## JAVA03: Affectation élargie
Le but de ce TP est de visualiser le résultat d’une conversion avec une affectation élargie.

L'exercice consiste à effectuer une affectation élargie avec des valeurs limites.

Affecter la valeur 10 à une variable x de type byte.
Ajouter 1000 à cette variable (avec l’opérateur +=).
Afficher le résultat par System.out.println(...).

Pour chaque TP JAVA01 à JAVA07, faire une nouvelle classe TpJavaXX avec une méthode “main”.

## JAVA04-1: Conditionnelle
Première partie : “if”
Le but de ce TP est d’utiliser les instructions : if ... else ....

L'exercice consiste à calculer un montant en fonction d’un paramètre.
On établit une remise dont le taux dépend du montant, à savoir :
•	0 % pour un montant inférieur à 1 000 €,
•	1 % pour un montant supérieur ou égal à 1 000 € et inférieur à 2 000 €,
•	3 % pour un montant supérieur ou égal à 2 000 € et inférieur à 5 000 €,
•	5 % pour un montant supérieur ou égal à 5 000 €.

$ java TpJava04 4500
4500.0 => 135.0

Help: utiliser un Float.parseFloat(...).

Pour chaque TP JAVA01 à JAVA07, faire une nouvelle classe TpJavaXX avec une méthode “main”.

## JAVA04-2: Conditionnelle
Seconde partie : “switch”
Le but de ce TP est d’utiliser les instructions : switch ... case … default ....

L'exercice consiste à calculer une taille de sac en fonction d’un poids d’entrée.
On définit la taille en fonction d’un poid (entier) :
•	“petit” pour un poid de 1kg,
•	“moyen” pour un poid de 2kg,
•	“grand” pour un poid supérieur à 2kg.

$ java TpJava04 4500 2
4500.0 => 135.0
moyen



Pour chaque TP JAVA01 à JAVA07, faire une nouvelle classe TpJavaXX avec une méthode “main”.

## JAVA05: Afficher la liste des X premiers nombres
Le but de ce TP est d’utiliser les instructions : do … while ou while ....

L'exercice consiste à afficher la liste des n premiers nombres.

$ java TpJava05 10
0
1
2
3
4
5
6
7
8
9



Pour chaque TP JAVA01 à JAVA07, faire une nouvelle classe TpJavaXX avec une méthode “main”.

## JAVA06: Afficher la factorielle d’un nombre
Le but de ce TP est d’utiliser les instructions : for ....

L'exercice consiste à calculer la factorielle d’un nombre.

Il s'agit d'écrire un programme qui calcule la factorielle d'un entier et indique à l'écran le résultat. Le nombre n doit être lu sur la ligne de commande.

$ java TpJava06 10
3628800


Pour chaque TP JAVA01 à JAVA07, faire une nouvelle classe TpJavaXX avec une méthode “main”.

## JAVA07: Afficher des nombres premiers
Le but de ce TP est de produire un algorithme basé sur  les instructions de bases.

L'exercice consiste à calculer et afficher les n premiers nombres premiers.

Récupérer le chiffre passée en ligne de commande.
Afficher la liste des n nombres premiers (n étant la valeur récupérée).

$ java TpJava07 6
2
3
5
7
11
13

