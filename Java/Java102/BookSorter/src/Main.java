import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Book> treeSet = new TreeSet<>();
        treeSet.add(new Book("Kitap1","Yazar1",156,"2022"));
        treeSet.add(new Book("Kitap2","Yazar2",200,"2022"));
        treeSet.add(new Book("Kitap3","Yazar3",340,"2022"));
        treeSet.add(new Book("Kitap4","Yazar4",121,"2022"));
        treeSet.add(new Book("Kitap5","Yazar5",50,"2022"));

        System.out.println("** LIST OF BOOKS IN ALPHABETICAL ORDER **\n");
        for (Book items : treeSet) {
            items.showBookDetail();
            System.out.println();
        }
    }
}