package fr.gabriel.programme;
    //ce programme crée un objet  personnage de RPG avec des caractéristiques qu'on viens modifier avec des methodes get / set
    public class Player {
        // TODO GSEN :  On lui créer des attributs privé propre à l'objet donc private
        private String name = "Gabriel";
        private int health = 20;
        private float attack = 0.5;

        // TODO GSEN :  Puisqu'on ne vas pas créér à chaque fois un joueur, on vas créer un constructeur qui nous permettras de modifier plusieurs attributs pour le rendre unique.
        // TODO GSEN :  ctrl + maj +A pour crer le constructeur de l'objet
        public Player() {

        }

        // TODO GSEN : voici une fonction pour modifier le nom / le récupérer.
        // TODO GSEN : On met la souris sur l'int name et on crée un getter et un setter via ALT+INSERT
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // TODO GSEN : idem pour l'attribut health
        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        // TODO GSEN : idem pour l'attribut attack
        public int getAttack() {
            return (float) attack;  //TODO : bloqué ici
        }

        public void setAttack(int attack) {
            this.attack = attack;
        }
    }
