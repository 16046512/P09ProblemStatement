package sg.edu.rp.c346.problemstatement;



public class Item {
    private String title;
    private String description;
    private String author;

    public Item(String title, String description,String author) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                "description='" + description + '\'' +
                "author='" + author + '\'' +
                '}';
    }
}
