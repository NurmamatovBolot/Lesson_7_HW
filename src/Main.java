public class Main {
    public static void main(String[] args) {

        Magic magic = new Magic() {
            @Override
            public void applySuperAbility() {
                System.out.println("Magic has applied super ability: Freeze");
            }
        };

        Medic medic = new Medic() {
            @Override
            public void applySuperAbility() {
                System.out.println("Medic has applied super ability: Heal");
            }
        };
        
        Warrior warrior = new Warrior() {
            @Override
            public void applySuperAbility() {
                System.out.println("Warrior has applied super ability: Critical Damage");
            }
        };


        Hero [] heroes = {magic, medic, warrior};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            System.out.println("--------------");
        }
        medic.increaseExperience();

    }
}