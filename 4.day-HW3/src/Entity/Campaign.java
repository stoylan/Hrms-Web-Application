package Entity;

public class Campaign {
    private int Id;
    private String content;
    private int discountRate;

    public Campaign(int id, String content, int discountRate) {
        Id = id;
        this.content = content;
        this.discountRate = discountRate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}
