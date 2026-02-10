/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;
  private static int numEntries = 0;
  public void addBook(String title, String author)
  {
    book = new Book(title, author);
    numBooks++;
    numEntries++;
  }

  public void addMovie(String title, double duration)
  {
    movie = new Movie(title, duration);
    numMovies++;
    numEntries++;
  }
  public void addSong(String title) {
    song = new Song(title);
    numSongs++;
    numEntries++;
  }
  public static int getNumBooks(){ 
    return numBooks;}
  public static int getNumMovies(){ 
    return numMovies;}
  public static int getNumSongs(){ 
    return numSongs;}
  public static int getNumEntries(){ 
    return numEntries;}
  public String toString()
  {
    String info = "";

    if (book != null)
    {
      info += "Book:\n" + book + "\n";
    }

    if (movie != null)
    {
      info += "Movie:\n" + movie;
    }
    if(song!=null){
      info+="Song:\n" + song + "\n";
    }

    return info;
  }
}
