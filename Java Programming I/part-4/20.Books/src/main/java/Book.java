public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String print(String data) {

        if (data.equals("name")) {
            String bookTitle = title;
            return bookTitle;
        }

        String bookInformation = title + ", " + pages + " pages, " + year;
        return bookInformation;

    }

}
