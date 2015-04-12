package org.pmix.cover;

import net.roarsoftware.lastfm.Album;
import net.roarsoftware.lastfm.ImageSize;

public class LastFMCover {

	public static String getCoverUrl(String artist, String album) throws Exception {
		String key = "7fb78a81b20bee7cb6e8fad4cbcb3694";
		
		Album albumObj = Album.getInfo(artist, album, key);
		return albumObj.getImageURL(ImageSize.LARGE);
	}
}
