public class Song {
    private String title;
    private int rating;
    public Song(String t){
        title=t;
        rating=0;
    }
    public String getTitle(){
        return title;
    }
    public int getRating(){
        return rating;
    }
    public void adjustRating(int r){
        int newRating=rating+r;
        if(newRating>=0 && newRating<=10){
            rating=newRating;
        }
    }
    public String toString(){
        String info="\"" + title + "\"";
        if (rating!=0){
            info+=", rating is " + rating;

        }
        return info;
    }
    public boolean equals(Song s){
        if(s==null){
            return false;
        }
        return this.title.equals(s.title);
    }

}
