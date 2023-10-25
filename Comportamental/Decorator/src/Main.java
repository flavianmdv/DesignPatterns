public class Main {
    public static void main(String[] args) {
        Text plainText = new PlainText("Hello, World!");
        System.out.println("Plain Text: " + plainText.getContent());

        Text boldText = new BoldTextDecorator(plainText);
        System.out.println("Bold Text: " + boldText.getContent());

        Text italicText = new ItalicTextDecorator(plainText);
        System.out.println("Italic Text: " + italicText.getContent());

        Text boldItalicText = new BoldTextDecorator(new ItalicTextDecorator(plainText));
        System.out.println("Bold Italic Text: " + boldItalicText.getContent());
    }
}