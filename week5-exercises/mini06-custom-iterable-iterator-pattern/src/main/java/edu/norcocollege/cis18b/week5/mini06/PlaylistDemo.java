package edu.norcocollege.cis18b.week5.mini06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlaylistDemo
{

    public static void main(String[] args) 
    {
        Playlist playlist = new Playlist();
        playlist.add(new PlaylistItem("Intro", 1));
        playlist.add(new PlaylistItem("Demo", 2));
        playlist.add(new PlaylistItem("Quiz", 3));

        System.out.println("Default order: " + titles(playlist.iterator()));
        System.out.println("Priority order: " + titles(playlist.priorityIterator()));
        System.out.println("Reverse order: " + titles(playlist.reverseIterator()));

        System.out.println("Reflection: Built-in iteration would be enough if the playlist only needed one simple traversal order. A custom Iterable adds value when the same data needs multiple meaningful traversal strategies, such as insertion order, priority order, and reverse order.");
    }

    static List<String> titles(Iterator<PlaylistItem> iterator) 
    {
        List<String> titles = new ArrayList<>();
        while (iterator.hasNext()) 
        {
            titles.add(iterator.next().getTitle());
        }
        return titles;
    }
}