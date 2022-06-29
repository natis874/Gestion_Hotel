# Gestion_Hotel

## Mini projet Gestion d'un hotel
![Preview](https://miro.medium.com/max/1400/1*h7OiiKMWuC6qX98-dmeQNA.png?raw=true)

### Première mini application Backend avec JAVA  
Vous allez créer votre première application Java qui va vous permettre de visualiser et de créer facilement des reservation de chambre.  
- Java 11
- Maven 

#### L'hôtel gère des chambres permettant de recevoir de une à quatre personnes et classifiées selon 6 catégories.

#### Vous disposez des tableaux TabPrix et TabDescript pour réaliser votre application :

TabPrix est un tableau à deux dimensions qui permet de donner le prix d'une chambre en fonction de sa capacité d'accueil (le nombre de personnes pouvant occuper la chambre) et de sa catégorie. Chaque cellule du tableau contient le prix de la chambre. Contenu de TabPrix :
![alt text](http://isabelle.thieblemont.pagesperso-orange.fr/java/ecrans/tabprix.jpg?raw=true)

Remarque : Lorsque TabPrix(NbPersonnes, N° Catégorie) = 0, cela signifie qu'il n'y a pas de chambre correspondant à la combinaison nombre de personnes/catégorie.

TabDescript est un tableau à une dimension qui permet de donner la description d'un chambre en fonction de sa catégorie, il contient les éléments suivants 
![alt text](http://isabelle.thieblemont.pagesperso-orange.fr/java/ecrans/descript.jpg?raw=true)

### La classe Chambre est définie selon le format suivant :
 
```
Chambre = Classe 
 privé : 
      Numéro : Entier 
      Catégorie : Entier 
      NbPersonnes : Entier 
 public : 
      Fonction DonnerNumero () : entier /* méthode qui renvoie le numéro de la chambre */ 
      Fonction DonnerCateg() : Entier 
       /* méthode qui renvoie la catégorie à laquelle la chambre appartient */ 
      Fonction DonnerNbPers() : Entier 
       /* méthode qui retourne la capacité d'accueil d'une chambre */ 
      Fonction DonnerPrix(PtabPrix : tableau(1..4,1..6) de entier) : entier 
       /* méthode qui retourne le prix de la chambre en fonction du nombre de places 
       d'accueil et de la capacité de celle-ci */ 
      Procédure AffichDescript(PtabDescript : tableau (1..6) de chaine(50)) 
       /* méthode qui affiche la description d'une chambre en fonction de sa catégorie */ 
Fclasse
```

### La classe Hotel est également disponible pour gérer le chambres de l'hôtel et est définie selon la description suivante :
 
```
Hotel = classe 
 Privé : 
    TabCh : tableau(1..31) de Chambre 
 Public : 
     Procédure AffichCh(PnbPers:entier; PtabPrix:tableau(1..4,1..6) de Entier; PtabDescript:tableau(1..6) de 
      chaine(50)) 
     /* méthode qui affiche la liste des chambres dont la capacité d'accueil correspond au nombre de personnes 
    passé en paramètre. Pour chaque chambre affichée, devront figurer le numéro, la catégorie, la description et le 
    prix, la méthode doit aussi afficher en fin de traitement le nombre de chambres sélectionnées (ayant une 
    capacité identique à celle passée en paramètre)*/ 
Fclasse
```
