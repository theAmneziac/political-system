package politics;

public class President extends ElectedOfficial {

    private boolean impeached;

    President(Candidate candidate) {
        super(candidate);
        impeached = false;
    }

    public void attack(Country country) {
        country.attack();
    }

    public void impeach() {
        impeached = true;
    }

}
