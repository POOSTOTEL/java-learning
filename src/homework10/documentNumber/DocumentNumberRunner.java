package homework10.documentNumber;

public class DocumentNumberRunner {
    public static void main(String[] args) {
        DocumentNumber documentNumber = new DocumentNumber("4123-xEs-1247-MIT-2n1W");
        documentNumber.printLetters();
        documentNumber.Print2NumBlocks();
        documentNumber.printSecureNum();
        documentNumber.printLettersStringBuilder();
        System.out.println(documentNumber.searchCombination());
        System.out.println(documentNumber.searchComboInBegin());
        System.out.println(documentNumber.searchComboInTheEnd());

    }
}
