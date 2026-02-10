/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
    //System.out.println("Adding book " + t);

  }
 /***  public int getRating(int r){
    System.out.println("Adjusting rating by " + r);

    int newRating = rating + r;
    r=100;
    if (newRating>=0 && newRating<=10){
      rating=newRating;
    }
    return rating;
  }*/
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  String info = "\"" + title + "\", written by " + author; 

  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }
  /***public String getInfo(){
  return "The current book information is " + info;}***/
  

  public void setAuthor(String a) {
    author = a;
  }
  public void adjustRating(int r) {
    //System.out.println("Adjusting rating by " + r);

    int newRating = rating + r;
    if (newRating >= 0 && newRating <= 10) {
      rating = newRating;
    }
  }
  public boolean equals(Book b){
    //System.out.println("Checking book " + this.title); 
    if (b == null){
      return false;
    

  }
  return this.title.equals(b.title) && this.author.equals(b.author);}
}
