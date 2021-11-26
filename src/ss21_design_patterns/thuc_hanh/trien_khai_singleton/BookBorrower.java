package ss21_design_patterns.thuc_hanh.trien_khai_singleton;

public class BookBorrower {
    private BookSingleton brrowBook;
    private boolean haveBook = false;

    public void borrowBook(){
        brrowBook = BookSingleton.borrowBook();

        if (brrowBook == null){
            haveBook =false;
        } else {
            haveBook = true;
        }
    }
}
