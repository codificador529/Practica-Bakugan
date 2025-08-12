public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

       /*  Bakugan ingram = new Bakugan();// instanciar un objeto
        ingram.tipo = "Esfera";
        ingram.atributo = "Ventus";
        ingram.poderG = 450;
        System.out.println(ingram);
        System.out.println(ingram.tipo);
        System.out.println(ingram.atributo);
        System.out.println(ingram.poderG);

        Bakugan drago = new Bakugan();
        drago.tipo = "Esfera";
        drago.atributo = "Pyrus";
        drago.poderG = 460;
        System.out.println(drago);
        System.out.println(drago.tipo);
        System.out.println(drago.atributo);
        System.out.println(drago.poderG);

        Bakugan percival = new Bakugan();
        percival.tipo = "Esfera";
        percival.atributo = "Darkus";
        percival.poderG = 460;
        System.out.println(percival.tipo);
        System.out.println(percival.atributo);
        System.out.println(percival.poderG); */
        Bakugan ingram = new Bakugan("Ingram", "Esfera", "Ventus", 450);
        System.out.println(ingram);
        Bakugan drago = new Bakugan("Drago", "Esfera", "Pyrus", 460);
        System.out.println(drago);
        Bakugan percival = new Bakugan("Percival", "Esfera", "Darkus", 460);
        System.out.println(percival);


    }
}