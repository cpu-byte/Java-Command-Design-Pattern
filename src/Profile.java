// Receiver
public class Profile {

    private String biography;

    public Profile(String biography) {
        this.biography = biography;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "biography='" + biography + '\'' +
                '}';
    }
}
