public class Movie {

    private String title;
    private double rating;
    private String[] genres;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
        this.genres = new String[0];
    }

    public Movie(String title, double rating, String[] genres) {
        this.title = title;
        this.rating = rating;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public void setGenre(String g) {
        String[] newGenres = new String[genres.length + 1];
        System.arraycopy(genres, 0, newGenres, 0, genres.length);
        newGenres[newGenres.length - 1] = g;
        this.genres = newGenres;
    }

    public static void main(String[] args) {
        
        Movie movie = new Movie("upin", 9.3);
        movie.setGenres(new String[]{"kartun", "anak"});
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Rating: " + movie.getRating());
        System.out.println("Genres: " + String.join(", ", movie.getGenres()));
    }
}