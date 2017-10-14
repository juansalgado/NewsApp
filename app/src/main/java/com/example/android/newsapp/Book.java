package com.example.android.newsapp;

/**
 * An {@link Book} object contains information related to a single News.
 */
public class Book {


    private String mSection;
    private String mTitle;
    /**
     * Website URL of the book
     */
    private String mUrl;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param section of the new
     * @param title   of the new
     * @param url     is the website URL to find more details about the article
     */
    public Book(String section, String title, String url) {
        mSection = section;
        mTitle = title;
        mUrl = url;
    }

    public String getSection() {
        return mSection;
    }

    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return mUrl;
    }
}
