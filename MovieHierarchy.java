package assignment10;

public class MovieHierarchy {
	private String title;
	private int duration;
	public String getTitle() {
		return title;
	}
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public MovieHierarchy(String title,int duration) {
		this.title=title;
		this.duration=duration;
	}
	public void displyDetails() {
		System.out.println("Title:"+title);
		System.out.println("Duration:"+duration+"minutes");

	}
}
class RomComMovie extends MovieHierarchy{

	public RomComMovie(String title, int duration) {
		super(title, duration);
		
	}
	@Override
    public void displayDetails() {
        System.out.println("Romantic Comedy Movie Details:");
        super.displayDetails();
    }
}

class ThrillerMovie extends MovieHierarchy{

	public ThrillerMovie(String title, int duration) {
		super(title, duration);
		
	}
	@Override
    public void displayDetails() {
        System.out.println("Thriller Movie Details:");
        super.displayDetails();
    }
	
}
class Movie{
	public static void main(String[] args) {
		
	MovieHierarchy rcm = new RomComMovie("RomComMovie:Minnale", 120);
	MovieHierarchy tm = new ThrillerMovie("ThrillerMovie:Thegidi", 118);
	rcm.displyDetails();
    System.out.println(); 
    tm.displyDetails();
	}
}