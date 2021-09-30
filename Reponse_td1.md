# TD 1

## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > Permmet d'initialiser le repo avec des fichiers supplémentaire :
    	- README.md pour les informations du projet tel que la méthode de compilation ou l'utilisation.
    	- .gitignore pour ordonner a git d'ignorer certain fichiers lors de l'ajout du projet.
    	- Choose a licence permet de choisir la licence souhaité pour le projet.

    *Pour la suite, ne cochez aucune de ces cases*.
2. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    git config --global user.name "Quentin Gruchet"
    git config --global user.email "quentin.gruchet78@gmail.com"
    ```
3. Initialisez le dépôt `git` local pour le projet;
    ```bash
    git init
    ```
4. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    # Commandes pour valider les changements
    ```
5. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    // Code pour tester toString
    ```
6. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    # Commandes pour publier les modifications
    ```
7. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > Répondre ici
8. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    # Répondre ici
    ```
9. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    # Copier ici le contenu de `.gitignore`
    ```
10. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    # Répondre ici
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    # Copier ici les modifications de `.gitignore`
    ```
11. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Expliquez la procédure de façon synthétique

## Partie II (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > Manjaro avec KDE plasma 5.22.5
    > Pour le shell, j'utilsie bash (echo $0)
2. Quelle commande permet d'obtenir de l'aide ?
	Donnez un exemple.
    	```bash
    	man ls 
    	man man pour rigoler
    	```
3. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        ls -s size
        ```
    2. compter le nombre de ligne d'un fichier
        ```bash
        wc -l fichier.txt
        ```
    3. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        grep -w uneVariable Main.java
        ```
    4. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        grep -r uneVariable *.java
        ```
    5. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        find . -name README.md
        ```
    6. afficher les différences entre deux fichiers textes
        ```bash
        diff fichier1.txt fichier2.txt
        ```
4. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Permet d'obtenir un moyen de communication sécurisé entre une machine locale et une machine distante (client/serveur). Utile pour le transfert de fichier, ou l'utilisation de terminal à distance, le tout en invite de commandes.
    * `screen`/`tmux`
        > screen et tmux permettent d'avoir plusieurs terminal dans une seule console.
    * `curl`/[HTTPie](https://httpie.org/)
        > Curl permet de telecharger et d'envoyer du contenu via un URL
    * [jq](https://stedolan.github.io/jq/)
        > jq permet de manipuler avec simplicité du JSON en ligne de commandes.

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > IntelliJ

    Pour la suite, ne considérez que l'un de vos choix.
2. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
   > File>Settings>Editor>File Encodings > Global Encoding
3. Comment choisir le JDK à utiliser dans un projet ?
    > File > project structure > projet settings > project > project SDK
4. Comment préciser la version Java des sources dans un projet ?
    > File > project structure > projet settings > project > Project language level
5. Comment ajouter une bibliothèque externe dans un projet ?
    > File > project structure > projet settings > modules >Dependencies >le plus a cote de scope.
6. Comment reformater un fichier source Java ?
    > Dans intelliJ,  on cherche le fichier a reformater, clique droit dessus puis reformat code.
7. Comment trouver la déclaration d'une variable ou méthode ?
    > Dans un intelliJ, on place son curseur sur le dossier source puis la loupe en haut a droit puis on tape le nom de la variable ou de la methode.
8. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Répondre ici
9. Comment renommer une classe dans l'ensemble du projet ?
    > Dans intellij, on fais clique droit sur le fichier qu'on veut renommer puis refractor puis rename file.
10. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Répondre ici
11. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > On appuie sur à gauche de la dites variable (dans la barre numéroté). Cela créé un point d'arrêt pour le débuggage. On appuie sur la bestiole en haut à droite à côté du bouton de compilation du programme.
12. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Un débogueur puissant, une bonne visibilité de la hierarchie du projet et un refactoring efficace.
