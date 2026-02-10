public class Movie
{
  private String title;
  private double duration;
  private int rating;

  public Movie(String t, double d){
    title = t;
    duration = d;
    rating = 0;
  }
  public int adjustRating(int r){
    int newRating = rating + r;
    if (newRating >= 0 && newRating <= 10){
      rating = newRating;}
    return rating;
  }
  public String getTitle(){
    return title;}

  public double getDuration(){
    return duration;}

  public int getRating(){
    return rating;}

  public String toString(){
    String info = "\"" + title + "\", duration " + duration + " hours";
    if (rating != 0){
      info += ", rating is " + rating;}
    return info;}
  public void setTitle(String t){
    title = t;}
  public void setDuration(double d){
    duration = d;}

  public boolean equals(Movie m){
    if (m == null){
      return false;}
    return this.title.equals(m.title) && this.duration == m.duration;}
}
