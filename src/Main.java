public class Main {
    public static void main(String[] args) {
        //Conjunto 1 de tipo String
        Conjunto<String> conjunto1 = new Conjunto<>();

        conjunto1.insert("jose");
        conjunto1.insert("luis");
        conjunto1.insert("pedro");
        conjunto1.insert("maria");
        conjunto1.insert("angel");
        conjunto1.insert("manuel");
        conjunto1.insert("sergio");
        conjunto1.insert("alberto");
        conjunto1.insert("carlos");
        conjunto1.insert("antonio");
        System.out.println(conjunto1.toString());

        System.out.println("La posision de luis es: " + conjunto1.find("luis"));
        System.out.println("En la posicion 8 tenemos a: " + conjunto1.get(8));



        conjunto1.delete("jose");
        conjunto1.delete("pedro");
        conjunto1.delete("maria");
        System.out.println(conjunto1.toString());

        //Conjunto 2 de tipo Integer
        Conjunto<Integer> conjunto2 = new Conjunto<>();

        conjunto2.insert(0);
        conjunto2.insert(1);
        conjunto2.insert(2);
        conjunto2.insert(3);
        conjunto2.insert(4);
        conjunto2.insert(5);
        conjunto2.insert(6);
        conjunto2.insert(7);
        conjunto2.insert(8);
        conjunto2.insert(9);
        System.out.println(conjunto2.toString());

        System.out.println("La posision del 2 es: " + conjunto2.find(2));
        System.out.println("En la posicion 1 tenemos a: " + conjunto2.get(1));

        conjunto2.delete(2);
        conjunto2.delete(9);

        System.out.println(conjunto2.toString());




    }
}