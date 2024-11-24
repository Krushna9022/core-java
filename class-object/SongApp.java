import java.util.*;
class Song
{
	private String title;
	private String artist;
	private int duration;
	public Song(String title,String artist,int duration)
	{
		this.title=title;
		this.artist=artist;
		this.duration=duration;
	}
	
	public String getTitle()
	{
		return title;
	}
	public String getArtist()
	{
		return artist;
	}
	public int getDuration()
	{
		return duration;
	}
	public void displayDetail()
	{
		System.out.println(getTitle()+"\t"+getArtist()+"\t"+getDuration());
	}
}
class MusicLibrary 
{
	private Song list[]=new Song[10];
	int count=0;
	public MusicLibrary(Song ...l)
	{
		for(int i=0;i<l.length;i++)
		{	list[count++]=l[i];
		}
		
		
	}
	public void addSong(Song song)
	{	if(count<10)
		{
			list[count++]=song;
			System.out.println("song added to playlist..");
		}
		else
		{
			System.out.println("could not added");
		}
		
	}
	public void removeSong(String title)
	{
		for(int i=0;i<count;i++)
		{
			if(list[i].getTitle().equals(title))
			{
				for(int j=i+1;i<count;i++)
				{
					list[i-1]=list[i];
					list[i]=null;
					count--;
					System.out.println("deleted sucessfully.....\n\n");
				}
					
			}
		}
	}
	public void playRandom()
	{
		Random rand=new Random();
		int x=rand.nextInt(count-1);
		System.out.println("playing random song.....\n");
		System.out.println(list[x].getTitle()+"\t"+list[x].getArtist()+"\tduration "+list[x].getDuration());
	}
	public void displayAllSong()
	{	for(int i=0;i<count;i++)
		{
			if(list[i]!=null)
			{
				System.out.println(list[i].getTitle()+"\t"+list[i].getArtist()+"\tDuration "+list[i].getDuration()+"min");
			}
		}
	}
}

public class SongApp
{
	public static void main(String x[])
	{
		
		Song s1=new Song("dekho na dekho zulfon se ","Anuv jain",3);
		Song s2=new Song("main rang sharbato ka ","Atif aslam",3);
		Song s4=new Song("mare jaise lakho meli","xyz",3);
		Song s5=new Song("nakos fodu kahana mazi","ajay-atul",3);
		Song s6=new Song("om shanti om ","Atif aslam",3);
		MusicLibrary m=new MusicLibrary(s1,s2,s4,s5,s6);
		m.displayAllSong();
		Song s3=new Song("abcd","xyz",2);
		m.addSong(s3);
		m.displayAllSong();
		m.removeSong("abcd");
		m.displayAllSong();
		m.playRandom();
	}
}
