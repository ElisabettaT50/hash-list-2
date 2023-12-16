import java.util.HashSet;

/*
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Visualizza membri della famiglia: ");
        HashSet<String> family = new HashSet<>();
        family.add("madre");
        family.add("padre");
        family.add("figlia");
        family.add("figlio");
        family.add("cagnolina");
        family.add("gatto");
        String newMember = "figlia adottiva";
        family.add(newMember);

        for(String person : family){
            System.out.println(person);
        }
        if(family.contains(newMember)){
            System.out.println("The list contains a new member: " + newMember);
        }
    }
}