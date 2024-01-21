package minji.chapter11_proxyPattern;

public class PersonImpl implements Person{
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    public PersonImpl(String name, String gender, String interests) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.rating = 0;
        this.ratingCount = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    public int getGeekRating() {
        if (ratingCount == 0) return 0;
        return rating/ratingCount;
    }

    public void setGeekRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
