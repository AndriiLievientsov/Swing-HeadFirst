package SmallTest;

public class ForOrganization {
    public static void main(String[] args) {
        Organization orgA = new Organization("АТБ", 10, "Dollars", true, 10);
        Organization orgB = new Organization("Silpo", 12324, "Грывень", false, 2);

        orgA.display();
        System.out.println();
        orgB.display();
    }
}

/*
Объект Organi zation имеет название (например, XYZ Company), го­
довой доход (например, $10 0 000 . 0 0) и булево значение, указываю­
щее на то, является ли организация коммерческой. Компании, кото­
рые производят и продают продукцию, обычно являются коммерче­
скими. Ну а группы, которые оказывают помощь жертвам стихийных
бедствий, обычно представляют некоммерческие организации.
Объявите собственный класс Organi zation. Объявите другой класс,
который создает организации и отображает сведения, относящиеся
к этим организациям.
 */