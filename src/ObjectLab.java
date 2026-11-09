public class ObjectLab {
    public static void main(String[] args) {
        // 1. Create rex (Rex, 3) and mia (Mia). Print names and ages.
        Pet rex = new Pet("Rex", 3);
        Pet mia = new Pet("Mia");
        Pet twin = new Pet("Rex", rex.getAge());
        System.out.println(rex.getName() + " is " + rex.getAge() + " years old.");
        System.out.println(mia.getName() + " is " + mia.getAge() + " years old.");

        // 2. Alias: Pet copy = rex; copy.birthday(); print both ages.
        Pet copy = rex;
        copy.birthday();
        System.out.println(rex.getName() + " is " + rex.getAge() + " years old.");
        System.out.println("Alias Rex" + " is " + copy.getAge() + " years old.");
        System.out.println(twin.getName() + " is " + twin.getAge() + " years old.");

        // 3. A separate Pet twin with the same values. Print its age.
        Pet testPet = new Pet("", 0);
        System.out.println(testPet.getName() + " is " + testPet.getAge() + " years old.");

        // 4. copy = null; then try copy.getName().
        copy = null;
        System.out.println(copy.getName());
    }
}

// Given class. Read it, do not edit it. You will write classes like this in Unit 5.
class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void birthday() { age++; }
}
