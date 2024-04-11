class Card {
    String name;
    String type;
    String descriptionOrEffect;

    // Constructor
    public void newCard(String name, String type, String descriptionOrEffect) {
        this.name = name;
        this.type = type;
        this.descriptionOrEffect = descriptionOrEffect;
    }
}

class SpellCard extends Card {
    String type;
    public void newCardSpell(String name, String descriptionOrEffect) {
        super.newCard(name, type ,descriptionOrEffect);
        this.type = "Spell";
    }
    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nDescription: " + descriptionOrEffect;
    }
}

class MonsterCard extends Card{
    String type;
    int attack;
    int defense;
    int lvl;

    public void newCardMonster(String name, String type, int atack, int defense, int lvl, String descriptionOrEffect){
        super.newCard(name, type, descriptionOrEffect);
        this.type = type;
        this.attack = atack;
        this.defense = defense;
        this.lvl = lvl;
    }
    public String toString(){
        return "Name: " + name + "\nType: " + type + "\nAttack: " + attack + "\nDefense: " + defense + "\nLevel: " + lvl + "\nDescription: " + descriptionOrEffect;
    }
}
class TrapCard extends Card{
    String type;
    public void newCardTrap(String name,String type, String descriptionOrEffect) {
        super.newCard(name, type, descriptionOrEffect);
        this.type = type;
    }

    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nDescription: " + descriptionOrEffect;
    }
}
class showCard {
    public static void main(String[] args) {
        SpellCard card1 = new SpellCard();
        card1.newCardSpell("Dark Houl", "Destroy all monsters on the field.");
        System.out.println(card1);
        MonsterCard card2 = new MonsterCard();
        card2.newCardMonster("Monster Card 1", "Monster", 1000, 1000, 5, "This is a monster card");
        System.out.println(card2);
        TrapCard card3 = new TrapCard();
        card3.newCardTrap("Fuerza de Espejo", "Trap", "Destruye todos los monstruos en el campo de tu oponente.");
        System.out.println(card3);
    }
}