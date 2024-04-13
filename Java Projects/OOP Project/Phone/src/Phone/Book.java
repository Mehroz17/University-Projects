package Phone;

public class Book {
    private String bookname , bookaurthor;
    private int id;

    public Book( int id,String bookname, String bookaurthor) {
        this.bookname = bookname;
        this.bookaurthor = bookaurthor;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookaurthor() {
        return bookaurthor;
    }

    public void setBookaurthor(String bookaurthor) {
        this.bookaurthor = bookaurthor;
    }
}
