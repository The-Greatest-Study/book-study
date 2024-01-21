package jiin.chapter11_proxy.protectionproxy;

import lombok.Getter;
import lombok.Setter;

public class PersonImpl implements Person {
    @Getter @Setter private String name;
    @Getter @Setter private String gender;
    @Getter @Setter private String interests;
    private int rating;
    private int ratingCount = 0;

    public int getGeekRating() {
        if (ratingCount == 0) return 0;
        return (rating / ratingCount);
    }

    public void setGeekRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
