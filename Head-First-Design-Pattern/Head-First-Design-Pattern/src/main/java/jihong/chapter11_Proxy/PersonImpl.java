package jihong.chapter11_Proxy;

public class PersonImpl implements Person {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getGenter() {
        return this.gender;
    }

    @Override
    public String getInterests() {
        return this.interests;
    }

    @Override
    public int getGeekRating() {
        if (ratingCount == 0) return 0;
        return (rating / ratingCount);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setGeekRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
