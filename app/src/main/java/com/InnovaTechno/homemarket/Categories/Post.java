package com.InnovaTechno.homemarket.Categories;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_NAME =  "name";
    public static final String KEY_IMAGE =  "productImage";
    public static final String KEY_DEVISE = "devise";


    public String getName(){
        return getString(KEY_NAME);
    }

    public void setName(String name) {
        put(KEY_NAME, name);
    }

    public ParseFile getImage (){
        return getParseFile(KEY_IMAGE);
    }

    public void setImage (ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }

    public String getDevise () {
        return getString(KEY_DEVISE);
    }

    public void setDevise (String devise){
        put(KEY_DEVISE, devise);
    }

    //public int getPrice() {
      //  return getInt(String.valueOf(KEY_PRICE));}

    //public void setPrice () {
       // put(String.valueOf(KEY_PRICE)); }

}
