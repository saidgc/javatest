/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.vogella.rss;

import de.vogella.rss.Feed;
import de.vogella.rss.FeedMessage;
import de.vogella.rss.RSSFeedParser;

public class ReadTest {
        public static void main(String[] args) {
            while(true){
                RSSFeedParser parser = new RSSFeedParser("http://www.ssn.unam.mx/rss/ultimos-sismos.xml");
                Feed feed = parser.readFeed();
                System.out.println(feed);
                for (FeedMessage message : feed.getMessages()) {
                        if(message != message){
                            System.out.println(message);
                    }
                }
                try {
                    Thread.sleep(2000);                 
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
}