package edu.norcocollege.cis18b.week5.mini06;

/**
 * Represents a single item in a playlist.
 * Each item has a title and a priority value,
 * which is used for alternate traversal strategies.
 */
public class PlaylistItem 
{

    private final String title;
    private final int priority;

    /*
     * Constructs a PlaylistItem with a title and priority
	*/
    public PlaylistItem(String title, int priority) 
	{
        this.title = title;
        this.priority = priority;
    }

    /*
     * Returns the title of the playlist item.
    */
    public String getTitle() 
	{
        return title;
    }

    /*
     * Returns the priority of the playlist item
    */
    public int getPriority() 
	{
        return priority;
    }
}