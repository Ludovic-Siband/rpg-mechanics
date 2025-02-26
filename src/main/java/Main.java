//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Equipement Epee = new Arme("galaad",10,34.6,"arme a une main",35);
        Equipement Plastron = new Armure("ecrin rouge", 20,89,"plastron lourd",56);


        System.out.println(Epee);
        System.out.println(Plastron);


    }
}