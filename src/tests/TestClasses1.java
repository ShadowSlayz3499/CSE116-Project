package tests;

import org.junit.Test;
import ratings.Rating;
import ratings.Reviewer;
import ratings.Song;

import static org.junit.Assert.*;

public class TestClasses1 {
    @Test
    public void testRating() {
        Rating rating = new Rating("someID", 3);
        Rating rating2 = new Rating("someID2", 10);

        assertTrue(rating.getReviewerID().equals("someID"));
        assertTrue(rating.getRating() == 3);
        assertTrue(rating2.getRating() == -1);
        rating.setRating(100);
        assertTrue(rating.getRating() == -1);
        rating.setRating(-100);
        assertTrue(rating.getRating() == -1);
    }

    @Test
    public void testReviewer() {
        Reviewer reviewer = new Reviewer("someReviewerID");
        assertTrue(reviewer.getReviewerID().equals("someReviewerID"));
        Rating rating = reviewer.rateSong(2);
        assertTrue(rating.getRating() == 2);
    }

    @Test
    public void testSong() {
        Song song = new Song("someTitle", "someArtist", "someSongID");
        assertTrue(song.getSongID().equals("someSongID"));
        assertTrue(song.getArtist().equals("someArtist"));
        assertTrue(song.getTitle().equals("someTitle"));
    }
}
