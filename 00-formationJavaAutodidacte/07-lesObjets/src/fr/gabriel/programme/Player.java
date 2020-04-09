package fr.gabriel.programme;
    //ce programme crée un objet  personnage de RPG avec des caractéristiques qu'on viens modifier avec des methodes get / set
    public class Player {
        // On lui créer des attributs privé propre à l'objet donc private
        private String name;
        private float health;
        private double attack;

        // Puisqu'on ne vas pas créér à chaque fois un joueur, on vas créer un constructeur qui nous permettras de modifier plusieurs attributs pour le rendre unique.
        // ctrl + maj +A pour crer le constructeur de l'objet
        public Player(String name, float health, double attack) {
            this.name = name; // cette variable hérite du nom de la methode main
            this.attack = attack; // idem
            this.health = health; // idem
        }

        // voici une fonction pour modifier le nom / le récupérer.
        // On met la souris sur l'int name et on crée un getter et un setter via ALT+INSERT
        public String getName() {
            return name;
        }

        public void damage(double damage){
            this.health -= damage;
        }

        public void setName(String name) {
            this.name = name;
        }

        // idem pour l'attribut health
        public float getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        //  idem pour l'attribut attack
        public double getAttack() {
            return attack;
        }

        public void setAttack(int attack) {
            this.attack = attack;
        }

    }
