/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.vogella.rss;

import java.util.concurrent.Phaser;

public class FeedMessage {

        String title;
        String description;
        String link;
        String author;
        String guid;
        String[] parts;
        String part1;
        String part2;
        String part3;
        
        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
                parts = title.split(",");
                part1 = parts[0]; 
                part2 = parts[1];
                part3 = parts[2];
                int val = Integer.parseInt(parts[0].substring(0,1));
                if(val>=5){
                    part1=("Sismo de magnitud fuerte: " + parts[0]);
                }
                else if (val>=3.9 && val<=4.9) {
                    part1=("Sismo de magnitud moderada: " + parts[0]);
                }else{
                    part1=("Sismo de magnitud leve: " + parts[0]);
                }               
                part3 = (part3.substring(0,4));
                
                
                
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getLink() {
                return link;
        }

        public void setLink(String link) {
                this.link = link;
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public String getGuid() {
                return guid;
        }

        public void setGuid(String guid) {
                this.guid = guid;
        }

        @Override
        public String toString() {
                return part1 + " a" + part2 + part3 + " " + description.substring(4,29);
        }

}