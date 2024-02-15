package lesson_23.code.lessoncode.mediaLibrary.service;

import lesson_23.code.lessoncode.mediaLibrary.entity.MediaItem;

public class LibraryCatalog {
    private MediaItem[] items = new MediaItem[10];
    private int itemCont = 0;

    public void addMediaItem(MediaItem newItem){
        if (itemCont < items.length) {
            items[itemCont] = newItem;
            itemCont++;
            System.out.println("New media item added: " + newItem.getTitle());
        } else {
            System.out.println("Library is full, cannot add more items");
        }
    }

    public void printAllItems(){
        System.out.println("Library catalog: ");

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                 items[i].printInfo();
            }
        }
    }
}
