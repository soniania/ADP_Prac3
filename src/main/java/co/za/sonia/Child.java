package co.za.sonia;

public class Child extends Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main (String []args){
        Child person = new Child();

        person.setName("Sonia");
        person.setSurname("Sontshatsha");
        person.setAge(6);

        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        person.canWalk();
    }
}
