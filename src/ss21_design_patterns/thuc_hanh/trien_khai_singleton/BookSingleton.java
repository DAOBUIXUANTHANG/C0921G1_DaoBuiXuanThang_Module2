package ss21_design_patterns.thuc_hanh.trien_khai_singleton;

public class BookSingleton {
    private String author;
    private String tile;
    private static BookSingleton book;
    private static boolean isLoadOut;

    private BookSingleton(){
        author = "Gammae, Helm, Johnson, and Vliss";
        tile = "Design Patterns";
        book = null;
        isLoadOut =false;
    }

    public static BookSingleton borrowBook(){
        if (!isLoadOut ){
            if (book == null){
                book = new BookSingleton();
            }
            isLoadOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton bookreturn){
        isLoadOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTile() {
        return tile;
    }

    public String getAuthorTile(){
        return getTile() + " by " + getAuthor();
    }


}
