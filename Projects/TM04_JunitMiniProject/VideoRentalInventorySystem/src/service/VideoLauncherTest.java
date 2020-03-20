package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoLauncherTest {
    VideoStore store = new VideoStore();
    @Test
    void AddVideoTest(){
        assertEquals("Video \"Matrix\" added successfully.",store.addVideo("Matrix"));
        assertEquals("Video \"Sinchan\" added successfully.",store.addVideo("Sinchan"));
        assertEquals("Video \"Doraemon\" added successfully.",store.addVideo("Doraemon"));
        assertEquals("Video \"Ben10\" added successfully.",store.addVideo("Ben10"));
        store.setI();
    }
    @Test
    void doCheckoutTest(){
        assertEquals("Video \"Matrix\" added successfully.",store.addVideo("Matrix"));
        assertEquals("Video \"Sinchan\" added successfully.",store.addVideo("Sinchan"));
        assertEquals("Video \"Doraemon\" added successfully.",store.addVideo("Doraemon"));
        assertEquals("Video \"Ben10\" added successfully.",store.addVideo("Ben10"));
        assertEquals("Video \"Sinchan\" checked out successfully.",store.doCheckout("Sinchan"));
        assertEquals("Video \"Matrix\" checked out successfully.",store.doCheckout("Matrix"));
        assertEquals("Video \"Doraemon\" checked out successfully.",store.doCheckout("Doraemon"));
        store.setI();
    }
    @Test
    void doReturnTest(){
        assertEquals("Video \"Matrix\" added successfully.",store.addVideo("Matrix"));
        assertEquals("Video \"Sinchan\" added successfully.",store.addVideo("Sinchan"));
        assertEquals("Video \"Doraemon\" added successfully.",store.addVideo("Doraemon"));
        assertEquals("Video \"Ben10\" added successfully.",store.addVideo("Ben10"));
        assertEquals("Video \"Sinchan\" checked out successfully.",store.doCheckout("Sinchan"));
        assertEquals("Video \"Matrix\" checked out successfully.",store.doCheckout("Matrix"));
        assertEquals("Video \"Doraemon\" checked out successfully.",store.doCheckout("Doraemon"));
        assertEquals("Video \"Sinchan\" returned successfully.",store.doReturn("Sinchan"));
        assertEquals("Video \"Doraemon\" returned successfully.",store.doReturn("Doraemon"));
        assertEquals(" ",store.doReturn("James Bond"));
        store.setI();
    }


}