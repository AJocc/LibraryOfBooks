/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryofbooks;

/**
 *
 * @author cwcis
 */
class Book {
    
    private int pages;
    public static final int MIN_PAGES = 1;
    public static final int MAX_PAGES = 1000;

    public Book(int pages) {
        setPages(pages);
    }
    /**
     * Get the value of pages
     *
     * @return the value of pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * Set the value of pages
     *
     * @param pages new value of pages
     */
    public void setPages(int pages) {
        if (pages < MIN_PAGES)
            this.pages = MIN_PAGES;
        else if (pages > MAX_PAGES)
            this.pages = MAX_PAGES;
        else
            this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book with " + pages + " pages";
    }


}

